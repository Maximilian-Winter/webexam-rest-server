package webexam;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question extends EntityBaseClass
{	
	@OneToOne
    @JoinColumn
	private Category category;
    private String title;
	private String text;
	private Boolean showTitle;
	private Boolean zeroPointIfAllAnswersSelected;
	private Boolean isMultipleChoice;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
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
	public Boolean getShowTitle() {
		return showTitle;
	}
	public void setShowTitle(Boolean showTitle) {
		this.showTitle = showTitle;
	}
	public Boolean getZeroPointIfAllAnswersSelected() {
		return zeroPointIfAllAnswersSelected;
	}
	public void setZeroPointIfAllAnswersSelected(Boolean zeroPointIfAllAnswersSelected) {
		this.zeroPointIfAllAnswersSelected = zeroPointIfAllAnswersSelected;
	}
	public Boolean getIsMultipleChoice() {
		return isMultipleChoice;
	}
	public void setIsMultipleChoice(Boolean isMultipleChoice) {
		this.isMultipleChoice = isMultipleChoice;
	}
}
