package 조별과제;

public class vehicle {
    int speed;
    int 연비;
    int 연료탱크크기;
    int 좌석수;
    int mcnt = 1;
    int 주유횟수 = 1;
    int 승객수;

    String CarName;

    void Carname() {
        System.out.println("=====" + CarName + "=====");
    }

    void 이동시간(int 지역, int 승객수) {
        mcnt = movecnt(승객수);
        double 총시간 = (double) 지역 * mcnt / speed;
        int 총분 = (int) (총시간 * 60);
        int 시;
        시 = 총분 / 60;
        int 분 = 총분 % 60;
        System.out.println("총 이동 시간 : " + 시 + "시 " + 분 + "분");
    }

    void 비용계산(int 지역) {
        mcnt = movecnt(승객수);
        int 비용 = 지역 / 연비 * 2000 * mcnt;
        System.out.println("총 비용 : " + 비용 + "원");
    }

    void 주유횟수(int 지역) {

        int 필요기름 = (지역 / 연비) * mcnt;

        if (연료탱크크기 >= 필요기름) {
            System.out.println("총 주유 횟수 : " + 주유횟수 + "회");
        } else {
            while (true) {

                주유횟수++;
//                필요기름 += 연료탱크크기;

                if (연료탱크크기 * 주유횟수 >= 필요기름) break;
            }
            System.out.println("총 주유 횟수 : " + 주유횟수 + "회");
        }
    }

    int movecnt(int 승객수) {
        this.승객수 = 승객수;

        if (좌석수 - 승객수 < 0) {
            while (true) {
                if ((좌석수 * mcnt) >= 승객수) break;
                mcnt++;
            }
        }
        return mcnt;
    }

}
