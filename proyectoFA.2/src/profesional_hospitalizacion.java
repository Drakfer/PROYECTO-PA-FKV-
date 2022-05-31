public class profesional_hospitalizacion extends HistorialClinicoP{
    String Afeccion;
    String canalizacion;
    String critico;
    String sangre;
    String contagioso;
    int numero_cama;
    int dias_hospitalizacion;


    public String getAfeccion() {
        return Afeccion;
    }

    public String getCanalizacion() {
        return canalizacion;
    }

    public String getcritico() {
        return critico;
    }

    public String getsangre() {
        return sangre;
    }

    public String getContagioso() {
        return contagioso;
    }

    public int getNumero_cama() {
        return numero_cama;
    }

    public int getDias_hospitalizacion() {
        return dias_hospitalizacion;
    }

    public void setAfeccion(String afeccion) {
        afeccion = afeccion;
    }

    public void setCanalizacion(String canalizacion) {
        canalizacion = canalizacion;
    }

    public void setCritico(String critico) {
        critico = critico;
    }

    public void setSangre(String sangre) {
        sangre = sangre;
    }

    public void setContagioso(String contagioso) {
        contagioso = contagioso;
    }

    public void setDias_hospitalizacion(int dias_hospitalizacion) {
        dias_hospitalizacion = dias_hospitalizacion;
    }

    public void setNumero_cama(String numero_cama) {
        numero_cama = numero_cama;
    }


    public profesional_hospitalizacion(String afeccion, String canalizacion, String critico, String sangre, String contagioso, int numero_cama, int dias_hospitalizacion) {
        this.Afeccion = afeccion;
        this.canalizacion = canalizacion;
        this.critico = critico;
        this.sangre = sangre;
        this.contagioso = contagioso;
        this.numero_cama = numero_cama;
        this.dias_hospitalizacion = dias_hospitalizacion;
    }

    @Override
    public void MostrarInformacion() {
        System.out.println("-------------------------");
        System.out.println("ANALISIS DEL PROFECIONAL");
        System.out.println("Afeccion: " +Afeccion);
        System.out.println("Necesita canalizacion: " +canalizacion);
        System.out.println("Estado critico: " +critico);
        System.out.println("Tipo de sangre: " +sangre);
        System.out.println("Contagioso: " +contagioso);
        System.out.println("Numero de cama : " +numero_cama);
        System.out.println("Dias de hospitalización: " +dias_hospitalizacion);

    }
}