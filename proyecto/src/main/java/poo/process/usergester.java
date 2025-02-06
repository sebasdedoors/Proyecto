package poo.process;

import poo.data.User;

import java.util.ArrayList;

import java.util.List;

public class UserGester {
    private List<User> gester;

    public UserGester(){
        this.gester = new ArrayList<>();
    }

    public void addUser(String name, String status){
        User user = new User(name, status);
        gester.add(user);
    }

    public List<User> getUser(){return gester;}

    public User showUser(String name){
        for(User user : gester){
            if(user.getName().equalsIgnoreCase(name)){
                return user;
            }
        } return null;
    }
}
