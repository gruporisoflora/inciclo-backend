package school.cesar.risoflora.inciclo;


import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import school.cesar.risoflora.inciclo.core.Watcher;

import javax.annotation.PostConstruct;

@Component
public class AppInitializator {

    private static final Logger log = LoggerFactory.getLogger(AppInitializator.class);

    private static final String CRON_EXPRESSION_DEV = "* * * ? * *";

    @PostConstruct
    private void init(){
        try{
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
        }

    }
}
