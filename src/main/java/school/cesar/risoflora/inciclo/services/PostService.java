package school.cesar.risoflora.inciclo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.cesar.risoflora.inciclo.domain.Post;


import school.cesar.risoflora.inciclo.repositories.PostRepository;
import school.cesar.risoflora.inciclo.utils.Response;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public Response insertPost(Post post){

        postRepository.save(post);

        return new Response(Response.ResponseType.SUCCESS);
    }







}
