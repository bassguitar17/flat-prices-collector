package ua.roman.flats.collector.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.roman.flats.collector.domain.Advertisement;

public interface AdvertisementRepository extends CrudRepository<Advertisement, Long> {
}
