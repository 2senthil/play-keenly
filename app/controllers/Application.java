package controllers;

import models.Skill;
import play.*;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;

import static play.libs.Json.toJson;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result addSkill() {
        //Skill skill = Form.form(Skill.class).bindFromRequest().get();
        //skill.save();
        return redirect(controllers.routes.Application.index());
    }

    public static Result getSkills() {
        //List<Skill> skills = new Model.Finder(String.class, Skill.class).all();
        List<Skill> skills = new ArrayList<Skill>();
        Skill skillOne = new Skill();
        skillOne.id = "1";
        skillOne.name = "Java";
        skills.add(skillOne);
        Skill skillTwo = new Skill();
        skillTwo.id = "2";
        skillTwo.name = "Scala";
        skills.add(skillTwo);
        return ok(toJson(skills));
    }
}
