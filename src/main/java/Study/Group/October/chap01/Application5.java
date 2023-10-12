package Study.Group.October.chap01;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("첫 번째,1이상 10미만의 정수를 입력하세요. : ");
            double dnum1 = sc.nextDouble();

            System.out.print("두 번째, 1이상 10미만의 정수를 한 개 더 입력하세요. : ");
            double dnum2 = sc.nextDouble();

            double result = dnum1 / dnum2;

            if(0 < dnum1 && 10 > dnum1 && 0 < dnum1 && 10 > dnum1) {
                System.out.println(dnum1 + " / " + dnum2 + " = " + result);
                break;
            } else {
                System.out.println("정수를 잘못 입력 하셨습니다. 1이상 10미만의 정수를 입력하세요.");
            }
        }
    }
}
