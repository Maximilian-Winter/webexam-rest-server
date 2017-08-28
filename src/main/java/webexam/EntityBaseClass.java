package webexam;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntityBaseClass 
{	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
    public EntityBaseClass() {
		super();
	}
    public EntityBaseClass(Integer id) {
		super();
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
