public class ConsultaYAntecedentes extends HistorialClinicoP{
    //Motivo de consulta
    String MotivoConsulta;

    //Enfermedad Actual
    String EnfermedadActual;

    //Antecedentes
    String Patologicos;
    String Quirurgicos;
    String Farmacologicos;
    String ToxicosAlergicos;
    String Traumaticos;
    String Transfusionales;
    String Familiares;

    public String getMotivoConsulta() {
        return MotivoConsulta;
    }

    public String getEnfermedadActual() {
        return EnfermedadActual;
    }

    public String getPatologicos() {
        return Patologicos;
    }

    public String getQuirurgicos() {
        return Quirurgicos;
    }

    public String getFarmacologicos() {
        return Farmacologicos;
    }

    public String getToxicosAlergicos() {
        return ToxicosAlergicos;
    }

    public String getTraumaticos() {
        return Traumaticos;
    }

    public String getTransfusionales() {
        return Transfusionales;
    }

    public String getFamiliares() {
        return Familiares;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        MotivoConsulta = motivoConsulta;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        EnfermedadActual = enfermedadActual;
    }

    public void setPatologicos(String patologicos) {
        Patologicos = patologicos;
    }

    public void setQuirurgicos(String quirurgicos) {
        Quirurgicos = quirurgicos;
    }

    public void setFarmacologicos(String farmacologicos) {
        Farmacologicos = farmacologicos;
    }

    public void setToxicosAlergicos(String toxicosAlergicos) {
        ToxicosAlergicos = toxicosAlergicos;
    }

    public void setTraumaticos(String traumaticos) {
        Traumaticos = traumaticos;
    }

    public void setTransfusionales(String transfusionales) {
        Transfusionales = transfusionales;
    }

    public void setFamiliares(String familiares) {
        Familiares = familiares;
    }

    public ConsultaYAntecedentes(String motivoConsulta, String enfermedadActual, String patologicos, String quirurgicos,
                                 String farmacologicos,
                                 String toxicosAlergicos, String traumaticos, String transfusionales, String familiares) {
        MotivoConsulta = motivoConsulta;
        EnfermedadActual = enfermedadActual;
        Patologicos = patologicos;
        Quirurgicos = quirurgicos;
        Farmacologicos = farmacologicos;
        ToxicosAlergicos = toxicosAlergicos;
        Traumaticos = traumaticos;
        Transfusionales = transfusionales;
        Familiares = familiares;
    }

    //https://www.cancer.gov/espanol/publicaciones/diccionarios/diccionario-cancer/def/antecedentes-medicos
    //(“Definición de Antecedentes Médicos - Diccionario de Cáncer Del NCI - NCI,” n.d.) CITA
    //


    @Override
    public void MostrarInformacion() {
        System.out.println("\n");
        System.out.println("-- CONSULTA --");
        System.out.println("Motivo de consulta: " +MotivoConsulta);
        System.out.println("Enfermedad o situacion actual: " +EnfermedadActual);
        System.out.println("\n");
        System.out.println("-- ANTECEDENTES MEDICOS DEL PACIENTE --");
        System.out.println("Patologicos: " +Patologicos);
        System.out.println("Quirurgicos: " +Quirurgicos);
        System.out.println("Farmacologicos: " +Farmacologicos);
        System.out.println("ToxicosAlergicos: " +ToxicosAlergicos);
        System.out.println("Traumaticos: " +Traumaticos);
        System.out.println("Transfusionales: " +Transfusionales);
        System.out.println("Familiares:" +Familiares);

    }

}
