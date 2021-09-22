class ICCTeamsTester
{
public static void main(String a[])
{
ICCTeams icc = new ICCTeams();
icc.teamCountry = "India";
icc.jersyColor = "Blue";
icc.captainName = "Virat Kohli";
System.out.println(icc.teamCountry+"  "+icc.jersyColor+"  "+icc.captainName);
icc.players();


ICCTeams icc1 = new ICCTeams();
icc1.teamCountry = "South Africa";
icc1.jersyColor = "Yellow & Green";
icc1.captainName = "Quiton de Kock";
System.out.println(icc1.teamCountry+"  "+icc1.jersyColor+"  "+icc1.captainName);
icc1.players();


ICCTeams icc2 = new ICCTeams();
icc2.teamCountry = "England";
icc2.jersyColor = "Red and Blue";
icc2.captainName = "Eion Morgan";
System.out.println(icc2.teamCountry+"  "+icc2.jersyColor+"  "+icc2.captainName);
icc2.players();

}
}