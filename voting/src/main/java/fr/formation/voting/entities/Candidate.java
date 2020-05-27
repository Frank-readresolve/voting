package fr.formation.voting.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // One Candidate to One Person
    // Sens inverse: One Person to One Candidate
    // @ManyToOne marche aussi (techniquement) !
    // @OneToOne: vrai "sens" de la relation
    @ManyToOne
    @JoinColumn(nullable = false, unique = true, name = "person_id")
    private Person person;

    public Candidate() {
	//
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Person getPerson() {
	return person;
    }

    public void setPerson(Person person) {
	this.person = person;
    }
}
