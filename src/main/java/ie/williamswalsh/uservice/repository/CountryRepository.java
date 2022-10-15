package ie.williamswalsh.uservice.repository;

import ie.williamswalsh.uservice.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author William Walsh
 * @version 15 Oct 2022
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Optional<Country> findById(Long id);
}
