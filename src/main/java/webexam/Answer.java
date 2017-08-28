package webexam;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Answer extends EntityBaseClass
{
	@OneToOne
    @JoinColumn
	private Question question;
    private String title;
	private String text;
	private Float points; 
	private Boolean showTitle;
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Float getPoints() {
		return points;
	}
	public void setPoints(Float points) {
		this.points = points;
	}
	public Boolean getShowTitle() {
		return showTitle;
	}
	public void setShowTitle(Boolean showTitle) {
		this.showTitle = showTitle;
	} 
	
}