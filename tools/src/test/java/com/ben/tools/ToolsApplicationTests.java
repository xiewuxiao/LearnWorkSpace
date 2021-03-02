package com.ben.tools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ToolsApplicationTests {

    public static void main(String[] args) {
        Student s0 = new Student("曹军",21);
        Student s1 = new Student("曹军",21);
        System.out.println(s0.equals(s1));
        System.out.println(s0==s1);
    }

}
