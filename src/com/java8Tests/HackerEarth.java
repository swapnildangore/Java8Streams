package com.java8Tests;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HackerEarth {
String str = "https://www.hackerrank.com/interview/interview-preparation-kit?h_l=domains&h_r=hrw&utm_source=hrwCandidateFeedback";
	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arrTemp = new ArrayList<>();

        IntStream.range(0, arrCount).forEach(i -> {
            try {
                arrTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> arr = arrTemp.stream()
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String res = null;//findNumber(arr, k);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}

	public static void main1(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int commandsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> commands = IntStream.range(0, commandsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = new ArrayList<>();//Result.doesCircleExist(commands);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
	
	static void method2() throws IOException {
		   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = bufferedReader.readLine();

	        String t = bufferedReader.readLine();

	        int result = 0;//Result.maxMoves(s, t);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	}
}
