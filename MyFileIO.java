import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class MyFileIO
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		String s="", temp; 
		char choice = 'y';
		
		File file = new File("input.txt");
		  
		file.createNewFile();
		
		FileWriter writer = new FileWriter(file); 
		  
		while(choice=='y')
		{
			temp = bfr.readLine();
			s=s+temp+"\r"+"\n";
			System.out.println("More? y for yes and n for no");
			choice=sc.next().charAt(0); 
		}
		writer.write(s); 
		writer.flush();
		writer.close();

		int vowel=0, consonent=0, line=0, sentence=0,alphabets=0, word=0;

		FileReader reader = new FileReader(file);
		BufferedReader bfl = new BufferedReader(reader);
		
		String a="";
		while((temp=bfl.readLine())!=null)
		{
			a=a+temp+"\n"+"\r";
		}
		for(int i=0;i<a.length();i++){
			char ch=a.charAt(i);
			if(Character.isLetter(ch)){
				alphabets++;
			}
			if((Character.isLetter(a.charAt(i)) && a.charAt(i+1)==' ') || (Character.isLetter(a.charAt(i)) && a.charAt(i+1)=='.')){
				word++;
			}
			switch(ch){
				case ' ':
					break;
				case '.':
					sentence++;
					break;
				case '\n':
					line++;
					break;
				case '\r':
					break;
	 			case  'a' :
	 			case 'e'  :
	 			case 'i'   :
	 			case 'o'  :
	 			case 'u'  :
	 			case  'A' :
	 			case 'E'  :
	 			case 'I'   :
	 			case 'O'  :
	 			case 'U'  :
	 				vowel++;
	 				break;
	 			default:
	 				consonent++;
			}
		}
		System.out.println("Number of alphabets: "+alphabets);
		System.out.println("Number of vowels: "+vowel);
		System.out.println("Number of consonants: "+consonent);
		System.out.println("Number of words: "+word);
		System.out.println("Number of sentences: "+sentence);
		System.out.println("Number of lines: "+line); 
		reader.close();
	}
}