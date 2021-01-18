package ua.roman.flats.services;

import ua.roman.flats.domain.Address;

import java.util.Iterator;

public interface IAddressService {

    public void addAddress(Address address);
    public Iterator<Address> findAllAddress();
    public Address findAddress(long id);
}
