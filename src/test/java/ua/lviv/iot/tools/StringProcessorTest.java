package ua.lviv.iot.tools;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class StringProcessorTest {

    private String inputText;
    private String expectedText;
    private StringProcessor sp;

    @BeforeEach
    void setUp() {
        inputText = "Random text to check test work";
        expectedText = "\tcheck \n\tRandom \n\ttext to test \n\twork \n\t";
        sp = new StringProcessor(inputText);
    }

    @Test
    void testProcessTextUsingHashMap() {
        sp.processTextUsingHashMap();
        assertNotNull(sp.getResultString(), "getResultString does not work");
        assertEquals(expectedText, sp.getResultString(),
                "Text was processed wrong!");
    }

    @Test
    void testGetAndSetInputText() {
        sp.setInputText(inputText);
        assertEquals(inputText, sp.getInputText(), "getter/setter does not work");
    }
}
