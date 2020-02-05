import java.util.Scanner; 

public class Proj1 {
					
   public static void main(String[] args)  {
      
      Scanner kb = new Scanner(System.in);
      
      System.out.println("Please enter a noun: ");
      String word = kb.next(); 
      
      System.out.println("Please enter a graphic size: ");
      int graphicSize = kb.nextInt();
      StdDraw.setCanvasSize(graphicSize, graphicSize);
      StdDraw.filledSquare(0, 0, graphicSize / 2);
   
      StdDraw.setPenColor(StdDraw.GRAY);  
      StdDraw.setPenRadius(.0045);
      StdDraw.line(0, .5, 0.51, 0.6550);
   
      StdDraw.setPenRadius();
   
      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.filledTriangle(1, 0.58, 0.49, 0.65, 1, 0.57);
      
      StdDraw.setPenColor(StdDraw.ORANGE);
      StdDraw.filledTriangle(1, 0.57, 0.49, 0.65, 1, 0.56);
   
      StdDraw.setPenColor(StdDraw.YELLOW);
      StdDraw.filledTriangle(1, 0.56, 0.49, 0.65, 1, 0.55);
   
      StdDraw.setPenColor(StdDraw.GREEN);
      StdDraw.filledTriangle(1, 0.55, 0.49, 0.65, 1, 0.54);
   
      StdDraw.setPenColor(StdDraw.CYAN);
      StdDraw.filledTriangle(1, 0.54, 0.49, 0.65, 1, 0.53);
   
      StdDraw.setPenColor(StdDraw.PURPLE);
      StdDraw.filledTriangle(1, 0.53, 0.49, 0.65, 1, 0.52);
   
      StdDraw.setPenColor();
      StdDraw.filledTriangle(.35, .46, .5, .69, .67, .44);
      
      StdDraw.setPenRadius(0.01);
      StdDraw.setPenColor(StdDraw.GRAY);
      StdDraw.triangle(.35, .45, .5, .7, .65, .45);
   
      StdDraw.setPenRadius();
      
      String darkSide = ("Dark side of the " + word.toUpperCase());  
      StdDraw.text(0.5, .1, darkSide);
      

   }
}