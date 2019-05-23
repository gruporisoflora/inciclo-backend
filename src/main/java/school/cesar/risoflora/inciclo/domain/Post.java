package school.cesar.risoflora.inciclo.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.RelationshipEntity;

import java.util.List;


import javax.persistence.*;


/**
 * Entidade híbrida. Serve de modelo para o Hibernate(MySQL)
 * e para o Neo4j(Nó de grafo)
 */




@Entity
@Table(name="posts")
@NodeEntity
public class Post {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="post_id")
    @GraphId
    private Long id;


    private int identificator ;
    private Double latitude;
    private Double longitude;
    private int impact;
    private int treeQtd;



    
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name="post_id")
    private List<Tree> trees;


    @Transient
    @Relationship(type = "CONNECTED")
    private List<Post> conectedPosts;



    public Post(){

    }


    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public int getTreeQtd() {
        return treeQtd;
    }

    public void setTreeQtd(int treeQtd) {
        this.treeQtd = treeQtd;
    }

    public List<Post> getConectedPosts() {
        return conectedPosts;
    }

    public void setConectedPosts(List<Post> conectedPosts) {
        this.conectedPosts = conectedPosts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List<Tree> getTrees() {
        return trees;
    }

    public void setTrees(List<Tree> trees) {
        this.trees = trees;
    }



}
