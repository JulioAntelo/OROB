import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcronymTest {

    @Test
    void getPNG() {
        Acronym a= new Acronym("Portable Network Graphics");
        assertEquals("PNG",a.get());
    }
