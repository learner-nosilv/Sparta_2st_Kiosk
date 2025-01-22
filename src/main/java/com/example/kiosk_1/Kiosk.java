/*
Kiosk: 프로그램 순서 및 흐름 제어를 담당하는 클래스
*/
package com.example.kiosk_1;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // Attribute: Menu 객체들을 담는 리스트 Encapsulation
    private List<Menu> totalMenus;

    // 생성자 : Main으로부터 Menu 객체 리스트를 입력받음
    public Kiosk(List<Menu> totalMenus) {
        this.totalMenus = totalMenus;
    }

    // Getter Method - Encapsulation
    public List<Menu> getItems() {
        return totalMenus;
    }

    // Setter Method - Encapsulation
    public void setItems(List<Menu> totalItems) {
        this.totalMenus = totalMenus;
    }

    // 키오스크를 재생하는 메소드
    public void start() {
        Scanner sc = new Scanner(System.in);    // 입력 관련 메소드를 활용할 수 있는 스캐너 객체 생성
        System.out.println("[땡땡버거] 키오스크");

        while (true) {
            int select = 0;         // 사용자 선택 번호
            int selectCategory = 0; // 사용자 카테고리 선택 번호
            int idx = 1;    // 반복 출력에 사용되는 공용 인덱스 (사용 후 0 초기화 필요)

            // 모든 메뉴 카테고리 출력하기
            System.out.println("◼︎ 카테고리를 선택해주세요.");
            for (Menu menu : totalMenus) {
                System.out.println((idx++) + ". " + menu.getCategory());
            }
            System.out.println("0. 종료");

            // 카테고리에 대한 사용자 입력받기
            while (true) {
                System.out.print("카테고리 번호 입력 >> ");
                if (sc.hasNextInt()) {
                    select = sc.nextInt();
                    sc.nextLine();  // 버퍼 비우기
                }
                else {
                    sc.nextLine();
                    System.out.println("올바른 카테고리 번호를 입력하세요");
                    continue;
                }

                // 입력값 유효성검사: 사용자 입력값이 적절한 경우
                if (select >= 0 && select <= totalMenus.size()) {
                    selectCategory = select;
                    break;
                }
                System.out.println("올바른 카테고리 번호를 입력하세요");
            }
            // 사용자가 입력한 번호에 따라 다른 로직 구현
            // 0 입력시 프로그램 종료
            if (select == 0) {
                System.out.println("키오스크를 종료합니다.");
                System.exit(0);
            }
            // 사용자가 선택한 카테고리에 해당하는 모든 메뉴 아이템 출력하기
            System.out.print(totalMenus.get(select - 1));
            System.out.println("0. 종료");

            // 사용자가 선택한 메뉴 번호 입력 받기 / 적절한 값이 입력될 때까지 무한루프
            while (true) {
                System.out.print("메뉴 입력 >> ");
                if (sc.hasNextInt()) {
                    select = sc.nextInt();
                    sc.nextLine();  // 버퍼 비우기
                }
                else {
                    sc.nextLine();
                    System.out.println("올바른 메뉴 번호를 입력하세요");
                    continue;
                }
                // 입력값 유효성검사: 사용자 입력값이 적절한 경우
                if (select >= 0 && select <= totalMenus.get(selectCategory - 1).getCategoryItems().size()) {
                    break;
                }
                System.out.println("올바른 메뉴 번호를 입력하세요");
            }

            // 사용자 선택 번호에 따라 다른 로직 실행
            if (select == 0) {
                System.out.println("키오스크를 종료합니다.");
                System.exit(0);
            }
            System.out.println(select + "번 선택");
        }
    }
}