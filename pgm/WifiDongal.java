package com.Xworkz.pgm;

public class WifiDongal {
  String brand;
  int transferRate;
  int itemWeight;

    public WifiDongal(String brand, int transferRate, int itemWeight) {
        this.brand = brand;
        this.transferRate = transferRate;
        this.itemWeight = itemWeight;
    }

    @Override
    public String toString() {
        return ("brand: "+this.brand+"  transferRate: "+this.transferRate+"  itemWeight: "+this.itemWeight);
    }

    @Override
        public boolean equals(Object obj) {
            WifiDongal leftSide=this;
            if(obj!=null){
                if(obj instanceof WifiDongal){
                    WifiDongal rightSide=(WifiDongal)obj;
                    if(leftSide.transferRate==rightSide.transferRate && leftSide.itemWeight==rightSide.itemWeight){
                        System.out.println("wifi1 & wifi2 are equal..");
                       // System.out.println(toString());
                        return true;
                    }
                    else {
                        System.err.println("wifi1 & wifi2 are not equal..");
                    }
                }
                else{
                    System.err.println("its not instance of WifiDongal..");
                }

            }
            else{
                System.err.println("obj is having null plz add valid data..");
            }
            return false;
        }



    }


