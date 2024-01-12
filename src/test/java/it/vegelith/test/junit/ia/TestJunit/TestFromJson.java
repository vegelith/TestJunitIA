package it.vegelith.test.junit.ia.TestJunit;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.vegelith.test.junit.ia.service.MainService;

@SpringBootTest
public class TestFromJson {

    @Autowired
    private MainService mainService;

    @Autowired
    private ResourceLoader resourceLoader;

    @Test
    public void testProcessString() throws IOException {
        Map<String, Object> testInput = loadTestInput();
        String stringInput = (String) testInput.get("stringInput");

        String result = mainService.processString(stringInput);

        // Perform assertions based on your expected outcomes
    }

    @Test
    public void testCalculateSumOfNumbers() throws IOException {
        Map<String, Object> testInput = loadTestInput();
        int[] arrayInput = ((List<?>) testInput.get("arrayInput"))
                .stream()
                .mapToInt(value -> ((Number) value).intValue())
                .toArray();

        int result = mainService.calculateSumOfNumbers(arrayInput);

        // Perform assertions based on your expected outcomes
    }

    // Add tests for other MainService methods...

    private Map<String, Object> loadTestInput() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:file\\test-input.json");
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(resource.getInputStream(), Map.class);
    }
}

