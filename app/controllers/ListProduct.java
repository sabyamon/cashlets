package controllers;

import play.mvc.*;
import play.data.validation.*;
import models.*;
import java.util.List ;
import controllers.Application ;


public class ListProduct extends Controller {

    public static void list(){

     List<Product> products = null;
     products = Product.all().fetch();
     
     render(products) ;

    }

}
