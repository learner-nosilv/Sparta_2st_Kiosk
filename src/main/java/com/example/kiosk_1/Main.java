/*
Main : 프로그램의 시작 지점이 되는 클래스
*/
package com.example.kiosk_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 4가지의 버거 메뉴 객체를 생성하고 리스트에 추가하기
        List<MenuItem> totalItems = new ArrayList<>();
        totalItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        totalItems.add(new MenuItem("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        totalItems.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        totalItems.add(new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);    // 입력 관련 메소드를 활용할 수 있는 스캐너 객체 생성
        System.out.println("[땡땡버거] 키오스크");

        while (true) {
            int menu=0;

            // 모든 메뉴를 출력하기
            int i=1;
            for (MenuItem item : totalItems) {
                System.out.println((i++) + ". "+ item);
            }
            System.out.println("0. 종료\t\t\t|종료");

            // 사용자가 선택한 메뉴 번호 입력 받기 / 적절한 값이 입력될 때까지 무한루프
            while(true) {
                System.out.print("메뉴 입력 >> ");
                if (sc.hasNextInt()) {
                    menu = sc.nextInt();
                    sc.nextLine();  // 버퍼 비우기
                    // 사용자 입력값이 적절한 경우
                    if(menu>=0 && menu<totalItems.size()) {
                        break;
                    }
                }
                System.out.println("올바른 메뉴 번호를 입력하세요");
            }

            // 사용자 선택 번호에 따라 다른 로직 실행
            switch (menu) {
                case 0:
                    System.out.println("키오스크를 종료합니다.");
                    return;
                default:
                    System.out.println(menu + "번 선택");
                    break;
            }
        }
    }
}
