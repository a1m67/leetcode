package acm;

import java.util.Scanner;

public class T8_avg {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String line = in.nextLine();
            String [] items = line.split(" ");
            int sum = 0;
            for(String item:items){
                char c = item.charAt(0);
                switch(c){
                    case 'A':
                        sum+=4;
                        break;
                    case 'B':
                        sum+=3;
                        break;
                    case 'C':
                        sum+=2;
                        break;
                    case 'D':
                        sum+=1;
                        break;
                    case 'F':
                        sum+=0;
                        break;
                    default:
                        System.out.println("Unknown");
                        return;
                }

            }
            System.out.printf("%.2f\n",1.00*sum/ items.length);
        }
    }
}
