package spring5_lifecycle_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring5_lifecycle_study.spring.Client2;

@Configuration
@ComponentScan(basePackages = {"spring5_lifecycle_study.spring"})//여기 적힌곳에서만 검색해달라
public class AppCtx {
	
	@Bean(initMethod = "connect",destroyMethod = "close")
	public Client2 client2() {
		return new Client2();
	}

}
