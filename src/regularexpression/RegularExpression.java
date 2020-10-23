package regularexpression;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class RegularExpression {
	public static void main(String[] args){
		String regex1 = "^[A-Z]+[a-z]{2,}";
		System.out.println("enter the last name");
		Scanner sc1=new Scanner(System.in);
		String text1=sc1.nextLine();
		Pattern pattern1=Pattern.compile(regex1);
		Matcher match1=pattern1.matcher(text1);
		boolean result1=match1.matches();
		System.out.println(result1);
		sc1.close();
		
	}
}
