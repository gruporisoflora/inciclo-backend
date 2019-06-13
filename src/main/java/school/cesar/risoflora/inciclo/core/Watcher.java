package school.cesar.risoflora.inciclo.core;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Watcher implements Job {



    private static  int a = 10;
    /*
    * Analizar Região para procurar Areas passíveis de se realizar podas
    */
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Realizando tarefa");

        RegionsManager.getInstance().execute();

    }
}
