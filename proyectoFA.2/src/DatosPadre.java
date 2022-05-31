public class DatosPadre extends HistorialClinicoP {

    //Datos Padre
    String NombrePadre;
    String ApellidoPadre;
    int EdadPadre;
    String LugarDeNacimientoPadre;

    //Consanguinidad Parental
    String ConsanguinidadParental;

    public String getNombrePadre() {
        return NombrePadre;
    }

    public String getApellidoPadre() {
        return ApellidoPadre;
    }

    public int getEdadPadre() {
        return EdadPadre;
    }

    public String getLugarDeNacimientoPadre() {
        return LugarDeNacimientoPadre;
    }

    public String getConsanguinidadParental() {
        return ConsanguinidadParental;
    }

    public void setNombrePadre(String nombrePadre) {
        NombrePadre = nombrePadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        ApellidoPadre = apellidoPadre;
    }

    public void setEdadPadre(int edadPadre) {
        EdadPadre = edadPadre;
    }

    public void setLugarDeNacimientoPadre(String lugarDeNacimientoPadre) {
        LugarDeNacimientoPadre = lugarDeNacimientoPadre;
    }

    public void setConsanguinidadParental(String consanguinidadParental) {
        ConsanguinidadParental = consanguinidadParental;
    }

    public DatosPadre(String nombrePadre, String apellidoPadre, int edadPadre,
                      String lugarDeNacimientoPadre, String consanguinidadParental) {
        NombrePadre = nombrePadre;
        ApellidoPadre = apellidoPadre;
        EdadPadre = edadPadre;
        LugarDeNacimientoPadre = lugarDeNacimientoPadre;
        ConsanguinidadParental = consanguinidadParental;
    }

    @Override
    public void MostrarInformacion() {
        System.out.println("\n");
        System.out.println("DATOS DEL PADRE DEL PACIENTE");
        System.out.println("Nombre padre: " +NombrePadre);
        System.out.println("Apellido padre: " +ApellidoPadre);
        System.out.println("Edad padre: " +EdadPadre);
        System.out.println("Lugar de nacimiento del padre: " +LugarDeNacimientoPadre);
        System.out.println("Consanguinidad parental: " +ConsanguinidadParental);


    }
}
