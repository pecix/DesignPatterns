package DesignPatterns.builder;

public abstract class HouseBuilder {

    protected String windowsType;
    protected String houseName;

    public HouseBuilder setWindowsType(String windowsType) {
        this.windowsType = windowsType;
        return this;
    }

    public HouseBuilder setHouseName(String houseName) {
        this.houseName = houseName;
        return this;
    }

    public abstract House build();
}
