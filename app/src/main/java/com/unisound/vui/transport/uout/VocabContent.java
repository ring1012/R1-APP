package com.unisound.vui.transport.uout;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;

import java.util.Map;
import java.util.List;

public class VocabContent {

    @JSONField(name = "grammarTag")
    @SerializedName("grammarTag")
    private String grammarTag;

    @JSONField(name = "vocabContent")
    @SerializedName("vocabContent")
    private Map<String, List<String>> vocabContent;

    // Default constructor
    public VocabContent() {
        super();
    }

    // Constructor with vocabContent and grammarTag parameters
    public VocabContent(Map<String, List<String>> vocabContent, String grammarTag) {
        super();
        this.vocabContent = vocabContent;
        this.grammarTag = grammarTag;
    }

    // Getter for grammarTag
    public String getGrammarTag() {
        return grammarTag;
    }

    // Getter for vocabContent
    public Map<String, List<String>> getVocabContent() {
        return vocabContent;
    }

    // Setter for grammarTag
    public void setGrammarTag(String grammarTag) {
        this.grammarTag = grammarTag;
    }

    // Setter for vocabContent
    public void setVocabContent(Map<String, List<String>> vocabContent) {
        this.vocabContent = vocabContent;
    }
}
