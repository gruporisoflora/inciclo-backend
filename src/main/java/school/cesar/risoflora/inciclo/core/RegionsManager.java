package school.cesar.risoflora.inciclo.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import school.cesar.risoflora.inciclo.domain.Poda;
import school.cesar.risoflora.inciclo.domain.Region;
import school.cesar.risoflora.inciclo.services.PostService;
import school.cesar.risoflora.inciclo.services.RegionsService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class RegionsManager {

    private ArrayList<Region> regions;
    private int currentRegion;

    @Autowired
    private RegionsService regionsService;


    void execute(){

        if(regions == null || regions.size() == 0 ) return ;


        RegionsManagementPipeline<Region, List<Poda>> podaInspectorExecutionPipeline
                = new RegionsManagementPipeline<>(new PodaCreator());

        podaInspectorExecutionPipeline
                .execute(regions.get(currentRegion));
        currentRegion++;
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


    public RegionsService getRegionsService() {
        return regionsService;
    }

    public void setRegionsService(RegionsService regionsService) {
        this.regionsService = regionsService;
    }

    @PostConstruct
    public void updateRegion(){
        regions = regionsService.findAll();
        currentRegion = 0;
    }

    public RegionsManager() {


    }


}
