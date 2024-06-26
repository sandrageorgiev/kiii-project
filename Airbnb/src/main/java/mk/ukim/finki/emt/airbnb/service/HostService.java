package mk.ukim.finki.emt.airbnb.service;

import mk.ukim.finki.emt.airbnb.models.Country;
import mk.ukim.finki.emt.airbnb.models.Host;

import java.util.List;
import java.util.Optional;

public interface HostService {
    Optional<Host> findById(Long id);
    List<Host> findAll();
    Optional<Host> create(String name, String surname, Long countryId);
    Optional<Host> edit(Long id, String name, String surname, Long countryid);
    Optional<Host> delete(Long id);

    void refreshMaterializedView();
}
