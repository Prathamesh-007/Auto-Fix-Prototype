import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "D:\\Github\\Auto-Fix-Prototype\\src\\Files\\Example.java";

        // Specify the line number you want to edit
        int lineNumber = 6;


        // Specify the new content
        String newContent = ReadLine(filePath, lineNumber);
        System.out.println(newContent);
        newContent = newContent.replaceAll("^\\s+", "");
        newContent = "        " + newContent;

        try {
            // Read the contents of the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder sb = new StringBuilder();
            String line;
            int currentLine = 1;
            while ((line = reader.readLine()) != null) {
                // If it's the line you want to edit, replace it with the new content
                if (currentLine == lineNumber) {
                    sb.append(newContent).append("\n");
                } else {
                    sb.append(line).append("\n");
                }
                currentLine++;
            }
            reader.close();

            // Write the modified contents back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(sb.toString());
            writer.close();

            System.out.println("Line " + lineNumber + " edited successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String ReadLine(String filePath, int lineNumber) {
        String line = new String("");
        try {
            // Open the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Read lines until reaching the target line number

            int currentLineNumber = 1;
            while ((line = reader.readLine()) != null && currentLineNumber <= lineNumber) {
                if (currentLineNumber == lineNumber) {
                    // Process the line here
                    System.out.println(line);
                    break; // Once the target line is read, exit the loop
                }
                currentLineNumber++;
            }

            // Close the file
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            return line;
        }

    }
}
