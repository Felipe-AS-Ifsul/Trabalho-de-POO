public class Natural extends Produto {//1, 4

    public Natural(String marca, String tipo) {//1, 3
        super(marca, tipo);
    }

    @Override
    public void abrir(){ //3, 4, 5
        this.setLacre(false);
        String produto = this.getTipo();
        System.out.println(produto +" descascado!");
    }

    @Override
    public void comer(int quantia) { //3, 4, 5
        if(getLacre()){
            setQuantia(getQuantia() - quantia);
            System.out.println("Comeu com casca o/a " + getTipo());
        }else if (getQuantia() == 0){
            String produto = getTipo(); 
            System.out.println("Acabou o "+ produto + " :-(");
        }else{
            setQuantia(getQuantia() - quantia);
            System.out.println("Comeu sem casca o/a " + getTipo());
        }
    }
    @Override
    public void status(){//3, 4, 5
        System.out.println("O produto é um " + getTipo());
        System.out.println(" Qual a marca? " + getMarca());
        System.out.println(" Qual a quantidade? " + getQuantia());
        System.out.println(" Está com casca? " + getLacre());
    }
    
}
