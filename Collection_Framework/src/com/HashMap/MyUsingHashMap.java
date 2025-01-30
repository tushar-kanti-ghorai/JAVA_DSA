package com.HashMap;

import javax.swing.text.html.parser.Entity;

public class MyUsingHashMap {
    private Entity[] entities;

    MyUsingHashMap(){
        entities=new Entity[100];
    }

    public void put(String key,String value){
        int hash=Math.abs(key.hashCode()%entities.length);
        entities[hash]=new Entity(key,value);//overriding

    }


    public String get(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
        }

        public void remove(String key){
            int hash=Math.abs(key.hashCode()%entities.length);
            if(entities[hash]!=null && entities[hash].key.equals(key)){
             entities[hash]=null;
            }
        }
    class Entity{
        String key;
        String value;
        Entity(String key,String value){
            this.key=key;
            this.value=value;
        }
    }

    public static void main(String[] args) {
        MyUsingHashMap map=new MyUsingHashMap();
        map.put("Mango", "King of fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Littchi","fav fruit");

        System.out.println(map.get("Mango"));
        map.remove("Mango");
        System.out.println(map.get("Mango"));

    }


}
