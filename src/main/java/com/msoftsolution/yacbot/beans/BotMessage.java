package com.msoftsolution.yacbot.beans;


//import javax.persistence.*;
import java.util.Set;

//@Entity
public class BotMessage {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idBot;
    private String Option;

//    @OneToMany(fetch = FetchType.EAGER)
    //TODO TO SEE LATER : => @Cascade(CascadeType.ALL)
    private Set<ResponseBot> responseBots;

    public BotMessage() {
    }

    public BotMessage(long idBot, String option, Set<ResponseBot> responseBots) {
        this.idBot = idBot;
        Option = option;
        this.responseBots = responseBots;
    }

    public long getIdBot() {
        return idBot;
    }

    public void setIdBot(long idBot) {
        this.idBot = idBot;
    }

    public String getOption() {
        return Option;
    }

    public void setOption(String option) {
        Option = option;
    }

    public Set<ResponseBot> getResponseBots() {
        return responseBots;
    }

    public void setResponseBots(Set<ResponseBot> responseBots) {
        this.responseBots = responseBots;
    }
}
