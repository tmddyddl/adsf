package 스택;

import java.util.Stack;

//last-in-first-out으로동작(생각보다 프로그램 내부에서 상당히많이사용됨)
//네비게이션 이동, 함수의호출등등
//벡터클래스에 기능을 제한해서 사용
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(345);
        stack.push(56);
        System.out.println(stack.peek()); //최상위값 확인
        System.out.println(stack.pop()); //최상위값 추출후보여줌
        System.out.println(stack.empty()); //비었는지확인
        System.out.println(stack.size());//몇개값인지확인
        System.out.println(stack.contains(1));//해당값이포함되어있는지
        System.out.println(stack.peek());
    }
}
