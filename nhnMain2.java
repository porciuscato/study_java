import java.util.Scanner;

class Main {
	static int cement = 0;
	static int[] heights;
	static int len;
	private static void solve(int left, int right){
		if (right - left < 2) return;
		if (left < 0) return;
		if (right > len) return;
		int mx = -1;
		int mxIdx = -1;
		for(int i = left; i <= right; i++){
			if (heights[i] > mx){
				mx = heights[i];
				mxIdx = i;
			}
		}
		int lmx = -1;
		int mxLIdx = -1;
		for(int i = left; i < mxIdx; i++){
			if (heights[i] > lmx){
				lmx = heights[i];
				mxLIdx = i;
			}
		}
		if (lmx >= 0){
			for(int i = mxLIdx + 1; i < mxIdx; i++){
				cement += lmx - heights[i];
				heights[i] = lmx;
			}
			solve(left, mxLIdx);	
		}
		
		
		int rmx = -1;
		int mxRIdx = -1;
		for(int i = mxIdx + 1; i <= right; i++){
			if (heights[i] > rmx){
				rmx = heights[i];
				mxRIdx = i;
			}
		}
		if (rmx >= 0){
			for(int i = mxIdx + 1; i < mxRIdx; i++){
				cement += rmx - heights[i];
				heights[i] = rmx;
			}
			solve(mxRIdx, right);			
		}
	}
	
  private static void solution(int day, int width, int[][] blocks) {
		len = width - 1;
    heights = new int[width];
		
		for(int i = 0; i < day; i++){
			for(int j = 0; j < width; j++){
				heights[j] += blocks[i][j];
			}
			solve(0, len);
		}
		System.out.println(cement);
  }
  
  private static class InputData {
    int day;
    int width;
    int[][] blocks;
  }

  private static InputData processStdin() {
    InputData inputData = new InputData();

    try (Scanner scanner = new Scanner(System.in)) {
      inputData.day = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));      
      inputData.width = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      
      inputData.blocks = new int[inputData.day][inputData.width];
      for (int i = 0; i < inputData.day; i++) {
        String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
        for (int j = 0; j < inputData.width; j++) {
          inputData.blocks[i][j] = Integer.parseInt(buf[j]);
        }
      }
    } catch (Exception e) {
      throw e;
    }

    return inputData;
  }

  public static void main(String[] args) throws Exception {
    InputData inputData = processStdin();

    solution(inputData.day, inputData.width, inputData.blocks);
  }
}