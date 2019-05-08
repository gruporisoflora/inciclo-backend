package school.cesar.risoflora.inciclo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.cesar.risoflora.inciclo.domain.Poda;
import school.cesar.risoflora.inciclo.domain.ScheduleOrder;
import school.cesar.risoflora.inciclo.repositories.PodaRepository;
import school.cesar.risoflora.inciclo.services.PodaService;
import school.cesar.risoflora.inciclo.utils.Coordenate;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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


    @PutMapping(value = "/scheduling")
    public @ResponseBody Map<String,String> schedulePoda(@RequestBody ScheduleOrder order, @RequestParam int id){

        return podaService.schedule(id,order);
    }

    @PostMapping
    public Map<String,String> insert(@RequestBody Poda poda){



        return podaService.insert(poda);
    }

}
