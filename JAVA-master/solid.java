import java.util.*;
abstract class solid
{
  abstract void calculate_area();
  abstract void calculate_volume();
}

class cylinder extends solid
{
  int r,h;
  cylinder(int a,int b)
  {
    r=a;
    h=b;
  }
  void calculate_area()
  { double surface_area;
    surface_area=(2*3.14*r*h) + (3.14*r*r);
    System.out.println("The Surface Area of the cylinder is: "+surface_area);
  }
   void calculate_volume()
  { double volume;
    volume=(2*3.14*r*h);
    System.out.println("The volume of the cylinder is: "+volume);
  }
}

class cone extends solid
{
  int r,h;
  cone(int a,int b)
  {
    r=a;
    h=b;
  }
  void calculate_area()
  { double surface_area;
    surface_area=(3.14*r)*(r+Math.sqrt((r*r)+(h*h)));
    System.out.println("The Surface Area of the cone is: "+surface_area);
  }
   void calculate_volume()
  { double volume;
    volume=(3.14*r*r*h)/3;
    System.out.println("The volume of the cone is: "+volume);
  }

}

class sphere extends solid
{
  int r;
  sphere(int a)
  {
    r=a;
  }
  void calculate_area()
  { double surface_area;
    surface_area=(4*3.14*r*r);
    System.out.println("The Surface Area of the sphere is: "+surface_area);
  }
   void calculate_volume()
  { double volume;
    volume=(4/3)*(3.14*r*r*r);
    System.out.println("The volume of the sphere is: "+volume);
  }

}

class united
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
        solid ob;
        int choice, x, y;
        System.out.println("1. Cylinder\n2. Cone\n3. Sphere\n4. Exit");
        do{
            System.out.println("Choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1: System.out.print("Enter the Radius and Height of the cylinder : ");
                        x = sc.nextInt();
                        y = sc.nextInt();
                        ob = new cylinder(x, y);
                        ob.calculate_area();
                        ob.calculate_volume();
                        break;
                case 2: System.out.print("Enter the Radius and Height of the Cone : ");
                        x = sc.nextInt();
                        y = sc.nextInt();
                        ob = new cone(x, y);
                        ob.calculate_area();
                        ob.calculate_volume();
                        break;
                case 3: System.out.print("Enter the Radius of the Sphere : ");
                        x = sc.nextInt();
                        ob = new sphere(x);
                        ob.calculate_area();
                        ob.calculate_volume();
                        break;
                case 4: return;
            }
        }while(choice != 4);
  }

}
