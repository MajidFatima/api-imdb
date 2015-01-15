package com.omertron.imdbapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.Map;

@JsonIgnoreProperties({"@meta","db"})
public class ImdbError extends AbstractJsonMapping {

    @JsonProperty("@type")
    private String type = "";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
