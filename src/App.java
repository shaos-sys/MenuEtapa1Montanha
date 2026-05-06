 
 import java.util.ArrayList;
 import java.util.Scanner;

 public class App {
     public static void main(String[] args) throws Exception {

     Scanner scan = new Scanner(System.in);
     ArrayList<String> listaJogos = new ArrayList<>();

     System.out.println("====== MENU ======");
     System.out.println("Escolha uma opção: ");
     System.out.println("1 - Adicionar jogo na lista.");
     System.out.println("2 - Ver lista.");
     System.out.println("3 - Sair");
     System.out.print("Opção: ");

     int opcao = 0;
     opcao = scan.nextInt();
     scan.nextLine();

     String jogos = " ";

          while (opcao != 3) {
            
             switch (opcao) {

             case 1:     

                do {
                System.out.println("Digite um jogo (ou 'N' para sair).");
                jogos = scan.nextLine();
                   
                   if (!jogos.equalsIgnoreCase("N")) {
                   listaJogos.add(jogos);
                   }
  
                } while (!jogos.equalsIgnoreCase("N"));

                   System.out.println("Escolha uma opção: ");
                   opcao = scan.nextInt();
                   scan.nextLine();
                
             case 2:              

             if (listaJogos.isEmpty()) {
               System.out.println("Nenhum jogo adicionado!");
               System.out.println("Escolha uma opção: ");
               opcao = scan.nextInt();
               
             } else {

                System.out.println("Jogos da lista: ");
                System.out.println(listaJogos);

                   System.out.println("Escolha uma opção: ");
                   opcao = scan.nextInt();
                   }

                   break;
                 
             default:    
             if (opcao >= 4) {

                System.out.println("====== OPÇÃO INVÁLIDA ======");
                System.out.print("Digite outra opção: ");
                opcao = scan.nextInt();               
             }   
             
   } 
  }       scan.close();
          System.out.println("Encerrando...");
 }        
} 

