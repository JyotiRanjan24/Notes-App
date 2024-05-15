package Com.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notes {
	@Id
	private int id;
	private String title;
	private String description;

	@ManyToOne
	@JoinColumn
	private User user;

	public Notes(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}

}
