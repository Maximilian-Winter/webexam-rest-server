package webexam;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CourseStudents extends EntityBaseClass
{
	@OneToOne
	@JoinColumn
	private Course course;
	@OneToOne
	@JoinColumn
	private User user;
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
