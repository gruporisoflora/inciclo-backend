package school.cesar.risoflora.inciclo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;
import school.cesar.risoflora.inciclo.domain.Post;

import java.util.ArrayList;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {


    @Query(value="select * from posts WHERE region_id = regionId AND poda_id IS NULL", nativeQuery = true)
    ArrayList<Post> findByRegionIdWithoutPoda(@Param("regionId") int id);
}
