package projekt.bazy2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projekt.bazy2.model.Address;

import java.util.Optional;

@Repository("addressRepository")
public interface AddressRepository extends JpaRepository<Address, Long> {
    Optional<Address> findById(Long id);
}
