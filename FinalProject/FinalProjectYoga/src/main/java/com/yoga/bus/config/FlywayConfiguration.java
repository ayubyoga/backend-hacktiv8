package com.yoga.bus.config;

import javax.sql.DataSource;
import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration
public class FlywayConfiguration {

	@Autowired
	public FlywayConfiguration(DataSource dataSource) {
		Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();
	}
	
}
