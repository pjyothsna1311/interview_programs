package DesignPatterns;

public class PhoneBuilderPattern {

    private String os;
    private String camera;
    private String size;
    private String battery;

    public PhoneBuilderPattern(String os, String camera, String size, String battery) {
        this.os = os;
        this.camera = camera;
        this.size = size;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "PhoneBuilderPattern{" +
                "os='" + os + '\'' +
                ", camera='" + camera + '\'' +
                ", size='" + size + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}

class PhoneBuilder {

    private String os;
    private String camera;
    private String size;
    private String battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilderPattern getPhone() {
        return new PhoneBuilderPattern(os,camera,size,battery);
    }
}

class Shop {
    public static void main(String[] args) {
        PhoneBuilderPattern phoneBuilderPattern = new PhoneBuilder().setBattery("6000mah").getPhone();
        System.out.println(phoneBuilderPattern);
    }


}
