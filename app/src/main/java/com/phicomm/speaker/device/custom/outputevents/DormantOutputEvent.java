package com.phicomm.speaker.device.custom.outputevents;

import com.unisound.vui.transport.uout.OutputEvent;

public class DormantOutputEvent extends OutputEvent<Boolean> {
    public DormantOutputEvent(Boolean data) {
        super(1, data);
    }
}
