package com.wipro.topgear.ags2;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //Apache Commons StrringUtils used
        String sentence = "I am  going to complete FSD";
        String abbreviated = StringUtils.abbreviate(sentence,25);
        System.out.println(abbreviated);
    }
}
