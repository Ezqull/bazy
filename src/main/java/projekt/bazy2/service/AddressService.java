package projekt.bazy2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import projekt.bazy2.model.Address;
import projekt.bazy2.repository.AddressRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(@Qualifier("addressRepository") AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAll(){
        return addressRepository.findAll();
    }

    public Address getById(Long id){
        Optional<Address> foundAddress = addressRepository.findById(id);
        return foundAddress.orElseThrow();
    }
}
