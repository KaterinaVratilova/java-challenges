public class NatoAlphabet {

  public static void main(String[] args) {

    char charValue = 'A';
    switch (charValue) {
      case 'A':
        System.out.println("A is able");
        break;
      case 'B':
        System.out.println("B is baker");
        break;
      case 'C':
        System.out.println("C is charlie");
        break;
      case 'D':
        System.out.println("D is dog");
        break;
      case 'E':
        System.out.println("E is easy");
        break;
      default:
        System.out.println("Letter " + charValue + " was not found in the switch");
        break;
    }
  }
}
/*
* Use NATO alphabet to replace a character or letter with NATO word for that letter.
* Take a single character and return the matching word from the alphabet.
* */

