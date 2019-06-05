package school.cesar.risoflora.inciclo.repositories;


import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;
import school.cesar.risoflora.inciclo.domain.Post;
import school.cesar.risoflora.inciclo.utils.Coordenate;

import java.util.ArrayList;
import java.util.stream.Stream;


@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}
