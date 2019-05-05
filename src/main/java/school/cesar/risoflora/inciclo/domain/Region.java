package school.cesar.risoflora.inciclo.domain;

import school.cesar.risoflora.inciclo.utils.Coordenate;

import java.util.List;

public class Region {

    private int id;
    private List<Coordenate> coordenates;

    public Region(){

    }

    public Region(List<Coordenate> coordenates, int id) {
        this.coordenates = coordenates;
        this.id= id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Coordenate> getCoordenates() {
        return coordenates;
    }

    public void setCoordenates(List<Coordenate> coordenates) {
        this.coordenates = coordenates;
    }
}
