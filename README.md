<center>Table of Contents</center>

[toc]

# Java 공부



## 커맨드 창으로 자바 컴파일 하기

> 자바 설치 이후

```bash
javac CLASSNAME.java
java CLASSNAME
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