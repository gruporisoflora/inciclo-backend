package school.cesar.risoflora.inciclo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.cesar.risoflora.inciclo.domain.Region;
import school.cesar.risoflora.inciclo.services.RegionsService;

@RestController()
@RequestMapping("/regions")
@CrossOrigin(origins = "*")
public class RegionController {


    @Autowired
    private RegionsService service;



    @PostMapping
    public void insertRegion( @RequestBody Region region){
        service.insertRegion(region);
    }
}
