package java8;
import java.util.*;
public class MyClassWithLambda {
public static void main(String args[])
{
WordCount c1=(str) -> str.split(" ").length;
System.out.println(c1.count("sai priya darshini"));
	   
}
}
