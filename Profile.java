public class Profile{
  int age;
  String name;
  
  public void setName(String str){
    name = str;
    }
  
  public void setAge(int val){
    age = val;
    }
  
  public String printName(){
    return name;
    }
  
  public int printAge(){
    return age;
    }
  
  public static void main(String[] args){
    Profile cato = new Profile();
    cato.setAge(28);
    cato.setName("Cato");
    System.out.println("My name is " + cato.printName() + "!!");
    System.out.println("I'm " + cato.printAge() + ".");
    }
  }-