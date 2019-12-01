package inventorysystemapp;

import java.util.ArrayList;

public class Client {


        private  boolean ClientDate; // private = restricted access

        // Getter
        public boolean getClientDate() {
            return ClientDate;
        }

        // Setter
        public void (boolean admindate) {
            this.admindate = admindate;
        }
}
private int cart ;
boolean Iclientproductpriviliege;// an intrface
public Client(boolean iclientproductpriviliege){ //constructor
    this.Iclientproductpriviliege=iclientproductpriviliege;

}

    private ArrayList<String> Product;

    public void addproducttocart(  String addproduct){
        Product.add(addproduct);
    }



    public void removeproductfromcart(  String removeproduct){
        Product.add(removeproduct);
    }



    public void Addbuyproduct(  String addbuyproduct){
        Product.add(addbuyproduct);
    }
    public void searchproductbyname(String name){

    }
    public  void searchproductbycategory(String category){

    }
    public void searchproductbydate(String date){

    }




