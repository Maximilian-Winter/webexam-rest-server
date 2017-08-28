package webexam;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ExamStudentStart extends EntityBaseClass
{
    @OneToOne
    @JoinColumn
	private ExamSummary examSummary;
    @OneToOne
    @JoinColumn
	private User student;
	private Date studentStartDate;
    
	public ExamSummary getExamSummary() {
		return examSummary;
	}
	public void setExamSummary(ExamSummary examSummary) {
		this.examSummary = examSummary;
	}
	public User getStudent() {
		return student;
	}
	public void setStudent(User student) {
		this.student = student;
	}
	public Date getStudentStartDate() {
		return studentStartDate;
	}
	public void setStudentStartDate(Date studentStartDate) {
		this.studentStartDate = studentStartDate;
	}
}