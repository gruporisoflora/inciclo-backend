package school.cesar.risoflora.inciclo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.cesar.risoflora.inciclo.domain.Region;
import school.cesar.risoflora.inciclo.repositories.RegionsRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegionsService {



    @Autowired
    private RegionsRepository repository;



    public RegionsRepository getRepository() {
        return repository;
    }

    public void setRepository(RegionsRepository repository) {
        this.repository = repository;
    }



    public List<Region> findAll(){

        List<Region> result=  repository.findAll();




        return result;
    }





    @Transactional
    public void insertRegion(Region region){
        repository.save(region);
    }


}
