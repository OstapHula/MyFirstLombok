package lesson.consult.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_order")
@Getter
@Setter
@NoArgsConstructor
public class UserOrder extends BaseEntity {
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date createdAt;

	
	
	@ManyToOne(cascade = {
			CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
	})
	
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(cascade = {
					CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
			})
	private List<Item> items = new ArrayList<>();
	
	@Override
	public String toString() {
		return "UserOrder [createdAt=" + createdAt + ", getId()=" + getId() + "]";
	}
	
}
