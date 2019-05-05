package school.cesar.risoflora.inciclo.domain;


import school.cesar.risoflora.inciclo.utils.Coordenate;

import java.awt.geom.Point2D;
import java.util.List;

public class Poda {
    private List<Point2D> area;
    private PodaStep step;
    private PodaStepStatus status;


    public Poda(List<Point2D> area, PodaStep step, PodaStepStatus status) {
        this.area = area;
        this.step = step;
        this.status = status;
    }


    public List<Point2D> getArea() {
        return area;
    }

    public void setArea(List<Point2D> area) {
        this.area = area;
    }

    public PodaStep getStep() {
        return step;
    }

    public void setStep(PodaStep step) {
        this.step = step;
    }

    public PodaStepStatus getStatus() {
        return status;
    }

    public void setStatus(PodaStepStatus status) {
        this.status = status;
    }

    public enum PodaStep{
        GROWING(0),
        NEXT_TO_CABLE(1),
        IN_INPECTION(2),
        CHECKED_TO_CUT(3);


        private int step;

        PodaStep(int step){
            this.step = step;
        }
    }

    public enum PodaStepStatus{
        DELAYED(0),
        DONE(1),
        SCHEDULED(2);


        private int stepStatus;

        PodaStepStatus(int stepStatus){
            this.stepStatus = stepStatus;
        }
    }


}
