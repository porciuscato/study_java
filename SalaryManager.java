public class SalaryManager{
  public static void main(String[] args){
    SalaryManager sm = new SalaryManager();
    System.out.println(sm.getMonthlySalary(20000000));
    }
  public double getMonthlySalary(int yearlySalary){
    double result = (double)yearlySalary / (double)12;
    result -= (calculateTax(result) + calculateNationalPension(result) + calculateHealthInsurance(result));
    return result;
    }
    
  public double calculateTax(double monthSalary){
    double labourTax = 0.125;
    return monthSalary * labourTax;
    }
    
  public double calculateNationalPension(double monthSalary){
    double NationalPension = 0.081;
    return monthSalary * NationalPension;
    }
    
  public double calculateHealthInsurance(double monthSalary){
    double healthInsurance = 0.135;
    return monthSalary * healthInsurance;
    }    
  }
