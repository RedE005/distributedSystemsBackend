package com.rede.distributedappserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@EnableMongoRepositories
@SpringBootApplication(exclude = {JpaRepositoriesAutoConfiguration.class})
public class DistributedAppServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedAppServerApplication.class, args);
	}

	@Bean
	public CommonsRequestLoggingFilter loggingFilter() {
		CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
		filter.setIncludeQueryString(true);
		filter.setIncludePayload(true);
		filter.setIncludeHeaders(true);
		filter.setAfterMessagePrefix("REQUEST DATA : ");
		return filter;
	}

}
