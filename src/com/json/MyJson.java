package com.json;

import net.sf.json.JSONObject;

public class MyJson {
  public static void main(String[] args) {
    JSONObject jb = new JSONObject();
    JSONObject jb1 = new JSONObject();
    jb1.put("1", "1");
    jb1.put("2", "2");
    jb1.put("3", "3");
    jb.put("A", "a");
    jb.put("B", "b");
    jb.put("C", "c");
    jb.put("D", "d");
    jb.put("E", "e");
    System.out.println(jb);
    jb.element("jb1", jb1);
    System.out.println(jb);
    System.out.println(jb.size());
    for(int i=0;i<jb.size();i++){
      System.out.println(jb.get(i));
    }
  }
}
