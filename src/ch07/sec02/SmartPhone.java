package ch07.sec02;

public class SmartPhone extends Phone {
    // 상속 받은 필드 두개
    // SmartPhone의 필드
    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 상속 받은 메소드 네개
    // SmartPnone의 메소드
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}
