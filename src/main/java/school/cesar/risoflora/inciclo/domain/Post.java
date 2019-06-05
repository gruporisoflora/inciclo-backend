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
    private Long id;


    private int identificator ;
    private Double latitude;
    private Double longitude;
    private int impact;
    private int treeQtd;

    private Long poda;

    public Post(){

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

    public int getImpact() {
        return impact;
    }

    public void setImpact(int impact) {
        this.impact = impact;
    }

    public int getTreeQtd() {
        return treeQtd;
    }

    public void setTreeQtd(int treeQtd) {
        this.treeQtd = treeQtd;
    }


}
