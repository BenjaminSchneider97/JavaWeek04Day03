package Advanced_A6;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void calmString() {
        assertEquals("Strand von ", Main.calmString("Strand von Ibiza"));
        assertEquals("Wirklich blöder Test", Main.calmString("Wirklich blöder Test!"));
        
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}