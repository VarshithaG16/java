class ShirtUtil
{
public static void main(String a[])
{
Shirt shirt=new Shirt();
shirt.name="Reymonds";
shirt.cost=1500;
shirt.color="black";
System.out.println(shirt.name+" "+shirt.cost+" "+shirt.color);
shirt.wear();

Shirt shirt1=new Shirt();
shirt1.name = "Peter England";
shirt1.cost=1750;
shirt1.color="blue";
System.out.println(shirt1.name+" "+shirt1.cost+" "+shirt1.color);
shirt1.wear();


Shirt shirt2=new Shirt();
shirt2.name="Louis Phillipe";
shirt2.cost=2550;
shirt2.color="red";
System.out.println(shirt2.name+" "+shirt2.cost+" "+shirt2.color);
shirt2.wear();


Shirt shirt3=new Shirt();
shirt3.name="Tommy Hilfigerer";
shirt3.cost=2200;
shirt3.color="red";
System.out.println(shirt3.name+" "+shirt3.cost+" "+shirt3.color);
shirt3.wear();
}
}