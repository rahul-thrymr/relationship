package controllers;

import models.Detail;
import models.Person;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
	
	public Person p;
	public Detail d;
    public Result index() {
    	
    	Form<Person> per = Form.form(Person.class).bindFromRequest();
    	
    	
        return ok(views.html.index.render(per));
    }
    
public Result submit(){
		
	Form<Person> per = Form.form(Person.class).bindFromRequest();
			p=per.get();
			p.save();
			return redirect("/detail");
		
		}	
		
    
public Result detail() {
    	
    	
    	Form<Detail> det = Form.form(Detail.class).bindFromRequest();	
    	
        return ok(views.html.detail1.render(det));
    }

public Result detsubmit(){
	
	Form<Detail> det = Form.form(Detail.class).bindFromRequest();
			d=det.get();
			p.detail = d;
			p.update();
			d.save();
			return ok("details saved");
		
		}


public Result delete()
{

	Form<Person> per = Form.form(Person.class).bindFromRequest();

per.get();
//if (per != null) {
		Logger.info("====" +p.pId + d.income);
p.delete();
d.delete();
return ok("person-details  " + per.name() + " are deleted");


/*} else {

   return ok("record can't be deleted");
}
*/
} 
public Result saved(){
	return ok("saved");
}

}
