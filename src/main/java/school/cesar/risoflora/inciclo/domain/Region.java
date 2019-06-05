package school.cesar.risoflora.inciclo.domain;


import school.cesar.risoflora.inciclo.utils.Coordenate;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="regions")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="region_id")
    private int id;



    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name="region_id")
    private List<Post> posts;


    public Region(){

    }

    public Region( List<Post> posts) {

        this.posts = posts;
    }




    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
