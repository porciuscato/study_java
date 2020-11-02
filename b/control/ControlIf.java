public class ControlIf{
  public static void main(String[] args){
    ControlIf control = new ControlIf();
    control.controlWhile();
    }
  
  public void ifStatement(){
    if(true);
    if(true) System.out.println("It's true.");
    if(true)
      System.out.println("It's also true.");
    if(false) System.out.println("It's False");
    }
  
  public void ifElseStatement(){
    int intValue = 10;
    
    if (intValue > 5) System.out.println("It's bigger than 5.");
    else System.out.println("It's smaller or equal than 5");
    
    if (intValue <= 5)
      System.out.println("It's smaller or equal than 5");
    else
      System.out.println("It's bigger than 5.");
    }
    
  public void ifAndOr(){
    int age = 25;
    boolean isMarried = true;
    if (age > 25 && isMarried){ 
      System.out.println("He is over 25 and Married");
      }
    if (age > 25 || isMarried){
      System.out.println("He is over 25 or Marreid");
      }
    }
  
  public void elseIf(int point){
    if(point > 90){
      System.out.println("A");
      }
    else if(point > 80){
      System.out.println("B");
      }
    else{
      System.out.println("C");
      }
    }
  
  public void switchStatement2(int numberOfWheel){
    switch(numberOfWheel){
      case 1:
        System.out.println("one");
        break;
      case 2:
        System.out.println("two");
        break;
      case 3:
        System.out.println("three");
        break;
      default:
        System.out.println("default");
        break;
      }
    }
    
  public void switchCalendar(int month) {
    switch(month){
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("31 days");
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("30 days");
        break;
      case 2:
        System.out.println("28 days");
        break;
      default:
        System.out.println("default");
        break;
      }
    }
    
  public void controlWhile(){
//    ControlIf control = new ControlIf();
    int loop = 0;
    while(loop < 12){
      loop++;
//      control.switchCalendar(loop);
      switchCalendar(loop);
      }
    }
  }
