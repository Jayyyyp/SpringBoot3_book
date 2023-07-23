package me.jay.springbootdeveloper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitTest {
    @DisplayName("1+2=3이다")
    @Test
    @Transactional
    public void junitTest(){
        int a = 1;
        int b = 2;
        int sum = 3;

        assertEquals(a+b, sum);
    }
}
