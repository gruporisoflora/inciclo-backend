package school.cesar.risoflora.inciclo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import school.cesar.risoflora.inciclo.domain.Poda;
import school.cesar.risoflora.inciclo.domain.ScheduleOrder;
import school.cesar.risoflora.inciclo.repositories.PodaRepository;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service

public class PodaService {

    @Autowired
    PodaRepository podaRepository;

    HashMap<String,String>  errorStatus = new HashMap<>();
    HashMap<String,String>  successStatus = new HashMap<>();


    public PodaService(){
        errorStatus.put("STATUS","FAILED");
        successStatus.put("STATUS","OK");
    }

    public Poda insert(Poda poda){
        Poda podaResult = podaRepository.save(poda);




        return podaResult;
    }


    @Transactional
    public void insertAll(List<Poda> podas){
        podaRepository.saveAll(podas);
    }


    public HashMap<String,String> schedule(int id,ScheduleOrder order){

        Poda poda = this.get(id).get();



        System.out.println(id);


        switch (order.getScheduleType()){
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
        return this.successStatus;

    }



    public Optional<Poda> get(int id){
      return podaRepository.findById(id);
    };

    public Iterable<Poda> findAll(){
       return podaRepository.findAll();
    }

}
