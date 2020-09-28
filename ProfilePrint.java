public class ProfilePrint{
  byte age;
  String name;
  boolean isMarried;
  
  public void setAge(byte paramage){
    age = paramage;
    }
  
  public byte getAge(){
    return age;
    }
    
  public void setName(String pname){
    name = pname;
    }
    
  public String getName(){
    return name;
    }
    
  public void setMarried(boolean flag){
    isMarried = flag;
    }
    
  public boolean isMarried(){
    return isMarried;
    }
    
  public static void main(String[] args){
    ProfilePrint pp = new ProfilePrint();
    String name = "Cato";
    byte age = 28;
    boolean isMarried = false;
    pp.setName(name);
    pp.setAge(age);
    pp.setMarried(isMarried);
    System.out.println(pp.getName());
    System.out.println(pp.getAge());
    System.out.println(pp.isMarried());
    }
  }