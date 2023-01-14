package login.sign.student.configer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("login.sign")
public class DetailsConfiger {
	 @Bean
	    public LocalContainerEntityManagerFactoryBean local() {
	    	LocalContainerEntityManagerFactoryBean fire=new LocalContainerEntityManagerFactoryBean();
	        fire.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
	    	return fire;
	    }
}
