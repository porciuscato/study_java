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

<strong>final은 변수, 메소드, 클래스 3가지 경우에 쓰인다.</strong>

- final 변수: 한 번 값이 정해지면 고칠 수 없는 값인 상수가 된다.
  - 고로 final은 선언과 초기화가 동시에 이뤄져야 한다.
  - 반면 매개변수, 지역변수의 final은 초기화가 선언과 함께 되지 않아도 된다.
  - 클래스로 객체를 생성할 때 final로 객체를 만들어도, 그 안의 인스턴스 혹은 클래스 변수들은 final이 아니라면 재할당이 가능하다.
- final 메소드: 오버라이딩이 불가능하다.
- final 클래스: 상속을 할 수 없다.

<strong>static final 변수는 클래스 상수다.</strong>

- static final 상수: 선언시 값이 초기화되어야 하며, 한 번 정해지면 객체 생성 여부와 관련없이 늘 같은 값을 지니는 클래스 상수다.

## Object 클래스

java에서 클래스를 선언할 때 아무 클래스도 상속하지 않는다면 자동으로 java.lang.Object 클래스를 상속한다.

## AWT, Swing을 사용해 윈도우 어플리케이션 만들기

문서

- https://www.javatpoint.com/java-jframe
- https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/javax/swing/JFrame.html

소스를 완성한 뒤, exe 파일로 만들기 위해 먼저 소스를 jar 파일로 만든다. 만들어진 jar 파일을 exe로 만들어주는 Launch4j 프로그램을 다운 받아 exe 파일을 생성한다. 자세한 내용은 [링크](https://www.genuinecoder.com/convert-java-jar-to-exe/)를 참고한다.

## equals()

두 객체가 같은 객체인지 확인하기 위해선 java.lang.Object에 정의된 equals() 메소드를 오버로드 함으로써 가능하다. equals() 메소드는 두 객체의 주소값이 완전히 같을 경우, true를 반환한다. 하지만 평소 개발을 할 땐 주소값이 다르더라도 같은 값을 가진 객체들을 같다고 판단하는 경우가 있기에 이를 위해 equals 메소드를 오버로딩하는 것이다. 이때 반드시 만족시켜야하는 5가지 조건이 있다.

1. 재귀reflexive: null이 아닌 x라는 객체의 x.equals(x) 결과는 항상 true여야만 한다.
2. 대칭symmetric: null이 아닌 x와 y 객체가 있을 때, y.equals(x)가 true를 리턴했다면 x.equals(y)도 반드시 true를 리턴해야 한다.
3. 타동적transitive: null이 아닌 x, y, z가 있을 때 x.equals(y)가 true를 리턴하고, y.equals(z)가 true를 리턴하면, x.equals(z)는 반드시 true를 리턴해야 한다.
4. 일관consistent. null이 아닌 x와 y가 있을 떄 객체가 변경되지 않은 상황에서는 몇 번을 호출하더라도, x.eqauls(y)의 결과는 항상 true이거나 항상 false여야만 한다.
5. null과의 비교: null이 아닌 x라는 객체의 x.equals(null) 결과는 항상 false여야만 한다.

## Interface vs Abstract Class vs Concrete Class

abstract 클래스를 정리해보자.

- abstract 클래스는 클래스 선언시 abstrat이라는 예약어가 클래스 앞에 추가되면 된다.
- abstract 클래스 안에는 abstract로 선언된 메소드가 0개 이상 있으면 된다.
- abstract으로 선언된 메소드가 하나라도 있으면 그 클래스는 반드시 abstract로 선언되어야만 한다.
- abstract 클래스는 몸통이 있는 메소드가 0개 이상 있어도 전혀 상관 없으며, static이나 final 메소드가 있어도 된다. (반면 인터페이스는 static, final 메소드가 선언되어 있으면 안 된다.)

인터페이스와 추상 클래스, 일반 클래스를 비교하면 다음과 같다.

|                                  | 인터페이스 | 추상 클래스    | 클래스     |
| -------------------------------- | ---------- | -------------- | ---------- |
| 선언시 예약어                    | interface  | abstract class | class      |
| 구현 안 된 메소드 포함 가능 여부 | 가능(필수) | 가능           | 불가       |
| 구현된 메소드 포함 가능 여부     | 불가       | 가능           | 가능(필수) |
| static 메소드 선언 가능 여부     | 불가       | 가능           | 가능       |
| final 메소드 선언 가능 여부      | 불가       | 가능           | 가능       |
| extends 가능                     | 불가       | 가능           | 가능       |
| implements 가능                  | 가능       | 불가           | 불가       |

## enum 클래스

- enumeration, 즉 셈, 계산, 열거, 목록, 일람표를 나타나는 말로써 `열거형 클래스`라고도 불린다. 
- enum 클래스에 있는 상수들은 타입과 값을 지정할 필요가 없다.

```java
package c.enums;

public enum OverTimeValues {
    THREE_HOUR,
    FIVE_HOUR;
}
```

이처럼 타입이나 값을 표시하지 않고도 아래와 같이 활용이 가능하다.

```java
package c.enums;

public class OverTimeManager {
    public int getOverTimeAmount(OverTimeValues value) {
        int amount = 0;
        System.out.println(value);
        switch(value){
            case THREE_HOUR:
                amount = 18000;
                break;
            case FIVE_HOUR:
                amount = 30000;
                break;
            default:
                break;
        }
        return amount;
    }
    public static void main(String[] args) {
        OverTimeManager manager = new OverTimeManager();
        int myAmount = manager.getOverTimeAmount(OverTimeValues.THREE_HOUR);
        System.out.println(myAmount);
    }
}

```



- enum 클래스에 값을 지정할 수도 있다.

  ```java
  package c.enums;
  
  public enum OverTimeValues2 {
      THREE_HOUR(18000),
      FIVE_HOUR(30000);
      
      private final int amount;
  
      OverTimeValues2(int amount) {  // 생성자는 package-private과 private만 가능
          this.amount = amount;
      }
      public int getAmount() {
          return amount;
      }
  }
  ```

  결과를 확인하자.

  ```java
  package c.enums;
  
  public class OverTimeManager2 {
      public static void main(String[] args) {
          OverTimeValues2 value = OverTimeValues2.THREE_HOUR;
          System.out.println(value);  // THREE_HOUR
          System.out.println(value.getAmount());  // 18000
      }
  }
  ```

- enum 클래스는 java.lang.Enum 클래스만을 상속 받아야 한다.

- enum 클래스의 API에 없는 values() 메소드는 클래스 내 모든 상수들을 반환한다.

  ```java
  OverTimeValues [] values = OverTimeValues.values();
  for(OverTimeValues value: values) {
      System.out.println(value);
  }
  ```

  

## 예외 처리

- try-catch 블록으로 처리한다. 그러나 지역변수는 사용될 수 없으므로 사용해야될 중요한 변수가 있다면 try-catch 블록 밖에 정의하자.

  ```java
  public void function() {
      int[] intArray = new int[5];
      try {
          System.out.println(intArray[5]);
      } catch (Exception e) {
          System.out.println(intArray.length);
      } finally {
          System.out.println("Here is finally.");
      }
      System.out.println("This code must run.");
  }
  ```

- catch는 여러 개를 사용해도 상관 없으나 Exception 클래스는 가장 마지막에 사용하도록 하자. 예외처리의 순서는 매우 중요하다.

  ```java
  public void multiCatchThreeWithNull() {
      int[] intArray = new int[5];
      try {
          intArray = null;
          System.out.println(intArray[5]);
      } catch (NullPointerException e) {
          System.out.println("NullPointerException");
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("ArrayIndexOutOfBoundsException occured");
      } catch (Exception e) {
          System.out.println(intArray.length);
      }
  }
  ```

여기서 내용을 한 번 정리하자.

- try 다음에 오는 catch 블록은 1개 이상 올 수 있다.
- 먼저 선언한 catch 블록의 예외 클래스가 다음에 선언한 catch 블록의 부모에 속하면, 자식에 속하는 catch 블록은 절대 실행될 일이 없으므로 컴파일이 되지 않는다.
- 하나의 try 블록에서 예외가 발생하면 그 예외와 관련이 있는 catch 블록을 찾아서 실행한다.
- catch 블록 중 발생한 예외와 관련 있는 블록이 없으면, 예외가 발생하면서 해당 쓰레드는 끝난다. 따라서 마지막 catch 블록에는 Exception 클래스로 묶어주는 버릇을 들여야 안전한 프로그램을 만들 수 있다.

## 예외의 종류

자바의 예외는 3가지다. 

- checked exception
- error
- runtime exception 혹은 unchecked exception

&nbsp;error와 exception의 가장 큰 차이는 발생 위치가 프로그램 밖, 안 발생 여부다. error는 프로그램을 멈춰버린다. 즉 error는 프로세스에 영향을 주고 exception은 쓰레드에만 영향을 준다.

&nbsp;runtime exception은 예외가 발생할 것을 미리 감지하지 못했을 때 발생한다. 모든 예외들은 runtime exception을 확장한 예외들이다. 컴파일은 되지만 실행시 예외가 발생한다. 그래서 런타임 예외라 부른다. 또한 컴파일시 체크를 하지 않기에 unchecked exception이라고도 부른다.

예외 클래스 구조를 정리하면 다음과 같다.

```
- Throwable
	- Error
	- Exception
		- RuntimeException (== unchecked exception)
		- checked exception (에러와 런타임 예외가 아닌 모든 예외들)
```

## Throwable 클래스의 메소드를 Exception 클래스에서 오버라이딩한 대표적인 메소드 3가지

- getMessage() : 예외 메시지를 string 형태로 받는다.
- toString() : getMessage() 보다 자세하게, 예외 클래스 이름도 같이 받는다.
- printStackTrace() : 예외가 발생한 메소드의 호출관계도 표시한다.

## Throws와 Throw 정리

- 메소드를 선언할 때 매개 변수 소괄호 뒤에 throws라는 예약어를 적은 뒤 예외를 선언하면, 해당 메소드에서 선언한 예외가 발생했을 때 호출한 메소드로 예외가 전달된다. 만약 메소드에서 두 가지 이상의 예외를 던질 수 있다면, implements처럼 콤마로 구분하여 예외 클래스 이름을 적어주면 된다.
- try 블록 내에서 예외를 발생시킬 경우에는 throw라는 예약어를 적어 준 뒤 예외 객체를 생성하거나, 생성되어있는 객체를 명시해준다. throw한 예외 클래스가 catch 블록에 선언되어 있지 않거나, throws 선언에 포함되어 있지 않으면 컴파일 엘러가 발생한다.
- catch 블록에서 예외를 throw할 경우에도 메소드 선언의 throws 구문에 해당 예외가 정의되어 있어야만 한다.