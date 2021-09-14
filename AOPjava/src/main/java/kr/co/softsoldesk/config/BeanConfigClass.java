package kr.co.softsoldesk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = "kr.co.softsoldesk.beans")
@EnableAspectJAutoProxy
public class BeanConfigClass {

	
}
