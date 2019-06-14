package school.cesar.risoflora.inciclo.core;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@EnableScheduling
public class Watcher {



    private static  int a = 10;
    private static final String CRON_EXPRESSION_DEV = "* * * ? * *";


    @Autowired
    private ApplicationContext context;
    /*
    * Analizar Região para procurar Areas passíveis de se realizar podas
    */


    @Scheduled(cron = CRON_EXPRESSION_DEV)
    public void execute() {
        System.out.println("Realizando tarefa");

        RegionsManager regionsManager = context.getBean(RegionsManager.class);

        regionsManager.execute();

    }
}
