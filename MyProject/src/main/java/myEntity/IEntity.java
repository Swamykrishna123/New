package myEntity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;

public class IEntity {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	private String password;
	
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

	
		// TODO Auto-generated method stub

	

}
