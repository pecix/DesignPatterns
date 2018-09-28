package DesignPatterns.builder;

public class House {

    private String wallType;
    private String windowsType;
    private String roofType;
    private String houseName;

    public House(String wallType, String windowsType, String roofType, String houseName) {
        this.wallType = wallType;
        this.windowsType = windowsType;
        this.roofType = roofType;
        this.houseName = houseName;
    }
}
