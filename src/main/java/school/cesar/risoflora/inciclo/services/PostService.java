package school.cesar.risoflora.inciclo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.cesar.risoflora.inciclo.domain.Post;


import school.cesar.risoflora.inciclo.repositories.PostRepository;
import school.cesar.risoflora.inciclo.utils.ResponseBody;

import java.util.ArrayList;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public ResponseBody insertPost(ArrayList<Post> posts){

        postRepository
                .saveAll((Iterable<? extends Post>) posts);

        return new ResponseBody(ResponseBody.ResponseType.OK);
    }


    public ResponseBody findAll(){

        Iterable<Post> posts = postRepository.findAll();

        return new ResponseBody<>(ResponseBody.ResponseType.OK,posts);

    }









}
