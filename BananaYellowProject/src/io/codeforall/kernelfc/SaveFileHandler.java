package io.codeforall.kernelfc;

import java.io.*;
import java.util.LinkedList;

public class SaveFileHandler {
    public static String filePath = "Save/LeaderBoard.txt";
    public static final String NEWLINE = "\n";
    public static LinkedList<String> scoreList = new LinkedList<>();
    public static void saveNew(String input) throws IOException {
        FileWriter fiwr = new FileWriter(filePath);
        fiwr.write(input + '\n');
    }

    public static LinkedList<String> loadFile() throws IOException {
        LinkedList<String> out = new LinkedList<>();
        FileReader fire = new FileReader(filePath);
        BufferedReader bufre = new BufferedReader(fire);

        while (true) {
            String line = bufre.readLine();
            if (line != null) {
                out.add(line);
                System.out.println("reading: " + line);
                continue;
            }
            System.out.println("finished reading");
            scoreList = out;
            scoreList.sort(String::compareTo);
            return scoreList;
        }
    }
}
