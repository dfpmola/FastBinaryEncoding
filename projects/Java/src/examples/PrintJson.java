package examples;

import com.chronoxor.test.*;

public class PrintJson
{
    /**
     * The main method serves as the entry point for the application.
     * It creates instances of various structures and prints their JSON representations to the console.
     *
     * <p>
     * This method demonstrates the usage of the following structures:
     * <ul>
     *     <li>{@link StructSimple}</li>
     *     <li>{@link StructOptional}</li>
     *     <li>{@link StructNested}</li>
     * </ul>
     * </p>
     *
     * <p>
     * Each structure's {@code toJson()} method is called to obtain its JSON representation, which is then printed.
     * </p>
     *
     * @param args Command-line arguments passed to the program. This parameter is not used in this implementation.
     *
     * @throws NullPointerException if any of the structures return null from their {@code toJson()} method.
     * @throws JsonProcessingException if there is an error during the JSON processing (if applicable).
     */
    public static void main(String[] args)
    {
        System.out.println(new StructSimple().toJson());
        System.out.println();

        System.out.println(new StructOptional().toJson());
        System.out.println();

        System.out.println(new StructNested().toJson());
        System.out.println();
    }
}
