package strategyPattern.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args)
	{
		//SpringApplication.run(ProjectApplication.class, args);

		PaymentService paymentService=new PaymentService();

		paymentService.setStrategy(new PaymentByCreditCard());
		paymentService.processOrder(100);

		System.out.println("***********************");

		paymentService.setStrategy(new PaymentByPaytm());
		paymentService.processOrder(100);
	}

}
