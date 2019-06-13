package school.cesar.risoflora.inciclo.core;

import org.springframework.stereotype.Component;
import school.cesar.risoflora.inciclo.domain.Poda;
import school.cesar.risoflora.inciclo.domain.Post;
import school.cesar.risoflora.inciclo.domain.Region;
import school.cesar.risoflora.inciclo.services.PodaService;
import school.cesar.risoflora.inciclo.services.PostService;
import school.cesar.risoflora.inciclo.utils.Coordenate;

import java.util.ArrayList;
import java.util.List;



public class PodaCreator implements Step<Region, List<Poda>> {

    PostService postService;


    private static final Double DISTANCE_TOLERANCE = 500.0; // Distancia de 500 metros em coordenadas;

    private static final Double IMPACT_TOLERANCE = 80.0;

    private static final Double DENSITY_TOLERANCE = 70.0;


    public PodaCreator(){
        postService = new PostService();

    }



    @Override
    public List<Poda> execute(Region input) {
        List<Post> postsWithoutPoda = postService.findPostByRegionWithoutPoda(input.getId());


        return createPodas(postsWithoutPoda);
    }

    private ArrayList<Poda> createPodas(List<Post> posts){

        ArrayList<Poda> podas = new ArrayList<>();




        for (int i = 0; i<posts.size();i++){

            Post currentPost = posts.get(i);

            int impact = currentPost.getImpact();
            Double latitude = currentPost.getLatitude();
            Double longitude = currentPost.getLongitude();

            if(impact < IMPACT_TOLERANCE) continue;

            ArrayList<Post> inseringPosts = new ArrayList<>();

            for(int j = i +1; j< posts.size();j++){
                Post selectedPost = posts.get(i);

                if(selectedPost.getImpact() >= IMPACT_TOLERANCE){

                    double distance = Coordenate.calculateDistance(
                            currentPost.getLatitude(),
                            currentPost.getLongitude(),
                            selectedPost.getLatitude(),
                            selectedPost.getLongitude());

                    if(distance> DISTANCE_TOLERANCE) continue;

                    inseringPosts.add(selectedPost);

                }
            }

            podas.add(new Poda(inseringPosts));

        }
        return podas;
    }
}
