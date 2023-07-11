package ClassAndObject.Enums;

public class Enums {

  public enum NotificationType {
    DEEPLINK,
    COVER,
    HEADER,
    ALERT,
  }

  public static String getContent(NotificationType type) {
    switch (type) {
      case DEEPLINK:
        return "Deeplink notification received";
      case COVER:
        return "Cover notification received";
      case HEADER:
        return "Header notification received";
      case ALERT:
        return "Alert notification received";
    }
    return null;
  }

  public static void main(String[] args) {
    String value = getContent(NotificationType.ALERT);
    System.out.println(value);
  }
}
