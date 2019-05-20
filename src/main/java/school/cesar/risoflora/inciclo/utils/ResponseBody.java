package school.cesar.risoflora.inciclo.utils;


import java.util.HashMap;

public class ResponseBody<T> {

    private ResponseType STATUS;

    private T data;


    public ResponseBody(ResponseType STATUS){

        this.STATUS = STATUS;

    }


    public ResponseBody(ResponseType STATUS, T data) {
        this.STATUS = STATUS;
        this.data = data;
    }


    public ResponseType getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(ResponseType STATUS) {
        this.STATUS = STATUS;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public enum ResponseType{
        OK,
        ERROR
    }



}
