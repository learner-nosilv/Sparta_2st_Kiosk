/*
Main : 프로그램의 시작 지점이 되는 클래스
*/
package com.example.kiosk_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력 관련 메소드를 활용할 수 있는 스캐너 객체 생성
        System.out.println("[땡땡버거] 키오스크");

        while (true){
            int menu;

            // 모든 메뉴를 출력하기
            System.out.println("1. ShackBurger\t| W 6.9 |\t토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack\t| W 8.9 |\t베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger\t| W 6.9 |\t포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger\t| W 5.4 |\t비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료\t\t\t|종료");
            // 사용자가 선택한 메뉴 번호 입력 받기
            System.out.print("메뉴 입력 >> ");
            menu = sc.nextInt();

            // 사용자 선택 번호에 따라 다른 로직 실행
            switch (menu){
                case 0:
                    System.out.println("키오스크를 종료합니다.");
                    return;
                case 1, 2, 3, 4:
                    System.out.println(menu + "번 선택");
                    break;
                default :
                    System.out.println("0~4 사이의 번호를 입력하세요");
            }
        }
    }
}
