package semana03;

public class Math06 {
    public static void main(String[] args) {
        String s = "0123456789abcdefgABCDEFG!@#$%¨&*()_-+=";
        int t = s.length();

        String senha = "";

        for(int i=1;i<=10;i++){
            int indice = (int)(Math.random()*t);
            senha += s.charAt(indice);
        }
        System.out.println(senha);

    }
}
