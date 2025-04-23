
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
                new Persona("Juan", 25),
                new Persona("Maria", 30),
                new Persona("Carlos", 22),
                new Persona("Ana", 28),
                new Persona("Luis", 35),
                new Persona("Sofia", 27),
                new Persona("Miguel", 40),
                new Persona("Laura", 32),
                new Persona("Pedro", 29),
                new Persona("Elena", 26),

        };

        PersonaController controlador = new PersonaController();
        ViewConsole vista = new ViewConsole();

        vista.printMessage("Arreglo de personas");
        vista.printPersonsArray(personas);
        vista.printMessage("Arreglo de personas ordenado");
        controlador.ordenarPorEdad(personas);
        vista.printPersonsArray(personas);

        vista.printMessage("Buscar persona con edad 40");
        Persona personaBuscada = controlador.buscarPorEdad(personas, 40);
        if (personaBuscada == null) {
            vista.printMessage("No se encontro persona con edad 40");
        } else {
            vista.printMessage("Se encontro persona con edad 40");
            vista.printMessage(personaBuscada.toString());
        }

        vista.printMessage("Buscar persona con edad 99");
        Persona personaBuscada2 = controlador.buscarPorEdad(personas, 99);
        if (personaBuscada2 == null) {
            vista.printMessage("No se encontro persona con edad 99");
        } else {
            vista.printMessage("Se encontro persona con edad 99");
            vista.printMessage(personaBuscada2.toString());
        }

    }
}
