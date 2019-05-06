package school.cesar.risoflora.inciclo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import school.cesar.risoflora.inciclo.domain.Poda;
import school.cesar.risoflora.inciclo.utils.Coordenate;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/podas")
public class PodaController {


	
    @GetMapping
    public List<Poda> listaPodas(){

        List<Poda> result = new ArrayList<>();

            
        
        
        result.add(new Poda(new ArrayList<>()
        						,new ArrayList<>()
        						,Poda.PodaStep.IN_INPECTION
        						,Poda.PodaStepStatus.DONE
        						,Poda.CLevel.LOW
        						));
        result.add(new Poda(new ArrayList<>()
				,new ArrayList<>()
				,Poda.PodaStep.CHECKED_TO_CUT
				,Poda.PodaStepStatus.DELAYED
				,Poda.CLevel.HIGH
				));
        
        result.add(new Poda(new ArrayList<>()
				,new ArrayList<>()
				,Poda.PodaStep.GROWING
			
				,Poda.CLevel.LOW
				));
        
        result.add(new Poda(new ArrayList<>()
				,new ArrayList<>()
				,Poda.PodaStep.NEXT_TO_CABLE
	
				,Poda.CLevel.HIGH
				));
        
        result.add(new Poda(new ArrayList<>()
				,new ArrayList<>()
				,Poda.PodaStep.IN_INPECTION
				,Poda.PodaStepStatus.DONE
				,Poda.CLevel.LOW
				));




        return result;

    }

}
