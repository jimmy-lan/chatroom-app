package com.group0536.chatroom;

import java.util.ArrayList;

public abstract class ChattingRoom {
    private ArrayList<Observer> Members;
    private Message CurrentMessage;
    private int ChatRoomId;
    private int Capacity;
    private ArrayList<Message> MessageHistory;
    private String Name;



}
