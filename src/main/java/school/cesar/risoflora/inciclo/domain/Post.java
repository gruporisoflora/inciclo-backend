package school.cesar.risoflora.inciclo.domain;

import java.util.List;


import javax.persistence.*;

@Entity
@Table(name="posts")
public class Post {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="post_id")
    private int id;


    private int identificator ;
    private Double xPosition;
    private Double yPosition;
    private int impact;
    
    
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name="post_id")
    private List<Tree> trees;
   
    
    public Post(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdentificator() {
        return identificator;
    }

    public void setIdentificator(int identificator) {
        this.identificator = identificator;
    }

    public int getImpact() {
        return impact;
    }

    public void setImpact(int impact) {
        this.impact = impact;
    }


    public Double getxPosition() {
        return xPosition;
    }

    public void setxPosition(Double xPosition) {
        this.xPosition = xPosition;
    }

    public Double getyPosition() {
        return yPosition;
    }

    public void setyPosition(Double yPosition) {
        this.yPosition = yPosition;
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public void setTrees(List<Tree> trees) {
        this.trees = trees;
    }
}
