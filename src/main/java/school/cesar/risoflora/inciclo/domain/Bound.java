package school.cesar.risoflora.inciclo.domain;

import school.cesar.risoflora.inciclo.utils.Coordenate;

public class Bound {



    private Coordenate ne;
    private Coordenate nw;
    private Coordenate se;
    private Coordenate sw;


    public Bound() {

    }

    public Bound(Coordenate ne, Coordenate nw, Coordenate se, Coordenate sw) {
        this.ne = ne;
        this.nw = nw;
        this.se = se;
        this.sw = sw;
    }


    public Coordenate getNe() {
        return ne;
    }

    public void setNe(Coordenate ne) {
        this.ne = ne;
    }

    public Coordenate getNw() {
        return nw;
    }

    public void setNw(Coordenate nw) {
        this.nw = nw;
    }

    public Coordenate getSe() {
        return se;
    }

    public void setSe(Coordenate se) {
        this.se = se;
    }

    public Coordenate getSw() {
        return sw;
    }

    public void setSw(Coordenate sw) {
        this.sw = sw;
    }


    @Override
    public String toString() {
        return "Bound{" +
                "ne=" + ne +
                ", nw=" + nw +
                ", se=" + se +
                ", sw=" + sw +
                '}';
    }
}
