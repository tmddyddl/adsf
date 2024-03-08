package 인터페이스심화;

import java.util.Scanner;

public class Network {
    public static void main(String[] args) {
        NetworkAdapter adapter;
        Scanner sc =new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택하세요 1.WIfi 2.5G 3.LTE");
        int num = sc.nextInt();
        switch (num) {
            case 1: adapter = new Wifi("KT MEGA");
            adapter.connect();
            break;
            case 2:
                adapter = new FIVEG("sk telecom");
                adapter.connect();
                break;
            case 3:
                adapter = new LTE("lg u+");
                adapter.connect();
                break;
            default:
                System.out.println("네트워크선택이 잘못되었습니다.");
        }
    }
}