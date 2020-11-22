
import java.util.Arrays;
import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    
    //0 Set variables to play with
    Integer[] nList = {2,12,5,7,89}; //array of integers
    int num_1 = 2;
    int num_2 = 5;

    //1   
    System.out.println("Maximum of nList: " + maximum(nList) + "\n");

    //2
    System.out.println("2 w/ HashMap + IfElse: int " + String.valueOf(num_1) + " -> " + printNumberInWord(num_1));
    System.out.println("2 w/ HashMap + IfElse: int " + String.valueOf(num_2) + " -> " + printNumberInWord(num_2));
    System.out.println("\n");

    //3
    System.out.println("3: " + String.valueOf(num_1) + " -> " + checkOddEven(num_1));
    System.out.println("3: " + String.valueOf(num_2) + " -> " + checkOddEven(num_2));  
    System.out.println("\n");

    //4
    System.out.println("4 Average of nList: " + average(nList));

  }

  // Challenge 1: Largest Integer in the list
  public static Integer maximum(Integer[] numList){
    Arrays.sort(numList);
    return numList[numList.length - 1];
  }
  
  // Challenge 2: Print number in word
  public static String printNumberInWord(int num){
    HashMap<Integer,String> strNums = new HashMap<>();

    strNums.put(1, "ONE");   strNums.put(2, "TWO");   strNums.put(3, "THREE"); 
    strNums.put(4, "FOUR");  strNums.put(5, "FIVE");  strNums.put(6, "SIX");
    strNums.put(7, "SEVEN"); strNums.put(8, "EIGTH"); strNums.put(9, "NINE");

    if (strNums.keySet().contains(num)) {return strNums.get(num);}
    else {return "OTHER";}
  }

  // Challenge 3: Check Odd/Even
  public static String checkOddEven (int num){
    if (num % 2 == 0) {return "This number is EVEN";}
    else {return "This number is ODD";} 
  }

  // Challenge 4: Calculate the average
  public static double average(Integer[] numList) {

    int total = 0;
    for (int i = 0; i < numList.length; i ++) {
      total = total + numList[i];
    }

    return total / numList.length;
  }
}