package cm.test.ncr;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 
 * @author User1
 *
 *https://www.hackerrank.com/challenges/cube-summation/problem
 *
 *
 *   2
4 5
UPDATE 2 2 2 4
QUERY 1 1 1 3 3 3
UPDATE 1 1 1 23
QUERY 2 2 2 4 4 4
QUERY 1 1 1 3 3 3

4
4
27
 */

public class CubeSummation {
    static ArrayList<int[]> Ulist;
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = pi(rl(in));
        Ulist = new ArrayList<int[]>();
        
        for (int i = 0; i < T; i++) {
            StringTokenizer nm = new StringTokenizer(rl(in));
            int N = pi(nt(nm)), M = pi(nt(nm));
            for (int j = 0; j < M; j++) {
                StringTokenizer oper = new StringTokenizer(rl(in));
                String type = nt(oper);
                int x1 = pi(nt(oper)), y1 = pi(nt(oper)), z1 = pi(nt(oper));
                
                if (type.charAt(0) == 'U') { /* update */
                    int index = contained(x1, y1, z1), W = pi(nt(oper));
                    if (index != -1) Ulist.remove(index);
                    Ulist.add(new int[]{x1, y1, z1, W});
                } else {
                    int x2 = pi(nt(oper)), y2 = pi(nt(oper)), z2 = pi(nt(oper));
                    
                    long sum = 0;
                    for (int[] A : Ulist) {
                        if (x1 <= A[0] && y1 <= A[1] && z1 <= A[2] && A[0] <= x2 && A[1] <= y2 && A[2] <= z2)
                            sum += 1L * A[3];
                    }
                    System.out.println(sum);
                }
            }
            Ulist.clear();
        }
    }
    
    static int contained(int x1, int y1, int z1) {
        int sz = Ulist.size();
        for (int i = 0; i < sz; i++) {
            int A[] = Ulist.get(i);
            if (A[0] == x1 && A[1] == y1 && A[2] == z1)
                return i;
        }
        return -1;
    }
    
    private static int pi(String s) { return Integer.parseInt(s); }
    private static String rl(BufferedReader in) throws IOException { return in.readLine(); }
    private static String nt(StringTokenizer st) { return st.nextToken(); }
}