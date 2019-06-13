package school.cesar.risoflora.inciclo;


import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import school.cesar.risoflora.inciclo.core.RegionsManager;
import school.cesar.risoflora.inciclo.core.Watcher;
import school.cesar.risoflora.inciclo.services.RegionsService;
import com.google.common.collect.Lists;
import javax.annotation.PostConstruct;

@Component
public class AppInitializator {

    private static final Logger log = LoggerFactory.getLogger(AppInitializator.class);




    @Autowired
    private RegionsService service;

    @PostConstruct
    private void init(){

       /* try{
            JobDetail watcherBuilder = JobBuilder
                    .newJob(Watcher.class)
                    .withDescription("watcherJob").build();

            Trigger trigger1 = TriggerBuilder.newTrigger().withIdentity("simpleTrigger", "group1")
                    .withSchedule(CronScheduleBuilder.cronSchedule(CRON_EXPRESSION_DEV)).build();
            Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
            scheduler1.start();
            scheduler1.scheduleJob(watcherBuilder, trigger1);


        }catch (Exception e){
            e.printStackTrace();
        }*/



    }
}
