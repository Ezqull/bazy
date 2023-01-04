package projekt.bazy2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import projekt.bazy2.model.PersonalData;
import projekt.bazy2.repository.PersonalDataRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalDataService {

    private static final String DATA_NOT_FOUND = "Personal Data with this id does not exist!";
    private final PersonalDataRepository personalDataRepository;

    @Autowired
    public PersonalDataService(@Qualifier("personalDataRepository") PersonalDataRepository personalDataRepository) {
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
                .orElseThrow();
    }

    public PersonalData getDataByPassportId(String passportId){
        return personalDataRepository.findByPassportId(passportId)
                .orElseThrow();
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
