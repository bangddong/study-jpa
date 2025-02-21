package hellojpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Team {

	@Id
	@GeneratedValue
	@Column(name = "TEAM_ID")
	private Long id;

}
