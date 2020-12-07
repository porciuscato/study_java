public class StaticBlockCheck{
  public static void main(String[] args){
    StaticBlockCheck check = new StaticBlockCheck();
      check.makeStaticBlockObject();
    }
  public void makeStaticBlockObject(){
    System.out.println("Creating block1");
    StaticBlock block1 = new StaticBlock();
    System.out.println("Created block1\n");
    System.out.println("Creating block2");
    StaticBlock block2 = new StaticBlock();
    System.out.println("Created block2");
    }
  
  public void makeStaticBlockObjectWithData(){
    System.out.println("");
    }
  }
