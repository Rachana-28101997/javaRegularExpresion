package regularexpression;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class RegularExpression {
	public static void main(String[] args) {
		String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
		System.out.println("enter the pattern");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(text);
		boolean result=match.matches();
		System.out.println(result);
	}
	

}