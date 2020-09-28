public class CarManager{
  public static void main(String[] args){
    Car dogCar = new Car("dog");
    Car cowCar = new Car("cow");
    dogCar.speedup();
    dogCar.speedup();
    dogCar.speedup();
    System.out.println(dogCar.getcurrentspeed());
    dogCar.speeddown();
    dogCar.speeddown();
    System.out.println(dogCar.getcurrentspeed());
  }
}