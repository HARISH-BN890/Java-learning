/*varables 2 type:
primative, reference
primatives are (stack):int,double,char,boolean
referance are (heap): string,array,object*/
class variables 
{
    public static void main(String args[])
    {
        int age = 20;
        int year =2026;
        int joined =2024;

        System.out.println("my age is " + age);
        System.out.println("i joined in college at :" + year);
        System.out.println("persent year at :" +joined);

        double money = 250000.223;
        double lone = 200000;
        double emi = 2500.250;
        
        System.out.println("i saled my land at prise :"+money);
        System.out.println("i took lone "+ lone +" in bank to buy car " );
        System.out.println("i have "+emi+" emi on my account");
        

        char leatter = 'H';
        char Leatter = 'U';
        char symble ='$';

        System.out.println("my first letter in my name is :"+leatter);
        System.out.println("my last letter in my name is :"+Leatter);
        System.out.println("symble for money ine amarica is :"+symble);

        boolean isStudent =false;
        boolean isnotStudent=true;

        if(isStudent)
        System.out.println("present");
        else if(isnotStudent)
        System.out.println("absent");
        else
        System.out.println("error");

    }
}