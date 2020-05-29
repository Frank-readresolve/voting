package fr.formation.voting.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.voting.entities.Address;
import fr.formation.voting.repositories.AddressJpaRepository;

@Service
public class QueryServiceImpl implements QueryService {
    // Inject required repositories

    @Autowired
    private AddressJpaRepository addresses;

    @Override
    public QueryResult execute() {
	String value = "91820";
	List<Address> result = addresses.findByTownZipCodeOrderByRoad(value);
	return new QueryResult(result); // do not change
    }
}
