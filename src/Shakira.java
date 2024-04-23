import groovy.lang.Binding;
import groovy.lang.GroovyShell;

public class Shakira {

    private String stringScript;
    private GroovyShell shell = new GroovyShell();

    public String getStringScript() {
        return stringScript;
    }

    public void setStringScript(String stringScript) {
        this.stringScript = stringScript;
    }

   /* public Object executeScript(String script) {
        return shell.evaluate(script);
    }*/

    public Object executeScript(String script, String variable) {
        Binding binding = new Binding();
        binding.setVariable("variable", variable);

        GroovyShell shell = new GroovyShell(binding);
        return shell.evaluate(script);
    }

    public void executeHelloJava() {
        System.out.println("Hello from Java!");
    }
}