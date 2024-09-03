package com.iablocova;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testGetRandomPhrase() {
        // Arrange: список возможных фраз
        List<String> phrases = List.of(
                "The journey of a thousand miles begins with a single step.",
                "The early bird catches the worm.",
                "Never give up on your dreams.",
                "A positive attitude can change everything.",
                "Your potential is limitless."
        );

        // Act: получение случайной фразы
        String randomPhrase = Main.getRandomPhrase();

        // Assert: проверка, что фраза присутствует в списке возможных фраз
        assertTrue(phrases.contains(randomPhrase), "The phrase should be one of the predefined phrases");
    }
}
