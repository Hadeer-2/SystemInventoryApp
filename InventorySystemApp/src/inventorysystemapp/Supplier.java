package inventorysystemapp;

import java.util.ArrayList;

public class Supplier {
    private  boolean supplierdata; // private = restricted access

    // Getter
    public boolean getsupplierdata() {

        return supplierdata;
    }

    // Setter
    public void setsupplierdata(boolean supplierdata) {
        this.supplierdata = supplierdata;}
}


boolean Isupplierprivilege;
    private ArrayList<String> Quantity;

    public void addQuntity(  String quantity){
        Quantity.add(quantity);
    }