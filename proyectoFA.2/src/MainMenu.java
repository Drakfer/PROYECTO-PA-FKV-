import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class MainMenu {
    public static void main(String[] args) throws IOException{
       FileWriter Fichero = new FileWriter("C:/Users/Asus/Desktop/Univerdad/programacion avanzada/Historial_Cilinico.txt");

        List<HistorialClinicoP> HistorialP = new ArrayList<>();
        List<PacienteDatosPersonales> PacientesLista = new ArrayList<>(); //Lista Datos personales del paciente
        List<DatosPadre> PadresL = new ArrayList<>(); //Lista Datos Padre
        List<DatosMadre> MadresL = new ArrayList<>(); //Lista Datos Madre
        List<ConsultaYAntecedentes> ConsultaYAntecedentes = new ArrayList<>(); //Lista de antecedentes
        List<profesional_hospitalizacion> MedicoL = new ArrayList<>();
        List <EncuestaCOVID> ListaCovid = new ArrayList<>(); //Lista de respuestas encuesta covid ESTEBAN


        int NumeroPacientes = 0;

        int opcion = 0;
        Scanner sca= new Scanner(System.in); // variable scaner para que el ususario me introduzca un nuevo dato

        do // ciclo do while para mostrar por lo menos una vez el menu
        {
            System.out.println("-----------------/MENU/-----------------");// menu del banco
            System.out.println("(1).  Subir su historia clinica");
            System.out.println("(2).  Ingresar su historia clinica"); //LISTO
            System.out.println("(3).  Digitar la encuesta de control COVID");
            System.out.println("(4).  Recomendaciones de rutina de actividad fisica");
            System.out.println("(5).  Revision de sintomas");
            System.out.println("(6).  Consulta diagnostico de todos los pacientes en el sistema");//LISTO
            System.out.println("(7).  Consulta  diagnostico de un paciente (ID)");//LISTO
            System.out.println("(8).  Ingreso de datos (Profesional de la salud - Paraclinicos y analisis)");
            System.out.println("(9). Salir del Programa"); //LISTO
            System.out.println("--->  Digite Su opcion: ");
            opcion = sca.nextInt();
            sca.nextLine();
            switch (opcion) {
                case 1: {

                }
                break;

                case 2: {

                    System.out.println("Cuantos pacientes desea agregar?");
                    Scanner scanner = new Scanner(in);
                    int num = scanner.nextInt();
                    for (int i = 0; i < num; i++){
                        scanner = new Scanner(in);

                        //PACIENTE ------------------------------------------
                        System.out.println("Para el paciente #"+(i+1));
                        System.out.println("Cual es el nombre del paciente?");
                        String nombre = scanner.nextLine();
                        System.out.println("Cual es el apellido del paciente?");
                        String apellido = scanner.nextLine();
                        System.out.println("Cual es la edad del paciente?");
                        int edad = scanner.nextInt();
                        System.out.println("Cual es la ID del paciente?");
                        int ID = scanner.nextInt();
                        //LINEA DE LIMPIEZA DE INTRO
                        scanner.nextLine();
                        System.out.println("Cual es el lugar de nacimiento del paciente?");
                        String lugardenacimiento = scanner.nextLine();
                        System.out.println("Cual es la fecha de nacimiento del paciente?");
                        int fechadenacimiento = scanner.nextInt();
                        //LINEA DE LIMPIEZA DE INTRO
                        scanner.nextLine();
                        System.out.println("Cual es la ocupacion del paciente?");
                        String ocupacion = scanner.nextLine();
                        System.out.println("Cual es el estado civil del paciente?");
                        String estadocivil = scanner.nextLine();



                        PacienteDatosPersonales auxPacientes = new PacienteDatosPersonales(nombre,apellido,ID,edad,
                                fechadenacimiento,lugardenacimiento,ocupacion,estadocivil);
                        PacientesLista.add(auxPacientes);

                        //PADRE ------------------------------------------
                        System.out.println("Cual es el nombre del PADRE?");
                        String nombrepadre = scanner.nextLine();
                        System.out.println("Cual es el apellido del PADRE?");
                        String apellidopadre = scanner.nextLine();
                        System.out.println("Cual es la edad del PADRE?");
                        int edadpadre = scanner.nextInt();
                        //LINEA DE LIMPIEZA DE INTRO
                        scanner.nextLine();
                        System.out.println("Cual es lugar de nacimiento del PADRE?");
                        String lugardenacimientopadre = scanner.nextLine();
                        System.out.println("Consanguinidad parental con PADRE / Si o no ?");
                        String consanguinidadpadre = scanner.nextLine();

                        DatosPadre auxPadre = new DatosPadre(nombrepadre,apellidopadre,edadpadre,lugardenacimientopadre,consanguinidadpadre);

                        PadresL.add(auxPadre);

                        //MADRE ------------------------------------------
                        System.out.println("Cual es el nombre de la MADRE?");
                        String nombremadre = scanner.nextLine();
                        System.out.println("Cual es el apellido de la MADRE?");
                        String apellidomadre = scanner.nextLine();
                        System.out.println("Cual es la edad de la MADRE?");
                        int edadmadre = scanner.nextInt();
                        //LINEA DE LIMPIEZA DE INTRO
                        scanner.nextLine();
                        System.out.println("Cual es lugar de nacimiento de la MADRE?");
                        String lugardenacimientomadre = scanner.nextLine();
                        System.out.println("Consanguinidad parental con MADRE / Si o no ?");
                        String consanguinidadmadre = scanner.nextLine();

                        DatosMadre auxMadre = new DatosMadre(nombremadre,apellidomadre,edadmadre,lugardenacimientomadre,consanguinidadmadre);

                        MadresL.add(auxMadre);

                        //MOTIVO DE CONSULTA Y ANTECEDENTES

                        System.out.println("Cual es el motivo de la consulta?");
                        String motivoconsulta = scanner.nextLine();
                        System.out.println("Describa la enfermedad o situacion actual: ");
                        String enfermedadactual = scanner.nextLine();

                        System.out.println("-- ANTECEDENTES --");
                        //FUENTE DE CONSULTA CONFIABLE TIPO DICCIONARIO DE ANTECEDENTES
                        System.out.println("En caso de que requiera mas informacion, por favor consulte en: " +
                                "https://www.cancer.gov/espanol/publicaciones/diccionarios/diccionario-cancer/def/antecedentes-medicos" );
                        System.out.println("Definición de antecedentes médicos - Diccionario de cáncer del NCI - NCI. (n.d.). \n" +
                                "   Retrieved May 27, 2022, from https://www.cancer.gov/espanol/publicaciones/diccionarios/diccionario-cancer/def/antecedentes-medicos");

                        System.out.println("Antecedentes Patologicos");
                        String patologicos = scanner.nextLine();
                        System.out.println("Antecedentes Quirurgicos");
                        String quirurgicos = scanner.nextLine();
                        System.out.println("Antecedentes Farmacologicos");
                        String farmacologicos = scanner.nextLine();
                        System.out.println("Antecedentes ToxicosAlergicos");
                        String toxicosalergicos = scanner.nextLine();
                        System.out.println("Antecedentes Traumaticos");
                        String traumaticos = scanner.nextLine();
                        System.out.println("Antecedentes Transfusionales");
                        String transfusionales = scanner.nextLine();
                        System.out.println("Antecedentes Familiares");
                        String familiares = scanner.nextLine();

                        ConsultaYAntecedentes auxConsAnt = new ConsultaYAntecedentes(motivoconsulta,enfermedadactual,patologicos,quirurgicos,farmacologicos,toxicosalergicos,traumaticos,transfusionales,familiares);

                        ConsultaYAntecedentes.add(auxConsAnt);

                        NumeroPacientes++;


                    }


                    for (int i = 0; i < num; i++){
                        HistorialP.add(PacientesLista.get(i));
                        HistorialP.add(PadresL.get(i));
                        HistorialP.add(MadresL.get(i));
                        HistorialP.add(ConsultaYAntecedentes.get(i));
                    }
                }
                break;
                case 4: {
                    System.out.println("Recomendacions de Salud");
                    System.out.println("IMPORTANTE: Los consejos dados en este sistema no son reemplazo para instrucciones de un profesional de salud.");
                    System.out.println("Los consejos dados no toman en cuenta limitaciones personales de pacientes, como alergias, enfermedades, o heridas.");
                    System.out.println("Si se detecta algun problema por los consejos dados, detenerse inmediatamente y contactar a un profesional medico.");
                    System.out.println("--------------------------------------");
                    System.out.println("Opciones:");
                    System.out.println("Funcionamiento Cardiovascular (1)");
                    System.out.println("Funcionamiento Respiratorio (2)");
                    System.out.println("Funcionamiento Endocrino (3)");
                    System.out.println("Funcionamiento Inmunologico (4)");


                    System.out.println("---->Digite su opcion:");
                    opcion = sca.nextInt();
                    sca.nextLine();
                    switch (opcion) {

                        case 1: {
                            System.out.println("Funcion Cardiovascular:");
                            System.out.println("Ejercicios recomendados para mejorar funcionalidad:");
                            System.out.println("       Natacion");
                            System.out.println("       Futbol");
                            System.out.println("       Trotar");
                            System.out.println("       Bailar (Zumba es una buena opcion)");
                            System.out.println("Alimentos (En Moderacion):");
                            System.out.println("       Quinoa");
                            System.out.println("       Aguacate");
                            System.out.println("       Frijoles");
                            System.out.println("       Nueces");
                            System.out.println("       This shit works");
                            System.out.println("       This shit works");
                            System.out.println("Cosas que evitar:");
                            System.out.println("       Comida grasienta");
                            System.out.println("       Vida sedentaria (Ejercicio menos de dos veces a la semana)");
                            System.out.println("       Alcohol en exceso");
                            System.out.println("Para mas informacion, visitar:");
                            System.out.println("https://www.who.int/philippines/news/feature-stories/detail/how-to-take-care-of-your-heart-health");
                            System.out.println("https://www.healthline.com/nutrition/heart-healthy-foods");
                        }
                    }
                }
                        break;
                case 3:{
                    System.out.println("Esta es su Encuesta covid");

                    Scanner scanner = new Scanner(in);

                    System.out.println("Ha tenido tos en la ultima semana? (Si / No)");
                    String Tos = scanner.nextLine();
                    System.out.println("Ha tenido fiebre en las ultimas dos semanas? (Si/No)");
                    String Fiebre = scanner.nextLine();
                    System.out.println("Ha sentido debilidad fisica en las ultimas dos semanas? (Si/No)");
                    String Debilidad = scanner.nextLine();
                    System.out.println("Ha estado fuera del pais en el ultimo mes? (Si/No)");
                    String Pais = scanner.nextLine();
                    System.out.println("Ha estado en contacto con alguna persona con prueba positiva de Covid-19 (Si/No)?");
                    String ContactoP = scanner.nextLine();
                    System.out.println("Ha estado en contacto con alguna persona con sintomas de Covid-19? (Si/No)");
                    String ContactoS = scanner.nextLine();
                    System.out.println("Ha visitado alguna comunidad con altos indices de contagio de Covid-19? (Si/No");
                    String Comunidad = scanner.nextLine();

                    EncuestaCOVID auxCovid = new EncuestaCOVID(Tos,Fiebre,Debilidad,Pais,ContactoP,ContactoS,Comunidad);

                    ListaCovid.add(auxCovid);

                    for (EncuestaCOVID COVID: ListaCovid){
                        COVID.MostrarInformacion();
                    }

                    ListaCovid.clear();

                }
                break;
                case 5: {
                    System.out.println("-- REVISIÓN DE SINTOMAS --");
                    //FUENTE DE CONSULTA CONFIABLE PARA BUSCAR SINTOMAS
                    System.out.println("INGRESAR AL SIGUIENTE LINK " +
                            "https://symptomate.com/es/diagnosis/0" );
                    System.out.println("La pagina anterior puede ser utilizada como metodo de chequeo general para averiguar " +
                            "la posible causa de los sintomas del paciente." + "\n" +
                            "De ninguna manera remplaza el diagnostico de un profesional de la salud.");
                    System.out.println("\n"+"A continuacion se sugiere una de las fuentes mas confiables en tematicas de salud," +
                            "que corresponde a ala pagina de MAYO CLINIC");
                    System.out.println("INGRESAR AL SIGUIENTE LINK " +
                            "https://www.mayoclinic.org/es-es/symptoms" );
                }
                break;
                case 6: {
                    /*FileWriter ejemplo1= new FileWriter(Fichero);
                    BufferedWriter impresion = new BufferedWriter(ejemplo1);*/
                    for (HistorialClinicoP INFO: HistorialP){
                        INFO.MostrarInformacion();
                    }
                }
                break;
                case 7: {

                    Scanner Buscador = new Scanner(in);
                    System.out.println("Por favor a ingrese el numero de identificacion del paciente a buscar:");
                    int ID = Buscador.nextInt();
                    for (int i = 0; i < PacientesLista.size(); i++){
                        if(ID == PacientesLista.get(i).getDocumentoIdentificacion()){
                            PacientesLista.get(i).MostrarInformacion();
                            PadresL.get(i).MostrarInformacion();
                            MadresL.get(i).MostrarInformacion();
                            ConsultaYAntecedentes.get(i).MostrarInformacion();
                        }

                    }
                }
                break;
                case 8: {
                    int contraseña = 123;
                    Scanner scanner = new Scanner(in);
                    System.out.println("contraseña");
                    int auxcontra = scanner.nextInt();

                    if (auxcontra == contraseña) {
                        scanner.nextLine();
                        System.out.println("Afecciones");
                        String Afeccion = scanner.nextLine();
                        System.out.println("canalizacion? si o no");
                        String canalizacion  = scanner.nextLine();
                        System.out.println("estado critico? si o no");
                        String critico = scanner.nextLine();
                        System.out.println("tipo de sangre");
                        String sangre = scanner.nextLine();
                        System.out.println("posible contagio? ");
                        String contagioso = scanner.nextLine();
                        System.out.println("numero de cama");
                        int numero_cama = scanner.nextInt();
                        System.out.println("dias de hospitalizacion ");
                        int dias_hospitalizacion = scanner.nextInt();

                        profesional_hospitalizacion auxpro_hoz = new profesional_hospitalizacion(Afeccion,canalizacion,critico,sangre, contagioso,numero_cama,dias_hospitalizacion);

                       HistorialP.add(auxpro_hoz);
                    }
                    for (HistorialClinicoP INFO: HistorialP){
                        INFO.MostrarInformacion();
                    }
                }
                case 9:
                    System.out.println("Usted Ha salido del Programa :)");
                    break;
            }
        } while(opcion != 9);
        sca.close();
        //fichero.close();

    }

}

