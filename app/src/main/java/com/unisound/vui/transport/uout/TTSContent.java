package com.unisound.vui.transport.uout;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;

@Deprecated
public class TTSContent {

    @JSONField(name = "play_text")
    @SerializedName("play_text")
    private String playContent;

    // Default constructor
    public TTSContent() {
        super();
    }

    // Constructor with playContent parameter
    public TTSContent(String playContent) {
        super();
        this.playContent = playContent;
    }

    // Getter for playContent
    public String getPlayContent() {
        return playContent;
    }

    // Setter for playContent
    public void setPlayContent(String playContent) {
        this.playContent = playContent;
    }
}
