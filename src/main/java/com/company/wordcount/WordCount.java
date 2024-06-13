/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.wordcount;

import java.io.*;
import java.util.*;

/**
 *
 * @author kamau
 */
public class WordCount {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("words.txt");
        Scanner scanner = new Scanner(file);

        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>();

        //read through the file 
        while (scanner.hasNext()) {
            //get the next word
            String wordsnext = scanner.next();
            //determine if the word is in the arayList
            if (words.contains(wordsnext)) {
                int index = words.indexOf(wordsnext);
                count.set(index, count.get(index) + 1);
            } else {
                words.add(wordsnext);
                count.add(1);
            }

        }
        scanner.close();
        file.close();
        
        //print out the results
        for(int i=0; i<words.size(); i++)
        System.out.println(words.get(i)+" occured "+ count.get(i)+ " time(s)");

    }
}
