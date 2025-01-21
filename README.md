# [Spring 5기] CH 2 키오스크 과제

---

## 개발환경

- IDE : IntelliJ IDEA 2024.3.1.1
- JDK : `17` Amazon Corretto 17.0.13
- Version control : `Git`
- Issue Tracking : `Github`
- 개발자 : Spring 5기 김혜민

## Lv1. 클래스 없이 사칙연산 계산기 만들기

- User Interface : Console
- 코드구현에 주로 사용한 관점 : Object-oriented programming
- 요구사항/구상 : [[Issues문서 링크]](https://github.com/learner-nosilv/Sparta_2st_Kiosk/issues/1)
- 세부설계/달성도 : [[Issues문서 링크]](https://github.com/learner-nosilv/Sparta_2st_Kiosk/issues/2)
- 구현일 : 2025-01-14 (화) ~ 2025-01-
- 개발복기 : [[문서 링크]]()

### 코드 구조

- **[main]** Main class
    - 시작 지점이 되는 클래스, `public static void main(String[] args)`
- MenuItem class
    - 해당 클래스가 만드는 객체 → 음식 하나 ∋ { 이름, 가격, 설명 }
    - Attribute
        - 음식명 : `private` String foodName
        - 음식가격 : `private` double foodPrice
        - 음식설명 : `private` String food
    -
    - inkedList의 resultList 객체 `private`
        - 연산의 결과값들이 FIFO로 저장되어있는 객체
    - double calculate (int, int, char) 메소드
        - 입력받은 인자값으로 연산을 진행하고, 결과값을 resultList에 저장하고, 리턴하는 기능
        - 다른 클래스의 resultList 객체 직접 접근을 막음/캡슐화
    - getResultOldest 메소드
        - 가장 오래된 결과값을 리턴 / 캡슐화
    - setResultOldest 메소드
        - 가장 오래된 결과값을 수정 / 캡슐화
    - deleteResultOldest 메소드
        - 가장 오래된 결과값을 삭제 / 캡슐화

### 작동 과정

- 사용자에게 숫자 2개 입력받기(String) → 예외처리 → Int 형변환
    - 예외처리(재입력): 오버(언더)플로우 / 문자입력 / 음수
    - 예외처리(종료): exit
- 사용자에게 연산기호 혹은 선지번호 입력받기(String) → 예외처리 → Int 형변환
    - 예외처리(재입력): 1, 2, 3, 4, 사칙연산 기호가 아닌 것
    - 예외처리(종료): exit
- 선택한 사칙연산 진행 & 예외처리
    - 예외처리(재시작): 오버(언더)플로우 / 0으로 나누는 경우
- 계산이 종료된 후, 사용자에게 재시작/오래된결과값확인/수정/삭제/종료 중에 하나를 선택하도록 함
- 재시작과, 종료는 Lv1.의 작동 그대로 구현됨
- 가장 오래된 결과값을 확인하려는 경우, Calculator의 getResultOldest 메소드를 사용하여 결과값 확인
- 가장 오래된 결과값을 수정하는 경우, 수정값을 입력받은 후 Calculator의 setResultOldest 메소드를 사용하여 결과값 수정
- 가장 오래된 결과값을 삭제하려는 경우, Calculator의 deleteResultOldest 메소드를 사용하여 결과값 삭제

### 작동 예시
- **Normal** Exception throw가 없는 정상적인 입력에서의 작동예시
  <img src="img/lv1normal.gif"  width="80%"/>


- **Exception** 사용자에게 숫자 2개를 입력받을 때의 Exception throw
  <img src="img/lv1Exception1.png"  width="70%"/>


- **Exception** 사용자에게 연산 기호를 입력받을 때의 Exception throw
  <img src="img/lv1Exception2.png"  width="80%"/>


- **Exception** 사용자에게 연산을 진행할 때의 Exception throw
  <img src="img/lv1Exception3.png"  width="90%"/>
  <img src="img/lv1Exception4.png"  width="75%"/>