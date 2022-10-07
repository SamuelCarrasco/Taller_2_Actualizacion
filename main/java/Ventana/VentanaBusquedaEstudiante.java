package Ventana;
import Model.Estudiante;
import Model.Carrera;

import javax.swing.*;

public class VentanaBusquedaEstudiante extends Ventana {
    private JLabel textoEncabezado, textoNombre, textoCarrera;
    private JComboBox listaCarrera;
    private JTextField campoNombre;
    private JButton botonBuscar, botonRegresar;
    private Carrera carrera;
    private JButton textoBoton;

    protected   VentanaBusquedaEstudiante(String nombre, int largoX, int largoY) {
        super("Busqueda Estudiante", 500, 520);
        this.carrera = carrera;
        generarElementosVentana();
    }




    private void generarElementosVentana() {
        generarCampoNombre();
        generarBotonBuscarEstudiante();
        generarBotonRegresar();
        generarListaCarreraEstudiante();
    }

    private void generarCampoNombre() {
        String textoNombre = "Nombre estudiante:";
        super.generarJLabel(this.textoNombre, textoNombre, 20, 50, 150, 20);
        this.campoNombre = super.generarJTextField(200, 50, 250, 20);
        this.add(this.campoNombre);
    }

    private void generarListaCarreraEstudiante() {
        super.generarJLabel(this.textoCarrera, "Carrera:", 20, 100, 100, 20);
        this.listaCarrera = super.generarListaDesplegable(carrera.values(), 120, 100, 100, 20);
        this.add(this.listaCarrera);
    }

    private void generarBotonBuscarEstudiante() {
        String textoBoton = "Buscar Estudiante";
        this.textoBoton = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.botonBuscar);
        this.botonBuscar.addActionListener(this);
    }

    private void generarBotonRegresar() {
        String textoBotonRegresar = "Regresar";
        this.botonRegresar = super.generarBoton(textoBotonRegresar, 275, 400, 150, 20);
        this.add(this.botonRegresar);
        this.botonRegresar.addActionListener(this);
    }

}
