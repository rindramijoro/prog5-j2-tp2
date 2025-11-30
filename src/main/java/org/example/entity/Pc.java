package org.example.entity;

public class Pc extends RentableItem{
    private PcType type;

    public Pc(String model, PcType type) {
        super(model);
        this.type = type;
    }
}
