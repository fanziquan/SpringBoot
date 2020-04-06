package com.example.demo;

import com.example.demo.adapter.Source;
import com.example.demo.adapter.Wrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) {
        Source source = new Source();
        Wrapper table = new Wrapper(source);
        table.method1();
        table.method2();
    }

}
