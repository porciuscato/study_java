import java.util.*;

public class nhnMain1 {
  private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
 	int len = numOfAllPlayers - 1;
	char[] currentArray = new char[len];
	int position = 0;
	int[] sulles = new int[numOfAllPlayers];
	char runner = 'A';
	sulles[0]++;
	for (int i = 0; i < len; i++){
	  currentArray[i] = (char)(66 + i);
	  }
	
	for (int i = 0; i < numOfGames; i++){
    int moves = numOfMovesPerGame[i];
    int nextPosition;
    if(moves >= 0) nextPosition = (position + (moves % len)) % len;
    else nextPosition = (position + moves - ((moves / len) * len)) + len;
    char tempRunner = currentArray[nextPosition];
    boolean find = false;
    for(char player: namesOfQuickPlayers){
      if (tempRunner == player){
        find = true;
        break;
        }
      }
    position = nextPosition;
    if(find){
      sulles[(int)runner - 65]++;
      }
    else{
      char temp = tempRunner;
      currentArray[position] = runner;
      runner = temp;
      sulles[(int)runner - 65]++;
      }
	  }
	for (int i = 0; i < len; i++){
	  char now = currentArray[i];
    int count = sulles[(int)(now) - 65];
    System.out.println(now + " " + count);
	  }
	System.out.println(runner + " " + sulles[(int)(runner) - 65]);
  }

  private static class InputData {
    int numOfAllPlayers;
    int numOfQuickPlayers;
    char[] namesOfQuickPlayers;
    int numOfGames;
    int[] numOfMovesPerGame;
  }

  private static InputData processStdin() {
    InputData inputData = new InputData();

    try (Scanner scanner = new Scanner(System.in)) {
      inputData.numOfAllPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

      inputData.numOfQuickPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      inputData.namesOfQuickPlayers = new char[inputData.numOfQuickPlayers];
      System.arraycopy(scanner.nextLine().trim().replaceAll("\\s+", "").toCharArray(), 0, inputData.namesOfQuickPlayers, 0, inputData.numOfQuickPlayers);

      inputData.numOfGames = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      inputData.numOfMovesPerGame = new int[inputData.numOfGames];
      String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
      for(int i = 0; i < inputData.numOfGames ; i++){
        inputData.numOfMovesPerGame[i] = Integer.parseInt(buf[i]);
      }
    } catch (Exception e) {
      throw e;
    }

    return inputData;
  }

  public static void main(String[] args) throws Exception {
    InputData inputData = processStdin();

    solution(inputData.numOfAllPlayers, inputData.numOfQuickPlayers, inputData.namesOfQuickPlayers, inputData.numOfGames, inputData.numOfMovesPerGame);
  }
}