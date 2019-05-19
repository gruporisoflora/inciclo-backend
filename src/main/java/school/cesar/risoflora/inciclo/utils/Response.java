package school.cesar.risoflora.inciclo.utils;


import java.util.HashMap;

public class Response {

    private String STATUS;


    public Response(ResponseType responseType){

        switch (responseType){
            case SUCCESS:
                STATUS = "OK";
                break;
            case ERROR:
                STATUS = "ERROR";
        }
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public enum ResponseType{
        SUCCESS,
        ERROR
    }



}
