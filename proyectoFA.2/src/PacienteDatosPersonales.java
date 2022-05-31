public class PacienteDatosPersonales extends HistorialClinicoP {
    String Nombre;
    String Apellido;
    int DocumentoIdentificacion;
    int Edad;
    int FechaDeNacimiento; //Digitese como Ej: 17072020 / DiaMesAno
    String LugarDeNacimiento;
    String Ocupacion;
    String EstadoCivil;


    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getDocumentoIdentificacion() {
        return DocumentoIdentificacion;
    }

    public int getEdad() {
        return Edad;
    }

    public int getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public String getLugarDeNacimiento() {
        return LugarDeNacimiento;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setDocumentoIdentificacion(int documentoIdentificacion) {
        DocumentoIdentificacion = documentoIdentificacion;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        FechaDeNacimiento = fechaDeNacimiento;
    }

    public void setLugarDeNacimiento(String lugarDeNacimiento) {
        LugarDeNacimiento = lugarDeNacimiento;
    }

    public void setOcupacion(String ocupacion) {
        Ocupacion = ocupacion;
    }

    public void setEstadoCivil(String estadoCivil) {
        EstadoCivil = estadoCivil;
    }

    public PacienteDatosPersonales(String nombre, String apellido, int documentoIdentificacion,
                                   int edad, int fechaDeNacimiento, String lugarDeNacimiento, String ocupacion,
                                   String estadoCivil) {
        Nombre = nombre;
        Apellido = apellido;
        DocumentoIdentificacion = documentoIdentificacion;
        Edad = edad;
        FechaDeNacimiento = fechaDeNacimiento;
        LugarDeNacimiento = lugarDeNacimiento;
        Ocupacion = ocupacion;
        EstadoCivil = estadoCivil;
    }


    @Override
    public void MostrarInformacion() {
        System.out.println("-------------------------");
        System.out.println("DATOS PERSONALES DEL PACIENTE");
        System.out.println("Nombre: " +Nombre);
        System.out.println("Apellido: " +Apellido);
        System.out.println("ID: " +DocumentoIdentificacion);
        System.out.println("Edad: " +Edad);
        System.out.println("Fecha de nacimiento: " +FechaDeNacimiento);
        System.out.println("Lugar de nacimiento: " +LugarDeNacimiento);
        System.out.println("Ocupacion: " +Ocupacion);
        System.out.println("Estado civil :" +EstadoCivil);

    }
}

