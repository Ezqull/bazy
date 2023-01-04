package projekt.bazy2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projekt.bazy2.model.ElectoralRegister;

import java.util.Optional;

@Repository("electoralRepositoryRegister")
public interface ElectoralRegisterRepository extends JpaRepository<ElectoralRegister, Long> {
    Optional<ElectoralRegister> findById(Long id);
}
