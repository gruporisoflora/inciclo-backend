package school.cesar.risoflora.inciclo.core;

public class RegionsManagementPipeline<I,O> {


    private final Step<I,O> current;

    public RegionsManagementPipeline(Step<I,O> current){
        this.current = current;

    }


    public  <NewO>  RegionsManagementPipeline<I,NewO>  pipe(Step<O,NewO> next){

        return new RegionsManagementPipeline<>(input -> next.execute(current.execute(input)));
    }

    public O execute(I input){

        return current.execute(input);
    }

}
