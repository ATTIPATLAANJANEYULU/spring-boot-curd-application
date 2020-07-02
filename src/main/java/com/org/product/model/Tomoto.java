package com.org.product.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection= "tomoto")
public class Tomoto implements Serializable {

    @Id
    private Integer boxId;
    private String tomotoName;
    private String areaAddress;

    public Tomoto(Integer boxId, String tomotoName, String areaAddress) {
        this.boxId = boxId;
        this.tomotoName = tomotoName;
        this.areaAddress = areaAddress;
    }

    public Integer getBoxId() {
        return boxId;
    }

    public void setBoxId(Integer boxId) {
        this.boxId = boxId;
    }

    public String getTomotoName() {
        return tomotoName;
    }

    public void setTomotoName(String tomotoName) {
        this.tomotoName = tomotoName;
    }

    public String getAreaAddress() {
        return areaAddress;
    }

    public void setAreaAddress(String areaAddress) {
        this.areaAddress = areaAddress;
    }
}
