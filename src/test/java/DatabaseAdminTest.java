import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseadmin;

    @Before
    public void beforeEach(){
        databaseadmin = new DatabaseAdmin("Oggy","BC543572K", 250.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Oggy", databaseadmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("BC543572K", databaseadmin.getNINumber());
    }

    @Test
    public void canSalary(){
        assertEquals(250.50, databaseadmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseadmin.raiseSalary(20.20);
        assertEquals(270.70, databaseadmin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(2.51, databaseadmin.payBonus(), 0.01);
    }
}
