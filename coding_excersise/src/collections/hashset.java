package collections;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
      HashSet<String> str = new HashSet<>();
      str.add("python");
      str.add("java");
      str.add("c");
      str.add("cpp");
      str.add("kotlin");

      //in the hashset there a filter available to filter the list.

      str.stream().filter(lan-> !"python".equals(lan)).forEach((ele)-> System.out.println(ele)); // this will print element not a python

    }
}
