package school.cesar.risoflora.inciclo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.cesar.risoflora.inciclo.domain.Bound;
import school.cesar.risoflora.inciclo.domain.Post;
import school.cesar.risoflora.inciclo.services.PostService;
import school.cesar.risoflora.inciclo.utils.ResponseBody;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public @org.springframework.web.bind.annotation.ResponseBody
    ResponseBody insert(@RequestBody Post post){

        return postService.insertPost(post);
    }


    @GetMapping
    public ResponseBody findAll(){
        return postService.findAll();
    }


    @PostMapping
    @RequestMapping(value="/bounded")
    public ResponseBody<ArrayList<Post>> findByBound(@RequestBody Bound bound){

        System.out.println(bound.toString());
        return postService.findbyBound(bound);
    }


}
