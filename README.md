<center>Table of Contents</center>

[toc]

# Java 공부



## 커맨드 창으로 자바 컴파일 하기

> 자바 설치 이후

```bash
javac CLASSNAME.java
java CLASSNAME
```

패키지 단위로 컴파일을 시행할 땐, 패키지 파일이 있는 곳에서부터 컴파일을 실행해야 한다. 가령 c 패키지의 cc 패키지 안에 있는 Car 클래스를 컴파일하고 실행하기 위해선 다음과 같이 작성한다.

```bash
javac c/cc/Car.java
java c/cc/Car
```



## 자바 기본 구조

```java
public class StrucOfJava{
	public static void main(String[] args){}   
}
```

- public: 접근 제어자
- static: static method 임을 선언. 인스턴스를 생성하지 않아도 호출이 가능한 함수
- void: return value
- main: method name
- String[] args: 매개변수

## 주석

```
/**
*/  : 문서용 주석

/*
*/  : 블록 주석

//  : 한 줄 주석
```

## 변수

변수에는 4가지 종류가 있다.

- 지역 변수 local variables
- 매개 변수 parameters
- 인스턴스 변수 instance variables
  - 메소드 밖, 클래스 안에 선언된 변수. static 이 안 붙은 변수
- 클래스 변수 class variables
  - 메소드 밖, 클래스 안에 static 선언된 변수

## 자료형

- 기본 자료형
  - 숫자
    - 정수형
    - 소수형
  - boolean
- 참조 자료형

```
- 정수형: byte, short, int, long, char
- 소수형: float, double
- 기타: boolean
```

## 배열

- 배열의 기본값

```
byte: 0
short : 0
int : 0
long : 0
float : 0.0
double : 0.0
char : 
boolean : false
```

\+ 참조 자료형은 초기화를 하지 않으면 초기값이 null이다.

## static method

- 스태틱 메소드는 객체 생성 없이 호출이 가능한 함수다. 이때 변수를 호출한다면 클래스 변수(static 변수)만이 가능하다.

## static block

- 객체 생성시 처음 한 번만 호출되는 코드다. 생성자가 호출되기 전에 실행된다.

  - 스태틱 블록 안에서는 스태틱 변수와 스태틱 메소드만 호출할 수 있다.

  아래와 같이 선언한다

  ```java
  static {
  	// 한 번만 수행되는 코드
  }
  ```

## pass by value, pass by reference

기본 자료형은 값으로 전달하나, 참조 자료형은 참조 형태로 전달된다.

\+ "타입...변수명"으로 배열처럼 전달할 수 있다.

​	매개 변수가 몇개 전달될지 알 수 없을 땐 이와 같이 코드를 작성할 수 있다.

```java
public class MethodVarargs{
  public static void main(String[] args){
    MethodVarargs varargs = new MethodVarargs();
//    varargs.calculateNumbersWithArray(new int[]{1, 2, 3, 4, 5, 6});
    varargs.calculateNumbers(1);
    varargs.calculateNumbers(1, 2, 3);
    varargs.calculateNumbers(1, 2, 3, 4, 5);
   }
    public void calculateNumbersWithArray(int[] numbers){
      int total = 0;
      for(int number: numbers) total+= number;
      System.out.println("Total1= " + total);
      }
    public void calculateNumbers(int...numbers){
      int total = 0;
      for(int number: numbers) total += number;
      System.out.println("Total2= " + total);
    }
}
```

주의할 점은 하나의 메소드에서는 한 번 만 사용 가능하고, 여러 매개 변수가 있다면 가장 마지막에 선언해야 한다.

```java
public void arbitrary(String message, int...numbers){}
```

message가 numbers 뒤에 와서는 안 된다.

## import

import 하고자 하는 패키지의 경로를 지정해서 가져온다.

```java
import c.javapackage.sub.Sub
```

만약 해당하는 디렉터리 내의 모든 클래스를 다 가져오고 싶다면 다음과 같이 선언한다.

```java
import c.javapackage.sub.*
```

sub 디렉터리의 하위 디렉터리의 클래스들은 가져오지 않는다.

\+ 다음의 패키지들은 import를 하지 않아도 된다.

- java.lang 패키지
- 같은 패키지

> String과 System 객체가 java.lang에 있기 때문에 import를 하지 않아도 사용이 가능한 것이다.

## import static

import static을 사용하지 않으면 다음과 같이 코드를 작성해야 한다.

```java
package c.javapackage;

import c.javapackge.sub.SubStatic;

public class PStatic{
    public static void main(String[] args){
        SubStatic.subStaticMethod();
        System.out.println(SubStatic.CLASS_NAME);
    }
}
```

subStaticMethod는 SubStatic 클래스의 스태틱 메소드고 CLASS_NAME은 스태틱 변수다. 이를 편하게 사용하기 위해 다음과 같이 코드를 수정할 수 있다.

```java
package c.javapackage;

// import c.javapackge.sub.SubStatic;
import static c.javapackge.sub.SubStatic.*;

public class PStatic{
    public static void main(String[] args){
        subStaticMethod();
        System.out.println(CLASS_NAME);
    }
}
```

## 접근제어자

접근 제어자는 4가지가 있고 클래스, 메소드, 인스턴스 및 클래스 변수를 선언할 때 사용된다.

```java
public class AccessModifier {
    public void publicMethod(){}
    protected void protectedMethod(){}
    void packagePrivateMethod(){}
    private void privateMethod(){}
}
```

- public: 누구나 접근 가능
- protected: 같은 패키지 혹은 상속받은 경우에만 가능
- package-private: 접근 제어자를 적지 않으며, 같은 패키지 내에 있을 때에만 접근 가능
- private: 해당 클래스 내에서만 접근 가능

|                 | 해당 클래스 | 같은 패키지 | 상속 받은 클래스 | import 한 클래스 |
| --------------- | ----------- | ----------- | ---------------- | ---------------- |
| public          | O           | O           | O                | O                |
| protected       | O           | O           | O                |                  |
| package private | O           | O           |                  |                  |
| private         | O           |             |                  |                  |

\+ 주의사항! 클래스도 이와 같이 적용된다. 다만, 한 java 파일 안에는 오직 파일 이름과 동일한 클래스만이 public 접근 제어자를 가질 수 있다.

## 상속

상속을 정리하면 다음과 같다.

- 부모 클래스에서는 기본 생성자를 만들어 놓는 것 이외에는 상속을 위해서 아무런 작업을 할 필요는 없다.

- 자식 클래스는 클래스 선언시 extends 다음에 부모 클래스 이름을 적어준다. 다만, 단일 상속만이 가능하다.  즉 extends 뒤에는 하나의 클래스만 올 수 있다.

- 자식 클래스의 생성자가 호출되면, 자동으로 부모 클래스의 매개 변수 없는 생성자가 실행된다.
  > 매개 변수가 있는 생성자를 만들었을 경우에는 기본 생성자는 자동으로 만들어지지 않는다. 이러한 경우 해결할 수 있는 방법은 2가지다.
  >
  > - 부모 클래스에 "매개 변수가 없는 " 기본 생성자를 만든다.
  > - 자식 클래스에서 부모 클래스의

- 자식 클래스에서는 부모 클래스에 있는 public, protected 로 선언된 모든 인스턴스 및 클래스 변수와 메소드를 사용할 수 있다.

```java
// 부모 클래스
package c.inheritance;

public class ParentArg {
    public ParentArg(String name) {
        System.out.println("ParentArg(" + name + ") Constructor");
    }
    public ParentArg(int num) {
        System.out.println("ParentArg(int " + num + ") Constructor");
    }
}
```

```java
// 자식 클래스
package c.inheritance;

public class ChildArg extends ParentArg {
    public ChildArg() {
        super(3);
        System.out.println("ChildArg Constructor");
    }
}
```

- super() 함수의 매개 변수를 통해 상속하는 클래스 중 매개변수가 일치하는 생성자를 호출한다.
> super("what") 이라 하면 매개변수가 String인 생성자를 호출한다.
> \+ 추가로, super()는 반드시 생성자의 맨 첫 줄에 와야 한다.

## 메소드 오버라이딩

자식 클래스에서 부모 클래스에 있는 메소드와 동일하게 선언하는 것을 메소드 오버라이딩이라고 한다. 접근 제어자, 리턴 타입, 메소드 이름, 매개 변수 타입 및 개수가 모두 같아야 메소드 오버라이딩이라 부른다.

메소드 overriding에 대해 정리하자.

- 메소드 overriding은 부모 클래스의 메소드와 동일한 시그니처(메소드 이름, 매개 변수의 타입 및 개수)를 갖는 자식 클래스의 메소드가 존재할 때 성립된다.

- Overriding된 메소드는 부모 클래스와 동일한 리턴 타입을 가져야만 한다.

- Overriding된 메소드의 접근 제어자는 부모 클래스에 있는 메소드와 달라도 되지만, 접근 권한이 확장되는 경우에만 허용된다. 접근 권한이 축소될 경우에는 컴파일 에러가 발생한다.

  > public > protected > package-private > private



\+ 메소드 오버로딩은 같은 함수들을 매개변수만 다르게 하여 확장하는 것을 의미한다. 반면 메소드 오버로딩은 함수 덮어쓰기다.

## 참조 자료형의 형 변환

- 참조 자료형도 형 변환이 가능하다.

- 자식 타입의 객체를 부모 타입으로 형 변환하는 것은 자동으로 된다.

  ```java
  // 아래는 가능하다. parent 변수는 겉으로 보기에 Parent 타입이지만 실제로는 Child 타입이다. 그렇기에 Child의 메소드를 호출할 수 있다.
  Parent parent = new Child();
  ```

  ```java
  // 아래는 불가능하다. 부모 타입은 자식 타입으로 형변환하기 위해선 명시적으로 타입을 지정해야 하기 때문이다.
  Child child = new Parent();
  ```

  ``` java
  Parent parent = new Parent();
  Child child = (Child)parent;
  // 이처럼 부모 타입의 객체를 강제적으로 형 변환하여 자식 타입의 객체로 만들면 컴파일에는 문제가 없으나 실행이 되지 않는다.
  ```

- 부모 타입의 객체를 자식 타입으로 형 변환을 할 때에는 명시적으로 타입을 지정해 주어야 한다. 이때, 부모 타입의 실체 객체는 자식 타입이어야 한다.

- instanceof 예약어를 사용하면 객체의 타입을 확인할 수 있다.

- instanceof로 타입 확인을 할 떄 부모 타입도 true라는 결과를 제공한다.

- 부모와 자식 타입의 클래스를 함께 배열로 선언할 땐, 배열을 부모 타입으로 지정해야 한다.

  ```java
  Parent[] parent = new Parent[2];
  parent[0] = new Child();
  parent[1] = new Parent();
  ```

  ## 다형성 Polymorphism

  - 형 변환을 하더라도, 실제 호출되는 것은 원래 객체에 있는 메소드가 호출된다.

    ```java
    package c.inheritance;
    
    public class InheritancePoly {
        public static void main(String[] args) {
            InheritancePoly inheritance = new InheritancePoly();
            inheritance.callPrintName();
        }
        private void callPrintName() {
            Parent parent1 = new Parent();
            parent1.printName();
            Parent parent2 = new Child();
            parent2.printName();
            Parent parent3 = new ChildOther();
            parent3.printName();
        }
    }
    ```

    ```
    위 코드는 다음과 같은 결과를 낸다.
    Parent Constructor
    Parent printName()
    
    Parent Constructor
    Child Constructor
    Child printName()
    
    Parent Constructor
    Childother Constructor
    ChildOther - printName()
    ```

    > 즉 변수를 새로 생성할 때 변수의 이름과 함께 선언한 타입이 무엇이든 실제 생성하는 클래스로 변수의 타입이 결정된다. 위에서는 Parent로 다 명시했지만 실제로는 우항의 타입으로 객체가 생성되었다. 그렇기에 printName 메소드를 호출하면 오버라이딩된 메소드가 출력된다. 하지만 Child 클래스로 생성되었을 지라도 Parent의 형으로 강제했기 때문에 Parent 클래스에 없는 Child 클래스 고유의 메소드는 호출할 수 없다.

## Static Final

<strong>static은 변수와 메소드에 쓰일 수 있다.</strong>

- static 변수: 클래스 변수
- static 메소드: 객체 생성 없이 호출이 가능한 함수

<strong>final은 상수, 메소드, 클래스 3가지 경우에 쓰인다.</strong>

- final 상수: 한 번 값이 정해지면 고칠 수 없는 값이 된다.
- final 메소드: 오버라이딩이 불가능하다.
- final 클래스: 상속을 할 수 없다.

<strong>static final은 클래스 상수다.</strong>

- static final 상수: 선언시 값이 초기화되어야 하며, 한 번 정해지면 객체 생성 여부와 관련없이 늘 같은 값을 지니는 클래스 상수다.

## Object 클래스

java에서 클래스를 선언할 때 아무 클래스도 상속하지 않는다면 자동으로 java.lang.Object 클래스를 상속한다.

## AWT, Swing을 사용해 윈도우 어플리케이션 만들기

문서

- https://www.javatpoint.com/java-jframe
- https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/javax/swing/JFrame.html

소스를 완성한 뒤, exe 파일로 만들기 위해 먼저 소스를 jar 파일로 만든다. 만들어진 jar 파일을 exe로 만들어주는 Launch4j 프로그램을 다운 받아 exe 파일을 생성한다. 자세한 내용은 [링크](https://www.genuinecoder.com/convert-java-jar-to-exe/)를 참고한다.

