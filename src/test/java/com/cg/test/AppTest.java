package com.cg.test;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    
	public AppTest( String testName )
    {
    }

    /**
     * Rigourous Test :-)
     */
    @Test
	public void testApp()
    {
        //System.out.println("Hello");
    	/*String str="Java is interesting";
    	String reverse;
    	String[] sr=str.split(" ");
    	for (int i=sr.length-1;i>=0;i--)
    	{
    		reverse=sr[i];
    		System.out.println(reverse);
    	}*/
		String str="Java is interesting";
		String[] sr=str.split(" ");
		StringBuilder sb=new StringBuilder(str);
		
		for (int i=sb.length()-1;i>=0;i--)
    	{
    		//reverse = sb.
    		System.out.println(sb.reverse().toString());
    	}
		//String reverse=sb.reverse().toString();
		//System.out.println(reverse.indexOf("i"));
		//System.out.println("((())".replaceAll("[^'(']*('(')?", "$1").length());
//				replaceAll( "[^a]*(a)?", "$1" ).length());
		
		
    }
}
