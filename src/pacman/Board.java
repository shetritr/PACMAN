package pacman;
import java.io.File;
import java.util.Scanner;

public class Board {

	public int [] [] firstArray=new int [32][32];

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
 * @param path-the path of the file.
 */
	private void readFile(Scanner scanIn, String inputLine, String fileName){
		int row=0;
		File f=new File(fileName);
		try{
			scanIn=new Scanner(f);
			while(scanIn.hasNext()){
				inputLine=scanIn.nextLine();
				String [] parts=inputLine.split(",");
			for(int i=0 ; i < 32 ; i++)
				firstArray[row][i]=Integer.parseInt(parts[i]);//make int from string.
			row++;
			}
		}
			catch(Exception e){//if the file wasn't found.
				System.err.println("couldn't find the file.");
			}
	}//close readFile
	
	public static void main(String[] args) {
		new Board(1);
	}
}