import java.util.*;

public class Statistics {

  /**
   * Iterates through arguments,
   * if the integer is positive, it adds it to the arrayList created at the top of the method.
   * If negative or zero, we add one to the error count
   * The catch to add one for the errors is for decimals or a string that cannot be parsed to an int
   */
  static void getNumbers(String [] args) {
    ArrayList<Integer> numList = new ArrayList<>();
    int errors = 0;

    for (String arg : args) {
      try {
        int newNum = Integer.parseInt(arg);
        if (newNum > 0) {
          numList.add(newNum);
        } else errors += 1;
      } catch (NumberFormatException e) {
        errors += 1;
      }
    }

    System.out.println("Total input count: " + (numList.size() + errors));
    System.out.println("Positive integer count: " + numList.size());
    System.out.println("Minimum: " + calculateMin(numList));
    System.out.println("Maximum: " + calculateMax(numList));
    System.out.println("Mean: " + calculateAverage(numList));
    System.out.println("Median: " + calculateMedian(numList));
    System.out.println("Errors: " + totalErrorsToString(errors));
  }

  /**
   * These methods are public for testing purposes
   */
  public static String calculateMax(ArrayList<Integer> numList) {
    String maximum;
    if (!numList.isEmpty()) {
      int max = Collections.max(numList);
      maximum = String.valueOf(max);
    } else maximum = "n/a";
    return maximum;
  }

  public static String calculateMin(ArrayList<Integer> numList) {
    String minimum;
    if (!numList.isEmpty()) {
      int min = Collections.min(numList);
      minimum = String.valueOf(min);
    } else minimum = "n/a";
    return minimum;
  }

  private static String totalErrorsToString(int errors) {
    /**
     * Just converts the error total to a string, and if none, returns n/a
     */
    if (errors > 0) {
      String errorCountToString = String.valueOf(errors);
      return errorCountToString;
    } else return "n/a";
  }

  public static String calculateMedian(ArrayList<Integer> numList) {
    double roundedMedian = 0;

    /**
     * Sorts the arrayList before finding median
     */
    Collections.sort(numList);

    if (numList.isEmpty()) {return "n/a";};

    /**
     * Checks if element count is even
     */
    if (numList.size() % 2 == 0) {

      /**
       * gets the two middle numbers of the arrayList
       */
      double lowerMiddle = numList.get(numList.size() / 2);
      double upperMiddle = numList.get((numList.size() / 2) - 1);
      double avgOfMiddles = (lowerMiddle + upperMiddle) / 2;
      double roundedAvg = Math.round(avgOfMiddles * 100.0) / 100.0;
      roundedMedian += roundedAvg;
    } else {
      double median = Math.round(numList.get(((numList.size() + 1) / 2) - 1) * 100.0 / 100.0);
      roundedMedian += median;
    }
    String medianToString = String.valueOf(roundedMedian);
    return medianToString;
  }

  public static String calculateAverage(ArrayList<Integer> numList) {
    Integer sumOfInputs = 0;
    if(!numList.isEmpty()) {
      for (Integer num : numList) {
        sumOfInputs += num;
      }
    } else return "n/a";
    
    double avg = sumOfInputs.doubleValue() / numList.size();
    double roundedAvg = Math.round(avg * 100.0) / 100.0;
    String avgToString = String.valueOf((roundedAvg));
  
    return avgToString;
  }

  public static void main(String[] args) {
    getNumbers(args);
  }
}


