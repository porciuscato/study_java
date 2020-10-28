public class nhntest {
	public static void main(String[] args) {
		char a = 'A'; // 65
		int b = (int)a;
		System.out.println(b);
		
	  int c = 13;
	  
	  System.out.println(c % 5);
	  
	  int position = 3;
    int moves = -2;
    int len = 5;
    int result = ((position + moves - ((moves / len) * len)) + len) % len;
    System.out.println(result);
	}
}
