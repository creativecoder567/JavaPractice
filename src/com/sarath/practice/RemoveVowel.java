package com.sarath.practice;

import java.util.Scanner;

/**
 * Created by sarath on 15/1/17.
 */
public class RemoveVowel {
    public static void main(String args[]){
        String strOrg,strNew;
        System.out.println("Enter the String:");
        Scanner scanner = new Scanner(System.in);
        strOrg = scanner.nextLine();
        System.out.println("original String:"+strOrg);
        strNew=strOrg.replaceAll("[aeiouAEIOU]","");
        System.out.print(strNew);

    }
}
