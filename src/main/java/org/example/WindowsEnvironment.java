package org.example;

public class WindowsEnvironment {

    private String os;
    private String computerName;
    public WindowsEnvironment() {
        this.os = System.getenv("OS");
        this.computerName = System.getenv("COMPUTERNAME");
    };

    public String getComputerName() {
        return computerName;
    }

    public String getOs() {
        return os;
    }
}
