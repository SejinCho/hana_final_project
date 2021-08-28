package kr.ac.kopo.blockChain;

import java.util.HashMap;
import java.util.Map;

public class TestMain {

	public static void main(String[] args) {
		Map<String, Object> value = new HashMap<>();
		value.put("artwork_info_id", "artwork1");
		value.put("piece", 3);
		System.out.println(value);
		System.out.println(value.toString());

	}

}
