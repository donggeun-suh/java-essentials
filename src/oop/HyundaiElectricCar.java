package src.oop;

// 추상클래스는 미완성 설계도와 같이 일부를 구현하고, 일부를 추상메서드로 남겨, 자식클래스로 하여금 구현하게 한다.
// 때문에 구현된 메서드와 멤버변수를 가질 수 있다. 반면, 인터페이스는 구현을 강제하는 최초의 설계도와 같다고 볼 수 있다.
// 추상메서드를 사용하는 이유는 구현이 공통적일때 이를 반복하는 것을 피하기 위함이다.
// 다중 상속의 가능여부의 차이도 있음.
public abstract class HyundaiElectricCar implements ElectricCar {
    public String manufacturer = "Hyundai";
    // 상속 대신, 위임.
    public Battery battery;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getManufacturer(){
        return manufacturer;
    }

    // 현대라는 제조사의 라인들이 가지고 있는 특징들이 추상메서드로 등록될 수 있음. public 과 default 로 구현가능
    public abstract int getHyundaiSerialNumber();
    abstract int getHyundaiFactoryNumber();


}
