public class SecondsAndMinutes {

  public static void main(String[] args) {

    System.out.println(getDurationString(3945)); // The first test case for the first method
    System.out.println(getDurationString(65,45)); // Test case for the second method
    System.out.println(getDurationString(65,145));
    System.out.println(getDurationString(-65, 145));
  }

  public static String getDurationString(int seconds) {
    if (seconds < 0) { // chaeck if the parameter is wrong; we will exit if the parameter doesn't pass the validation
      return "Invalid data for seconds(" + seconds + "), must be a positive integer value"; // we exit with a returning message
    }

      int minutes = seconds / 60; // Two steps approach to get hours}

      return getDurationString(seconds / 60, seconds % 60);
    }

  public static String getDurationString(int minutes, int seconds) {

    if (minutes < 0) { // chaeck if the parameter is wrong; we will exit if the parameter doesn't pass the validation
      return "Invalid data for minutes(" + minutes + "), must be a positive integer value"; // we exit with a returning message
    }

    if (seconds <= 0 || seconds >= 59) {
      return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
    }


    int hours = minutes / 60;

    int remainingMinutes = minutes % 60; // we use modulo to get the remaining minutes

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
  }
}

/*
We'll then want to transform the seconds into hours.
Next we'll display the time in hours, with the remaining minutes and seconds, in a String.
We'll do this transformation in two steps, which allows us to use overloaded methods.

We want to create two methods with the same name:  getDurationString
The first method has one parameter of type int, named seconds.
The second method has two parameters, named minutes and seconds, both ints.
Both methods return a String in the format shown:‘XXh YYm ZZs’where XX represents the number of hours, YY the number of minutes, and ZZ the number of seconds.
The first method should in turn call the second method to return its results.

Remember that one minute is 60 seconds, and one hour equals 60 minutes, or 3600 seconds.

* */
