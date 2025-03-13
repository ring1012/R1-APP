package com.unisound.vui.transport.uout;

public class ChangeWakeupWordEvent extends OutputEvent<String> {

    public ChangeWakeupWordEvent(String data) {
        super(3, data);
    }
}