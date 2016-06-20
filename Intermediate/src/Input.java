//import java.util.Scanner;


public class Input {
	//input of type "Am Cm7 A7 Dbdim7 C#"
	
	public static String[][] getInput()
	{
		String ChordInput = "Am Dm EMm7 Am Am";
/*
		//this is exactly the same but way cooler 'cause user interaction is always cooler isn't it		
		//but yeah we're not gonna input it all the time so.
		System.out.println("Chords?");
		Scanner scanner = new Scanner(System.in);
		String ChordInput = scanner.nextLine();
		scanner.close();
*/
		return StringToChords(ChordInput);
	}
	
	public static String[][] StringToChords(String ChordInput)
	{
		
		//split input into "Am", "Cm7" etc.
		String Chords[] = ChordInput.split(" ");
		
		String ChordNames[][] = new String[Chords.length][2];
		for(int i=0;i<Chords.length;i++)
		{
			int j = 1; //start of kind
			String in = Chords[i].charAt(0)+"";
			if(Chords[i].charAt(1)=='#' || Chords[i].charAt(1)=='b')
			{
				in = in+Chords[i].charAt(1);
				j++;
			}
			ChordNames[i][0]=rootConversion(in);
			ChordNames[i][1]=Chords[i].substring(j);
		}
		return ChordNames;
	}
	
	public static String rootConversion(String in)
	{
		String out = "";
		if(in.equals("C"))
			out = "0";
		else if(in.equals("C#") || in.equals("Db"))
			out = "1";
		else if(in.equals("D"))
			out = "2";
		else if(in.equals("D#") || in.equals("Eb"))
			out = "3";
		else if(in.equals("E"))
			out = "4";
		else if(in.equals("F"))
			out = "5";
		else if(in.equals("F#") || in.equals("Gb"))
			out = "6";
		else if(in.equals("G"))
			out = "7";
		else if(in.equals("G#") || in.equals("Ab"))
			out = "8";
		else if(in.equals("A"))
			out = "9";
		else if(in.equals("A#") || in.equals("Bb"))
			out = "10";
		else if(in.equals("B"))
			out = "11";
		return out;
	}

}
