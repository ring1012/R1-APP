package com.phicomm.speaker.device.custom.outputevents;

import com.unisound.vui.transport.uout.OutputEvent;

public class BluetoothOutputEvent extends OutputEvent<Boolean> {
    public BluetoothOutputEvent(Boolean data) {
        super(1, data);
    }
}
