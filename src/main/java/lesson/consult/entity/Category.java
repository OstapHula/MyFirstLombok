package lesson.consult.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "category")
@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseEntity {

	@Column(name = "name")
	private String name;
	
	@Column(name = "descripeion")
	private String descripeion;
	
	@OneToMany(mappedBy = "category")
	private List<Item> items = new ArrayList<>();

	public Category(String name, String descripeion) {
		this.name = name;
		this.descripeion = descripeion;
	}
	
	@Override
	public String toString() {
		return "Category [name=" + name + ", descripeion=" + descripeion + ", getId()=" + getId() + "]";
	}
	
}
