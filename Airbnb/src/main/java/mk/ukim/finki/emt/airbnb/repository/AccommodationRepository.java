package mk.ukim.finki.emt.airbnb.repository;

import mk.ukim.finki.emt.airbnb.models.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
}
