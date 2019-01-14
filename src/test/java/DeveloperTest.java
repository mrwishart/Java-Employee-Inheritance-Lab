import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void beforeEach(){
        developer = new Developer("Oggy","BC543572K", 250.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Oggy", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("BC543572K", developer.getNINumber());
    }

    @Test
    public void canSalary(){
        assertEquals(250.50, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(20.20);
        assertEquals(270.70, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(2.51, developer.payBonus(), 0.01);
    }

    @Test
    public void canNotAddNegativeRaise(){
        developer.raiseSalary(-1);
        assertEquals(250.5, developer.getSalary(), 0.01);
    }

    @Test
    public void canChangeName(){
        developer.setName("Dwight Kurt Schrute");
        assertEquals("Dwight Kurt Schrute", developer.getName());
    }

    @Test
    public void canNotChangeNameIfNull(){
        developer.setName(null);
        assertEquals("Oggy", developer.getName());
    }
}
