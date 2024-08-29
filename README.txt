Fiz um CRUD sobre comida,
deixarei comentado dentro do código as enumerações
que estarão destacadas e explicadas aqui


1: CLASSES E OBJETOS: sem contar a MAIN, foram criados 3 outras classes.
dentro dos arquivos INDUSTRIA.java, NATURAL.java e PRODUTO.java, se monta objetos por meio de construtores, como por exemplo o construtor do objeto Produto, que apesar de não ser diretamente utilizado por estar dentro de uma classe abstrata, por meio da herança, ele é usado como base para os demais objetos “Industria” e “Natural”.

2: ENCAPSULAMENTO: todas as variáveis são postas como privada,
mantendo sempre o acesso indireto do programa por meio de SET e GET.

3: HERANÇA: as classes “natural” e “industria” estendem os atributos da 
superclasse “produto”.  O mais evidente está nos construtores, “Industria” e 
“Natural” usam o construtor herdado de “Produto” para serem montados.

4:POLIMORFISMO: há o polimorfismo em cada método criado, a seguir descrevo cada um. 
O método abrir() na subclasse Natural vai para a função de printar o nome da 
Produto concatenando com a mensagem “descascado!”, enquanto para a classe Industria 
é gerada a mensagem (nome do produto) + “deslacrado!”. Já o método comprar(int n), 
quando na subclasse Industria ele apresenta o comportamento de uma expressão que 
soma a multiplicação por 6 da quantia digitada pelo usuário com a quantia do produto 
já obtida do produto, enquanto para a superclasse Produto é diretamente somada a 
quantia digitada pelo usuário com a já obtida pelo produto. Por fim o método 
comer(int quantia), quando na classe Natural apresenta o seguinte comportamento: 
há 3 condicionais, podendo o usuário receber mensagens que sinalizam que ele 
comeu o produto com casca, sem casca ou o produto acabou. Quanto a classe 
Industria há a possibilidade do usuário receber mensagens indicando que o 
produto ainda está lacrado, que o usuário comeu tal produto, ou então que o 
produto já acabou.

5: SOBRECARGA E SOBRESCRITA: para realizar o Polimorfismo, foi utilizado o 
@override (sobrescrita) para alterar a funcionalidade dos métodos. 
Exemplo: comer(int quantia) das classes “Natural” e “Industria”; 
comprar(int n) das classes “Industria” e “Produto”.

6: CLASSES ABSTRATAS e INTERFACE: a classe “Produto” é um exemplo de 
implementação de classe abstrata e há a interface “Consumo” que apresenta 
os métodos comprar(int n), comer(int quantia) e abrir()

7: COLEÇÕES: foi utilizado a coleção de ArrayLists (produtoIND, produtoNAT) 
para a manipulação dos objetos dentro da classe MAIN, foi empregado um FOREACH 
para utilizar de forma repetida o método comprar(int quantia) e preencher a variável 
“quantia” dentro dos objetos Industria e Natural.

8: MANIPULAÇÃO DE ARQUIVO: dentro da classe MAIN, foi implementado uma linha de código 
FileWriter que armazena todas as variáveis “tipos” dos objetos Industria dentro de um 
arquivo de texto chamado “arquivo.txt” com o auxílio da variável “leitor”. 
Em sequência, o arquivo de texto é lido com o uso do FileReader e do 
auxílio das variáveis “data” e “leitor”, ambas percorrendo cada linha do .txt 
por um while(-1) (o -1 indica que o texto acabou).