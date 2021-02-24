package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }

        String temp;
        for (int i = 0; i < M; i++) {
            temp = list.get(0);
            list.remove(list.get(0));
            list.add(temp);
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            System.out.println(list.get(i));
        }


        // write your code here
    }
}
