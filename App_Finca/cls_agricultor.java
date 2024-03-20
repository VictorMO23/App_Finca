public class cls_agricultor{

    private String IDStr;
    private String NombreStr;
    private String ContactoStr;
    private String UbicacionStr;
    
    public cls_agricultor(String iDStr, String nombreStr, String contactoStr, String ubicacionStr) {
        IDStr = iDStr;
        NombreStr = nombreStr;
        ContactoStr = contactoStr;
        UbicacionStr = ubicacionStr;
    }

    //Métodos Getters

    public String getIDStr() {return this.IDStr;}

    public String getNombreStr() {return this.NombreStr;}

    public String getContactoStr() {return this.ContactoStr;}

    public String getUbicacionStr() {return this.UbicacionStr;}

    //Métodos Setters

    public void setIDStr(String iDStr) {this.IDStr = iDStr;}

    public void setNombreStr(String nombreStr) {this.NombreStr = nombreStr;}

    public void setContactoStr(String contactoStr) {this.ContactoStr = contactoStr;}

    public void setUbicacionStr(String ubicacionStr) {this.UbicacionStr = ubicacionStr;}

}