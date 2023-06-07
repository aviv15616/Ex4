import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Segment_2DTest {
    @Test

    public void testContains() {
        Point_2D p1 = new Point_2D(0, 0);
        Point_2D p2 = new Point_2D(2, 2);
        Point_2D p3 = new Point_2D(1, 1);

        Segment_2D segment = new Segment_2D(p1, p2);

        assertTrue(segment.contains(p3));
    }

    @Test
    public void testPerimeter() {
        Point_2D p1 = new Point_2D(0, 0);
        Point_2D p2 = new Point_2D(3, 4);

        Segment_2D segment = new Segment_2D(p1, p2);

        assertEquals(10.0, segment.perimeter(), 0.001);
    }

    @Test
    public void testArea() {
        Point_2D p1 = new Point_2D(0, 0);
        Point_2D p2 = new Point_2D(3, 4);

        Segment_2D segment = new Segment_2D(p1, p2);

        assertEquals(0.0, segment.area(), 0.001);
    }

    @Test
    public void testScale() {
        Point_2D p1 = new Point_2D(1, 1);
        Point_2D p2 = new Point_2D(3, 4);
        Point_2D center = new Point_2D(2, 3);
        double ratio = 2.0;

        Segment_2D segment = new Segment_2D(p1, p2);
        segment.scale(center, ratio);

        Point_2D expectedP1 = new Point_2D(0, -1);
        Point_2D expectedP2 = new Point_2D(4, 7);

        assertEquals(expectedP1, segment.get_p1());
        assertEquals(expectedP2, segment.get_p2());
    }

    @Test
    public void testRotate() {
        Point_2D p1 = new Point_2D(1, 1);
        Point_2D p2 = new Point_2D(3, 4);
        Point_2D center = new Point_2D(2, 3);
        double angleDegrees = 90.0;

        Segment_2D segment = new Segment_2D(p1, p2);
        segment.rotate(center, angleDegrees);

        Point_2D expectedP1 = new Point_2D(3, 5);
        Point_2D expectedP2 = new Point_2D(2, 1);

        assertEquals(expectedP1, segment.get_p1());
        assertEquals(expectedP2, segment.get_p2());
    }

    @Test
    public void testCopy() {
        Point_2D p1 = new Point_2D(0, 0);
        Point_2D p2 = new Point_2D(3, 4);

        Segment_2D segment = new Segment_2D(p1, p2);
        Segment_2D copy = (Segment_2D) segment.copy();

        assertEquals(segment.get_p1(), copy.get_p1());
        assertEquals(segment.get_p2(), copy.get_p2());
    }
}