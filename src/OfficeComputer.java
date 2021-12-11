public class OfficeComputer extends Computer {
  @Override
  void plugCPU() {
    System.out.println("Low-end dual-core cpu");
  }
  @Override
  void plugMemory() {
    System.out.println("Energy-efficient memory");
  }
  @Override
  void plugStorage() {
    System.out.println("Energy-efficient HDD");
  }
   @Override
  void plugMouseKey(){
    System.out.println("Connect mouse keyboard monitor");
  }
}