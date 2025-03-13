package com.unisound.vui.transport.uout;

public class SimulateWakeupEvent extends OutputEvent {

    // Constructor
    public SimulateWakeupEvent(String data) {
        // Calling the constructor of the superclass OutputEvent with a specific integer and the String parameter
        super(2, data);
    }
}
