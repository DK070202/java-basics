package ClassAndObject.Methods;

public class Return {

  public static void main(String[] args) {
    Return r = new Return();
    CallableInterface iFace = r.getCallableInterface();
    iFace.doSomething();
    CallableInterface iFace2 = r.getImplementation();
    iFace2.doSomething();
  }

  public CallableInterface getCallableInterface() {
    return () -> {
      System.out.println("Called callable interface");
    };
  }

  public CallableInterface getImplementation() {
    return new ImplementedInterface();
  }
}

interface CallableInterface {
  void doSomething();
}

class ImplementedInterface implements CallableInterface {

  @Override
  public void doSomething() {
    System.out.println("Called ImplementedInterface interface");
  }
}
