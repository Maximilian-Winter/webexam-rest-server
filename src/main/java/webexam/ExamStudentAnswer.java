package webexam;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ExamStudentAnswer extends EntityBaseClass
{
    @OneToOne
    @JoinColumn
	private ExamSummary examSummary;
    @OneToOne
    @JoinColumn
	private Question question;
    @OneToOne
    @JoinColumn
	private Answer answer;
    @OneToOne
    @JoinColumn
	private User student;

	public ExamSummary getExamSummary() {
		return examSummary;
	}
	public void setExamSummary(ExamSummary examSummary) {
		this.examSummary = examSummary;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public User getStudent() {
		return student;
	}
	public void setStudent(User student) {
		this.student = student;
	}
    
}