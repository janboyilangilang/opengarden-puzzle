package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		boolean flag = true;
		int targetPopulation = 100000000;
		List<Integer> populations = Arrays.asList(18897109, 12828837, 9461105, 6371773, 5965343, 5946800, 5582170,
				5564635, 5268860, 4552402, 4335391, 4296250, 4224851, 4192887, 3439809, 3279833, 3095313, 2812896,
				2783243, 2710489, 2543482, 2356285, 2226009, 2149127, 2142508, 2134411);
		while (flag) {
			Collections.shuffle(populations);
			List<Integer> result = getSubset(targetPopulation, populations);
			if (!result.isEmpty()) {
				flag = false;
				System.out.println(result);
			}
		}
	}

	private static List<Integer> getSubset(int targetPopulation, List<Integer> list) {
		List<Integer> result = new ArrayList<>();
		for (Integer integer : list) {
			result.add(integer);
			targetPopulation = targetPopulation - integer;
			if (targetPopulation == 0) {
				return result;
			}
		}
		return new ArrayList<>();
	}

}
