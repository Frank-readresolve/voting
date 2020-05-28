package fr.formation.voting.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.voting.entities.Town;
import fr.formation.voting.repositories.AddressJpaRepository;
import fr.formation.voting.repositories.TownJpaRepository;

@Service
public class QueryServiceImpl implements QueryService {

    // Inject required repositories
    @Autowired
    private TownJpaRepository towns;

    @Autowired
    private AddressJpaRepository addresses;

    @Override
    public QueryResult execute() {
	String value = "OU";
	List<Town> result = towns.findByNameContainingOrderByNameDesc(value);
	return new QueryResult(result); // do not change
    }
}
