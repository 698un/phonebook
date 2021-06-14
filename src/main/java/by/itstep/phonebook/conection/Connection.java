package by.itstep.phonebook.conection;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Connection {

    //private Object StreamReader;

    public static List<String> readFullFile(File file) {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            return br.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Integer getNumberOfRecords(String path){


        try{
            String s= Files.lines(Paths.get(path)).toString();





            }catch(IOException e){



            }


        return 0;
    }


    public int getLastID(String dbName) throws FileNotFoundException {

        File f1 = new File(dbName);

        BufferedReader input = new BufferedReader(new FileReader(dbName));
        String last, line;

        int count = input.lines().count();

        input.
        while (null != (line = input.readLine())) {
            last = line;
            }

        String[] a = last.split(",");
        return a[0].toI

        return ;
        }//getLastID


    public static void writeToFileOneLine(File file, String logLine) {
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(file, true))) {
            bw.newLine();
            bw.write(logLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
