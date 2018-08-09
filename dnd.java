import java.util.*;
public class dnd
{
  //attributes

  public String name;
  public String role;
  public String race;
  public String back;
  public String al;
  public int level;
  public int str;
  public int dex;
  public int con;
  public int intel;
  public int wis;
  public int cha;
  public int strmod;
  public int dexmod;
  public int conmod;
  public int intelmod;
  public int wismod;
  public int chamod;
  public int pp;

  //default

  public dnd()
  {
    name = "John Smith"; role = "Rogue"; race = "human"; back = "Criminal"; al = "CN"; level = 1;
    str = 0; dex = 0; con = 0; wis = 0; intel = 0; cha = 0;
    strmod = 0; dexmod = 0; conmod = 0; wismod = 0; intelmod = 0; chamod = 0;
    pp = wis + 10;
  }

  //general

  public void dnd()
  {
    this.name = name; this.role = role; this.race = race; this.back = back; this.al = al; this.level = level;
    this.str = str; this.dex = dex; this.con = con; this.intel = intel; this.wis = wis; this.cha = cha;
    this.strmod = (str/2)+5; this.dexmod = (dex/2)+5;
    this.conmod = (con/2)+5; this.intel = (intel/2)+5;
    this.wismod = (wis/2)+5; this.chamod = (cha/2)+5;
    this.pp = wis+10;
  }

  //setter

  public void setName(String name)
  {
    this.name = name;
  }

  public void setRole(String role)
  {
    this.role = role;
  }

  public void setRace(String race)
  {
    this.race = race;
  }

  public void setBack(String back)
  {
    this.back = back;
  }

  public void setAl(String al)
  {
    this.al = al;
  }

  public void setLevel(int level)
  {
    this.level = level;
  }

  public void setStr(int str)
  {
    this.str = str;
  }

  public void setDex(int dex)
  {
    this.dex = dex;
  }

  public void setCon(int con)
  {
    this.con = con;
  }

  public void setIntel(int intel)
  {
    this.intel = intel;
  }

  public void setWis(int wis)
  {
    this.wis = wis;
  }

  public void setCha(int cha)
  {
    this.cha = cha;
  }

  public void setStrmod(int str)
  {
    this.strmod = (str/2)-5;
  }

  public void setDexmod(int dex)
  {
    this.dexmod = (dex/2)-5;
  }

  public void setConmod(int con)
  {
    this.conmod = (con/2)-5;
  }

  public void setIntelmod(int intel)
  {
    this.intelmod = (intel/2)-5;
  }

  public void setWismod(int wis)
  {
    this.wismod = (wis/2)-5;
  }

  public void setChamod(int cha)
  {
    this.chamod = (cha/2)-5;
  }

  public void setPp(int wis)
  {
    this.pp = wis + 10;
  }

  //getter

  public String getName()
  {
    return name;
  }

  public String getRole()
  {
    return role;
  }

  public String getRace()
  {
    return race;
  }

  public String getBack()
  {
    return back;
  }

  public String getAl()
  {
    return al;
  }

  public int getLevel()
  {
    return level;
  }

  public int getStr()
  {
    return str;
  }

  public int getDex()
  {
    return dex;
  }

  public int getCon()
  {
    return con;
  }

  public int getIntel()
  {
    return intel;
  }

  public int getWis()
  {
    return wis;
  }

  public int getCha()
  {
    return cha;
  }

  public int getStrmod()
  {
    return strmod;
  }

  public int getDexmod()
  {
    return dexmod;
  }

  public int getConmod()
  {
    return conmod;
  }

  public int getIntelmod()
  {
    return intelmod;
  }

  public int getWismod()
  {
    return wismod;
  }

  public int getChamod()
  {
    return chamod;
  }

  public int getPp()
  {
    return pp;
  }

  //functionality

public void print()
{
  System.out.println("Base Information" + "\n");
  System.out.println("Name: " + name + " Class: " + role + " Background: " + back + " Alignment: " + al + "\n");
  System.out.println("Combat Stats" + "\n");
  System.out.println("Strength: " + str);
  System.out.println("Dexterity: " + dex);
  System.out.println("Constitution: " + con);
  System.out.println("Inteligence: " + intel);
  System.out.println("Wisdom: " + wis);
  System.out.println("Charisma: " + cha);
}

}
