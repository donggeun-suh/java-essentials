package src.oop;

public class EV6  extends HyundaiElectricCar {
    int plateNumber;

    public EV6(int plateNumber) {
        this.plateNumber = plateNumber;
        this.battery = HyundaiBattery.getHyundaiBattery();
    }

    public String getBatteryModel(){
        return battery.getModelName();
    }

    @Override
    public String getBrand() {
        return "EV6";
    }

    @Override
    public int price() {
        return 1000000;
    }

    @Override
    public int getHyundaiSerialNumber() {
        return 1000000;
    }

    @Override
    int getHyundaiFactoryNumber() {
        return 12;
    }
}
