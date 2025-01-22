/*
Main : 프로그램의 시작 지점이 되는 클래스
*/
package com.example.kiosk_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 버거, 사이드, 음료 메뉴판 객체 리스트 생성
        List<Menu> totalMenus=new ArrayList<>();
        // 버거 메뉴판 객체
        List<MenuItem> totalItems = new ArrayList<>();
        totalItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        totalItems.add(new MenuItem("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        totalItems.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        totalItems.add(new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        Menu burgers = new Menu("Burgers", totalItems);
        // 사이드 메뉴판 객체
        totalItems = new ArrayList<>();
        totalItems.add(new MenuItem("Chicken nugget (10p)", 5.5, "바삭~ 촉촉~ 한입에 쏙 부드러운 너겟킹!"));
        totalItems.add(new MenuItem("French Fries (R)", 2.6, "대표 사이드 메뉴 프렌치프라이"));
        totalItems.add(new MenuItem("Corn salad", 2.1, "달콤한 옥수수와 싱싱한 야채의 어울림"));
        totalItems.add(new MenuItem("Real Onion Rings (R)", 2.6, "통째로 썰어 더 두툼하고 더 바삭해진"));
        Menu sides = new Menu("Sides", totalItems);
        // 음료 메뉴판 객체
        totalItems = new ArrayList<>();
        totalItems.add(new MenuItem("Coca-Cola (R)", 2.0, "코카-콜라로 더 짜릿하게!"));
        totalItems.add(new MenuItem("Sprite (R)", 2.0, "나를 깨우는 상쾌함!"));
        Menu drinks = new Menu("Drinks", totalItems);
        // 모든 메뉴 리스트에 삽입
        totalMenus.add(burgers);
        totalMenus.add(sides);
        totalMenus.add(drinks);

        // 키오스크 가동
        Kiosk myKiosk = new Kiosk(totalMenus);
        myKiosk.start();
    }
}
