package src.oop;

import java.util.Objects;

// 싱글턴 패턴으로 구축
public class HyundaiBattery implements Battery {
    // 밑에서와 달리, 바로 생성할 수도 있음.
    // private static HyundaiBattery hyundaiBattery = new HyundaiBattery();
    private static HyundaiBattery hyundaiBattery;
    private String modelName = "EV32156";

    // private 으로 하여 외부에서 생성자 사용 못하게 막음.
    private HyundaiBattery(){

    }

    public static HyundaiBattery getHyundaiBattery() {
        if(Objects.isNull(hyundaiBattery)){
            hyundaiBattery = new HyundaiBattery();
        }
        return hyundaiBattery;
    }

    @Override
    public String getModelName() {
        return modelName;
    }
}
