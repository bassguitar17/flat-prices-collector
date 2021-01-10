package ua.roman.flats.collector.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.roman.flats.collector.domain.Landlord;

public interface LandlordRepository extends CrudRepository<Landlord, Long> {
}
