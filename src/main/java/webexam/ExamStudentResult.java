package webexam;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ExamStudentResult extends EntityBaseClass
{
    @OneToOne
    @JoinColumn
	private User student;
    @OneToOne
    @JoinColumn
	private ExamSummary examSummary;
    private Date studentStartDate;
    private Date studentEndDate;
    private Float points;
    private Float percent;
    private String gradeTitle;
    
	public User getStudent() {
		return student;
	}
	public void setStudent(User student) {
		this.student = student;
	}
	public ExamSummary getExamSummary() {
		return examSummary;
	}
	public void setExamSummary(ExamSummary examSummary) {
		this.examSummary = examSummary;
	}
	public Date getStudentStartDate() {
		return studentStartDate;
	}
	public void setStudentStartDate(Date studentStartDate) {
		this.studentStartDate = studentStartDate;
	}
	public Date getStudentEndDate() {
		return studentEndDate;
	}
	public void setStudentEndDate(Date studentEndDate) {
		this.studentEndDate = studentEndDate;
	}
	public Float getPoints() {
		return points;
	}
	public void setPoints(Float points) {
		this.points = points;
	}
	public Float getPercent() {
		return percent;
	}
	public void setPercent(Float percent) {
		this.percent = percent;
	}
	public String getGradeTitle() {
		return gradeTitle;
	}
	public void setGradeTitle(String gradeTitle) {
		this.gradeTitle = gradeTitle;
	}
    
}