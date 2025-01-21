/*
MenuItem: 세부 메뉴 속성 가지는 클래스
        햄버거의 이름, 가격설명
예시: ShackBurger, 6.9, 토마토, 양상추, 쉑소스가 토핑된 치즈버거
new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")
*/
package com.example.kiosk_1;

public class MenuItem {
    // Class Attribute : 음식 이름, 가격, 설명
    private String itemName;
    private double itemPrice;
    private String itemDescription;

    // 생성자
    public MenuItem(String itemName, double itemPrice, String itemDescription) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
    }

    // Getter, Setter 메서드를 활용한 Capsulation
    public String getName(){return itemName;}
    public double getPrice(){ return itemPrice;}
    public String getDescription(){return itemDescription;}
    public boolean setName(String name) { itemName = name; return true; }
    public boolean setPrice(double price) { itemPrice = price; return true;}
    public boolean setDescription(String dsc) { itemDescription = dsc; return true;}

}