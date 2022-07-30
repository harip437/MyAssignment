package week2.day3;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int len=text1.length();
		int len2=text2.length();
		if(len==len2)
		{
			char[] charArray1=text1.toCharArray();
			char[] charArray2=text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			if(text1.length()==text2.length())
			{
			System.out.println("both are anagram");
		}else
		{
			System.out.println("both are not anagram");
		}

	}}}


