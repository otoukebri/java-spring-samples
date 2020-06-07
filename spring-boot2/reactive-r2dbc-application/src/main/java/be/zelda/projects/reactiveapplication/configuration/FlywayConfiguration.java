package be.zelda.projects.reactiveapplication.configuration;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfiguration implements CommandLineRunner {

    @Value("${spring.r2dbc.url}")
    private String url;

    @Value("${spring.r2dbc.username}")
    private String username;

    @Value("${spring.r2dbc.password}")
    private String password;

    @Override
    public void run(String... args) throws Exception {
        Flyway.configure().dataSource(url, username, password)
                .load()
                .migrate();
    }
}
