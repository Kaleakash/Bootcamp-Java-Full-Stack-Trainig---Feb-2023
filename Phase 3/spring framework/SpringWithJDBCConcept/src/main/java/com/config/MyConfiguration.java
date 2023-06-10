package com.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;

@Configuration 		// beans.xml 
@ComponentScan(basePackages = "com")// <context:component-scan base-package="com"></context:component-scan>
public class MyConfiguration {

	/*<bean class="org.springframework.jdbc.datasource.DriverManagerDataSource" 
id="ds" scope="singleton">
	<property name="driverClassName" value="com.mysql.cj.jdbc.Driver"></property>
	<property name="url" value="jdbc:mysql://localhost:3306/mydb"></property>
	<property name="username" value="root"></property>
	<property name="password" value="root@123"></property>
</bean> 
	 */
	
	@Bean    // object creating or resource creating by us but maintain by container. 
	public DataSource getDataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/mydb");
		dmds.setUsername("root");
		dmds.setPassword("root@123");
		return dmds;
	}
}
