class grandparent
{
  public grandparent()
  {
    System.out.println("grandparent constructor");
  }
}

class parent extends grandparent
{
  public parent()
  {
    super();
    System.out.println("parent constructor");
  }
}

class child extends parent
{
  public child()
  {
   super();
   System.out.println("child constructor");
  }
}

class Chain
{
  public static void main(String args[])
  {
    child ch = new child();
  }
}