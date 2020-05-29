package fr.formation.voting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.voting.entities.Elector;

@Repository
public interface ElectorJpaRepository extends JpaRepository<Elector, Long> {
    // Derived queries:
    // 1. find Elector by national identifier
    // SQL:
    // Derived query:
    // 2. find Electors by birthdate between two dates order by lastname asc
    // SQL:
    // Derived query:
    // 3. find Electors by birthdate before a date and birth town not a specific
    // zip code order by lastname desc
    // SQL:
    // Derived query:
}
