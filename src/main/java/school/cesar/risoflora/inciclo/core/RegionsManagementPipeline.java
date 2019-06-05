package school.cesar.risoflora.inciclo.core;

public class RegionsManagementPipeline<I,O> {


    private final Step<I,O> current;

    public RegionsManagementPipeline(Step<I,O> current){
        this.current = current;
    }
}
