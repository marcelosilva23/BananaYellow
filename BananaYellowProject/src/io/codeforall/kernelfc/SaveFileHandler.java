package io.codeforall.kernelfc;

import java.io.*;
import java.util.LinkedList;

public class SaveFileHandler {
    public static String filePath = "Save/LeaderBoard.txt";
    public static final String NEWLINE = "\n";
    public static LinkedList<String> scoreList = new LinkedList<>();
    public static void saveNew(String input) throws IOException {
        FileWriter fiwr = new FileWriter(filePath);
        LinkedList<String> temp = loadFile();
        temp.add(input);
        temp.sort(String::compareTo);
        for (String str : temp){
            System.out.println("writing " + str);
            fiwr.write(str + '\n');
        }

        System.out.println("save completed");
        fiwr.close();


    }

    public static LinkedList<String> loadFile() throws IOException {

        LinkedList<String> out = new LinkedList<>();
        FileReader fire = new FileReader(filePath);
        BufferedReader bufre = new BufferedReader(fire);

        System.out.println(" started loop ");
        while (true) {
            String line = bufre.readLine();
            System.out.println("line" + line);

            if (line == null) {
                break;
            }
            out.add(line);

        }
        System.out.println("finished reading");
        scoreList = out;
        scoreList.sort(String::compareTo);
        fire.close();
        bufre.close();
        return scoreList;
    }
}
