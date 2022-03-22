package com.msoftsolution.yacbot.beans;

//import javax.persistence.*;

//@Entity
public class ResponseBot {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idResponseBot;
    private String ResponseBot;

//    @ManyToOne(fetch = FetchType.LAZY)
    private BotMessage botMessage;


    public ResponseBot() {}

    public ResponseBot(long idResponseBot, String responseBot, BotMessage botMessage) {
        this.idResponseBot = idResponseBot;
        ResponseBot = responseBot;
        this.botMessage = botMessage;
    }


    public long getIdResponseBot() {
        return idResponseBot;
    }

    public void setIdResponseBot(long idResponseBot) {
        this.idResponseBot = idResponseBot;
    }

    public String getResponseBot() {
        return ResponseBot;
    }

    public void setResponseBot(String responseBot) {
        ResponseBot = responseBot;
    }

    public BotMessage getBotMessage() {
        return botMessage;
    }

    public void setBotMessage(BotMessage botMessage) {
        this.botMessage = botMessage;
    }
}
