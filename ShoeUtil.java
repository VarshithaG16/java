class ShoeUtil
{

public static void main(String a[]){

Shoe shoe=new Shoe();
shoe.brand="Jimmichoi";
shoe.cost=1340;
System.out.println(shoe.brand+" "+shoe.cost);
shoe.run();


Shoe shoe1=new Shoe();
shoe1.brand="Woodland";
shoe1.cost=2000;
System.out.println(shoe1.brand+" "+shoe1.cost);
shoe1.run();


Shoe shoe2=new Shoe();
shoe2.brand="Addidas";
shoe2.cost=2000;
System.out.println(shoe2.brand+" "+shoe2.cost);
shoe2.run();
}
}