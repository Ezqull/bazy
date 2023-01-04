package projekt.bazy2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projekt.bazy2.model.CheckedIn;

import java.util.Optional;

@Repository("checkedInRepository")
public interface CheckedInRepository extends JpaRepository<CheckedIn, Long> {
    Optional<CheckedIn> findById(Long id);
}
