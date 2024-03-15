package 사용자정의예외;


public class customExcep {
    public void main(String[] args) {
        CheckEven ce = new CheckEven();
        int number1 = 100;
        int number2 = 99;
        try {
            System.out.println(ce.printEven(number1));
            System.out.println(ce.printEven(number2));
        } catch (EvenException e) {
            e.printStackTrace();
        }
    }

    public class EvenException extends Exception {
        private Integer number = null;

        public EvenException(int number) {
            this.number = number;
        }

        @Override
        public String getMessage() {
            if (number == null) {
                return "숫자가 아닙니다";
            } else {
                return Integer.toString(number) + "는 짝수가 아닙니다";
            }
        }
    }

    public class CheckEven {
        private int num;

        public void setNum(int num) {
            this.num = num;
        }

        public int printEven(int number) throws EvenException {
            this.num = number;
            if (num % 2 != 0) {
                throw new EvenException(num);
            } else {
                return num;
            }
        }
    }
}