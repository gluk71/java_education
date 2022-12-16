import java.util.Scanner;
import java.util.Hashtable;
import java.util.Map;

public class LexAnalizer {
    
    public static void main(String[] args) {
    
    my_dict_input();
    }

    public static void my_dict_input(){
        int resulted = 0;
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> values = new Hashtable<String, Integer>();
        String[] variables = get_user_input(sc ,"Enter expression: ").split(" {0,}\\+ {0,}");
        for (String variable : variables) 
            values.put(variable, values.getOrDefault(variable, 0) + 1);
        for (String key : values.keySet()) {
            resulted += values.get(key)*Integer.parseInt(get_user_input(sc ,"Enter vaue for " + key + ": "));
           
        }
        for (String key : values.keySet()) {
        if (values.get(key) > 1)             
            System.out.print(" " + values.get(key)+key+" +");
        else
            System.out.print(" " + key+" +");
        }
        System.out.print("\b= "+ resulted);        
        sc.close();
    }


    public static String get_user_input(Scanner sc ,String text) {
        
        System.out.println();
        System.out.print(text);
        String result =  sc.nextLine();     
        return result;               
    }    
    
}
