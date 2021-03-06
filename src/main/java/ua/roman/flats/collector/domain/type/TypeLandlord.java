package ua.roman.flats.collector.domain.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeLandlord {

    @Id
    private int id;

    private String name;

    public TypeLandlord(String name) {
        this.name = name;
    }
}
