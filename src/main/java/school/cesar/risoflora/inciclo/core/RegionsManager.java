package school.cesar.risoflora.inciclo.core;

import school.cesar.risoflora.inciclo.domain.Region;
import school.cesar.risoflora.inciclo.services.PostService;

import java.util.ArrayList;


public class RegionsManager {

    private ArrayList<Region> regions;
    private int currentRegion;



    void execute(){


        RegionsManagementPipeline<Region, Region> podaInspectorExecutionPipeline
                = new RegionsManagementPipeline<>(new RegionUpdater());

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

    private static RegionsManager ourInstance = new RegionsManager();

    public static RegionsManager getInstance() {
        return ourInstance;
    }

    private RegionsManager() {
        this.currentRegion = 0;


    }


}
