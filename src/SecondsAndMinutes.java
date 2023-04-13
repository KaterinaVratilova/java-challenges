public class SecondsAndMinutes {

  public static void main(String[] args) {

    System.out.println(getDurationString(3945)); // The first test case for the first method
    System.out.println(getDurationString(65,45)); // Test case for the second method
  }

  public static String getDurationString(int seconds) {
// Two steps approach to get hours
    int minutes = seconds / 60;

    return getDurationString(minutes, seconds);
  }

  public static String getDurationString(int minutes, int seconds) {

    int hours = minutes / 60;

    int remainingMinutes = minutes % 60; // we use modulo to get the remaining minutes

    int remainingSeconds = seconds % 60; // use modulo to get the remaining seconds

    return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
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
