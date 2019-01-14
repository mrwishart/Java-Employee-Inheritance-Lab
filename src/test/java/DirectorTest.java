import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DirectorTest {
    Director director;

    @Before
    public void beforeEach(){
        director = new Director("David Brent","AB123456L", 1250.50,"Paper Merchant", 50500.5);
    }

    @Test
    public void canGetName(){
        assertEquals("David Brent", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("AB123456L", director.getNINumber());
    }

    @Test
    public void canSalary(){
        assertEquals(1250.5, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Paper Merchant", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(.20);
        assertEquals(1250.70, director.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(12.51, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(50500.5, director.getBudget(), 0.01);
    }
}
