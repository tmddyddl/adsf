package 다운캐스팅;


import java.util.ArrayList;

public class downcasting {
    ArrayList<animal> anilist = new ArrayList<>(); // anlimal클래스타입의 객체를 리스트형태로 관리하기 위해사용

    public static void main(String[] args) {
        downcasting downcasting = new downcasting();
        downcasting.addanimal();
        System.out.println("원래형으로 다운캐스팅");
        downcasting.downcasting();
    }

    public void addanimal() {
        anilist.add(new animal()); //animal객체를 생성해서 anilist에 대입
        anilist.add(new tiger());
        anilist.add(new eagle());
        for (animal e : anilist) e.move();
    }

    public void downcasting() {
        for (animal ani : anilist) {
            if (ani instanceof human) { // 현재의 리스트가 human형으로 다운캐스팅 가능한지 확인
                human h = (human) ani;
                h.readbooks();
            } else if (ani instanceof tiger) {
                tiger t = (tiger) ani;
                t.hunting();
            } else if (ani instanceof eagle) {
                eagle e = (eagle) ani;
                e.flying();
            } else {
                System.out.println("지원되지 않는 형입니다");
            }
        }
    }
}

class animal {
    public void move() {
        System.out.println("동물이 움직인다");

    }
}

class human extends animal {
    @Override
    public void move() {
        System.out.println("사람은 두발로걷습니다");
    }

    public void readbooks() {
        System.out.println("사람이 책을 읽습니다");
    }
}

class tiger extends animal {
    @Override
    public void move() {
        System.out.println("호랑이는 네발로 뜁니다");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다");
    }
}

class eagle extends animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다");
    }

    public void flying() {
        System.out.println("독수리가날개를 쭉 펴고 납니다");
    }
}