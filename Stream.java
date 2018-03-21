package java8;
import java.util.*;
import java.util.stream.Collectors;
public class Stream {
	public static void main(String[] args) {
   ArrayList<String> a1=new ArrayList<String>();
   ArrayList<String> a2=new ArrayList<String>();
   a1.add("hello");
   a1.add("haihow");
   a1.add("");
   a1.add("areyou");
   a1.add("");
   int count1=0,count2=0;
   Iterator i2=a1.iterator();
   while(i2.hasNext())
   {
	   String g1=(String)i2.next();
	   if(g1.isEmpty())
	   {
		   count1++;
		   a2.add(g1);
	   }
	   if(g1.length()>5)
		   count2++;
	   
   }
   System.out.println("emptystrings count"+count1);
   System.out.println("strings length >5 count"+count2);
   List<String> emptystrings =a2.stream().collect(Collectors.toList());  
   System.out.println(emptystrings);
   System.out.println(emptystrings.size()); //As there are two empty strings size is 2
	
	}
