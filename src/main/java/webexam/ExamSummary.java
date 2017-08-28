package webexam;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ExamSummary extends EntityBaseClass
{
    @OneToOne
    @JoinColumn
	private Exam exam;
    @OneToOne
    @JoinColumn
	private Course course;
    @OneToOne
    @JoinColumn
	private User instructor;
    @OneToOne
    @JoinColumn
	private GradingSystem gradingSystem;
    private String title;
	private Date startDate;
	private Integer durationInMin;
 	private Boolean durationAbsolute;
 	private Integer beginTimelimit;
 	
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public User getInstructor() {
		return instructor;
	}
	public void setInstructor(User instructor) {
		this.instructor = instructor;
	}
	public GradingSystem getGradingSystem() {
		return gradingSystem;
	}
	public void setGradingSystem(GradingSystem gradingSystem) {
		this.gradingSystem = gradingSystem;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Integer getDurationInMin() {
		return durationInMin;
	}
	public void setDurationInMin(Integer durationInMin) {
		this.durationInMin = durationInMin;
	}
	public Boolean getDurationAbsolute() {
		return durationAbsolute;
	}
	public void setDurationAbsolute(Boolean durationAbsolute) {
		this.durationAbsolute = durationAbsolute;
	}
	public Integer getBeginTimelimit() {
		return beginTimelimit;
	}
	public void setBeginTimelimit(Integer beginTimelimit) {
		this.beginTimelimit = beginTimelimit;
	}

}