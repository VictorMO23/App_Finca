import java.util.LinkedList;

import javax.swing.JOptionPane;

public class App_Finca {
    
    static LinkedList <cls_agricultor> Agricultor = new LinkedList<cls_agricultor>();
    static LinkedList <cls_cultivos> Cultivo = new LinkedList<cls_cultivos>();
    static LinkedList <cls_labores> Labores = new LinkedList<cls_labores>();

    public static void main(String[] args) {
        fnt_menu(true);
    }

    public static void fnt_registrar_agricultor(String id, String nombre, String contacto, String ubicacion){

        if (id.equals("") || nombre.equals("") || contacto.equals("") || ubicacion.equals("")){
            JOptionPane.showMessageDialog(null, "           ¡Error!    \n\nRegistrar todos los datos solicitados", "Error de registro", 0);
        }else{
            Agricultor.add(new cls_agricultor(id,nombre,contacto, ubicacion));
            JOptionPane.showMessageDialog(null, "<<<<Registro Éxitoso>>>\n\nÉxitoso registro de agricultor.", "Registro Éxitoso", 1);
        }
    }

    public static void fnt_registrar_cultivo(String c, String n, String a){

        if (c.equals("") || n.equals("") || a.equals("") ){
            JOptionPane.showMessageDialog(null, "           ¡Error!    \n\nRegistrar todos los datos solicitados", "Error de registro", 0);
        }else{
            Cultivo.add(new cls_cultivos(c,n,a));
            JOptionPane.showMessageDialog(null, "<<<<Registro Éxitoso>>>\n\nÉxitoso registro del cultivo.", "Registro Éxitoso", 1);
        }
    }

    public static void fnt_registrar_labores(String c, String n, String t){

        if (c.equals("") || n.equals("") || t.equals("") ){
            JOptionPane.showMessageDialog(null, "           ¡Error!    \n\nRegistrar todos los datos solicitados", "Error de registro", 0);
        }else{
            Labores.add(new cls_labores(c,n,t));
            JOptionPane.showMessageDialog(null, "<<<<Registro Éxitoso>>>\n\nÉxitoso registro de la labor.", "Registro Éxitoso", 1);
        }
        
    }

    public static void fnt_sub_menu(boolean sub_men_reg){
        while (sub_men_reg == true){

            int op2 = Integer.parseInt(JOptionPane.showInputDialog(null,"<<<< Ménu de Registro >>>>" +
            "\n\n1. Registrar Agricultor" + "\n2. Registrar Cultivo" + "\n3. Registrar Labor" + "\n4. Salir", "Ménu de Registro", 3 ));
            
            if (op2 == 1){
                String i = JOptionPane.showInputDialog(null,"ID:", "Registro de Agricultor", 3);
                String n = JOptionPane.showInputDialog(null,"Nombre:", "Registro de Agricultor", 3);
                String c = JOptionPane.showInputDialog(null,"Contacto:", "Registro de Agricultor", 3);
                String u = JOptionPane.showInputDialog(null,"Ubicación:", "Registro de Agricultor", 3);

            fnt_registrar_agricultor(i, n, c, u);
            } else if(op2 == 2){
                String cod = JOptionPane.showInputDialog(null,"Código Cultivo:", "Registro del Cultivo", 3);
                String nom = JOptionPane.showInputDialog(null,"Nombre Cultivo:", "Registro del Cultivo", 3);
                String area = JOptionPane.showInputDialog(null,"Área Cultivo:", "Registro del Cultivo", 3);

                fnt_registrar_cultivo(cod, nom, area);
            }else if(op2 == 3){
                String cod = JOptionPane.showInputDialog(null,"Código Labor:", "Registro de Labor", 3);
                String nom = JOptionPane.showInputDialog(null,"Labor a realizar: \n\n1. Siembra\n2. Cosecha\n3. Aplicación de Fertilizante\n4. Aplicación de mata maleza\n5. Otra labor", "Registro de Labor", 3);
                if(nom.equals("5")){
                    nom = "";
                    nom = JOptionPane.showInputDialog(null,"Escriba la labor a registrar:");
                }
                String tiempo = JOptionPane.showInputDialog(null,"Tiempo que le va llevar esta labor:", "Registro de Labor", 3);

                fnt_registrar_labores(cod, nom, tiempo);
            } else if(op2 == 4){
                sub_men_reg = false;
            }
        }
    }

    public static void fnt_consultar_agricultores(String idBusqueda) {
        boolean sw = false;
        int pos = 0;
    
        for (int i = 0; i < Agricultor.size(); i++) {
            if (Agricultor.get(i).getIDStr().equals(idBusqueda)) {
                sw = true;
                pos = i;
                break;
            }
        }
    
        if (sw) {
            cls_agricultor agricultorEncontrado = Agricultor.get(pos);
            JOptionPane.showMessageDialog(null, "Agricultor encontrado:\n" +
                    "ID: " + agricultorEncontrado.getIDStr() + "\n" +
                    "Nombre: " + agricultorEncontrado.getNombreStr() + "\n" +
                    "Contacto: " + agricultorEncontrado.getContactoStr() + "\n" +
                    "Ubicación: " + agricultorEncontrado.getUbicacionStr(), "Consulta de Agricultor", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún agricultor con el ID proporcionado.", "Consulta de Agricultor", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void fnt_consultar_cultivos(String codigoBusqueda) {
        boolean sw = false;
        int pos = 0;
    
        for (int i = 0; i < Cultivo.size(); i++) {
            if (Cultivo.get(i).getCodigoStr().equals(codigoBusqueda)) {
                sw = true;
                pos = i;
                break;
            }
        }
    
        if (sw) {
            cls_cultivos cultivoEncontrado = Cultivo.get(pos);
            JOptionPane.showMessageDialog(null, "Cultivo encontrado:\n" +
                    "Código: " + cultivoEncontrado.getCodigoStr() + "\n" +
                    "Nombre: " + cultivoEncontrado.getNombreStr() + "\n" +
                    "Área: " + cultivoEncontrado.getAreaStr(), "Consulta de Cultivo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún cultivo con el código proporcionado.", "Consulta de Cultivo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void fnt_consultar_labores(String codigoBusqueda) {
        boolean sw = false;
        int pos = 0;
    
        for (int i = 0; i < Labores.size(); i++) {
            if (Labores.get(i).getCodigoStr().equals(codigoBusqueda)) {
                sw = true;
                pos = i;
                break;
            }
        }
    
        if (sw) {
            cls_labores laborEncontrada = Labores.get(pos);
            JOptionPane.showMessageDialog(null, "Labor encontrada:\n" +
                    "Código: " + laborEncontrada.getCodigoStr() + "\n" +
                    "Nombre: " + laborEncontrada.getNombreStr() + "\n" +
                    "Tiempo: " + laborEncontrada.getTiempoStr(), "Consulta de Labor", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna labor con el código proporcionado.", "Consulta de Labor", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void fnt_menu(boolean m){

        while (m == true){
            int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "<<<< MÉNU PRINCIPAL >>>>" +
            "\n\n1. Nuevo Registro" + "\n2. Consultar Registros" + "\n3. Salir", "Ménu Principal", 3));

            if (op1 == 1){
                fnt_sub_menu(true);
                }

            if (op1 == 2){
                int tipoConsulta = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué deseas consultar?\n1. Agricultores\n2. Cultivos\n3. Labores", "Consulta", JOptionPane.QUESTION_MESSAGE));
                switch (tipoConsulta) {
                    case 1:
                        String ID_agricultor = JOptionPane.showInputDialog(null, "Ingrese el ID del agricultor a buscar: ");
                        fnt_consultar_agricultores(ID_agricultor);
                        break;
                    case 2:
                        String cod_cultivo = JOptionPane.showInputDialog(null, "Ingrese el Código del cultivo a buscar: ");
                        fnt_consultar_cultivos(cod_cultivo);
                        break;
                    case 3:
                        String cod_labores = JOptionPane.showInputDialog(null, "Ingrese el Código de la labor a buscar: ");
                        fnt_consultar_labores(cod_labores);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida.", "Consultar", JOptionPane.WARNING_MESSAGE);
                }
            }
            if (op1 == 3){
                m = false;
                }
        }
    }
}
