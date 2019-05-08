package school.cesar.risoflora.inciclo.domain;

public class ScheduleOrder {

    private int id;

    private PodaScheduleType scheduleType;


    public ScheduleOrder() {
    }

    public ScheduleOrder(int id, PodaScheduleType type) {
        this.id = id;
        this.scheduleType = type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PodaScheduleType getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(PodaScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }

    public enum PodaScheduleType{

        INSPECTION(0),
        PODA(1);


        private int scheduleType;


        PodaScheduleType(int type){
            this.scheduleType = type;
        }
    }
}
