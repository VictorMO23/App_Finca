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

    public static void fnt_menu(boolean m){

        while (m == true){
            int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "<<<< MÉNU PRINCIPAL >>>>" +
            "\n\n1. Nuevo Registro" + "\n2. Consultar Registros" + "\n3. Salir", "Ménu Principal", 3));

            if (op1 == 1){
                fnt_sub_menu(true);
                }
                if (op1 == 2){
                    JOptionPane.showMessageDialog(null, "Aun esta en proceso, por favor esperar un poco más de tiempo");
                    }
            if (op1 == 3){
                    m = false;
                    }
            }
        }
}
