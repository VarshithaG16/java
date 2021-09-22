class FilmIndustryUtil{

public static void main(String a[]){

FilmIndustry film= new FilmIndustry();
 film.nameOfIndustry="Sandalwood";
 film.nameOfMovie="Sooryavamsha";
 film.nameOfActor="Vishnuvardhan";
 film.musicBy="V Manohar";
 System.out.println(film.nameOfIndustry+"  "+film.nameOfMovie+"  "+film.nameOfActor+"  "+film.musicBy);
 film.watch();
 
 FilmIndustry film1= new FilmIndustry();
 film1.nameOfIndustry="Bollywood";
 film1.nameOfMovie="Sanam Teri Kasam";
 film1.nameOfActor="Harshavardhan Rane";
 film1.musicBy="Himesh Reshmammiya";
 System.out.println(film1.nameOfIndustry+"  "+film1.nameOfMovie+"  "+film1.nameOfActor+"  "+film1.musicBy);
 film.watch();
 
 FilmIndustry film2= new FilmIndustry();
 film2.nameOfIndustry="Tollywood";
 film2.nameOfMovie="Mirchi";
 film2.nameOfActor="Prabhas";
 film2.musicBy="Devi Sri Prasad";
 System.out.println(film2.nameOfIndustry+"  "+film2.nameOfMovie+"  "+film2.nameOfActor+"  "+film2.musicBy);
 film.watch();
 
}
}