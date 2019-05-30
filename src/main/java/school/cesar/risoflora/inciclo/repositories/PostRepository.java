package school.cesar.risoflora.inciclo.repositories;


import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;
import school.cesar.risoflora.inciclo.domain.Post;
import school.cesar.risoflora.inciclo.utils.Coordenate;

import java.util.ArrayList;
import java.util.stream.Stream;


@Repository
public interface PostRepository extends Neo4jRepository<Post, Long> {

    


    @Query("MATCH  (n1) where {swLat} < n1.latitude <  {nwLat} and {nwLng}< n1.longitude < {neLng} return n1")
    ArrayList<Post> getPostsByBound(@Param("swLat")Double swLat, @Param("nwLat")Double nwLat, @Param("nwLng")Double nwLng, @Param("neLng")Double neLng );
}
