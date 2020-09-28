public class Car{
  int speed;
  int distance;
  String color;
  String name;
  
  public Car(String name){
    speed = 0;
    distance = 0;
    name = name;
    System.out.println("A Car " + name +  " is created!!");
    }

  
  public void speedup(){
    speed += 5;
    }
  public void speeddown(){
    if (speed - 10 > 0){
        speed -= 10;
      }
    else{
      speed = 0;
      }
    }
  
  public int getcurrentspeed(){
    return speed;
    }
  }
  
