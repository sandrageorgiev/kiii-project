package mk.ukim.finki.emt.airbnb.service;

import mk.ukim.finki.emt.airbnb.models.Accommodation;
import mk.ukim.finki.emt.airbnb.models.enumerations.Category;

import java.util.List;
import java.util.Optional;

public interface AccommodationService {

    Optional<Accommodation> findById(Long id);
    List<Accommodation> findAll();
    Optional<Accommodation> create(String name, Category category, Long hostId, Integer numRooms);
    Optional<Accommodation> edit(Long id, String name, Category category, Long hostId, Integer numRooms);
    Optional<Accommodation> delete(Long id);
    Optional<Accommodation> rent(Long id);

}
