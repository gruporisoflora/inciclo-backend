package school.cesar.risoflora.inciclo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.cesar.risoflora.inciclo.domain.Bound;
import school.cesar.risoflora.inciclo.domain.Post;


import school.cesar.risoflora.inciclo.repositories.PostRepository;
import school.cesar.risoflora.inciclo.utils.ResponseBody;

import java.util.ArrayList;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public ResponseBody insertPost(Post post){

        Post newPost = postRepository
                .save( post);

        return new ResponseBody<>(ResponseBody.ResponseType.OK,newPost);
    }


    public ResponseBody findAll(){

        Iterable<Post> posts = postRepository.findAll();


        return new ResponseBody<>(ResponseBody.ResponseType.OK,posts);

    }

    public ResponseBody updatePosts(Post posts){

        System.out.println(posts);

        postRepository.save(posts);
        return new ResponseBody(ResponseBody.ResponseType.OK);
    }


    public ResponseBody<ArrayList<Post>> findbyBound(Bound bound){

        return new ResponseBody<>(
                ResponseBody.ResponseType.OK,new ArrayList<>());
    }


    public ArrayList<Post> findPostByRegionWithoutPoda(int id){
        return postRepository.findByRegionIdWithoutPoda(id);
    }









}
