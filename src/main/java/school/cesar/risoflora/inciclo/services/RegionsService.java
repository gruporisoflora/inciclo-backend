package school.cesar.risoflora.inciclo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.cesar.risoflora.inciclo.domain.Region;
import school.cesar.risoflora.inciclo.repositories.RegionsRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class RegionsService {

    @Autowired
    private RegionsRepository repo;



    public RegionsRepository getRepo() {
        return repo;
    }

    public void setRepo(RegionsRepository repo) {
        this.repo = repo;
    }



    public ArrayList<Region> findAll(){


        Iterable<Region> result=  repo.findAll();
        ArrayList<Region> regions = new ArrayList<>();

        result.forEach(regions::add);

        return regions;
    }


}
