package test.sw.wyj.cal; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import sw.wyj.cal.Computer;

import static org.junit.Assert.assertEquals;


/** 
* Computer Tester. 
* 
* @author 王一疆
* @since <pre>十月 30, 2017</pre> 
* @version 1.0 
*/ 
public class ComputerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add() 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here...
    assertEquals(5, new Computer(2,3).add());
} 

/** 
* 
* Method: minus() 
* 
*/ 
@Test
public void testMinus() throws Exception { 
//TODO: Test goes here...
    assertEquals(2, new Computer(5,3).minus());
} 

/** 
* 
* Method: multiply() 
* 
*/ 
@Test
public void testMultiply() throws Exception { 
//TODO: Test goes here...
    assertEquals(10, new Computer(2,5).multiply());
} 

/** 
* 
* Method: divide() 
* 
*/ 
@Test
public void testDivide() throws Exception { 
//TODO: Test goes here...
    assertEquals(8, new Computer(8,1).divide());
} 


} 
