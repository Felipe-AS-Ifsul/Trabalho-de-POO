public class Industria extends Produto {// 1, 4
    
    public Industria(String marca, String tipo) { //1, 3
        super(marca, tipo);
    }

    @Override
    public void comer(int quantia){ //3, 4, 5
            if (this.getLacre()){
                System.out.println("Ainda está lacrado!");
            }else if (getQuantia() == 0){
                String produto = getTipo(); 
                System.out.println("Acabou o "+ produto + " :-(");
            }
            else {
                setQuantia(getQuantia() - quantia);
                System.out.println("Comeu o "+ getTipo());
                this.setLacre(true);
            }
        
    }

    @Override
    public void abrir(){ //3, 4, 5
        this.setLacre(false);
        String produto = this.getTipo();
        System.out.println(produto +" deslacrado!");
    }

    @Override
    public void comprar(int qnt){ //3, 4, 5
        setQuantia(getQuantia() + qnt*6);
    }

}
