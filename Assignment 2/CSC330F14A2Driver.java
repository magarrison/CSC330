import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
Name: Michael Garrison
Date: 9/9/2014
I have abided by the UNCG Academic Honor Code on this assignment.
*/
public class CSC330F14A2Driver{
    public static void main(String[] args){
        String fileName = args[0];
        
        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new Queue<Integer>();
        
        Scanner fileIn = null;
        
        try{
            fileIn = new Scanner(new FileReader(fileName));
            
            while(fileIn.hasNextLine()){
                String line = fileIn.nextLine();
                if(line.contains("E"))
                    q.enqueue(fileIn.nextInt());
                else if(line.contains("D"))
                    q.dequeue().toString();
                else if(line.contains("Q"))
                    q.toString();
                else if(line.contains("U"))
                    s.push(fileIn.nextInt());
                else if(line.contains("O"))
                    s.pop().toString();
                else if(line.contains("S"))
                    s.toString();
        }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if(fileIn != null)
                fileIn.close();
        }
    }
}