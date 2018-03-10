package com.javafortesters.demos.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CartesianProductDemo {
	public static Map<String, String>[] getCartesianProduct(Map<String, String[]> targets) {
		ArrayList<Map<String, String>> cartesianProduct = new ArrayList<>();
		for (String key : targets.keySet()) {
			ArrayList<Map<String, String>> internalList = new ArrayList<>();
			for (String value : targets.get(key)) {
				if (cartesianProduct.size() < 1) {
					HashMap<String, String> map = new HashMap<>();
					map.put(key, value);
					internalList.add(map);
				} else {
					for (Map<String, String> map : cartesianProduct) {
						Map<String, String> internalMap = new HashMap<>();
						for (String inKey : map.keySet()) {
							internalMap.put(inKey, map.get(inKey));
							internalMap.put(key, value);
						}
						internalList.add(internalMap);
					}
				}
			}
			cartesianProduct = internalList;
		}

		return cartesianProduct.toArray(new HashMap[cartesianProduct.size()]);
	}
}
