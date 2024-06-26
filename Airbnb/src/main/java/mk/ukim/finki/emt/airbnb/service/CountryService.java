package mk.ukim.finki.emt.airbnb.service;

import mk.ukim.finki.emt.airbnb.models.Accommodation;
import mk.ukim.finki.emt.airbnb.models.Country;
import mk.ukim.finki.emt.airbnb.models.enumerations.Category;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    Optional<Country> findById(Long id);
    List<Country> findAll();
    Optional<Country> create(String name, String continent);
    Optional<Country> edit(Long id, String name, String continent);
    Optional<Country> delete(Long id);
}
