package school.cesar.risoflora.inciclo.utils;

import java.util.Date;

public class Utils {

    static Long getNumberOfDays(Date a, Date b){


        Long difference = (a.getTime() - b.getTime())/86400000;

        return Math.abs(difference);
    }
}
