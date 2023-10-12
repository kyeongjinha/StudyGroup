package Study.Group.October.chap01;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("첫 번째,1이상 10미만의 정수를 입력하세요. : ");
            int num1 = sc.nextInt();

            System.out.print("두 번째, 1이상 10미만의 정수를 한 개 더 입력하세요. : ");
            int num2 = sc.nextInt();

            int result = num1 * num2;

            if(0 < num1 && 10 > num1 && 0 < num2 && 10 > num2) {
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            } else {
                System.out.println("정수를 잘못 입력 하셨습니다. 1이상 10미만의 정수를 입력하세요.");
            }
        }
    }
}

