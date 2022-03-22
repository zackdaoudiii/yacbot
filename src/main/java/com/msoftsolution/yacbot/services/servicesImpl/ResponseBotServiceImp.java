package com.msoftsolution.yacbot.services.servicesImpl;

import com.msoftsolution.yacbot.beans.Users;
import com.msoftsolution.yacbot.services.IService.IResponseBot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResponseBotServiceImp  implements IResponseBot {


    @Override
    public ResponseEntity<?> getAllResponsesBots() {
        List<Users> usersList = new ArrayList<>();
        Users users = new Users(1,"zakaria","daoudi");
        usersList.add(users);
        usersList.add(new Users(2,"chama","ibtissmaa"));
        usersList.add(new Users(3,"proff","yassine"));

        return ResponseEntity.ok(usersList);    }
}
