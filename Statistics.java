import java.util.*;

class Statistics {
  static void getNumbers(String [] args) {
    ArrayList<Integer> numList=new ArrayList<>();
    int errors = 0;

    for (String s : args) {
      try {
        int newNum = Integer.parseInt(s);
        if (newNum > 0) {
          numList.add(newNum);
        } else errors += 1;
      } catch (NumberFormatException e) {
        errors += 1;
      }
    }

    System.out.println(numList);

    System.out.println("Positive Integer count: " + numList.size());
    System.out.println("Total input count: " + (numList.size() + errors));
    System.out.println("Minimum: " + calculateMin(numList));
    System.out.println("Maximum: " + calculateMax(numList));
    System.out.println("Mean: " + calculateAverage(numList));
    System.out.println("Median: " + calculateMedian(numList));
    System.out.println("Errors: " + totalErrors(errors));
  }

  private static String calculateMax(ArrayList<Integer> numList) {
    String maximum;
    if (!numList.isEmpty()) {
      int max = Collections.max(numList);
      maximum = String.valueOf(max);
    } else maximum = "n/a";
    return maximum;
  }

  private static String calculateMin(ArrayList<Integer> numList) {
    String minimum;
    if (!numList.isEmpty()) {
      int min = Collections.min(numList);
      minimum = String.valueOf(min);
    } else minimum = "n/a";
    return minimum;
  }

  private static String totalErrors(int errors) {
    if (errors > 0) {
      String s = String.valueOf(errors);
      return s;
    } else return "n/a";
  }

  private static String calculateMedian(ArrayList<Integer> numList) {
    double roundedMedian = 0;
    Collections.sort(numList);
    if (numList.isEmpty()) {return "n/a";};
    if (numList.size() % 2 == 0) {
      int lowerMiddle = numList.get(numList.size() / 2);
      int upperMiddle = numList.get((numList.size() / 2) - 1);
      double avgOfMiddles = (lowerMiddle + upperMiddle) / 2;
      double roundedAvg = Math.round(avgOfMiddles * 100.0) / 100.0;
      roundedMedian += roundedAvg;
    } else {
      double median = Math.round(numList.get(((numList.size() + 1) / 2) - 1) * 100.0 / 100.0);
      roundedMedian += median;
    }
    String s = String.valueOf(roundedMedian);
    return s;
  }

  private static String calculateAverage(ArrayList<Integer> numList) {
    Integer sum = 0;
    if(!numList.isEmpty()) {
      for (Integer num : numList) {
        sum += num;
      }
    } else return "n/a";
    
    double avg = sum.doubleValue() / numList.size();
    double roundedAvg = Math.round(avg * 100.0) / 100.0;
    String s = String.valueOf((roundedAvg));
  
    return s;
  }

  public static void main(String[] args) {
    getNumbers(args);
  }
}


