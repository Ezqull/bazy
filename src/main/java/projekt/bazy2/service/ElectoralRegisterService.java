package projekt.bazy2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekt.bazy2.model.ElectoralRegister;
import projekt.bazy2.repository.ElectoralRegisterRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ElectoralRegisterService {

    private final ElectoralRegisterRepository electoralRegisterRepository;

    @Autowired
    public ElectoralRegisterService(ElectoralRegisterRepository electoralRegisterRepository) {
        this.electoralRegisterRepository = electoralRegisterRepository;
    }

    public List<ElectoralRegister> getAll(){
        return electoralRegisterRepository.findAll();
    }

    public ElectoralRegister getById(Long id){
        Optional<ElectoralRegister> foundRegister = electoralRegisterRepository.findById(id);
        return foundRegister.orElseThrow();
    }
}
