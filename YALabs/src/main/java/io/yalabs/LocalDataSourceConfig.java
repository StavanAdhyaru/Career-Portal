package io.yalabs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
//@Profile("local")
@ConfigurationProperties("spring.datasource")
public class LocalDataSourceConfig  {

	@Value("${jdbc.sql.driverClassName}")
	private String driverClassName;

	@Value("${jdbc.sql.url}")
	private String url;

	@Value("${jdbc.sql.username}")
	private String userName;

	@Value("${jdbc.sql.password}")
	private String password;


	/**===========================================
	 * Method Name: localDataSource
	 * CreatedDate: 14/09/2018
	 * CreatedBy : Akash Patel 
	 * Description: initialize the class attributes
	 * @param <none>
	 * @return Returns local datasource
	 =============================================*/	
	@Bean
	public DriverManagerDataSource localDataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);

		return dataSource;
	}
}

