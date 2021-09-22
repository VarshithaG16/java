class BagUtil
{
public static void main(String a[])
{
Bags bag=new Bags();
bag.name="Wildcraft";
bag.cost=2300;
bag.brandAmbassador="Gaurav Dublish";
System.out.println(bag.name+" "+bag.cost+" "+bag.brandAmbassador);
bag.carry();

Bags bag1=new Bags();
bag1.name="SkyBags";
bag1.cost=1500;
bag1.brandAmbassador="Varun Dhawan";
System.out.println(bag1.name+" "+bag1.cost+" "+bag1.brandAmbassador);
bag1.carry();


Bags bag2=new Bags();
bag2.name="American Tourister";
bag2.cost=2300;
bag2.brandAmbassador="Virat Kohli";
System.out.println(bag2.name+" "+bag2.cost+" "+bag2.brandAmbassador);
bag2.carry();


}

}