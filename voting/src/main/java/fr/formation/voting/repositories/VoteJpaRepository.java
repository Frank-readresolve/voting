package fr.formation.voting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.voting.entities.Vote;

@Repository
public interface VoteJpaRepository extends JpaRepository<Vote, Long> {
    // Derived queries:
    // 1. find Votes by polling station identifier at a specific polling date
    // order by voting time asc
    // SQL:
    // Derived query:
}
