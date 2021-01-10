package ua.roman.flats.collector.controllers;

import org.springframework.stereotype.Controller;
import ua.roman.flats.collector.repositories.type.AddressRepository;

@Controller
public class AddressController {

    private final AddressRepository addressRepository;

    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public String sayHi(){
        return "Hi guys!";
    }

}
