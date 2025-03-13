package com.unisound.vui.transport.uout;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;

public class OptionContent {

    @JSONField(name = "optionKey")
    @SerializedName("optionKey")
    private String optionKey;

    @JSONField(name = "optionValue")
    @SerializedName("optionValue")
    private Object optionValue;

    public OptionContent() {
    }

    public OptionContent(String optionKey, Object optionValue) {
        this.optionKey = optionKey;
        this.optionValue = optionValue;
    }

    public String getOptionKey() {
        return optionKey;
    }

    public void setOptionKey(String optionKey) {
        this.optionKey = optionKey;
    }

    public Object getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(Object optionValue) {
        this.optionValue = optionValue;
    }
}