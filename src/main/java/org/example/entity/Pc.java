package org.example.entity;

public class Pc {
    private String Model;
    private PcTtype type;

    public Pc(String model, PcTtype type) {
        Model = model;
        this.type = type;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public PcTtype getType() {
        return type;
    }

    public void setType(PcTtype type) {
        this.type = type;
    }
}
