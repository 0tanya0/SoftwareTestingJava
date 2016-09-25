package ru.stqa.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

/**
 * Created by 0tanya0 on 9/25/2016.
 */
public class LongDistanceTest {
    @Test
    public void testLongDistance(){
        Point p1 = new Point(77777777, 2222222);
        Point p2 = new Point(46666666, 388888888);
        Assert.assertEquals(p1.distance(p2),3.879162433093127E8);
    }
}
