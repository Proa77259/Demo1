//package org.junit.service;
//
//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.services.CalculatorServices;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//
//        @BeforeClass
//        public static void init(){
//            System.out.println("Before All Test Casese");
//            System.out.println("Stated Date " + new Date());
//        }
//
//        //test method of add two number
//        @Test
//        public void  addTwoNumberTest(){
//            System.out.println("addTwoNumberTest");
//         int result =    CalculatorServices.addTwoNumber(12,45);
//
//         int expected = 57;
//
//            Assert.assertEquals(expected,result);
//
//
//        }
//        @Test
//        public void sumAnyNumberTest(){
//            System.out.println("sumAnyNumberTest");
//           int result =  CalculatorServices.sumTwoNumber(121,34,6343,23,2);
//
//           int expected = 6523;
//
//           Assert.assertEquals(expected,result);
//
//        }
//
//
//        @AfterClass
//    public  static  void cleanup()
//        {
//            System.out.println("After ALl Method");
//            System.out.println("Endend Date " + new Date());
//        }
//}
