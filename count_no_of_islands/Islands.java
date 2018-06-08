
public class Islands {
	
	//No of rows and columns
    static final int ROW = 5, COL = 5;
    
	private int countIslands(int[][] m) {
		int count = 0;
		boolean[][] visited = new boolean[ROW][COL];
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				visited[i][j] = false;
			}
		}
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				if(m[i][j] !=0 && visited[i][j] != true) {
					count++;
					DFD(i,j,m,visited);
				}
			}
		}
		return count;
	}
	
	private void DFD(int p, int q, int[][] m, boolean[][] visited) {
		
		int[] row = {-1,1,1,0,-1,0,-1,1};
		int[] col = {0,-1,0,1,1,-1,-1,1};
		
		for (int i = 0; i < 8; i++) {
			int rowToVisit = p+row[i];
			int colToVisit = q+col[i];
			if (rowToVisit >=0 &&  rowToVisit <= ROW-1 &&  colToVisit >=0 && colToVisit <= COL-1 && m[rowToVisit][colToVisit] == 1 && visited[rowToVisit][colToVisit] != true) {
				visited[rowToVisit][colToVisit]  = true;
				DFD(rowToVisit, colToVisit, m, visited);
			}

		}
		
		
	}

	public static void main(String[] args) {
	    {
	        int M[][]=  new int[][] {{1, 1, 0, 0, 0},
	                                 {0, 1, 0, 0, 1},
	                                 {1, 0, 1, 1, 1},
	                                 {0, 1, 0, 1, 0},
	                                 {1, 0, 1, 0, 1}
	                                };
	        Islands I = new Islands();
	        System.out.println("Number of islands is: "+ I.countIslands(M));
	    }
}

}
