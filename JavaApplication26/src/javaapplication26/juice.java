package javaapplication26;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.lang.InterruptedException;

public class juice {

    private ArrayList<String> component;

    public juice() throws IOException {
        component = new ArrayList<String>();
        Scanner sc = new Scanner(new BufferedReader(new FileReader("juice.in")));
        while (sc.hasNextLine()) {
            component.add(sc.nextLine());
        }

    }

    public void Printcomponent() throws IOException {
        PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter(new File("juice1.out"))));
        for (int i = 0; i < component.size(); i++) {
            String componentstkoke = new String();
            componentstkoke = component.get(i);
            String[] leksemy = componentstkoke.split("[\\p{Punct}\\s]");
            for (int r = 0; r < leksemy.length; r++) {
                out1.print(leksemy[r] + "    ");
            }
            out1.println();

        }
        out1.close();
    }

    public void Sortcomponent() throws IOException {
        PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter(new File("juice2.out"))));
        for (int i = 0; i < component.size(); i++) {
            String s = new String();
            s = component.get(i);
            String[] componentsort = s.split("[\\p{Punct}\\s]");
            Arrays.sort(componentsort, new Comparator<String>() {

                public int compare(String s1, String s2) {
                    if (s1.compareToIgnoreCase(s2) < 0) {
                        return -1;
                    } else if (s1.compareToIgnoreCase(s2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            });

            for (int r = 0; r < componentsort.length; r++) {
                out1.print(componentsort[r] + " ");
            }
            out1.println();

        }
        out1.close();
    }
}
