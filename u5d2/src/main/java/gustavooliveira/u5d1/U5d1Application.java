package gustavooliveira.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d1Application.class, args);
		
		// esercizio 1
				AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1Application.class);
				
				ctx.getBean("HW");
				
				ctx.close();
	}

}
