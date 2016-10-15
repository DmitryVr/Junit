package com.mycompany.junit.junittest;



import org.junit.Test;
import junit.framework.Assert;

public class TestArithmetics {

	/**
	 * @Before - метод выполнится перед каждым тестом
	 * @BeforeClass - один раз перед тестами (метод должен быть static)
	 * @After - после каждого теста
	 * @AfterClass - после всех тестов
	 * 
	 * @Ignore - тест не будет выполняться
	 * 
	 * @Test(timeout=1000) - если выполняется больше указанного времени тест зафейлмтся
	 */
	
	@Test
	public void testAdd() {
		Arithmetics a = new Arithmetics();
		double res = a.add(3, 7);
		Assert.assertTrue(res == 10.0);
	}
	
	@Test
	public void testMult() {
		Arithmetics a = new Arithmetics();
		double res = a.mult(3, 3);
		Assert.assertEquals(res, 9.0);
	}
	
}