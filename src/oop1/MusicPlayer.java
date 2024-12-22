package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println("뮤직 플레이어 실행");
    }

    void off() {
        isOn = false;
        System.out.println("뮤직 플레이어 종료");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨 증가 : " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨 감소 : " + volume);
    }

    void showStatus() {
        System.out.println("뮤직 플레이어 상태 확인");
        if (isOn) {
            System.out.println("뮤직 플레이어 On");
        } else {
            System.out.println("뮤직 플레이어 off");
        }
    }
}
