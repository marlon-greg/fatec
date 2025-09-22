public class Windows {
    public static void main(String[] args) {
        // Esse cara vai iniciar as duas Threads simultaneas
        Word01 w1 = new Word01();
        Word02 w2 = new Word02();
        w1.start();
        w2.start();
        

    }
}
