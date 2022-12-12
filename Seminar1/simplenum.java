//Определить является ли число простым

class SimpleNumber{

public static void main(String args[]){
    for(int i=2;i<1000;i++){
        boolean isPrimeNum = true;

        for(int j=2;j < i;j++) {
            if(i % j == 0) {
                isPrimeNum = false;
                break;
            } 
        } 
        if(isPrimeNum){
            System.out.println(i);
        }
    }
  }
}