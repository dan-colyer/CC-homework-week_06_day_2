package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    Employee employee;
    Manager manager;
    Director director;

    @Before
    public void before() {
        employee = new Employee(1, "Wilma", "AB123456C", 30000.00 );
        manager = new Manager(1, "Hetty", "ZB123456C", 40000.00, "FinTech" );
        director = new Director(1, "Hetty", "ZB123456C", 40000.00, "FinTech", 1000000);
    }

    @Test
    public void canGetEmployeeId() {
        assertEquals(1, employee.getId());
    }

    @Test
    public void canGetEmployeeName() {
        assertEquals("Wilma", employee.getName());
    }

    @Test
    public void canGetEmployeeSSn() {
        assertEquals("AB123456C", employee.getSocialSecurityNumber());
    }

//    @Test
//    public void canSetEmployeeId() {
//        employee.setId(99);
//        assertEquals(99, employee.getId());
//    }

    @Test
    public void canSetEmployeeName() {
        employee.setName("Betty");
        assertEquals("Betty", employee.getName());
    }

    @Test
    public void testRaiseSalary() {
        employee.raiseSalary(30000.00);
        assertEquals(60000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetManagerDeptName() {
        assertEquals("FinTech", manager.getDeptName());
    }

    @Test
    public void canGetDirectorBudget() {
        assertEquals(1000000, director.getBudget(), 0.01);
    }

//    @Test
//    public void canSetEmployeeSsn() {
//        employee.setSocialSecurityNumber("XY987654Z");
//        assertEquals("XY987654Z", employee.getSocialSecurityNumber());
//    }

//    @Test
//    public void canSetEmployeeSalary() {
//        employee.setSalary(40000.00);
//        assertEquals(40000.00, employee.getSalary(), 0.01);
//    }
}
