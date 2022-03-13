package com.example.employeemanager.monitor;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "dns")
public class CustomEndpoint {

    @ReadOperation
    public Map<String, String> customEndpoint() {
        Map<String, String> map = new HashMap<>();
        map.put("name.blah.com", "down");
        return map;
    }
}
