import java.util.Map;
import java.util.HashMap;

public class WordToNumber {

  public static String getWords(Integer inNum){

    String stringNum = inNum.toString();
    String results = "";

    for ( Integer i = stringNum.length() - 1; i >= 0; i-- ) {

        char charIndex = stringNum.charAt(i);

        Integer intIndex = Character.getNumericValue(charIndex);
        if( i == stringNum.length() - 1 ) {
          //if baseone is 0, and input is longer than one digit, go to next iteration
          if (intIndex == 0 && stringNum.length() > 1){
            continue;
          }
          results = baseOne(intIndex);
        } else if( i == stringNum.length() - 2) {
          results = baseTen(intIndex) + " " + results;
        }
    }
    
    results = results.trim();
    System.out.println("result: " + results);
    return results;
  }

  public static String baseOne(Integer oneNumber){
    HashMap<Integer, String> base1HashMap = new HashMap();

    String[] base1Array = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    for (Integer i=0; i < base1Array.length; i++){
      base1HashMap.put(i, base1Array[i]);
    }
    return base1HashMap.get(oneNumber);
  }


  public static String baseTen(Integer tenNumber){

    HashMap<Integer, String> base10HashMap = new HashMap();

    String[] base10Array =
    {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    // System.out.println(base10HashMap);

    for (Integer i=0; i < base10Array.length; i+=1){
      base10HashMap.put(i+1, base10Array[i]);
    }

    return base10HashMap.get(tenNumber);
  }

}
