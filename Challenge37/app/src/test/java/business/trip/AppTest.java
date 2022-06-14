/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package business.trip;

import business.trip.graoh.Graph;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
    //[Metroville, Pandora, ]	$82
    //[Arendelle, New Monstropolis, Naboo]	$115
    //[Naboo, Pandora]	null
    //[Narnia, Arendelle, Naboo]	null

        Graph graph = new Graph();

        graph.addVerNode("Pandora");
        graph.addVerNode("Arendelle");
        graph.addVerNode("Metroville");
        graph.addVerNode("Monstroplolis");
        graph.addVerNode("Narnia");
        graph.addVerNode("Naboo");

        graph.addEdge("Pandora", "Arendelle", 150);
        graph.addEdge("Metroville", "Pandora", 82);
        graph.addEdge("Arendelle", "Metroville", 99);
        graph.addEdge("Arendelle", "Monstroplolis", 42);
        graph.addEdge("Metroville", "Monstroplolis", 105);
        graph.addEdge("Monstroplolis", "Naboo", 73);
        graph.addEdge("Metroville", "Naboo", 26);
        graph.addEdge("Metroville", "Narnia", 37);
        graph.addEdge("Narnia", "Naboo", 250);

        String[] array1 = {"Metroville","Pandora"};
        String[] array2 = {"Arendelle","Monstroplolis","Naboo"};
        String[] array3 = {"Naboo","Pandora"};
        String[] array4 = {"Narnia","Arendelle","Naboo"};


        int result1 =graph.businessTrip(graph, array1);
        int result2 =graph.businessTrip(graph, array2);
        int result3 =graph.businessTrip(graph, array3);
        int result4 =graph.businessTrip(graph, array4);

        String theFinal1 = Arrays.toString(array1) + "  "+(result1 > 0 ? "$" + result1 : "null" )+"\n";
        String theFinal2 = Arrays.toString(array2) + "  "+(result2 > 0 ? "$" + result2 : "null" )+"\n";
        String theFinal3 = Arrays.toString(array3) + "  "+(result3 > 0 ? "$" + result3 : "null")+"\n";
        String theFinal4 = Arrays.toString(array4) + "  "+(result4 > 0 ? "$" + result4 : "null" )+"\n";

        System.out.println(theFinal1 + '\n'+ theFinal2+ '\n' + theFinal3 +'\n'+ theFinal4 );

    }
}