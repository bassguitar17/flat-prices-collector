package ua.roman.flats.services;

import ua.roman.flats.domain.Advertisement;

import java.util.Iterator;

public interface IAdvertisementService {

    public void addAdvertisement(Advertisement advertisement);
    public Iterator<Advertisement> findAllAdvertisement();
    public Advertisement findAdvertisement(long id);
}
