package quartaQuestao;

public static void main(String[] args) {
    IntegerSet conjunto1 = new IntegerSet();
    IntegerSet conjunto2 = new IntegerSet();

    conjunto1.inserirElemento(10);
    conjunto1.inserirElemento(20);
    conjunto1.inserirElemento(30);

    conjunto2.inserirElemento(20);
    conjunto2.inserirElemento(30);
    conjunto2.inserirElemento(40);

    System.out.println("Conjunto 1: " + conjunto1);  
    System.out.println("Conjunto 2: " + conjunto2);  

    IntegerSet conjuntoUniao = conjunto1.uniao(conjunto2);
    System.out.println("Uni�o dos conjuntos: " + conjuntoUniao);  

    IntegerSet conjuntoIntersecao = conjunto1.intersecao(conjunto2);
    System.out.println("Interse��o dos conjuntos: " + conjuntoIntersecao);  

    conjunto1.excluirElemento(20);
    System.out.println("Conjunto 1 ap�s exclus�o: " + conjunto1);  

    boolean igual = conjunto1.igualA(conjunto2);
    System.out.println("Conjunto 1 � igual ao Conjunto 2: " + igual);  
    