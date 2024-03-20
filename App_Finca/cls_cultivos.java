public class cls_cultivos {
    
    private String CodigoStr;
    private String NombreStr;
    private String AreaStr;

    public cls_cultivos(String c, String n, String a){
        this.CodigoStr = c;
        this.NombreStr = n;
        this.AreaStr = a;
    }

    // Métodos Getters

    public String getCodigoStr(){return this.CodigoStr;}
    public String getNombreStr(){return this.NombreStr;}
    public String getAreaStr(){return this.AreaStr;}

    //Métodos Setters

    public void setCodigoStr(String codStr){this.CodigoStr = codStr;}
    public void setNombreStr(String nom){this.NombreStr = nom;}
    public void setAreaStr(String area){this.AreaStr = area;}

}
