import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.backendTest.BackendMobiquityApplication;
import com.backendTest.controller.AtmController;
import com.backendTest.service.AtmService;

@RunWith(SpringRunner.class)
public class AtmControllerTest {
	
	@InjectMocks
	AtmController controller;
	
	@Mock
	AtmService service;
	
	@Test
	public void allEmployeesMethodTest() {
		controller.allEmployeesMethod();
		
	}
	
	@Test
	public void employeeCity() {
		controller.employeeCity("abc");
		
	}
}
