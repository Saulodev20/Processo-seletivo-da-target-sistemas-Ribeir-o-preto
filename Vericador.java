import java.util.Scanner;
   public class Vericador {

    // Comentario pra atualização no Git Hub

        public static int countAInString(String s) {
            int count = 0;
            for (char c : s.toLowerCase().toCharArray()) {
                if (c == 'a') {
                    count++;
                }
            }
            return count;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe uma string: ");
            String input = scanner.nextLine();
            
            int count = countAInString(input);
            System.out.println("A letra 'a' aparece " + count + " vezes na string.");
    
            scanner.close();
        }
    }
    
