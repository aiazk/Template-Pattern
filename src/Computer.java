abstract class Computer {
  abstract void plugCPU();
  abstract void plugMemory();
  abstract void plugStorage(); 
  abstract void plugMouseKey();
 
   public final void comp(){

      
      plugCPU();

      plugMemory();

      plugStorage();
      
      plugMouseKey();
      
   }
}