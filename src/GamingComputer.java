public class GamingComputer extends Computer {
  @Override
  void plugCPU() {
    System.out.println("High-end multi-core cpu");
  }
  @Override
  void plugMemory() {
    System.out.println("High-clock speed memory");
  }
  @Override
  void plugStorage() {
    System.out.println("SSD storage");
    }
  @Override
  void plugMouseKey(){
      System.out.println("Connect mouse keyboard monitor");
  }
}