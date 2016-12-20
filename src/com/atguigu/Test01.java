package com.atguigu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import sun.org.mozilla.javascript.internal.Evaluator;

public class Test01 {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		hashMap.put("BBB", Integer.valueOf(112));
		hashMap.put("AAA", Integer.valueOf(18));
		hashMap.put("CCC", Integer.valueOf(100));
		hashMap.put("DDD", Integer.valueOf(12));

		System.out.println("按key排序");
		SortedMap sortedMap = sortMapByKey(hashMap);

		for (Iterator iterator = sortedMap.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, Integer> entry = (Entry<String, Integer>) iterator.next();
			System.out.println(entry);
		}

		System.out.println("按value排序");
		List<Map.Entry<String, Integer>> list = Test01.sortMapByVal(hashMap);

		for (Map.Entry<String, Integer> mapping : list) {
			System.out.println(mapping.getKey() + ":" + mapping.getValue());
		}

		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + "-------" + entry.getValue());
		}
	}
	
	//按照key值,排列map集合
	public static SortedMap sortMapByKey(HashMap<String,Integer> hashMap) {
		TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);
		return treeMap;
	}
		
	//按照value值,排列map集合
	public static List<Entry<String, Integer>> sortMapByVal(HashMap<String, Integer> hashMap){
		List<Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2) {
				Integer value1 = o1.getValue();
				Integer value2 = o2.getValue();
				return value1.compareTo(value2);
			}
		});
		return list;
	}
	
	
	
	
	
	
//		//取key值的set集合
//		Set<String> keySet = hashMap.keySet();
//		//将集合转换为数组
//		String[] array = (String[]) keySet.toArray();
//		String string = "";
//		//取出元素排序
//		for (int i = 0; i < array.length; i++) {
//			int compareTo = array[i].compareTo(array[i+1]);
//			if (compareTo > 0) {
//				String temp = "";
//				temp = array[i+1];
//				array[i+1] = array[i];
//				array[i] = temp;
//			}
//			//排好顺序的key值,获取到value值,放入map中
//			string = array[i].toString();
////			hashMap.put(string,);
////			
//		}
//		
		
	

}
