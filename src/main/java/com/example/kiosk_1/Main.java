/*
Main : 프로그램의 시작 지점이 되는 클래스
*/
package com.example.kiosk_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 4가지의 버거 메뉴 객체를 생성하고 리스트에 추가하기
        List<MenuItem> totalItems = new ArrayList<>();
        totalItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        totalItems.add(new MenuItem("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        totalItems.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        totalItems.add(new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 키오스크 가동
        Kiosk myKiosk = new Kiosk(totalItems);
        myKiosk.start();
    }
}
