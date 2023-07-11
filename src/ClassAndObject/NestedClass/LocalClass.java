package ClassAndObject.NestedClass;

/*
 * Takeaway: The local class can only access those variable inside scope which are final or effective
 * final, means that after assignment of the variable it's not changeling.
 *
 *  After JDK 8 we can access the parameters passed in function to local class.
 *
 *  Local class can be also create inside for loop or in if else clause.
 */
public class LocalClass {

  static String regularExpression = "[^0-9]";

  public static void validatePhoneNumber(
    String phoneNumber1,
    String phoneNumber2
  ) {
    final int numberLength = 10;

    class PhoneNumber {

      String formattedPhoneNumber = null;

      PhoneNumber(String phoneNumber) {
        String currentNumber = phoneNumber.replaceAll(regularExpression, "");
        if (currentNumber.length() == numberLength) formattedPhoneNumber =
          currentNumber; else formattedPhoneNumber = null;
      }

      public String getNumber() {
        return formattedPhoneNumber;
      }

      public void printOriginalNumbers() {
        System.out.println(
          "Original numbers are " + phoneNumber1 + " and " + phoneNumber2
        );
      }
    }

    PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
    PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

    if (myNumber1.getNumber() == null) {
      System.out.println("First number is invalid");
      myNumber1.printOriginalNumbers();
    } else System.out.println("First number is " + myNumber1.getNumber());
    if (myNumber2.getNumber() == null) System.out.println(
      "Second number is invalid"
    ); else System.out.println("Second number is " + myNumber2.getNumber());
  }

  public void greetInEnglish() {
    interface HelloThere {
      public void greet();
    }
    class EnglishHelloThere implements HelloThere {

      public void greet() {
        System.out.println("Hello " + "Dhruvin");
      }
    }
    HelloThere myGreeting = new EnglishHelloThere();
    myGreeting.greet();
  }

  public static void main(String... args) {
    validatePhoneNumber("123-456-7890", "456-7890");
  }
}
