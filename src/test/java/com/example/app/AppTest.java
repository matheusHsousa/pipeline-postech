package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testSomar() {
        App app = new App();
        assertEquals(4, app.somar(2, 2));
    }
}
