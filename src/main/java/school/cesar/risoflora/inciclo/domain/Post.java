package school.cesar.risoflora.inciclo.domain;


import java.util.Date;
import java.util.List;


import javax.persistence.*;


/**
 * Entidade híbrida. Serve de modelo para o Hibernate(MySQL)
 * e para o Neo4j(Nó de grafo)
 */




@Entity
@Table(name="posts")
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



    private Date lastPoda;

    private Long PodaAverage;

    private Long podaId;

    private Long regionId;

    public Post(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPodaId() {
        return podaId;
    }

    public void setPodaId(Long podaId) {
        this.podaId = podaId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
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



    public Date getLastPoda() {
        return lastPoda;
    }

    public void setLastPoda(Date lastPoda) {
        this.lastPoda = lastPoda;
    }

    public Long getPodaAverage() {
        return PodaAverage;
    }

    public void setPodaAverage(Long podaAverage) {
        PodaAverage = podaAverage;
    }


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", identificator=" + identificator +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", impact=" + impact +
                ", treeQtd=" + treeQtd +
                ", lastPoda=" + lastPoda +
                ", PodaAverage=" + PodaAverage +
                '}';
    }
}
