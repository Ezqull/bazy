package projekt.bazy2.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import projekt.bazy2.model.PersonalData;

import java.util.Optional;

public interface PersonalDataRepository extends JpaRepository<PersonalData, Long> {

    public Optional<PersonalData> findById(Long id);
    public Optional<PersonalData> findByPersonalId(String personalId);
    public Optional<PersonalData> findByPassportId(String passportId);
}
