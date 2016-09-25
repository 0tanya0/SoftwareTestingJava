package ru.stqa.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

/**
 * Created by 0tanya0 on 9/25/2016.
 */
public class DistanceTest {

    @Test
    public void testDistance(){

        Point p1 = new Point(7, 2);
        Point p2 = new Point(4, 3);
        Assert.assertEquals(p1.distance(p2),3.1622776601683795);
        //assert p1.distance(p2) == 3.1622776601683795;
    }

}
