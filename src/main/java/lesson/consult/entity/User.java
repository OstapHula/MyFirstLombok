package lesson.consult.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
public class User extends BaseEntity{
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;

	@Enumerated(EnumType.ORDINAL)
	private Gender gender;

	@OneToMany(mappedBy = "user", cascade = {
			CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
	})
	private List<UserOrder> orders = new ArrayList<>();
	
	public User(String first_name, String last_name, Gender gender) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender + ", getId()="
				+ getId() + "]";
	}
	
}
