import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.backendTest.service.AtmService;

@RunWith(SpringRunner.class)
public class AtmServiceTest {

	@InjectMocks
	AtmService service;
	
	@Test
	public void employeeResponse() {
		service.employeeResponse();
	}
	
	@Test
	public void getAddressByCity() {
		service.getAddressByCity("city");
	}
}
