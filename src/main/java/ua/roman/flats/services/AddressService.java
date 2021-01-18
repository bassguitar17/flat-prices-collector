package ua.roman.flats.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.roman.flats.domain.Address;
import ua.roman.flats.repositories.type.AddressRepository;

import java.util.Iterator;

@Service
public class AddressService implements IAddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public Iterator<Address> findAllAddress() {
        return addressRepository.findAll().iterator();
    }

    @Override
    public Address findAddress(long id) {
        return addressRepository.findById(id).orElseThrow();
    }
}
