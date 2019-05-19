package school.cesar.risoflora.inciclo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.cesar.risoflora.inciclo.domain.Post;
import school.cesar.risoflora.inciclo.services.PostService;
import school.cesar.risoflora.inciclo.utils.Response;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/posts")
public class PostController {

    @Autowired
    private PostService postService;



    @PostMapping
    public @ResponseBody Response insert(@RequestBody Post post){



        return postService.insertPost(post);
    }

}
