package org.example;

public class typesofvariables
{
static String name = "manikanth";
int age = 12;

void diplay()
{
 String nationality = "indian";
 System.out.println(nationality);

}
public static void main(String[]args)
{
    typesofvariables a = new typesofvariables();

    System.out.println(name);
    System.out.println(a.age);
    a.diplay();


}

}
