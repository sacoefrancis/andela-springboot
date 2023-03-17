package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired    private JdbcTemplate jdbcTemplate;
    @GetMapping("/live")
    public ResponseEntity<String> testDbConnection() {
        try {
            String query = "SELECT 1";
            jdbcTemplate.queryForObject(query, Integer.class);
            return ResponseEntity.ok("Well Done");
        } catch (Exception ex) {
            return ResponseEntity.ok("Maintenance!");
        }
    }
}