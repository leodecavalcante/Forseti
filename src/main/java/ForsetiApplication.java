package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class ForsetiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForsetiApplication.class, args);
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/maps");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");

        return dataSource;
    }
}
