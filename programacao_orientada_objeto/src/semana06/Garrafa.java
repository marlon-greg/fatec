
public class Garrafa {

    public String material;
    private int volume;
    private char status;

    /**
     * Método alterna o estado do atributo status para abrir
     */
    public void abrir() {
        status = 'A';
    }

    /**
     * Método alterna o estado do atributo statuso para fechar
     */
    public void fechar() {
        status = 'F';
    }

    /*
     * Método enche a garrafa - Muda o estado do atributo volume
     */
    public void encher() {
        volume = 1000;
    }

    /**
     * Método esvazia a garrafa - Muda estado do atribulo volume
     */
    public void esvaziar() {
        volume = 0;
    }

    /**
     * Método vai retirando líquido da garrafa - Muda estado do atribulo volume
     *
     * @param ml
     */
    public String consumir(int ml) {
        String retorno = "Consumo realizado com sucesso";
        if (volume > ml) {
            volume -= ml;
        } else {
            retorno = "Volume insuficiente a garrafa só possui " + volume + "ml";
        }
        return retorno;
    }

    public void mostrar() {
        System.out.println("Material: " + material);
        System.out.println("Volume: " + volume);
        System.out.println("Status: " + (status == 'A' || status == 'a' ? "Aberta" : status == 'F' || status == 'f' ? "Fechada" : "Invalida"));
    }

}
