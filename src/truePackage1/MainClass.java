package truePackage1;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

public class MainClass {
    // bai 3
    public static boolean checkPangram(String s) {
        HashSet<Character> set = new HashSet<>();
        s = s.toLowerCase();
        for (Character c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(c);
                System.out.print(c);
            }
        }
        System.out.println();
        return set.size() == 26;
    }

    // bai 1
    public static HashSet<Character> findCommonCharacters(String s1, String s2) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }
        for (char c : s2.toCharArray()) {
            set2.add(c);
        }

        Iterator<Character> iterator = set1.iterator();
        while (iterator.hasNext()) {
            Character c = iterator.next();
            if (!set2.contains(c)) {
                iterator.remove();
            }
        }
        return set1;
    }

    // bai 2
    public static int countUniqueElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        return set.size();
    }

    // bai 4
    public static HashSet<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i : nums) {
            System.out.print("cur i : " + i + " ");
            if (!set.add(i)) {
                System.out.print("add i : " + i + " ");
                result.add(i);
            }
        }
        return result;
    }

    // bai 5
    public static HashSet<Integer> mergeSets(HashSet<Integer> set1, HashSet<Integer> set2) {
        set1.addAll(set2);
        return set1;
    }

    public static void main(String[] args) {
        
        try {
            BufferedWriter writeMyName = new BufferedWriter(new FileWriter("myname.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("myname.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("newname.txt"));

            writeMyName.write("This is my name : \n");
            writeMyName.write("Oh Shit, Johnson Baby");
            writeMyName.close();

            String line = "";
            while ((line = reader.readLine()) != null) {
                writer.write("Hello " + line);
                System.out.print("Hello, " + line + "\n");
            }
            writer.close();
            reader.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


// Test
//        String s1 = "abcdef";
//        String s2 = "acd";
//        System.out.printf("s1 : %s ; s2 : %s%n", s1, s2);
//        System.out.println(findCommonCharacters(s1, s2));
//
//        int[] nums = {3, 5, 3, 7, 9, 5, 7, 9};
//        System.out.println(countUniqueElements(nums)); // 4
//
//        int[] nums = {1, 2, 3, 4, 2, 5, 6, 7, 1};
//        System.out.println(findDuplicates(nums)); // [1, 2]
//        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
//        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
//        System.out.println(mergeSets(set1, set2)); // [1, 2, 3, 4, 5, 6]

