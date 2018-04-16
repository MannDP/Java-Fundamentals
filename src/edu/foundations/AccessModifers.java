package edu.foundations;

public class AccessModifers {
    //  private is the most restrictive
    //  default
    //  protected
    //  public is the least restrictive

    public static void main(String[] args) {

    }

    //  public visibility means that this method can be accessed anywhere in the program so long as you have an instance of this class to call it from
    public void doSomethingPublic() {

    }

    //  private visibility means that this method can't be accessed anywhere other than inside of this class
    private void doSomethingPrivate() {

    }

    //protected visibility means that this method can only be accessed inside of this package and from subclasses of this class
    protected void doSomethingProtected() {

    }

    //  default visibility means that this method can only be accessed inside of this package
    void doSomethingDefault() {

    }

}
