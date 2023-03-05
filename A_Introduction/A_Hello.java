package A_Introduction;
//This is a single line comment: The Above Given Line declares the package

/* this is a multiline comment: class name same as filename and access modifier public so that
    it is accessible from anywhere */
public class A_Hello{
    public static void main(String[] args){

        // System class, out is variable of type printstream and println is method
        System.out.println("Hello, World!");

        // different ways of printing in java

        // this will not print a new line
        System.out.print("OnlyPrint");

        // we can use new line character 
        System.out.print("Demo\n");
        System.out.println("on newline");
    }
}