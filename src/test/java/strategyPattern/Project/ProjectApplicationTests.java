package strategyPattern.Project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProjectApplicationTests {

	@Test
	void contextLoads() {
	}

   @Test
	void paymentTest()
   {
	   assertEquals(500,PaymentDecide.validate("Paytm"));
   }

}
