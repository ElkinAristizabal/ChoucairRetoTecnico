package choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class ElementVisible implements Question<Boolean> {
    private final Target target;

    public ElementVisible(Target target) {
        this.target = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(target).answeredBy(actor);
    }

    public static ElementVisible of(Target target) {
        return new ElementVisible(target);
    }
}
