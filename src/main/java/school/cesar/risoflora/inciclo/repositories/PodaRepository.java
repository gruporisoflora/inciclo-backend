package school.cesar.risoflora.inciclo.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import school.cesar.risoflora.inciclo.domain.Poda;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;


@Repository
public interface PodaRepository extends CrudRepository<Poda, Integer>{



}