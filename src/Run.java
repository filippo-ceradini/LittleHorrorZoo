
public class Run {
    public static void main(String[] args) {

        //Adding the two animals with their attributes
        animal snake = new animal(9, 9, "Snake says: \"Yo dead bunny!\"", "Snake");
        animal bunny = new animal(0, 0, "Rabbit says: \"Oh not again!\"", "Rabbit");

        //Printout animal position at the start
        System.out.println(snake.toAnimalPos());
        System.out.println(bunny.toAnimalPos());

        //While cycle that makes the animals move until they are in the same cell
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