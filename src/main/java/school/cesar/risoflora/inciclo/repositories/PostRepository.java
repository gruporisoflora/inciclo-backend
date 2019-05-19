package school.cesar.risoflora.inciclo.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import school.cesar.risoflora.inciclo.domain.Post;

@Repository
public interface PostRepository extends Neo4jRepository<Post, Long> {


}
