package com.project1;
import java.util.ArrayList;

import com.service.Users;
public class ListUser {
    private ArrayList<String> testi1;
    public String execute(){
        Users testi = new Users();
        setTesti1(testi.getUD());
        System.out.print(testi1);
        return "success";
    }
    public ArrayList<String> getTesti1() {
        return testi1;
    }
    public void setTesti1(ArrayList<String> testi1) {
        this.testi1 = testi1;
    }
}
