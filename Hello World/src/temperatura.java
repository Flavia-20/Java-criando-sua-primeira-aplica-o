//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class temperatura {
    public static void main(String[] args) {
       double ceusius;
       ceusius = 45.5;

       double fahrenheit;
       fahrenheit = (ceusius * 1.8) + 32;

        String mensagem = (String.format("A temperatura de %f Celsius é equivalente a: " + fahrenheit, fahrenheit));

        System.out.println(mensagem);
    }
}