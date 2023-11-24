package java8Practice;

public class StringsInJAVA {
	
	public static void main(String[] args)
    {
        String s1 = new String("JAVA");
 
        System.out.println(s1);         //Output : JAVA
 
        String s2 = s1.concat("J2EE");
 
        System.out.println(s1+" "+s2);         //Output : JAVA JAVAJ2EE
        
        s1 = s1+"Kali";
        
        System.out.println(s1); 			//Output : JAVAKali
        
        
        String str1 = "abc";
        
        String str2 = "abc";
        
        System.out.println(str1.toCharArray()[1]);
 
        System.out.println(str1 == str2);        //Output : true
 
        //Creating string objects using new operator
 
        String str3 = new String("abc");
 
        String str4 = new String("abc");
        
        System.out.println(str3.toCharArray()[1]);
 
        System.out.println(str3 == str4);				//Output : false
    }

}
