import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //Inicializa a tabela hash com 26 categorias
        int totalCategorias = 26;
        @SuppressWarnings("unchecked")
        ArrayList<String>[] tabelaHash = new ArrayList[totalCategorias];
        
        //aqui vamos Inicializar cada categoria
        for (int i = 0; i < totalCategorias; i++) {
            tabelaHash[i] = new ArrayList<>();
        }
        
        //Aqui vamos Adicionar algumas palavras de exemplo
        tabelaHash[0].add("apple");
        tabelaHash[0].add("ant");
        tabelaHash[1].add("banana");
        tabelaHash[3].add("dromedário");
        tabelaHash[15].add("pneumoultramicroscopicosilicovulcanoconiótico");
        tabelaHash[25].add("zebra");
        
        
        //Isso é para Testar a busca
        String palavraBusca = "apple";
        if (buscarPalavra(palavraBusca, tabelaHash, totalCategorias)) {
            System.out.println("Confirmação: Palavra '" + palavraBusca + "' encontrada.");
        } else {
            System.out.println("Confirmação: Palavra '" + palavraBusca + "' não encontrada.");
        }
        
        palavraBusca = "cat";
        if (buscarPalavra(palavraBusca, tabelaHash, totalCategorias)) {
            System.out.println("Confirmação: Palavra '" + palavraBusca + "' encontrada.");
        } else {
            System.out.println("Confirmação: Palavra '" + palavraBusca + "' não encontrada.");
        }
        palavraBusca = "dromedário";
        if (buscarPalavra(palavraBusca, tabelaHash, totalCategorias)) {
             System.out.println("Confirmação: Palavra '" + palavraBusca + "' encontrada.");
        } else {
             System.out.println("Confirmação: Palavra '" + palavraBusca + "' não encontrada.");
        }
        palavraBusca = "pneumoultramicroscopicosilicovulcanoconiótico";
        if (buscarPalavra(palavraBusca, tabelaHash, totalCategorias)) {
             System.out.println("Confirmação: Palavra '" + palavraBusca + "' encontrada.");
        } else {
             System.out.println("Confirmação: Palavra '" + palavraBusca + "' não encontrada.");
        }
    }
    
    public static boolean buscarPalavra(String palavra, ArrayList<String>[] tabelaHash, int tam) {
        //Calcular a categoria usando a função hash
        int categoria = funcaoHash(palavra, tam);
        
        //Verifica se a categoria contém a palavra desejada
        if (tabelaHash[categoria] != null && tabelaHash[categoria].contains(palavra)) {
            System.out.println("Palavra '" + palavra + "' encontrada na categoria " + categoria + ".");
            return true;
        } else {
            System.out.println("Palavra '" + palavra + "' não encontrada na categoria " + categoria + ".");
            return false;
        }
    }
    
    public static int funcaoHash(String palavra, int tam) {
        if (palavra == null || palavra.isEmpty()) {
            return 0;
        }
        char primeiraLetra = Character.toLowerCase(palavra.charAt(0));
        return (primeiraLetra - 'a') % tam;
    }
}