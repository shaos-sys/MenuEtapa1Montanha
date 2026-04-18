 
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

     String jogos = " ";

          while (opcao != 3) {
            
             switch (opcao) {

             case 1:     

                System.out.print("Adicionar jogo: ");
                scan.nextLine();
                jogos = scan.nextLine(); 
                listaJogos.add(jogos);
              
                   System.out.print("Escolha uma opção: ");
                   opcao = scan.nextInt();
                   break; 

             case 2:

                System.out.println("Jogos da lista: ");
                System.out.println(listaJogos);

                   System.out.println("Escolha uma opção: ");
                   opcao = scan.nextInt();
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

