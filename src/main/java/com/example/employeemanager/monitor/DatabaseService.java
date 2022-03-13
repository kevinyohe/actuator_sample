package com.example.employeemanager.monitor;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements HealthIndicator {
    private final String DATABASE_SERVICE = "DatabaseService";
    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        if(isDatabaseGreen()) {
            return Health.up().withDetail(DATABASE_SERVICE, "Service is running").build();
        }
        return Health.down().withDetail(DATABASE_SERVICE, "Service is not running").build();
    }

    private boolean isDatabaseGreen(){
        return true;
    }
}
