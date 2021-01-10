package ua.roman.flats.collector.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.roman.flats.collector.domain.Flat;

public interface FlatRepository extends CrudRepository<Flat, Long> {
}
