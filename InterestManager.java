public class InterestManager{
  public static void main(String[] args){
    InterestManager manager = new InterestManager();
    int amount = 1000000;
    for(int day = 1; day < 380; day += 10){
      System.out.println(day + " gets " + manager.getInterestRate(day) * amount);
      }
    }
  
  public double getInterestRate(int day){
    return day <= 90 ? 0.005 : day <= 180 ? 0.01 : day <= 364 ? 0.02 : 0.056;
    }
  
  public double calculateAmount(int day, long amount) {
    return (double)((getInterestRate(day) + 1) * amount);
    }
  }
