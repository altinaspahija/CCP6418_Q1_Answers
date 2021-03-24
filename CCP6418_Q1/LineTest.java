
// checking all imports might be helpful

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
public class LineTest {

    @Test
    public void testLinePoint1() {
        Line line = new Line();
        assertEquals(5, line.linePoint(1,2,3));
    }
    @Test
    public void testLinePoint2() {
        Line line = new Line();
        assertEquals(6, line.linePoint(1,2,4));
    }

    @Test
    public void testCalculate1() {
        Line line = new Line();
        int[] x_points = {1,2,3};
        int[] results = {4,5,6};
        int lines[] = line.calculate(1,x_points,3);
        assertEquals(results[1],lines[1]);
    }

    @Test
    public void testCalculate2() {
        Line line = new Line();
        int[] x_points = {1,2,3};
        int[] results = {4,5,6};
        int lines[] = line.calculate(1,x_points,3);
        assertEquals(results[0],lines[0]);
    }

}