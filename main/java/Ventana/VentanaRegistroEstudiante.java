package Ventana;
import Model.Estudiante;
import Model.Carrera;

import javax.swing.*;

public class VentanaRegistroEstudiante extends Ventana {

    private JLabel textoEncabezado, textoNombreEstudiante, textoRut, textoMatricula, textoCarrera;
    private JTextField campoNombreEstudiante, campoRut, campoMatricula, campoCarrera;
    private JButton botonRegistrar, botonCancelar;
    private JComboBox listaCarrera;
    private Estudiante estudiante;

    private void generarEncabezado() {
        String textoCabecera = "Registro Estudiante";
        super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 190, 10, 200, 50);
    }

    protected VentanaRegistroEstudiante(Estudiante estudiante) {
        super("Registro Estudiante", 500, 520);
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarEncabezado();
        generarListaCarrera();
        generarCampoNombre();
        generarCampoRut();
        generarCampoMatricula();
        generarBotonRegistrar();
        generarBotonCancelar();
    }

    private void generarListaCarrera() {
        super.generarJLabel(this.textoCarrera, "Carrera:", 20, 100, 100, 20);
        String[] arreglo = new String[]{};
        this.listaCarrera = generarListaDesplegable(arreglo, 120, 100, 100, 20);
        this.add(this.listaCarrera);
    }

    private void generarBotonRegistrar() {
        String textoBoton = "Registrar Vehículo";
        this.botonRegistrar = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.botonRegistrar);
        this.botonRegistrar.addActionListener(this);
    }

    private void generarBotonCancelar() {
        String textoBotonCancelar = "Cancelar";
        this.botonCancelar = super.generarBoton(textoBotonCancelar, 275, 400, 150, 20);
        this.add(this.botonCancelar);
        this.botonCancelar.addActionListener(this);
    }

    private void generarCampoNombre() {
        String textoNombre = "Nombre:";
        super.generarJLabel(this.textoNombreEstudiante, textoNombre, 20, 50, 150, 20);
        this.campoNombreEstudiante = super.generarJTextField(200, 50, 250, 20);
        this.add(this.campoNombreEstudiante);
    }

    private void generarCampoRut() {
        String textoRut = "Rut:";
        super.generarJLabel(this.textoNombreEstudiante, textoRut, 200, 150, 250, 20);
        this.campoRut = super.generarJTextField(200, 30, 250, 20);
        this.add(this.campoRut);
    }

    private void generarCampoMatricula() {
        String textoMatricula = "Matricula:";
        super.generarJLabel(this.textoMatricula, textoMatricula, 20, 200, 200, 20);
        this.campoMatricula = super.generarJTextField(200, 200, 250, 20);
        this.add(this.campoMatricula);
    }
}