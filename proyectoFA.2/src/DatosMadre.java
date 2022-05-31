public class DatosMadre extends HistorialClinicoP{
    //Datos Madre
    String NombreMadre;
    String ApellidoMadre;
    int EdadMadre;
    String LugarDeNacimientoMadre;

    //Consanguinidad Parental
    String ConsanguinidadParental;

    public String getNombreMadre() {
        return NombreMadre;
    }

    public String getApellidoMadre() {
        return ApellidoMadre;
    }

    public int getEdadMadre() {
        return EdadMadre;
    }

    public String getLugarDeNacimientoMadre() {
        return LugarDeNacimientoMadre;
    }

    public String getConsanguinidadParental() {
        return ConsanguinidadParental;
    }

    public void setNombreMadre(String nombreMadre) {
        NombreMadre = nombreMadre;
    }

    public void setApellidoMadre(String apellidoMadre) {
        ApellidoMadre = apellidoMadre;
    }

    public void setEdadMadre(int edadMadre) {
        EdadMadre = edadMadre;
    }

    public void setLugarDeNacimientoMadre(String lugarDeNacimientoMadre) {
        LugarDeNacimientoMadre = lugarDeNacimientoMadre;
    }

    public void setConsanguinidadParental(String consanguinidadParental) {
        ConsanguinidadParental = consanguinidadParental;
    }

    public DatosMadre(String nombreMadre, String apellidoMadre, int edadMadre,
                      String lugarDeNacimientoMadre, String consanguinidadParental) {
        NombreMadre = nombreMadre;
        ApellidoMadre = apellidoMadre;
        EdadMadre = edadMadre;
        LugarDeNacimientoMadre = lugarDeNacimientoMadre;
        ConsanguinidadParental = consanguinidadParental;
    }

    @Override
    public void MostrarInformacion() {
        System.out.println("\n");
        System.out.println("DATOS DE LA MADRE DEL PACIENTE");
        System.out.println("Nombre madre: " +NombreMadre);
        System.out.println("Apellido madre: " +ApellidoMadre);
        System.out.println("Edad madre: " +EdadMadre);
        System.out.println("Lugar de nacimiento de la madre: " +LugarDeNacimientoMadre);
        System.out.println("Consanguinidad parental: " +ConsanguinidadParental);

    }


}
