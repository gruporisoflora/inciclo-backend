package school.cesar.risoflora.inciclo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import school.cesar.risoflora.inciclo.domain.Region;


@Repository
public interface RegionsRepository extends JpaRepository<Region,Long> {
    
}
