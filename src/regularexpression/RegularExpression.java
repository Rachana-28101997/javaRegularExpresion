package regularexpression;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class RegularExpression {
	public static void main(String[] args) {
		String regex = "^[a-z]+[0-9]*([-_+.][0-9a-z]+)*@[0-9a-z]+[.][a-z]{2,4}([,]{1})*([.][a-z]{2})*$";
		System.out.println("enter the pattern");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(text);
		boolean result=match.matches();
		System.out.println(result);
		sc.close();
	}
	

}