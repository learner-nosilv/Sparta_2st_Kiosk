/*
Menu: MenuItem 클래스를 관리하는 클래스
예시 : 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 MenuItem을 포함합니다.
*/
package com.example.kiosk_1;

import java.util.List;

public class Menu {
    // Attributes: 카테고리이름, 카테고리에 속하는 MenuItem 객체의 List
    private String category;
    private List<MenuItem> categoryItems;

    // 생성자
    public Menu(String category, List<MenuItem> categoryItems) {
        this.category = category;
        this.categoryItems = categoryItems;
    }

    // Getter Method - Encapsulation
    public String getCategory() { return this.category; }
    public List<MenuItem> getCategoryItems() { return this.categoryItems; }
}