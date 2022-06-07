package com.project1;
import com.service.Users;

public class AddUser {
    private String user;
    Users testi = new Users();
    public String execute(){
        return "success";
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
        System.out.print(this.getUser());
        testi.addU(this.getUser());
    }
}
