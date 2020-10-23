public class ArrayLotto{
  public static void main(String[] args){
    int [] lottoNumbers = new int[7];
    for(int i= 0; i < 7; i++) {
      System.out.print(lottoNumbers[i] + " ");
      }
    System.out.println();
    String[] arrays = new String[5];
    for(int i = 0; i < 5; i++){
      System.out.print(arrays[i] + " ");
      }
    
    System.out.println("\n" + arrays.length);
    System.out.println(arrays);
    
    if (args.length > 0){
      for (String arg: args){
        System.out.println(arg);
        }
      }
    }
  }