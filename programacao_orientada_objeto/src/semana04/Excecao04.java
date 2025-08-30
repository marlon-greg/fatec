package semana04;

public class Excecao04 {
    public static void main(String[] args) {
        
        for (int a=1;a<=10;a++){
            System.out.println(a);
        
        try{
            Thread.sleep(1000);
        }
        
        catch (InterruptedException e){
            System.out.println("Erro de interrupção");
        }
    }
}
}
