public class ParaclinicosYAnalisis extends HistorialClinicoP {

    //Examen Fisico
    String ExamenFisico;

    //Paraclinicos
    String Paraclinico;

    //Analisis
    String Analisis;
    int FechaAnalisis;

    public String getExamenFisico() {
        return ExamenFisico;
    }

    public String getParaclinico() {
        return Paraclinico;
    }

    public String getAnalisis() {
        return Analisis;
    }

    public int getFechaAnalisis() {
        return FechaAnalisis;
    }

    public void setExamenFisico(String examenFisico) {
        ExamenFisico = examenFisico;
    }

    public void setParaclinico(String paraclinico) {
        Paraclinico = paraclinico;
    }

    public void setAnalisis(String analisis) {
        Analisis = analisis;
    }

    public void setFechaAnalisis(int fechaAnalisis) {
        FechaAnalisis = fechaAnalisis;
    }

    public ParaclinicosYAnalisis(String examenFisico, String paraclinico, String analisis, int fechaAnalisis) {
        ExamenFisico = examenFisico;
        Paraclinico = paraclinico;
        Analisis = analisis;
        FechaAnalisis = fechaAnalisis;
    }

    //ESTO LO DEBE HACER EL MEDICO. NO EL PACIENTE.
    // https://caris.com.co/examenes-paraclinicos/
    //(“Examenes Paraclínicos - Examenes de Apoyo Diagnóstico - Caris,” n.d.) CITA

    //Examenes paraclínicos - Examenes de apoyo diagnóstico - Caris. (n.d.). Retrieved May 27, 2022, from https://caris.com.co/examenes-paraclinicos/



    public void MostrarInformacion() {
        System.out.println("\n");
        System.out.println("-- EXAMEN FISICO GENERAL (NO SEGMENTARIO) --");
        System.out.println(ExamenFisico);
        System.out.println("\n");
        System.out.println("-- PARACLINICOS --");
        System.out.println(Paraclinico);
        System.out.println("-- ANALISIS --");
        System.out.println(Analisis);
        System.out.println("Fecha del analisis: " +FechaAnalisis);
    }


}
