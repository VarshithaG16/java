class ChocolateTester
{
public static void main(String a[])
{
Chocolate choco = new Chocolate();
choco.chocolateName = "Snickers";
choco.price = 50;
choco.patent = "Mars Inc.";
System.out.println(choco.chocolateName+"  "+choco.price+"  "+choco.patent);
choco.ingrediantsUsed();


Chocolate choco1 = new Chocolate();
choco1.chocolateName = "5 star";
choco1.price = 10;
choco1.patent = "Cadbury";
System.out.println(choco1.chocolateName+"  "+choco1.price+"  "+choco1.patent);
choco1.ingrediantsUsed();


Chocolate choco2 = new Chocolate();
choco2.chocolateName = "Kitkat";
choco2.price = 25;
choco2.patent = "Nestle";
System.out.println(choco2.chocolateName+"  "+choco2.price+"  "+choco2.patent);
choco2.ingrediantsUsed();


Chocolate choco3 = new Chocolate();
choco3.chocolateName = "Dairy Milk";
choco3.price = 225;
choco3.patent = "Cadbury";
System.out.println(choco3.chocolateName+"  "+choco3.price+"  "+choco3.patent);
choco3.ingrediantsUsed();

}
}