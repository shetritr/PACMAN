package pacman;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Board {



	private int [] [] BoardArray=new int [32][32];

	public Board(int numBoard){
		setUpMyCSVArray(numBoard);
	}
	
	/**this function sets the first array with the csv file.  
	 * @param num- the number of the board that client chose from the second menu.
	 */
	private void setUpMyCSVArray(int num){
		Scanner scanIn = null;
		String inputLine="";
		String fileName="";
		if(num==1)//the board of the first button
			fileName="firstBoard.csv";
		else if(num==2)//second button
			fileName="secondBoard.csv";
		else//Third button
			fileName="thirdBoard.csv";
		readFile(scanIn , inputLine, fileName);//read the file and build the array.
		
	}

/**Open the file and scans it.
 * @param scanIn-the scanner.
 * @param inputLine-the string of one line from the file.
 * @param fileName-the path of the file.
 */
	private void readFile(Scanner scanIn, String inputLine, String fileName){
		int row=0;
		File f=new File(fileName);
		try{
			scanIn=new Scanner(f);
			while(scanIn.hasNext()){
				inputLine=scanIn.nextLine();
				String [] parts=inputLine.split(",");
				BoardArray[row]= Arrays.asList(parts).stream().mapToInt(Integer::parseInt).toArray();//make int from string.
				row++;
			}
		}
			catch(Exception e){//if the file wasn't found.
				System.err.println("couldn't find the file.");
			}
	}//close readFile

	public void setBoardArray(int x,int y,int upgrade) {
		this.BoardArray[x][y] = upgrade;
	}

	public int[][] getBoardArray() {

		return BoardArray;
	}
}