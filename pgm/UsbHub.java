package com.Xworkz.pgm;

public class UsbHub {
   int totalPorts;
   int transferRate;
   int batteryRequired;

    public UsbHub(int totalPorts, int transferRate, int batteryRequired) {
        this.totalPorts = totalPorts;
        this.transferRate = transferRate;
        this.batteryRequired = batteryRequired;
    }

    @Override
    public String toString() {
        return ("totalPorts: " + this.totalPorts + "  transferRate: " + this.transferRate + "  batteryRequired: " + this.batteryRequired);
    }

    @Override
    public boolean equals(Object obj) {
        UsbHub leftSide = this;
        if (obj != null) {
            if (obj instanceof UsbHub) {
                UsbHub rightSide = (UsbHub) obj;
                if (leftSide.transferRate == rightSide.transferRate && leftSide.batteryRequired == rightSide.batteryRequired && leftSide.totalPorts==rightSide.totalPorts) {
                    System.out.println("UsbHub1 & UsbHub12 are equal..");
                    return true;
                } else {
                    System.err.println("UsbHub1 & UsbHub2 are not equal..");
                }
            } else {
                System.err.println("its not instance of UsbHub..");
            }

        } else {
            System.err.println("obj is having null plz add valid data..");
        }
        return false;
    }
}






