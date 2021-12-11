public class TemplatePattern {
   public static void main(String[] args) {

      Computer computer = new GamingComputer();
      computer.comp();
      System.out.println();
      computer = new OfficeComputer();
      computer.comp();		
   }
}