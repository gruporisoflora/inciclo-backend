package school.cesar.risoflora.inciclo.core;

import school.cesar.risoflora.inciclo.domain.Poda;
import school.cesar.risoflora.inciclo.domain.Region;
import school.cesar.risoflora.inciclo.services.PostService;
import school.cesar.risoflora.inciclo.services.RegionsService;

import java.util.ArrayList;
import java.util.List;


public class RegionsManager {

    private ArrayList<Region> regions;
    private int currentRegion;
    private RegionsService regionsService;


    void execute(){


        RegionsManagementPipeline<Region, List<Poda>> podaInspectorExecutionPipeline
                = new RegionsManagementPipeline<>(new PodaCreator());

        podaInspectorExecutionPipeline
                .execute(regions.get(currentRegion));
    }


    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public int getCurrentRegion() {
        return currentRegion;
    }

    public void setCurrentRegion(int currentRegion) {
        this.currentRegion = currentRegion;
    }




    private static RegionsManager ourInstance;

    public static RegionsManager getInstance() {
        if(ourInstance == null){
            ourInstance = new RegionsManager();
        }

        return ourInstance;
    }

    private RegionsManager() {
        regions = new ArrayList<>();
        currentRegion = 0;


    }


}
