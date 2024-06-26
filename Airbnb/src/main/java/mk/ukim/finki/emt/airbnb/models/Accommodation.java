package mk.ukim.finki.emt.airbnb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mk.ukim.finki.emt.airbnb.models.enumerations.Category;

@Entity
@Data
@NoArgsConstructor

public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Category category;
    @ManyToOne
    private Host host;
    private Integer numRooms;


    public Accommodation(String name, Category category, Host host, Integer numRooms){
        this.name = name;
        this.category = category;
        this.host = host;
        this.numRooms = numRooms;
    }


}
