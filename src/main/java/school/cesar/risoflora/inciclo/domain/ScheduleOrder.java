package school.cesar.risoflora.inciclo.domain;

public class ScheduleOrder {

    private int id;

    private PodaScheduleType type;


    public ScheduleOrder() {
    }

    public ScheduleOrder(int id, PodaScheduleType type) {
        this.id = id;
        this.type = type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PodaScheduleType getType() {
        return type;
    }

    public void setType(PodaScheduleType type) {
        this.type = type;
    }

    public enum PodaScheduleType{

        INSPECTION(0),
        PODA(1);


        private int inspectionType;


        PodaScheduleType(int type){
            this.inspectionType = type;
        }
    }
}
