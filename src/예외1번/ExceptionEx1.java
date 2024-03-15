package 예외1번;
// ArrayindexOutofBoundException : 배열의인덱스를 넘어가는경우
public class ExceptionEx1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
         //   e.printStackTrace();
            System.out.println("ArrayindexOutofBoundException");
        }
        System.out.println("프로그램정상종료");
    }
}
