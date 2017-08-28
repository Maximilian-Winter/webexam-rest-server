package webexam;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ExamQuestion extends EntityBaseClass
{
    @OneToOne
    @JoinColumn
	private Exam exam;
    @OneToOne
    @JoinColumn
	private Question question;
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
    
}