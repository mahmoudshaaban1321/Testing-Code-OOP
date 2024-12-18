package session1;

public class cars {


    // attributes / Data type
    int speed;
    String color;
    String model;
     boolean ismanual;

    // model : model name
    public void printinfo()
    {

      System.out.println("model:"  +model + " , " + " color:" +  color + " , " + " speed:" +  speed + " Car Type" + ismanual);

    }
public cars (String model, String color , int speed ,  boolean ismanual )
{
  //  body + Parameters
    this.model=model;
    this.color=color;
    this.speed=speed;
    this.ismanual=ismanual;

}

    public cars(){
        System.out.println("this empaty project");
    }
}

//methods / opperations


