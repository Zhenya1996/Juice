package javaapplication26;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.lang.InterruptedException;

public class juice {

    private ArrayList<String> component;
    private int[] count;
    private int chislo;

    public juice() throws IOException {
        component = new ArrayList<String>();
        chislo = 0;
        Scanner sc = new Scanner(new BufferedReader(new FileReader("juice.in")));
        while (sc.hasNextLine()) {
            component.add(sc.nextLine());
            chislo++;
        }
    /* while(sc.hasNextLine())
    {

    StringTokenizer st=new StringTokenizer(sc.nextLine()," ");
    while(st.hasMoreTokens())
    {
    component.add(st.nextToken());
    }
     */
    }

    public void Printcomponent() throws IOException {
        PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter(new File("juice1.out"))));
        for (int i = 0; i < component.size(); i++) {
            String s = new String();
            s = component.get(i);
            String[] test = s.split("[\\p{Punct}\\s]");
            for (int r = 0; r < test.length; r++) {
                out1.print(test[r] + "    ");
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

    public void fun3() throws IOException {
        PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter(new File("juice2.txt"))));
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

    /* public void function1()throws IOException{
    PrintWriter out1=new PrintWriter(new BufferedWriter(new FileWriter(new File("juice1.txt"))));
    for(int i=0;i<component.size();i++){
    out1.println(component.get(i));
    }
    out1.close();
    }*/
    public void function2() throws IOException {
        PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter(new File("juice1.txt"))));
        String componentsort[] = new String[component.size()];
        for (int i = 0; i < component.size(); i++) {
            componentsort[i] = component.get(i);
        }

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
        for (int i = 0; i < componentsort.length; i++) {
            out1.print(componentsort[i] + "  ");
        }
        out1.close();
    }

    public void print() {
        for (int i = 0; i < component.size(); i++) {
            System.out.println(component.get(i));
        }
    }

    public void f3() {
        ArrayList<String> al = new ArrayList<String>();
        count = new int[chislo];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        int k = 0;
        for (int i = 0; i < component.size(); i++) {
            String s = component.get(i);
            String[] test = s.split("[\\p{Punct}\\s]");
            Arrays.sort(test);
            count[k] = test.length;
            k++;

        }
        String[] myArray = new String[component.size()];
        component.toArray(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        for (int i = 0; i < count.length; i++) {
            for (int j = i; j < count.length; j++) {
                if (count[i] > count[j]) {
                    String q = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = q;
                /*  int t = a[i];
                a[i] = a[j];
                a[j] = t;*/
                }
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

    }
}
