package Triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;



class ControllerTest {

    private final Controller cont = new Controller();

    //--Triangle Inequality Tests--//

    @Test
    void isValidTriangle(){
        //setup
        //make an ArrayList with sides that are a valid triangle
        ArrayList<Integer> sides = new ArrayList<>();
        sides.add(3);
        sides.add(3);
        sides.add(3);

        //act
        //run the method checkTriangle()
        boolean result = cont.checkTriangle(sides);

        //verify
        //make sure that this returns true
        Assertions.assertTrue(result);
    }

    @Test
    void isNotValidTriangle(){
        //setup
        //make an ArrayList with sides that are an invalid triangle
        ArrayList<Integer> sides = new ArrayList<>();
        sides.add(1);
        sides.add(1);
        sides.add(5); //this side is too long and should invalidate the results

        //act
        //run the method checkTriangle()
        boolean result = cont.checkTriangle(sides);

        //verify
        //make sure that this returns true
        Assertions.assertFalse(result);
    }

    @Test
    void isNotValidBoundaryTriangle(){
        //setup
        //make an ArrayList with sides that are an invalid triangle
        ArrayList<Integer> sides = new ArrayList<>();
        sides.add(2);
        sides.add(2);
        sides.add(4); //this side is too long and should invalidate the results

        //act
        //run the method checkTriangle()
        boolean result = cont.checkTriangle(sides);

        //verify
        //make sure that this returns true
        Assertions.assertFalse(result);
    }

    @Test
    void isNotValidArrayForATriangle(){
        //setup
        //make an ArrayList with sides that are an invalid triangle since there are only two sides
        ArrayList<Integer> sides = new ArrayList<>();
        sides.add(2);
        sides.add(2);

        //act
        //run the method checkTriangle()
        boolean result = cont.checkTriangle(sides);

        //verify
        //make sure that this returns true
        Assertions.assertFalse(result);

        //setup 2
        //add two more sides to make sure
        sides.add(2);
        sides.add(2);

        //act 2
        //run the method checkTriangle()
        result = cont.checkTriangle(sides);

        //verify 2
        //make sure that this returns true
        Assertions.assertFalse(result);
    }

    //--Triangle Type Tests--//

    @Test
    void isEquilateralTriangle(){
        //setup
        //make an ArrayList with sides that are that of an equilateral triangle
        ArrayList<Integer> sides = new ArrayList<>();
        sides.add(2);
        sides.add(2);
        sides.add(2);

        //act
        //run the method getType()
        TriangleTypes type = cont.getType(sides);

        //verify
        //confirm the type returned is EQUILATERAL
        Assertions.assertEquals(type, TriangleTypes.EQUILATERAL);
    }

    @Test
    void isNotEquilateralTriangle(){
        //setup
        //make an ArrayList with sides that are NOT that of an equilateral triangle
        ArrayList<Integer> sides = new ArrayList<>();
        sides.add(2);
        sides.add(2);
        sides.add(3);

        //act
        //run the method getType()
        TriangleTypes type = cont.getType(sides);

        //verify
        //confirm the type returned is not EQUILATERAL
        Assertions.assertNotEquals(type, TriangleTypes.EQUILATERAL);
    }

    @Test
    void isIsoscelesTriangle(){
        //setup
        //make an ArrayList with sides that are that of an isosceles triangle
        ArrayList<Integer> sides = new ArrayList<>();
        sides.add(2);
        sides.add(2);
        sides.add(3);

        //act
        //run the method getType()
        TriangleTypes type = cont.getType(sides);

        //verify
        //confirm the type returned is ISOSCELES
        Assertions.assertEquals(type, TriangleTypes.ISOSCELES);
    }

    @Test
    void isNotIsoscelesTriangle(){
        //setup
        //make an ArrayList with sides that are NOT that of an isosceles triangle
        ArrayList<Integer> sides = new ArrayList<>();
        sides.add(2);
        sides.add(2);
        sides.add(2);

        //act
        //run the method getType()
        TriangleTypes type = cont.getType(sides);

        //verify
        //confirm the type returned is not ISOSCELES
        Assertions.assertNotEquals(type, TriangleTypes.ISOSCELES);
    }

    @Test
    void isScaleneTriangle(){
        //setup
        //make an ArrayList with sides that are that of a scalene triangle
        ArrayList<Integer> sides = new ArrayList<>();
        sides.add(4);
        sides.add(2);
        sides.add(3);

        //act
        //run the method getType()
        TriangleTypes type = cont.getType(sides);

        //verify
        //confirm the type returned is SCALENE
        Assertions.assertEquals(type, TriangleTypes.SCALENE);
    }

    @Test
    void isNotScaleneTriangle(){
        //setup
        //make an ArrayList with sides that are NOT that of a scalene triangle
        ArrayList<Integer> sides = new ArrayList<>();
        sides.add(2);
        sides.add(2);
        sides.add(3);

        //act
        //run the method getType()
        TriangleTypes type = cont.getType(sides);

        //verify
        //confirm the type returned is not SCALENE
        Assertions.assertNotEquals(type, TriangleTypes.SCALENE);
    }

}