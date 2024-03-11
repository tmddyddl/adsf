package 디폴트메소드;

public class TV implements remotecontrol {
    private int volume;

    @Override
    public void turnon() {
        System.out.println("TV turn on");
    }

    @Override
    public void turnoff() {
        System.out.println("TV turn off");
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
        System.out.println("현재 TV 볼륨:" + this.volume);
    }

    @Override
    public void setmute(boolean mute) {
        if (mute) System.out.println("TV mute on");
        else System.out.println("TV mute off");
    }
}


