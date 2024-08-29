//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        Industria ind1 = new Industria("Shamito", "Yogurte");
        Industria ind2 = new Industria("Balduco", "Biscoito");
        Industria ind3 = new Industria("Kellogs", "Cereal");
        Industria ind4 = new Industria("Melita", "Café");
        Industria ind5 = new Industria("Kibom", "Sorvete");
        Industria ind6 = new Industria("Nestlé", "Aveia");
        Natural nat1    =   new Natural("Korin","Maçã");
        Natural nat2    =   new Natural("Vapza","Pêra");
        Natural nat3    =   new Natural("Coopernatural","Laranja");
        
    ArrayList<Industria> produtoIND = new ArrayList<Industria>(); // 7
    produtoIND.add(ind1);
    produtoIND.add(ind2);
    produtoIND.add(ind3);
    produtoIND.add(ind4);
    produtoIND.add(ind5);
    produtoIND.add(ind6);

    FileWriter escritor = new FileWriter("arquivo.txt"); //8
    for (Industria marca : produtoIND) {
        marca.comprar(2);
        try{
            escritor.append(marca.getTipo()+"\n");
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    escritor.close();
try {
    FileReader leitor = new FileReader("arquivo.txt"); //8
    int data = leitor.read();
    while(data != -1){
        System.out.println((char)data);
        data = leitor.read();
    }
    leitor.close();
} catch (FileNotFoundException e) {
    e.printStackTrace();
}
  catch (IOException e){
    e.printStackTrace();
  } 

    ArrayList<Natural> produtoNAT = new ArrayList<Natural>(); // 7
    produtoNAT.add(nat1);
    produtoNAT.add(nat2);
    produtoNAT.add(nat3);

    for (Natural marca : produtoNAT) {
        marca.comprar(3);
    }
    nat1.status();
    ind2.status();

    produtoNAT.get(1).comer(1);
    produtoIND.get(3).comer(1);

    produtoIND.get(3).abrir();
    produtoIND.get(3).comer(2);
    }
    
}