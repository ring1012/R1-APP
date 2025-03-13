package com.phicomm.speaker.device.custom.outputevents;

import com.unisound.vui.transport.uout.OutputEvent;

public class NetworkConfigOutputEvent extends OutputEvent<Boolean> {
    public NetworkConfigOutputEvent(Boolean data) {
        super(1, data);
    }
}
