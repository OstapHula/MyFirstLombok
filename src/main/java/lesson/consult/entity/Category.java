package lesson.consult.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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

	public Category(String name, String descripeion) {
		this.name = name;
		this.descripeion = descripeion;
	}
	
	@Override
	public String toString() {
		return "Category [name=" + name + ", descripeion=" + descripeion + ", getId()=" + getId() + "]";
	}
	
}
