package com.example.employeemanager.monitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomEndpointTest {

    @Test
    void customEndpoint() {
        CustomEndpoint customEndpoint = new CustomEndpoint();
        assertEquals(customEndpoint.customEndpoint().toString(),"{name.blah.com=down}");
    }
}