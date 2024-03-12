package 열거타입;

//열거타입:한정된값이 열거상수중에서 하나의 상수를 저장하는 타입
//입력값의 타입을 제한할수있음
public class EnumEx {
    public static void main(String[] args) {
        Developer developer = new Developer("곰돌이", Career.Senior, DevType.forntned, gender.MAle);
        developer.devInfo();
    }
}

enum Career {
    junior, Senior
}

enum DevType {
    mobile, forntned, backend, dba
}

enum gender {
    MAle, female
}


class Developer {
    private String name;
    private Career career;
    private DevType devType;
    private gender gender;

    public Developer(String name, Career career, DevType devType, 열거타입.gender gender) {
        this.name = name;
        this.career = career;
        this.devType = devType;
        this.gender = gender;
    }

    public void devInfo() {
        System.out.println("이름" + name);
        System.out.println("업무" + devType);
        System.out.println("경력" + career);
        System.out.println("성별" + gender);

    }
}