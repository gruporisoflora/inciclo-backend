package school.cesar.risoflora.inciclo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.cesar.risoflora.inciclo.domain.Poda;
import school.cesar.risoflora.inciclo.repositories.PodaRepository;
import school.cesar.risoflora.inciclo.services.PodaService;
import school.cesar.risoflora.inciclo.utils.Coordenate;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/podas")
public class PodaController {

	@Autowired
	private PodaService podaService;

    @GetMapping
    public @ResponseBody Iterable<Poda> listaPodas(){






        return podaService.findAll();

    }

    @PostMapping
    public void insert(@RequestBody Poda poda){

        System.out.println(poda.getPosts().get(0).toString());
        podaService.insert(poda);
    }

}
