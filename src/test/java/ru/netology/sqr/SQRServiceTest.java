package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldFindNumExampleFirst(){
        SQRService service = new SQRService();
        int excepted = 6;
        int actual = service.findCountSqrt(10,99);
        Assertions.assertEquals(excepted,actual);
    }
    @Test
    public void shouldFindNumExampleTwo(){
        SQRService service = new SQRService();
        int excepted = 3;
        int actual = service.findCountSqrt(200,300);
        Assertions.assertEquals(excepted,actual);
    }
    @Test
    public void shouldFindNumExampleThird(){
        SQRService service = new SQRService();
        int excepted = 4;
        int actual = service.findCountSqrt(0,15);
        Assertions.assertEquals(excepted,actual);
    }
}