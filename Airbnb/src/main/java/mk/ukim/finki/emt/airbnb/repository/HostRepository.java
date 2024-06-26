package mk.ukim.finki.emt.airbnb.repository;

import mk.ukim.finki.emt.airbnb.models.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostRepository extends JpaRepository<Host, Long> {
}
