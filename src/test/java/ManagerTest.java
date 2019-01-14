import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ManagerTest {
    Manager manager;

    @Before
    public void beforeEach(){
        manager = new Manager("David Brent","AB123456L", 1250.50,"Paper Merchant");
    }

    @Test
    public void canGetName(){
        assertEquals("David Brent", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("AB123456L", manager.getNINumber());
    }

    @Test
    public void canSalary(){
        assertEquals(1250.5, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
    assertEquals("Paper Merchant", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(.20);
        assertEquals(1250.70, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(12.51, manager.payBonus(), 0.01);
    }
}
