package controllers;

import play.mvc.*;
import play.data.validation.*;
import models.*;
import java.util.List ;
import play.mvc.With;
import controllers.securesocial.SecureSocial;


public class Application extends Controller {

/**
* This method will render the homepage of selltics .
*/
    public static void index() {
        render();
    }



}
