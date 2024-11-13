import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // File = an abstract representation of file and directory path-names

        File file = new File("coverPage.png");
        // Be sure to include the file extension.

        if (file.exists()) {
            System.out.println("That file exists!");
            System.out.println(file.getPath());
            // This method will get the relative path of the file
            System.out.println(file.getAbsolutePath());
            // This method will get the exact path of the file in your computer.
            System.out.println(file.isFile());
            // This method returns true when the file exists, vise versa.
            //file.delete(); This will delete the file.
        } else {
            System.out.println("That file doesn't exist!");
        }

    }
}