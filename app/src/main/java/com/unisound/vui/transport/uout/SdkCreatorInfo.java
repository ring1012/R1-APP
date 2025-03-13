package com.unisound.vui.transport.uout;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.unisound.vui.auth.BasicCredentials;
import com.unisound.vui.bootstrap.ANTELocalConfiguration;
import com.unisound.vui.engine.ANTEngineOption;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SdkCreatorInfo {

    @JSONField(name = "credentials")
    @SerializedName("credentials")
    private BasicCredentials credentials;

    @JSONField(name = "engineOption")
    @SerializedName("engineOption")
    private Map<String, Object> engineOption;

    @JSONField(name = "localConfiguration")
    @SerializedName("localConfiguration")
    private ANTELocalConfiguration localConfiguration;

    @JSONField(name = "mainVocab")
    @SerializedName("mainVocab")
    private Map<String, List<String>> mainVocab;

    @JSONField(name = "maintag")
    @SerializedName("maintag")
    private String maintag;

    @JSONField(name = "wakeupWord")
    @SerializedName("wakeupWord")
    private List<String> wakeupWord;

    public SdkCreatorInfo() {
    }

    public BasicCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(BasicCredentials credentials) {
        this.credentials = credentials;
    }

    public Map<String, Object> getEngineOption() {
        return engineOption;
    }

    public void setEngineOption(Map<String, Object> engineOption) {
        this.engineOption = engineOption;
    }

    public ANTELocalConfiguration getLocalConfiguration() {
        return localConfiguration;
    }

    public void setLocalConfiguration(ANTELocalConfiguration localConfiguration) {
        this.localConfiguration = localConfiguration;
    }

    public Map<String, List<String>> getMainVocab() {
        return mainVocab;
    }

    public void setMainVocab(Map<String, List<String>> mainVocab) {
        this.mainVocab = mainVocab;
    }

    public String getMaintag() {
        return maintag;
    }

    public void setMaintag(String maintag) {
        this.maintag = maintag;
    }

    public List<String> getWakeupWord() {
        return wakeupWord;
    }

    public void setWakeupWord(List<String> wakeupWord) {
        this.wakeupWord = wakeupWord;
    }

    public Map<String, Object> parseFromANTEngineOption(Map<ANTEngineOption<?>, Object> options) {
        Map<String, Object> result = new HashMap<>();
        for (ANTEngineOption<?> option : options.keySet()) {
            result.put(option.name(), options.get(option));
        }
        return result;
    }

    public Map<ANTEngineOption<?>, Object> toANTEngineOption(Map<String, Object> optionsMap) {
        Map<ANTEngineOption<?>, Object> result = new HashMap<>();
        for (String key : optionsMap.keySet()) {
            result.put(ANTEngineOption.valueOf(key), optionsMap.get(key));
        }
        return result;
    }
}