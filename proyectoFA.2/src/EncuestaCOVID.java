import java.util.Objects;

public class EncuestaCOVID extends HistorialClinicoP{
    //Sintomas Comunes
    String tos;
    String fiebre;
    String debilidad;
    String pais;
    String contactoP;
    String contactoS;
    String comunidad;

    public String gettos() {
        return tos;
    }
    public String getfiebre() {
        return fiebre;
    }
    public String getdebilidad() {
        return debilidad;
    }
    public String getpais() {
        return pais;
    }
    public String getcontactoP() {
        return contactoP;
    }
    public String getcontactoS() {
        return contactoS;
    }
    public String getcomunidad() {
        return comunidad;
    }


    public EncuestaCOVID(String tos, String fiebre, String debilidad, String pais, String contactoP, String contactoS, String comunidad) {
        this.tos = tos;
        this.fiebre = fiebre;
        this.debilidad = debilidad;
        this.pais = pais;
        this.contactoP = contactoP;
        this.contactoS = contactoS;
        this.comunidad = comunidad;
    }

    @Override
    public void MostrarInformacion( ) {
        System.out.println("\n");
        System.out.println("- Informacion Covid-19 -");
        System.out.println("Sintoma de Tos : " +tos);
        System.out.println("Sintoma de Fiebre : " +fiebre);
        System.out.println("Sintoma de Debilidad : " +debilidad);
        System.out.println("Expuesto al Extranjero : " +pais);
        System.out.println("Expuesto a Caso Confirmado : " +contactoP);
        System.out.println("Expuesto a Caso Sospechado : " +contactoS);
        System.out.println("Expuesto a Comunidad Vulnerable : " +comunidad);

        if(Objects.equals(tos, "No") && Objects.equals(fiebre, "No") && Objects.equals(debilidad, "No") && Objects.equals(pais, "No") && Objects.equals(contactoP, "No") && Objects.equals(contactoS, "No") && Objects.equals(comunidad, "No")) {
            System.out.println("El paciente no es de alto riesgo.");
        }
        else if(Objects.equals(contactoS, "Si") || Objects.equals(comunidad, "Si")){
            System.out.println("Hay un riesgo moderado de COvid-19. Se recomienda cuarentena, y Prueba (Antigenos) y cuarentena de personas vulnerables hasta resultado negativo");
        }
        else{
            System.out.println("Hay un riesgo considerable de  Covid-19. Recomendacion de Prueba (Antiduerpos) y Cuarentena hasta resultado negativo");
        }
        System.out.println("Datos e informacion adicional:");
        System.out.println("https://www.who.int/emergencies/diseases/novel-coronavirus-2019");
    }
}

