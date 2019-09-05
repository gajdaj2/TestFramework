package model;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Tests {

    public LinkedList<TestStep> list;

    public Tests() {
        this.list = new LinkedList<TestStep>();
    }

    public void RunAllTest(){
        for (TestStep s:list) {
            s.testStep();
        }
    }
}
