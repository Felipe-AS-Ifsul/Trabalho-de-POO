public abstract class Produto implements Consumo { //1, 3, 6
    private String  marca; //2
    private boolean lacre; //2
    private String  tipo; //2
    private  int   quantia; //2

    public Produto(String marca, String tipo) {// 1
        this.marca = marca;
        this.lacre = true;
        this.tipo = tipo;
        this.quantia = 0;
    }

    void status(){
        System.out.println("O produto é um " + this.tipo);
        System.out.println(" Qual a marca? " + marca);
        System.out.println(" Qual a quantidade? " + quantia);
        System.out.println(" Está lacrado? " + this.lacre);
    }
    
    public void comprar(int qnt){ // 4
        this.quantia = this.quantia + qnt;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantia() {
        return quantia;
    }

    public void setQuantia(int quantia) {
        this.quantia = quantia;
    }

    public boolean getLacre(){
        return this.lacre;
    }
    public void setLacre(boolean lacre){
        this.lacre = lacre;
    }

}