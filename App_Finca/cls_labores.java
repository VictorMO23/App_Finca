public class cls_labores{

    private String CodigoStr;
    private String NombreStr;
    private String TiempoStr;
    
    public cls_labores(String codigoStr, String nombreStr, String tiempoStr) {
        this.CodigoStr = codigoStr;
        this.NombreStr = nombreStr;
        this.TiempoStr = tiempoStr;
    }

    // Métodos Getters and Setters

    public String getCodigoStr() {return CodigoStr;}

    public void setCodigoStr(String codigoStr) {CodigoStr = codigoStr;}

    public String getNombreStr() {return NombreStr;}

    public void setNombreStr(String nombreStr) {NombreStr = nombreStr;}

    public String getTiempoStr() {return TiempoStr;}

    public void setTiempoStr(String tiempoStr) {TiempoStr = tiempoStr;}

}