package webexam;


import javax.persistence.Entity;

@Entity
public class UserRole extends EntityBaseClass
{
	private String rolename;

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
}