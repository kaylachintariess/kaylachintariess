
 
public class KonversiSuhu {
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;
        
        System.out.println("--- 9a. Celcius ke Fahrenheit & Sebaliknya ---");
        double cToF = (C * 9/5) + 32;
        double fToC = (F - 32) * 5/9;
        System.out.println(C + " Celcius = " + cToF + " Fahrenheit");
        System.out.println(F + " Fahrenheit = " + fToC + " Celcius");
        
        System.out.println("\n--- 9b. Celcius ke Reamur & Sebaliknya ---");
        double cToR = C * 4/5;
        double rToC = R * 5/4;
        System.out.println(C + " Celcius = " + cToR + " Reamur");
        System.out.println(R + " Reamur = " + rToC + " Celcius");
        
        System.out.println("\n--- 9c. Fahrenheit ke Reamur & Sebaliknya ---");
        double fToR = (F - 32) * 4/9;
        double rToF = (R * 9/4) + 32;
        System.out.println(F + " Fahrenheit = " + fToR + " Reamur");
        System.out.println(R + " Reamur = " + rToF + " Fahrenheit");
    }
}