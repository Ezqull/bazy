package projekt.bazy2;

import com.vaadin.flow.component.dependency.NpmPackage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@NpmPackage(value = "lumo-css-framework", version = "^4.0.10")
@ComponentScan({"projekt.bazy2.view"})
@ComponentScan({"projekt.bazy2"})
@EnableJpaRepositories(basePackages={"projekt.bazy2.repository"})
@EnableTransactionManagement
public class Bazy2Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Bazy2Application.class, args);
	}

}
