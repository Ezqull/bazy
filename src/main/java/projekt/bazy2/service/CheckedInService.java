package projekt.bazy2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekt.bazy2.model.CheckedIn;
import projekt.bazy2.repository.CheckedInRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CheckedInService {

    private final CheckedInRepository checkedInRepository;

    @Autowired
    public CheckedInService(CheckedInRepository checkedInRepository) {
        this.checkedInRepository = checkedInRepository;
    }

    public List<CheckedIn> getAll(){
        return checkedInRepository.findAll();
    }

    public CheckedIn getById(Long id){
        Optional<CheckedIn> foundEntity = checkedInRepository.findById(id);
        return foundEntity.orElseThrow();
    }
}
