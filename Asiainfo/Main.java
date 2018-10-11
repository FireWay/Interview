package com.baiyi;

import java.util.*;
/*
 * 亚信，两字符串数组求相同字符串数组
 */

public class Main {

	/**
	 * 求两个字符串数组中相同的字符串
	 *
	 * @param str1 字符串数组
	 * @param str2 字符串数组
	 * @return 字符串数组
	 */
	public static String[] sameWords(String[] str1, String[] str2) throws Exception {
		// 请在此添加代码
		TreeMap<String, Integer> tm = new TreeMap<>();
		
		for(int i = 0; i < str1.length; i++){
			tm.put(str1[i], 0);
		}
		for(int i = 0; i < str2.length; i++){
			if(tm.containsKey(str2[i])){
				tm.put(str2[i],1);
			}
		}
		Iterator<String> it = tm.keySet().iterator();
		StringBuffer res = new StringBuffer();
		while(it.hasNext()){
			String key = (String)it.next();
			int val = tm.get(key);
			res.append(key + ",");
		}
		//System.out.println(res);
		return new String(res).split(",");
	}

	// 若有需要，请在此添加辅助变量、方法

}

