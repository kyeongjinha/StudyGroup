package Study.Group.October.chap01;

import java.util.Scanner;

public class Application7 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("아이디를 입력하세요: ");
//        String str = sc.next();
//        String str1 = "joonas";
//
//        if (str.equals("joonas")) {
//            System.out.println(str + "??!");
//        } else {
//            System.out.println(str + "??!");
//
//        }
//    }
//}
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("생성 할 아이디를 입력하세요, : ");
//        String str1 = sc.next();
//
//        String system = "joonas";
//
//        if(str1.equals("joonas")) {
//            if (str1.equals("backjoon")
//            System.out.print(str1 + "??!");
//        } else {
//            System.out.println(str1 + "??!");
//        }
//
//    }
//}
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.print("생성 할 아이디를 입력하세요 : ");
        String str1 = sc.next();

        if (str1.equals("joonas") || str1.equals("baekjoon")) {
            System.out.println(str1 + "??!");
            continue;
        } else {
            System.out.println("당신의 아이디는 " + str1 + "입니다.");
            break;
        }
    }
}
}


