// this file contain all the constants in the package and use as an interface to all the other file in the project.

public class Constants {

    public static final int ZERO = 0;
    public static final int COUNT = 10;

    public static final String ERROR_INSERT = "cant insert this student. number already exists";

    public static final String PROMPT_USER = "please insert one line that contain the command and parameters.\n for help, type help.";
    public static final String HELP_TEXT =
            "insert a line that contain the command then the parameters. \n" +
            "the methods are: " +
            "help - list all the possible commands."+
            "exit - exit from the program.\n" +
            "insert <studentNum> <studentName> - insert the student.\n" +
            "remove <studentNum> - remove the student.\n" +
            "search <studentNum> - search for the student.\n" +
            "successor <studentNum> - print the successor.\n" +
            "predecessor <studentNum> - print the successor.\n" +
            "max - print the max student.\n" +
            "min - print the max student.\n" +
            "preorder - print the tree as pre order.\n" +
            "inorder - print the tree as in order.\n" +
            "postorder - print the tree as post order.\n" +
            "gui - print the tree as two dimension tree.\n" +
            "median - print the median.\n" +
            "file <fileName> - read the input from the specific file.\n"
            ;



}
