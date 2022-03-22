package com.msoftsolution.yacbot.controllers;

import com.msoftsolution.yacbot.services.IService.IResponseBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/responsesBots/")
public class ResponseBotController {

    private final IResponseBot iResponseBot;

    @Autowired
    public ResponseBotController(IResponseBot iResponseBot){
        this.iResponseBot = iResponseBot;
    }

    @GetMapping
    public ResponseEntity<?> getAllResponsesBots(){
        return iResponseBot.getAllResponsesBots();
    }
}
