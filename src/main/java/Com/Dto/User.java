package Com.Dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	private int id;
	private String name;
	private int age;
	private long mobile;
	private String Email;
	private String password;

	@OneToMany(mappedBy = "User", cascade = CascadeType.ALL)
	private List<Notes> Notelist;

	public User(int id, String name, int age, long mobile, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		Email = email;
	}

}
