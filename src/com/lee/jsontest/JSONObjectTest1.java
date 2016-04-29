package com.lee.jsontest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JSONObjectTest1 {
	public static void main(String[] args) {
		/**
		 * 1. List集合转换成json代码
		 
		List list = new ArrayList();
		list.add( "first" );
		list.add( "second" );

		JSONArray jsonArray2 = JSONArray.fromObject( list );
		System.out.println(jsonArray2);
		*/
		
		/**
		 * 2. Map集合转换成json代码
		
		Map map = new HashMap();

		map.put("name", "json");
		map.put("bool", Boolean.TRUE);
		map.put("int", new Integer(1));
		map.put("arr", new String[] { "a", "b" });
		map.put("func", "function(i){ return this.arr[i]; }");

		JSONObject json = JSONObject.fromObject(map);
		System.out.println(json);
		 */
		
		/**
		 * 3. Bean转换成json代码
		 
		JSONObject jsonObject = JSONObject.fromObject(new JsonBean("lee"));
		System.out.println(jsonObject);
		*/
		
		/**
		 * 4. 数组转换成json代码
		boolean[] boolArray = new boolean[] { true, false, true };

		JSONArray jsonArray1 = JSONArray.fromObject(boolArray);
		System.out.println(jsonArray1);
		*/
		
		/**
		 * 5. 一般数据转换成json代码
		 
		JSONArray jsonArray3 = JSONArray.fromObject("['json','is','easy']" );
		System.out.println(jsonArray3);
		*/
		
		/**
		 * 6.把两个拼装好的JSON串合并成一个新的JSON，两个JSON相同的key值情况下只保存一个，后放入的JSON串对应key的Value值会覆盖先放入的。
		
		JSONObject jsonOne = new JSONObject();  
        JSONObject jsonTwo = new JSONObject();  
  
        jsonOne.put("name", "kewen");  
        jsonOne.put("age", "24");  
  
        jsonTwo.put("hobbit", "Dota");  
        jsonTwo.put("hobbit2", "wow");  
  
        JSONObject jsonThree = new JSONObject();  
  
        jsonThree.putAll(jsonOne);  
        jsonThree.putAll(jsonTwo);  
  
        System.out.println(jsonThree.toString()); 
        
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", "孙大圣");
		params.put("age", "500岁");
		JSONObject jsonObj = new JSONObject();
		jsonObj.putAll(params);
		
		System.out.println(jsonObj);
		 */
		
	}
	
}
