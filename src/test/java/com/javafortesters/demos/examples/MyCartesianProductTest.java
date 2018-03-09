package com.javafortesters.demos.examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MyCartesianProductTest {
	private final String PROD = "products";
	private final String COUNTRY = "countries";
	private final String VENDOR = "vendors";
	private final String APPLE = "apple";
	private final String IBM = "IBM";
	private final String MICRO = "Microsoft";
	private final String USA = "USA";
	private final String CDA = "Canada";
	private final String CONT = "contoso";
	private final String ACME = "Acme";
	private final String WIDG = "widgetco";

	@Test
	public void cartesianProductTest() {

		Map<String, String[]> targets = new HashMap();
		String products[] = { APPLE, IBM, MICRO };
		String countries[] = { USA, CDA };
		String vendors[] = { CONT, ACME, WIDG };
		targets.put(PROD, products);
		targets.put(COUNTRY, countries);
		targets.put(VENDOR, vendors);

		Map<String, String>[] actual = CartesianProductDemo.getCartesianProduct(targets);

		Map<String, String>[] expected = getExpected();

		Assert.assertArrayEquals("Actual Cartesion Product does not equal expected.", expected, actual);

	}

	private Map<String, String>[] getExpected() {

		Map<String, String>[] expected = new HashMap[18];
		Map<String, String> map1 = new HashMap<>();
		map1.put(PROD, APPLE);
		map1.put(COUNTRY, USA);
		map1.put(VENDOR, CONT);
		expected[0] = map1;
		Map<String, String> map2 = new HashMap<>();
		map2.put(PROD, IBM);
		map2.put(COUNTRY, USA);
		map2.put(VENDOR, CONT);
		expected[1] = map2;
		Map<String, String> map3 = new HashMap<>();
		map3.put(PROD, MICRO);
		map3.put(COUNTRY, USA);
		map3.put(VENDOR, CONT);
		expected[2] = map3;
		Map<String, String> map4 = new HashMap<>();
		map4.put(PROD, APPLE);
		map4.put(COUNTRY, USA);
		map4.put(VENDOR, ACME);
		expected[3] = map4;
		Map<String, String> map5 = new HashMap<>();
		map5.put(PROD, IBM);
		map5.put(COUNTRY, USA);
		map5.put(VENDOR, ACME);
		expected[4] = map5;
		Map<String, String> map6 = new HashMap<>();
		map6.put(PROD, MICRO);
		map6.put(COUNTRY, USA);
		map6.put(VENDOR, ACME);
		expected[5] = map6;
		Map<String, String> map7 = new HashMap<>();
		map7.put(PROD, APPLE);
		map7.put(COUNTRY, USA);
		map7.put(VENDOR, WIDG);
		expected[6] = map7;
		Map<String, String> map8 = new HashMap<>();
		map8.put(PROD, IBM);
		map8.put(COUNTRY, USA);
		map8.put(VENDOR, WIDG);
		expected[7] = map8;
		Map<String, String> map9 = new HashMap<>();
		map9.put(PROD, MICRO);
		map9.put(COUNTRY, USA);
		map9.put(VENDOR, WIDG);
		expected[8] = map9;
		Map<String, String> map10 = new HashMap<>();
		map10.put(PROD, APPLE);
		map10.put(COUNTRY, CDA);
		map10.put(VENDOR, CONT);
		expected[9] = map10;
		Map<String, String> map11 = new HashMap<>();
		map11.put(PROD, IBM);
		map11.put(COUNTRY, CDA);
		map11.put(VENDOR, CONT);
		expected[10] = map11;
		Map<String, String> map12 = new HashMap<>();
		map12.put(PROD, MICRO);
		map12.put(COUNTRY, CDA);
		map12.put(VENDOR, CONT);
		expected[11] = map12;
		Map<String, String> map13 = new HashMap<>();
		map13.put(PROD, APPLE);
		map13.put(COUNTRY, CDA);
		map13.put(VENDOR, ACME);
		expected[12] = map13;
		Map<String, String> map14 = new HashMap<>();
		map14.put(PROD, IBM);
		map14.put(COUNTRY, CDA);
		map14.put(VENDOR, ACME);
		expected[13] = map14;
		Map<String, String> map15 = new HashMap<>();
		map15.put(PROD, MICRO);
		map15.put(COUNTRY, CDA);
		map15.put(VENDOR, ACME);
		expected[14] = map15;
		Map<String, String> map16 = new HashMap<>();
		map16.put(PROD, APPLE);
		map16.put(COUNTRY, CDA);
		map16.put(VENDOR, WIDG);
		expected[15] = map16;
		Map<String, String> map17 = new HashMap<>();
		map17.put(PROD, IBM);
		map17.put(COUNTRY, CDA);
		map17.put(VENDOR, WIDG);
		expected[16] = map17;
		Map<String, String> map18 = new HashMap<>();
		map18.put(PROD, MICRO);
		map18.put(COUNTRY, CDA);
		map18.put(VENDOR, WIDG);
		expected[17] = map18;

		return expected;
	}
}
