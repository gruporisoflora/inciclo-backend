package school.cesar.risoflora.inciclo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import school.cesar.risoflora.inciclo.domain.Poda;
import school.cesar.risoflora.inciclo.domain.ScheduleOrder;
import school.cesar.risoflora.inciclo.repositories.PodaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service

public class PodaService {

    @Autowired
    PodaRepository podaRepository;


    public Map<String,String> insert(Poda poda){
        podaRepository.save(poda);

        HashMap<String,String> response = new HashMap<>();

        response.put("STATUS","DONE");
        return response;
    }

    public void schedule(int id,ScheduleOrder order){

        Poda poda;

        Optional<Poda> requestedPoda = this.get(id);

        if(requestedPoda.isPresent()){
            poda = requestedPoda.get();
        }else{
            //TODO Tratar exceção
            return;
        }


        switch (order.getType()){
            case INSPECTION:
                System.out.println("Agendamento de inspeção");
                poda.setStep(Poda.PodaStep.IN_INPECTION);
                poda.setStatus(Poda.PodaStepStatus.SCHEDULED);
                break;
            case PODA:
                System.out.println("Agendamento de poda");
                poda.setStep(Poda.PodaStep.CHECKED_TO_CUT);
                poda.setStatus(Poda.PodaStepStatus.SCHEDULED);
                break;

        }


        this.insert(poda);

    }



    public Optional<Poda> get(int id){
      return podaRepository.findById(id);
    };

    public Iterable<Poda> findAll(){
       return podaRepository.findAll();
    }

}
