/*
Kiosk: 프로그램 순서 및 흐름 제어를 담당하는 클래스
*/
package com.example.kiosk_1;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // Attribute: MenuItem 객체들을 담는 리스트
    private List<MenuItem> totalItems;

    // 생성자 : Main으로부터 MenuItem 객체 리스트를 입력받음
    public Kiosk(List<MenuItem> totalItems) {
        this.totalItems = totalItems;
    }

    // Getter Method
    public List<MenuItem> getItems(){
        return totalItems;
    }

    // Setter Method
    public void setItems(List<MenuItem> totalItems){
        this.totalItems = totalItems;
    }

    // 키오스크를 재생하는 메소드
    public void start() {
        Scanner sc = new Scanner(System.in);    // 입력 관련 메소드를 활용할 수 있는 스캐너 객체 생성
        System.out.println("[땡땡버거] 키오스크");

        while (true) {
            int menu = 0;

            // 모든 메뉴를 출력하기
            int i = 1;
            for (MenuItem item : totalItems) {
                System.out.println((i++) + ". " + item);
            }
            System.out.println("0. 종료\t\t\t|종료");

            // 사용자가 선택한 메뉴 번호 입력 받기 / 적절한 값이 입력될 때까지 무한루프
            while (true) {
                System.out.print("메뉴 입력 >> ");
                if (sc.hasNextInt()) {
                    menu = sc.nextInt();
                    sc.nextLine();  // 버퍼 비우기
                    // 입력값 유효성검사: 사용자 입력값이 적절한 경우
                    if (menu >= 0 && menu <= totalItems.size()) {
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