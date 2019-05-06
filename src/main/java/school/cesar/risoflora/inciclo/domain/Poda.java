package school.cesar.risoflora.inciclo.domain;


import school.cesar.risoflora.inciclo.utils.Coordenate;

import java.awt.geom.Point2D;
import java.util.List;

public class Poda {
    private List<Point2D> area;
    private List<Post> posts;
    private PodaStep step;
    private PodaStepStatus status;

    private CLevel cLevel;
    
    
 

    public Poda(List<Point2D> area, List<Post> posts, PodaStep step, PodaStepStatus status, CLevel cLevel) {
		
		this.area = area;
		this.posts = posts;
		this.step = step;
		this.status = status;
		this.cLevel = cLevel;
	}
    
public Poda(List<Point2D> area, List<Post> posts, PodaStep step,  CLevel cLevel) {
		
		this.area = area;
		this.posts = posts;
		this.step = step;
		this.status = status;
		this.cLevel = cLevel;
	}

	public CLevel getcLevel() {
		return cLevel;
	}

	public void setcLevel(CLevel cLevel) {
		this.cLevel = cLevel;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}


	public List<Point2D> getArea() {
        return area;
    }

    public void setArea(List<Point2D> area) {
        this.area = area;
    }

    public PodaStep getStep() {
        return step;
    }

    public void setStep(PodaStep step) {
        this.step = step;
    }

    public PodaStepStatus getStatus() {
        return status;
    }

    public void setStatus(PodaStepStatus status) {
        this.status = status;
    }

    public enum PodaStep{
        GROWING(0),
        NEXT_TO_CABLE(1),
        IN_INPECTION(2),
        CHECKED_TO_CUT(3);


        private int step;

        PodaStep(int step){
            this.step = step;
        }
    }

    public enum PodaStepStatus{
        DELAYED(0),
        DONE(1),
        SCHEDULED(2);


        private int stepStatus;

        PodaStepStatus(int stepStatus){
            this.stepStatus = stepStatus;
        }
    }
    
    
    public enum CLevel{
    	LOW(0),
    	MEDIUM(1),
    	HIGH(2);
    	
    	private int cLevel;
    	
    	CLevel(int cLevel){
    		this.cLevel = cLevel;
    	}
    }


}
