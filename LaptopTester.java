class LaptopTester
{
public static void main(String a[])
{
Laptop lap = new Laptop();
lap.weight = 14;
lap.brandName = "HP";
lap.price = 77000;
lap.color = "Purple";
lap.model = "NoteBook";
System.out.println(lap.weight+"  "+lap.brandName+"  "+lap.price+"  "+lap.color+"  "+lap.model);
lap.processor();


Laptop lap1 = new Laptop();
lap1.weight = 13;
lap1.brandName = "Acer";
lap1.price = 80000;
lap1.color = "Black";
lap1.model = "Radeon";
System.out.println(lap1.weight+"  "+lap1.brandName+"  "+lap1.price+"  "+lap1.color+"  "+lap1.model);
lap1.processor();


Laptop lap2 = new Laptop();
lap2.weight = 12;
lap2.brandName = "Mac";
lap2.price = 140000;
lap2.color = "Purple";
lap2.model = "NoteBook";
System.out.println(lap2.weight+"  "+lap2.brandName+"  "+lap2.price+"  "+lap2.color+"  "+lap2.model);
lap2.processor();
}
}