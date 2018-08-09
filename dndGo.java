import java.util.*;
public class dndGo
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Create new character, or load previous character?");
    String nl = sc.nextLine();

    Random rand = new Random();

    if (nl.matches("new"))
    {
      dnd p1 = new dnd();
      mod m1 = new mod();

      System.out.println("Enter your character's name");
      String a1 = sc.nextLine();
      p1.setName(a1);

      System.out.println("Enter your character's class");
      String a2 = sc.nextLine();
      p1.setRole(a2);

      System.out.println("Enter your character's background");
      String a3 = sc.nextLine();
      p1.setBack(a3);

      System.out.println("Enter your character's alignment");
      String a4 = sc.nextLine();
      p1.setAl(a4);

      System.out.println("Enter your characters level");
      int a5 = sc.nextInt();
      p1.setLevel(a5);

      System.out.println("Enter your characters strength");
      int a6 = sc.nextInt();
      p1.setStr(a6);
      m1.setStrmod(a6);


      System.out.println("Enter your characters dexterity");
      int a7 = sc.nextInt();
      p1.setDex(a7);
      m1.setDexmod(a7);


      System.out.println("Enter your characters constition");
      int a8 = sc.nextInt();
      p1.setCon(a8);
      m1.setConmod(a8);


      System.out.println("Enter your characters inteligence");
      int a9 = sc.nextInt();
      p1.setIntel(a9);
      m1.setIntelmod(a9);


      System.out.println("Enter your characters wisdom");
      int a10 = sc.nextInt();
      p1.setWis(a10);
      m1.setWismod(a10);

      System.out.println("Enter your characters charisma");
      int a11 = sc.nextInt();
      p1.setCha(a11);
      m1.setChamod(a11);

      p1.print();
      System.out.println("\n");
      m1.skills();
    }

  }
}
