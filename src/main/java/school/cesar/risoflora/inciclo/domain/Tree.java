package school.cesar.risoflora.inciclo.domain;

import java.util.Date;

public class Tree {


    private int id;
    private int growTime;
    private Date lastPoda;
    private String especie;

    public Tree(int id, int growTime, Date lastPoda, String especie) {
        this.id = id;
        this.growTime = growTime;
        this.lastPoda = lastPoda;
        this.especie = especie;
    }

    public Tree() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrowTime() {
        return growTime;
    }

    public void setGrowTime(int growTime) {
        this.growTime = growTime;
    }

    public Date getLastPoda() {
        return lastPoda;
    }

    public void setLastPoda(Date lastPoda) {
        this.lastPoda = lastPoda;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
