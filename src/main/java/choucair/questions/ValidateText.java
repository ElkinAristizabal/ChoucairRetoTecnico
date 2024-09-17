package choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateText implements Question<Boolean> {

    private final Target element;
    private final String text;

    public ValidateText(Target element, String text) {
        this.element = element;
        this.text = text;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String textoElemento = Text.of(element).answeredBy(actor);
        System.out.println("Texto Elemento : " + textoElemento);
        System.out.println("Texto Esperado  : " + text);
        return textoElemento.equals(text);
    }
    public static ValidateText ofElement(Target element, String text) {
        return new ValidateText(element, text);
    }
}
