package 추상화;
//abstract를 사용하면 객체생성 불가
public abstract class Phone {
    public String name;
    public boolean isPower;

    public Phone(String name) {
        this.name = name;
    }

    public void setPower(boolean power) {
        isPower = power;
        if(isPower) {
            System.out.println("Phone Power ON");
        } else {
            System.out.println("Phone Power OFF");
        }
    }
    abstract void call();
}
