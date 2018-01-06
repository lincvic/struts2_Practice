package test.sw.wyj.servlet; 

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import sw.wyj.calculator.Calculator;

import static org.junit.Assert.assertEquals;

/** 
* CalServlet Tester. 
* 
* @author <Authors name> 
* @since <pre>十月 30, 2017</pre> 
* @version 1.0 
*/ 
public class CalServletTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) 
* 
*/ 
@Test
public void testDoPost() throws Exception { 
//TODO: Test goes here...
} 

/** 
* 
* Method: doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) 
* 
*/ 
@Test
public void testDoGet() throws Exception { 
//TODO: Test goes here...
    Calculator cal = new Calculator();

    cal.setNum1(Float.parseFloat("15"));
    cal.setNum2(Float.parseFloat("10"));
    cal.setOp("+");
    assertEquals(25,cal.getResult());
} 


} 
