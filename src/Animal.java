import java.lang.reflect.Array;
import java.util.Arrays;

public class Animal {

    //variables for animal position
    private int xpos;
    private int ypos;

    //public int[] getPos() {return pos;}
    //public void setPos(int[] pos) {this.pos = pos;}

    //private int[] pos = {xpos, ypos};
    private String animalYell;
    private String animalName;

    public Animal(int xpos, int ypos, String animalYell, String animalName) {
        this.setXpos(xpos);
        this.setYpos(ypos);
        this.setAnimalYell(animalYell);
        this.setAnimalName(animalName);
    }

    //setters for Animal
    public void setXpos(int xpos) {this.xpos = xpos;}
    public void setYpos(int ypos) {this.ypos = ypos;}
    public void setAnimalYell(String animalYell) {this.animalYell = animalYell;}
    public void setAnimalName(String animalName) {this.animalName = animalName;}
    //getters for Animal
    public String getAnimalName() {return animalName;}
    public int getXpos() {return xpos;}
    public int getYpos() {return ypos;}
    public String getAnimalYell() {return animalYell;}

    //Animal Methods
    public void moveFwrd() {
        xpos++;
        ypos++;
        System.out.println(animalName + " moves to: " + xpos + "," + ypos);
    }

    public void moveBack() {
        xpos--;
        ypos--;
        System.out.println(animalName + " moves to: " + xpos + "," + ypos);
    }

    //rewriting toString method to print the name and position of the animal
    public String toString() {
        return animalName + " is in: " + xpos + "," + ypos;
    }
    //public String toAnimPos() {return animalName +" is in:" + pos;}
}
