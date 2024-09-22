package com.example.pr12;

public class State {
    private String name;
    private String element;
    private int flagResource;

    public State(String name, String element, int flag){
        this.name=name;
        this.element=element;
        this.flagResource=flag;
    }

    public String getName(){return this.name;}

    public void setName(String name ){this.name = name;}

    public String getElement(){return this.element;}

    public void setElement(String capital){this.element = element;}

    public int getFlagResource(){return this.flagResource;}

    public  void setFlagResource(int flagResource){this.flagResource = flagResource;}
}

