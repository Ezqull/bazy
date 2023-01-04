package projekt.bazy2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import projekt.bazy2.model.User;
import projekt.bazy2.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static final String USER_NOT_FOUND = "User with this email does not exist!";
    private final UserRepository userRepository;

    @Autowired
    public UserService(@Qualifier("userRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        Optional<User> foundUser = userRepository.findById(id);
        return foundUser.orElseThrow();
    }

    public User getUserByEmail(String email){
        return userRepository.findByEmail(email)
                .orElseThrow();
    }

    public User saveUser(User user){
        return userRepository.saveAndFlush(user);
    }

    public String deleteUser(Long id){
        User userToDelete = getUserById(id);
        userRepository.delete(userToDelete);
        return "User with id: " + id + " deleted!";
    }
}
