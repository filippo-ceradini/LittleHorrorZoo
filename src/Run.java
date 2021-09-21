
public class Run {
    public static void main(String[] args) {
        Animal snake = new Animal(9, 9, "Snake says: \"Yo dead bunny!\"", "Snake");
        Animal bunny = new Animal(1, 1, "Rabbit says: \"Oh not again!\"", "Rabbit");
        System.out.println(snake);
        System.out.println(bunny);

        while(bunny.getXpos() != snake.getXpos() && bunny.getYpos() != snake.getYpos()) {
            bunny.moveFwrd();
            if (bunny.getXpos() == snake.getXpos() - 1 && bunny.getYpos() == snake.getYpos() - 1) {
                System.out.println(bunny.getAnimalYell());
                snake.moveBack();
                break;
            }

            if (bunny.getXpos() == snake.getXpos() && bunny.getYpos() == snake.getYpos()) {
                break;
            }

            snake.moveBack();
            if (bunny.getXpos() == snake.getXpos() - 1 && bunny.getYpos() == snake.getYpos() - 1) {
                System.out.println(bunny.getAnimalYell());
            }
        }

        System.out.println(snake.getAnimalYell());
    }
}
