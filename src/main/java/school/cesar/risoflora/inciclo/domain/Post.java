package school.cesar.risoflora.inciclo.domain;

import school.cesar.risoflora.inciclo.utils.Coordenate;

import java.awt.geom.Point2D;

public class Post {

    private int id ;
    private int identificator ;
    private Point2D location;
    private int impact;
    private Region region;
    

    public Post(int id, int identificator, Point2D location, int impact) {
        this.id = id;
        this.identificator = identificator;
        this.location = location;
        this.impact = impact;
    }


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

    public Point2D getLocation() {
        return location;
    }

    public void setLocation(Point2D location) {
        this.location = location;
    }

    public int getImpact() {
        return impact;
    }

    public void setImpact(int impact) {
        this.impact = impact;
    }
}
