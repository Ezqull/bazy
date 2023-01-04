package projekt.bazy2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projekt.bazy2.model.PersonalData;

import java.util.Optional;

@Repository("personalDataRepository")
public interface PersonalDataRepository extends JpaRepository<PersonalData, Long> {

    Optional<PersonalData> findById(Long id);
    Optional<PersonalData> findByPersonalId(String personalId);
    Optional<PersonalData> findByPassportId(String passportId);
}
