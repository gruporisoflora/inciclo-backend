package school.cesar.risoflora.inciclo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import school.cesar.risoflora.inciclo.domain.Poda;
import school.cesar.risoflora.inciclo.repositories.PodaRepository;

@Service

public class PodaService {

    @Autowired
    PodaRepository podaRepository;

    public void insert(Poda poda){
        podaRepository.save(poda);
    }

    public Iterable<Poda> findAll(){
       return podaRepository.findAll();
    }

}
