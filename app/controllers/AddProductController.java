package controllers;

import play.mvc.*;
import play.data.validation.*;
import models.*;
import java.util.List ;
import play.mvc.With;
import controllers.securesocial.SecureSocial;
import controllers.Application ;

@With( SecureSocial.class )
public class AddProductController extends Controller {



    public static void add(){

     List<Categories> categories = null;
     categories = Categories.all().fetch();
     
     render(categories) ;

    }
 
    public static void addProduct(@Valid Product product){

	if(validation.hasErrors()){
	flash.error("Trying to be smart ! aah ?? ");
	//Application.index;

        }
	else{
	product.create();
	flash.success(product.name + " -- Added to Selltics");
	add();
	}

   } 



}
