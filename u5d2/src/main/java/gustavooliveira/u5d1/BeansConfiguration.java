package gustavooliveira.u5d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Configuration
public class BeansConfiguration {

	@Bean
	public void HW() {
		log.info("Hello world");
	}
		
}
