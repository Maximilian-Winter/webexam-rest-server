package webexam;

import javax.persistence.Entity;

@Entity
public class GradingSystem extends EntityBaseClass
{
    private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
    
}