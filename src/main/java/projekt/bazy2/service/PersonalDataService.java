package projekt.bazy2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import projekt.bazy2.model.PersonalData;
import projekt.bazy2.repos.PersonalDataRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalDataService {

    private static final String DATA_NOT_FOUND = "Personal Data with this id does not exist!";
    private final PersonalDataRepository personalDataRepository;

    @Autowired
    public PersonalDataService(PersonalDataRepository personalDataRepository) {
        this.personalDataRepository = personalDataRepository;
    }

    public List<PersonalData> getAll(){
        return personalDataRepository.findAll();
    }

    public PersonalData getDataById(Long id){
        Optional<PersonalData> foundData = personalDataRepository.findById(id);
        return foundData.orElseThrow();
    }

    public PersonalData getDataByPersonalid(String personalId){
        return personalDataRepository.findByPersonalId(personalId)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(DATA_NOT_FOUND)));
    }

    public PersonalData getDataByPassportid(String passportId){
        return personalDataRepository.findByPersonalId(passportId)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(DATA_NOT_FOUND)));
    }

    public PersonalData saveData(PersonalData personalData){
        return personalDataRepository.saveAndFlush(personalData);
    }

    public String deleteData(Long id){
        PersonalData dataToDelete = getDataById(id);
        personalDataRepository.delete(dataToDelete);
        return "Data with id: " + id + " deleted!";
    }
}
