package webexam;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class GradingSystemGrade extends EntityBaseClass
{
    @OneToOne
    @JoinColumn
	private GradingSystem gradingSystem;
    private String title;
    private Float pointRangeStart;
    private Float pointRangeEnd;
    
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
	public Float getPointRangeStart() {
		return pointRangeStart;
	}
	public void setPointRangeStart(Float pointRangeStart) {
		this.pointRangeStart = pointRangeStart;
	}
	public Float getPointRangeEnd() {
		return pointRangeEnd;
	}
	public void setPointRangeEnd(Float pointRangeEnd) {
		this.pointRangeEnd = pointRangeEnd;
	}
     
}