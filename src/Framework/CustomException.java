package Framework;

public class CustomException extends Exception{
    public CustomException(String e, String clase, String metodo) {
        System.out.println("[ERROR APP] ---> " + clase+ "." + metodo + ":" + e);
    }

    @Override
    public String getMessage() {
        return "Se presentó un error ...";
    }
}
