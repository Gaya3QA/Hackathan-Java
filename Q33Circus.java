//Q33Q33. A circus is designing a tower routine consisting of people standing atop one another’s shoulders. For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her. Given the heights and weights of each person in the circus, write a method to compute the largest possible number of people in such a tower.
//EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) 
//Output: The longest tower is length 6 and includes from top to bottom:(56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
package Hackathon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

package com.tekarch.hackathon;


import java.util.*;
import java.util.Scanner;

/*
 * A circus is designing a tower routine consisting of people standing atop one another’s shoulders. 
 * For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her.
 *  Given the heights and weights of each person in the circus, 
 *  write a method to compute the largest possible number of people in such a tower. 
 *  EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) 
 *  Output: The longest tower is length 6 and includes from top to bottom: 
 *  (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
 * 
 */


//Creates a class to represent a person with a height and weight.
class Person {
    int height;
    int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    
    public String toString() {
        return "(" + height + ", " + weight + ")";
    }
}



public class Question33 {

 
 public static List<Person> largestTower(List<Person> people) {
        
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.height, p2.height); // sort the people according to there height
            }
        });
        
        // People are sorted according to height, now need to consider weight and sort it
        // Use longest increasing subsequence method
        
        
        int n = people.size();
        int[] dp = new int[n]; // keep track of the maximum length of sequences ending at each person
        int[] pred = new int[n]; //used to reconstruct the sequence by tracing back from the end of the LIS to its beginning
        
        
        Arrays.fill(dp, 1);
        Arrays.fill(pred, -1);

        int maxLength = 1;
        int maxIndex = 0;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (people.get(i).height > people.get(j).height &&
                    people.get(i).weight > people.get(j).weight &&
                    dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    pred[i] = j;
                    if (dp[i] > maxLength) {
                        maxLength = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }

      
        List<Person> tower = new ArrayList<>();
        while (maxIndex != -1) {
            tower.add(people.get(maxIndex));
            maxIndex = pred[maxIndex];
        }
        Collections.reverse(tower);  

        return tower;
    }
 
 
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.println("Enter the number of people:");
        int n = sc.nextInt();

        System.out.println("Enter the height and weight for each person:");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Height: ");
            int height = sc.nextInt();
            System.out.print("Weight: ");
            int weight = sc.nextInt();
            people.add(new Person(height, weight));
        }

        List<Person> tower = largestTower(people);

        System.out.println("The longest tower is length " + tower.size() + " and includes from top to bottom:");
        
        for (Person person : tower) {
            System.out.println(person);
        }

        sc.close();

 }
 
 

}



Anusha J (to Organizers and Panelists Only):

20:57: package com.tekarch.hackathon;


import java.util.*;
import java.util.Scanner;

import java.util.*;
import java.util.Scanner;

/*
 * A circus is designing a tower routine consisting of people standing atop one another’s shoulders. 
 * For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her.
 *  Given the heights and weights of each person in the circus, 
 *  write a method to compute the largest possible number of people in such a tower. 
 *  EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) 
 *  Output: The longest tower is length 6 and includes from top to bottom: 
 *  (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
 * 
 */


//Creates a class to represent a person with a height and weight.
class Person {
    int height;
    int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    
    public String toString() {
        return "(" + height + ", " + weight + ")";
    }
}



public class Question33 {

 
 public static List<Person> largestTower(List<Person> people) {
        
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.height, p2.height); // sort the people according to there height
            }
        });
        
        // People are sorted according to height, now need to consider weight and sort it
        // Use longest increasing subsequence method
        
        
        int n = people.size();
        int[] dp = new int[n]; // keep track of the maximum length of sequences ending at each person
        int[] pred = new int[n]; //used to reconstruct the sequence by tracing back from the end of the LIS to its beginning
        
        
        Arrays.fill(dp, 1);
        Arrays.fill(pred, -1);

        int maxLength = 1;
        int maxIndex = 0;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (people.get(i).height > people.get(j).height &&
                    people.get(i).weight > people.get(j).weight &&
                    dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    pred[i] = j;
                    if (dp[i] > maxLength) {
                        maxLength = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }

      
        List<Person> tower = new ArrayList<>();
        while (maxIndex != -1) {
            tower.add(people.get(maxIndex));
            maxIndex = pred[maxIndex];
        }
        Collections.reverse(tower);  

        return tower;
    }
 
 
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.println("Enter the number of people:");
        int n = sc.nextInt();

        System.out.println("Enter the height and weight for each person:");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Height: ");
            int height = sc.nextInt();
            System.out.print("Weight: ");
            int weight = sc.nextInt();
            people.add(new Person(height, weight));
        }

        List<Person> tower = largestTower(people);

        System.out.println("The longest tower is length " + tower.size() + " and includes from top to bottom:");
        
        for (Person person : tower) {
            System.out.println(person);
        }

        sc.close();

 }
 
 

}

