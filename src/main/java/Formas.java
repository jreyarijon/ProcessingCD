//Importamos la libreria
// importamos la libreria proncipal
import processing.core.PApplet;

/**
 * Esta será nuestra clase principal
 * Hererda de PApplet, que es la clase padre que tiene todos los métodos
 * y atributos para usar Processing
 * Desde este fichero si le damos al triangulito verde a la izquierda
 * podemos ejecutar esta clase sin ser 'main'
 */
public class Formas extends PApplet {
    // definimos atributos para todoa la clase
    // es la ventana de salida de la aplicacion
    // en Processing las aplicaciones se llaman sketchs
    int viewport_w = 500; // ancho en pixels
    int viewport_h = 400; // alto en pixels

    // truco para poder ejecutar nuestro código
    // en el entorno gráfico ya creado
    public static void main(String args[]) {
        PApplet.main("Formas");
    }

    // método que tiene las configuraciones iniciales
    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);
    }

    // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch
    @Override
    public void setup() {
    }

    // método principal. Aqui estará el grueso de nuestro código
    // sería equivalente a un 'main'
    // la DIFERENCIA principal es que se ejecuta en bucle
    // es decir, se repite el código infinitamente
    @Override
    public void draw() {
        // pintamos la ventana según rgb
        // hay muchas paginas que nos dan los colores en rgb
        // esta es una de ellas https://htmlcolorcodes.com/es/
        // prueba a cambiar estos colores

        //cielo
        background(0, 204, 255);
        //tronco arbol izquierda
        stroke(0);
        fill(153, 77, 0);
        rect(125,300,20,100);
        //tronco arbol derecha
        stroke(0);
        fill(153, 77, 0);
        rect(340,300,20,100);
        //Copa arbol izquierda
        stroke(0);
        fill(41, 163, 41);
        ellipse(135,220,100,275);
        //Copa arbol derecha
        stroke(0);
        fill(41, 163, 41);
        ellipse(350,220,100,275);
        //sol
        stroke(0);
        fill(255, 255, 0);
        ellipse(250,50,75,75);
        //Cesped
        stroke(0);
        fill(0, 179, 0);
        rect(0,390,500,10);

        //Cuerpo pajaro 1
        stroke(0);
        fill(255, 153, 51);
        ellipse(mouseX+20,mouseY+15,20,10);
        //Pico pajaro 1
        stroke(0);
        fill(255, 128, 0);
        rect(mouseX,mouseY+10,5,2);
        //Cabeza pajaro 1
        stroke(0);
        fill(255, 153, 51);
        ellipse(mouseX+9,mouseY+10,10,10);
        //Ojo pajaro 1
        stroke(0);
        fill(0);
        ellipse(mouseX+9,mouseY+10,2,2);
        //Ala pajaro 1
        stroke(0);
        fill(255, 153, 51);
        ellipse(mouseX+20,mouseY+5,8,20);

        //Cuerpo pajaro 2
        stroke(0);
        fill(255, 153, 51);
        ellipse(mouseY+20,mouseX+15,20,10);
        //Pico pajaro 2
        stroke(0);
        fill(255, 128, 0);
        rect(mouseY,mouseX+10,5,2);
        //Cabeza pajaro 2
        stroke(0);
        fill(255, 153, 51);
        ellipse(mouseY+9,mouseX+10,10,10);
        //Ojo pajaro 2
        stroke(0);
        fill(0);
        ellipse(mouseY+9,mouseX+10,2,2);
        //Ala pajaro 2
        stroke(0);
        fill(255, 153, 51);
        ellipse(mouseY+20,mouseX+5,8,20);



    }
}