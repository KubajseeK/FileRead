package sk.itsovy.kutka.fileread;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public void printJoke() {
        try {
            File myFile = new File("joke.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printFileInfo() {
        File myFile = new File("joke.txt");
        if (myFile.exists()) {
            System.out.println("File name: " + myFile.getName());
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("Size: " + myFile.length());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("Writable: " + myFile.canWrite());
            System.out.println("Creation: " + myFile.lastModified());
        } else {
            System.out.println("File not najdený.");
        }
    }

    public void writeToFile() {
        try {
            File myFile = new File("joke.txt");
            FileWriter fw = new FileWriter("joke.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void copyFile(String sourceFile) {
        FileWriter output;
        int count = 0;
        try {

            File myFile = new File(sourceFile);
            File otherFile = new File("vstup_copy.txt");
            output = new FileWriter(otherFile);
            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for (int i = 0; i < data.length(); i++) {
                    if (data.charAt(i) == 'y' || data.charAt(i) == 'i' || data.charAt(i) == 'í' || data.charAt(i) == 'ý') {
                        count++;
                    }
                }
                data = data.replaceAll("y", "_");
                data = data.replaceAll("i", "_");
                data = data.replaceAll("í", "_");
                data = data.replaceAll("ý", "_");
                output.write(data + "\n");
            }
            myReader.close();
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public int diktat (String sourceFile, String target) {
        FileWriter output;
        int count = 0;
        try {

            File myFile = new File(sourceFile);
            File otherFile = new File("vstup_copy.txt");
            output = new FileWriter(otherFile);
            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for (int i = 0; i < data.length(); i++) {
                    if (data.charAt(i) == 'y' || data.charAt(i) == 'i' || data.charAt(i) == 'í' || data.charAt(i) == 'ý') {
                        count++;
                    }
                }
                data = data.replaceAll("y", "_");
                data = data.replaceAll("i", "_");
                data = data.replaceAll("í", "_");
                data = data.replaceAll("ý", "_");
                output.write(data + "\n");
            }
            myReader.close();
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
