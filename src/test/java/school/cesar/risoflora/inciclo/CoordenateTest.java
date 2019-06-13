package school.cesar.risoflora.inciclo;


import org.junit.Test;
import school.cesar.risoflora.inciclo.utils.Coordenate;

import static org.junit.Assert.*;


public class CoordenateTest {


    @Test
    public void getDistanceBeetweenCoordenates(){


        assertEquals(1.414, Coordenate.calculateDistance(0,1,1,0),0.001);

        assertEquals(1.414, Coordenate.calculateDistance(0,-1,-1,0),0.001);
    }
}
