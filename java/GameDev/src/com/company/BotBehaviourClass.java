package com.company;

public class BotBehaviourClass {
    int botTotal = 0;

    public BotBehaviourClass(int botTotal) {
        this.botTotal = botTotal;
    }

    public int coperate()
    {
        this.botTotal = this.botTotal-1;
        return this.botTotal;
    }
    public int cheat()
    {
        this.botTotal = this.botTotal+3;
        return this.botTotal;
    }

}
