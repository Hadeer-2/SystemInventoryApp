package inventorysystemapp;

import java.util.ArrayList;

public class Admin {
    private  boolean admindate; // private = restricted access

    // Getter
    public boolean getadmindate() {
        return admindate;
    }

    // Setter
    public void setadmindate(boolean admindate) {
        this.admindate = admindate;
    }

}
private boolean  IAdminProductriviliege ; //an interface (error)
boolean Isupplierservice ;//an interface
private boolean supplierList ;
private boolean clientservice;

    public Admin(boolean iadminproductprivilege, boolean supplierservice) { //constructor including the 2 interfaces
       this.Isupplierservice = supplierservice;
       this.IAdminProductriviliege=iadminproductprivilege;
    }


    private ArrayList<String> Supplierlist;

    public void addsupplier(  String supplier){
        Supplierlist.add(supplier);
    }
    public void removesupplier(  String supplier){
        Supplierlist.remove(supplier);
    }
    public void deleteproduct(  String product){
        Supplierlist.remove(product);
    }


    public void searchproductByCategory(String category) {

    }
    public void searchPproductByName(String name) {
    }
    public void searchproductByDate(String date) {
    }


    public static String main(String[] args) {

    boolean    IAdminProductriviliege.addproduct( int product);
        try{

            return "true";
        } catch
            return "false";
        }
private static void addproduct(int product) {
        }

}


