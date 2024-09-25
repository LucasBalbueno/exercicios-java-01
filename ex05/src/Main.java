import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static CardService cardService = new CardService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Cards Game");
            System.out.println("1. Add Card");
            System.out.println("2. Remove Card");
            System.out.println("3. Move card to the end");
            System.out.println("4. Get all cards");
            System.out.println("5. Leave");

            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.println("Enter the card name for add");
                    String addCard = sc.nextLine();
                    cardService.addCard(addCard);
                    break;
                case 2:
                    System.out.println("Enter the card name for remove:");
                    String removeCard = sc.nextLine();
                    boolean removed = cardService.removeCard(removeCard);
                    if (removed) {
                        System.out.println("Card successfully removed!");
                    } else {
                        System.out.println("Card not found!");
                    }
                    break;
                case 3:
                    System.out.println("Enter card name for move card to the end:");
                    String moveCard = sc.nextLine();
                    boolean moved = cardService.organizeCards(moveCard);
                    if (moved) {
                        System.out.println("Card successfully moved!");
                    } else {
                        System.out.println("Card not found!.");
                    }
                    break;
                case 4:
                    System.out.println("Cards in hand:");
                    cardService.getCards();
                    break;
                case 5:
                    System.out.println("Leaving...");
                    return;
                default:
                    System.out.println("Invalid option. Try Again!");
                    break;
            }
        }
    }
}