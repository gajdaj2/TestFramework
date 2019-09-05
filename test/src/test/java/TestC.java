import model.TestStep;
import model.Tests;
import org.testng.annotations.Test;

public class TestC {

    public TestStep t1 = this::Test1;
    public TestStep t2 = this::Test2;
    public TestStep t3 = this::Test3;


    public Tests t;



    @Test
    public void FirstTest(){
        t = new Tests();
        t.list.add(t1);
        t.list.add(t2);
        t.list.add(t3);
        t.RunAllTest();
    }

    public void Test1(){
        System.out.println("Test 1");
    }

    public void Test2(){
        System.out.println("Test 2");
    }

    public void Test3(){
        System.out.println("Test 3");
    }






}
