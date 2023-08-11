
package ejrobot;


public class Robot {
    private Bateria bateria1;
    private int energia;
    private boolean dormido;

    public Robot(int nums) {
        this.energia = 1000;
        this.dormido= false;
        
        
    }
    public int robotAvanzar (int pasos){
        if (!dormido) {
            int perdidaEnergia = (pasos /100)*10;
             energia -= perdidaEnergia;
             System.out.println(" avanzo "+pasos+ " pasos ");
        }
        return energia;
            
        }
    public int robotRetroceder(int pasos){
        if (!dormido) {
            int perdidaEnergia = (pasos /100)*10;
             energia -= perdidaEnergia;
             System.out.println(" retrocedio "+pasos+ " pasos ");
        }
        return energia;
    }
    public void Dormir(){
    dormido = true;
        System.out.println("el robot se encuentra emfermo");        
    
    
    }
     public void Despiertar(){
     dormido = false;
         System.out.println("su robot se encuentra  despierto");
     }
     public void Recargar(){
         if (Bateria =) {
            
         }
     
     }
}
