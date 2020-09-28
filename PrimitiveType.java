public class PrimitiveType{
  
  public void checkByteType(){
    byte minByte = -128;
    byte maxByte = 127;
    }
  
  public void checkOtherTypes(){
    short minShort = - 32768;
    short maxShort = 32767;
    int minInt = - 2147483648;
    int maxInt = 2147483647;
    long minLong = - 9223372036854775808L;
    long maxLong = 9223372036854775807L;
    System.out.println(maxLong);
    }

  public void checkChar(){
    char charMin = '\u0000';
    char charMax = '\uffff';
    System.out.println(charMin);
    System.out.println(charMax);
    }
  
  int Default1;
  public void defaultValues(){
    int Default2 = 2;
    System.out.println(Default1);
    System.out.println(Default2);
    }
  
  public static void main(String[] args){
    int temp = 2147483647;
    long result = (long)(temp * 2);
    System.out.println(result);
    PrimitiveType a = new PrimitiveType();
    a.checkOtherTypes();
    a.checkChar();
    a.defaultValues();
    }
  }
