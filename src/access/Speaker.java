package access;

public class Speaker {

    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("최대 음량");
        } else {
            volume += 10;
            System.out.println("스피커 음량 증가");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("스피커 음량 감소");
    }

    void showVolume() {
        System.out.println("현재 스피커 음량 : " + volume);
    }
}
