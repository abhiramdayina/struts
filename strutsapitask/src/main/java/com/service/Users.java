package com.service;

import java.util.ArrayList;

public class Users {
    static ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> getUD(){
        return list;
    }
    
    public ArrayList<String> addU(String data){
        list.add(data);
        System.out.print(list);
        return list;
    }
    public ArrayList<String> deleteU(String data){
        list.remove(data);
        System.out.print(list);
        return list;
    }
    public ArrayList<String> updateU(String data,String newData){
        if(list.contains(data)){
            list.remove(data);
            list.add(newData);
        }
        System.out.printf(data,list);
        return list;
    }
}
