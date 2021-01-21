package com.lacivita.authorization;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserService {

    private static final Map<Integer, String> allUsers = new HashMap<>();

    static {
        allUsers.put(1, "Jim");
        allUsers.put(2, "Alex");
        allUsers.put(3, "Marie");
        allUsers.put(4, "Annie");
        allUsers.put(5, "Jack");
       }

       public Collection<String> getAllUsers(){
        return allUsers.values();
       }

       public String getById(Integer useriId){
        return allUsers.get(useriId);
       }
}
