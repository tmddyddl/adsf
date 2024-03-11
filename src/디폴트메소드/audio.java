package 디폴트메소드;

public class audio implements remotecontrol {
    private int volume;

    @Override
    public void turnon() {
        System.out.println("audio turn on");
    }

    @Override
    public void turnoff() {
        System.out.println("audio turn off");
    }

    @Override
    public void setvolume(int voulume) {
        if (voulume > remotecontrol.MAXV) {
            this.volume = remotecontrol.MAXV;
        } else if (voulume < remotecontrol.MINV) {
            this.volume = remotecontrol.MINV;
        } else {
            this.volume = voulume;
        }
        System.out.println("현재 오디오 볼륨:" + this.volume);
    }

    @Override
    public void setmute(boolean mute) {
        if (mute) System.out.println("audio mute on");
        else System.out.println("audio mute off");
    }
}
