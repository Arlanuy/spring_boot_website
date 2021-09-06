package com.test.hplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
@EntityScan(basePackages = "com.test.hplus")
public class HplusappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HplusappApplication.class, args);
	}

}
