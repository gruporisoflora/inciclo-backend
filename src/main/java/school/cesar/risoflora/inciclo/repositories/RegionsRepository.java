package school.cesar.risoflora.inciclo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import school.cesar.risoflora.inciclo.domain.Region;

public interface RegionsRepository extends JpaRepository<Region,Long> {

}
