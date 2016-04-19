package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

/**
 * Created by irina on 3/1/2016.
 */
@Test
public class SquareTests {
    public void testArea() {
        Square S = new Square(5);
        assert s.area()==25;
    }
}
