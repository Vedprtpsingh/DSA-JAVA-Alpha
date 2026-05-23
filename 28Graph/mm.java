/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.u.*;

class Result {

    public static int finalins(int ins, List<Integer> a) {
        int i = 0;

        while (i < a.size()) {
            int u = a.get(i);

            if (u < 25) {

                if (ins > 1) {
                    ins = (ins + 1) / 2;
                    i += 11;
                } else {
                    i++;
                }

            } else if (u > 60) {

                if (ins * 2 <= 200000000) {
                    ins *= 2;
                    i += 11;
                } else {
                    i++;
                }

            } else {
                i++;
            }
        }

        return ins;
    }
}

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ins = sc.nextInt();
        int n = sc.nextInt();

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(Result.finalins(ins, a));
    }
}