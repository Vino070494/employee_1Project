
package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnectionTest implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) {
        try {
            Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            System.out.println("Database connection test successful, result: " + result);
        } catch (Exception e) {
            System.err.println("Database connection test failed:");
            e.printStackTrace();
        }
    }
}
