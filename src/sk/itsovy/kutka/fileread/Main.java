package sk.itsovy.kutka.fileread;

public class Main {

    public static void main(String[] args) {
        ReadFile f = new ReadFile();
        f.printJoke();
        f.printFileInfo();
        System.out.println(f.diktat("vstup", "vstup_copy.txt"));

    }
}
