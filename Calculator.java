class Calculator{
public static double addition(double a, double b)
{
return a+b;
}
public static double subtraction(double a, double b)
{
return a-b;
}
public static double multiplication(double a, double b)
{
return a*b;
}
public static double division(double a, double b)
{
return a/b;
}
public static double modulus(double a , double b)
{
return a%b;
}
public static void main(String[] args)
{
int i=1;
while(i !=0)
{
System.out.println("........................");
System.out.println("CALCULATOR");
System.out.println("........................");
System.out.println("1. ADDITION");
System.out.println("2. SUBTRACTION");
System.out.println("3. MULTIPLICATION");
System.out.println("4. DIVISION");
System.out.println("5. MODULUS");
System.out.println("6. EXIT");
System.out.println("........................");
switch(choice)
{
case 1:Scanner Sc = new Scanner(System.in);
double choice = Sc. nextDouble();
System.out.println(" enter value 1");
System.out.println("enter value 2");
addition();
System.out.println("sum of given numbers : " +addition);

case 2:Scanner Sc = new Scanner(System.in);
double choice = Sc. nextDouble();
System.out.println(" enter value 1");
System.out.println("enter value 2");
subtraction();
System.out.println("difference of given numbers : " +subtraction);

case 3:Scanner Sc = new Scanner(System.in);
double choice = Sc. nextDouble();
System.out.println(" enter value 1");
System.out.println("enter value 2");
multiplication();
System.out.println("product of given numbers : " +multiplication);

case 4:Scanner Sc = new Scanner(System.in);
double choice = Sc. nextDouble();
System.out.println(" enter value 1");
System.out.println("enter value 2");
division();
System.out.println("division of given numbers : " +division);

case 5:Scanner Sc = new Scanner(System.in);
double choice = Sc. nextDouble();
System.out.println(" enter value 1");
System.out.println("enter value 2");
modulus();
System.out.println("modulus of given numbers : " +modulus);

case 6:
int i= 0;
}

