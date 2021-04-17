package com.example.javatokotlin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class JavaDemoTest {
    private JavaDemo demo = new JavaDemo();

    @Test
    public void case2() {
        demo.safeCallExternalMethod();
    }

}
