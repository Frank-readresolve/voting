package fr.formation.voting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.voting.entities.Address;

public interface AddressJpaRepository extends JpaRepository<Address, Long> {
    // Derived queries:
    // 1. find Addresses by Town's zip code order by road asc
    // SQL: select * from addresses a inner join towns t on a.town_id = t.id
    // where t.zip_code = '91820' order by a.road asc;
    // Derived query:
}
