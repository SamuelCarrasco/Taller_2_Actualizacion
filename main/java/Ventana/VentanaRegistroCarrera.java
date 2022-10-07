package Ventana;
import Model.Estudiante;
import Model.Carrera;

import javax.swing.*;

public class VentanaRegistroCarrera extends Ventana {

    private JLabel textoEncabezado, textoNombreCarrera, textoCodigo, textoCantidadSemestre;
    private JTextField campoNombreCarrera, campoCodigo, campoCantidadSemestre;
    private JButton botonRegistrar, botonCancelar;
    private Carrera carrera;
    private void generarEncabezado(){
        String textoCabecera = "Registro Carrera";
        super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 190, 10, 200, 50);
    }

    protected VentanaRegistroCarrera(Carrera carrera) {
        super("Registro Estudiante", 500, 520);
        generarElementosVentana();
    }

    private void generarElementosVentana(){
        generarEncabezado();

        generarCampoNombreCarrera();
        generarCampoCodigo();
        generarCampoCantidadSemestre();
        generarBotonRegistrar();
        generarBotonCancelar();
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

    private void generarCampoNombreCarrera(){
        String textoNombre= "Nombre:";
        super.generarJLabel(this.textoNombreCarrera,textoNombre,20,50,150,20);
        this.campoNombreCarrera= super.generarJTextField(200,50,250,20);
        this.add(this.campoNombreCarrera);
    }
    private void generarCampoCodigo(){
        String textoRut= "Rut:";
        super.generarJLabel(this.textoCodigo, String.valueOf(textoCodigo),200, 150, 250, 20);
        this.campoCodigo= super.generarJTextField(200,30,250,20);
        this.add(this.campoCodigo);
    }
    private void generarCampoCantidadSemestre(){
        String textoCantidadSemestre = "Cantidad de semestres:";
        super.generarJLabel(this.textoCantidadSemestre, textoCantidadSemestre,20, 200, 200, 20);
        this.campoCantidadSemestre = super.generarJTextField(200, 200, 250, 20);
        this.add(this.campoCantidadSemestre);
    }





}

