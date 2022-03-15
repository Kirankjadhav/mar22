/*
13. Write a Java program to print the area and perimeter of a rectangle. 
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/
class assign13
{ 
  
    public static void main(String[] args) {
           double width = 5.5 ,height=8.5;
           
      double area =  height*width;
        double perimeter = 2* (height+width);

        System.out.println("Area is  " +width+ "*" +height+ "=" + area);
        System.out.println("Perimeter is  2 * (" +width+ "+" +height+ ") ="+perimeter);
    }        
}

