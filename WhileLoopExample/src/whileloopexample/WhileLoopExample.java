
package whileloopexample;

/**
 *
 * @author Zach Murphy
 */
public class WhileLoopExample {

    public static void main(String[] args) {
        int number=1;
        int numberTwo = 11;
        
        while(number<=10 && numberTwo !=1){
            System.out.println("While loop increment: " + number + " .");
            number++;
            numberTwo--;
            System.out.println("While count decrement: " + numberTwo + ".");
        }
    }
    
}
