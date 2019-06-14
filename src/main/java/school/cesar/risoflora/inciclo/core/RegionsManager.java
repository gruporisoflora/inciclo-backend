package school.cesar.risoflora.inciclo.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import school.cesar.risoflora.inciclo.domain.Poda;
import school.cesar.risoflora.inciclo.domain.Post;
import school.cesar.risoflora.inciclo.domain.Region;
import school.cesar.risoflora.inciclo.services.PostService;
import school.cesar.risoflora.inciclo.services.RegionsService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class RegionsManager {

    private List<Region> regions;
    private int currentRegionId;

    @Autowired
    private RegionsService regionsService;

    @Autowired
    private PostService postService;

    void execute(){

        if(regions == null || regions.size() == 0 ) return ;


        Region currentRegion = regions.get(this.currentRegionId);


        List<Post> postsWithoutPoda = postService.findPostByRegionWithoutPoda(currentRegion.getId());

        RegionsManagementPipeline<List<Post>, List<Poda>> podaInspectorExecutionPipeline
                = new RegionsManagementPipeline<>(new PodaCreator());

        List<Poda> result = podaInspectorExecutionPipeline
                .execute(postsWithoutPoda);


        System.out.println("Podas criadas: "+ result);
        this.currentRegionId++;

        this.currentRegionId = this.currentRegionId % regions.size();
    }


    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public int getCurrentRegion() {
        return currentRegionId;
    }

    public void setCurrentRegion(int currentRegion) {
        this.currentRegionId = currentRegion;
    }


    public RegionsService getRegionsService() {
        return regionsService;
    }

    public void setRegionsService(RegionsService regionsService) {
        this.regionsService = regionsService;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public PostService getPostService() {
        return postService;
    }

    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @PostConstruct
    public void updateRegion(){
        regions = regionsService.findAll();

        System.out.println("Numero de regiões: "+regions.size());

    }

    public RegionsManager() {
        currentRegionId = 0;

    }


}
