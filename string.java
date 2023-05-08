public class string {
  public static void main(String[] args) {
    String message = "Hello, world!";

    // length() method: returns the length of the string
    int length = message.length();
    System.out.println("Length of the message is: " + length);

    // charAt() method: returns the character at a specified index
    char firstChar = message.charAt(0);
    System.out.println("First character of the message is: " + firstChar);

    // substring() method: returns a portion of the string
    String subMessage = message.substring(7, 12);
    System.out.println("Substring of the message is: " + subMessage);

    // indexOf() method: returns the index of the first occurrence of a character or substring
    int index = message.indexOf("world");
    System.out.println("Index of 'world' in the message is: " + index);

    // toUpperCase() method: returns the string in uppercase
    String upperCaseMessage = message.toUpperCase();
    System.out.println("Uppercase message is: " + upperCaseMessage);

    // toLowerCase() method: returns the string in lowercase
    String lowerCaseMessage = message.toLowerCase();
    System.out.println("Lowercase message is: " + lowerCaseMessage);
  }
}

