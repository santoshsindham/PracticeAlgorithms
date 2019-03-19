package problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1Test {

    protected int val1, val2;
    Test1 test1 = new Test1();

    @Before
    public void setUp() throws Exception {
        val1 = 2;
        val2 = 3;
    }

    @Test
    public void main() {

        double result = val1 + val2;
        assertTrue(result == 5);
    }

    @Test
    public void testReturnBoolean(){
        assertTrue(test1.returnBoolean(false) == false);
        assertTrue(test1.returnBoolean(true) == true);
    }
}