public class DiagnosticoNPE {
    public static void main(String[] args) {
        Usuario usr = new Usuario();
        usr.nombre = "Elena";

        // ¿Qué ocurrirá en la siguiente línea? Deberia ser un null pointer exception
        System.out.println("Rol del usuario: " + usr.perfil.rol.toUpperCase());
    }
}
/*
1. Sin ejecutar el código, predice cuál es el valor por defecto de usr.perfil al instanciar new Usuario(). null
2. Compila y ejecuta el código en consola. Observa el mensaje detallado de la excepción que emite la JVM en Java 21.
3. Modifica la clase DiagnosticoNPE para implementar una verificación defensiva con if (usr.perfil != null) o inicializando la variable perfil correctamente antes de invocar métodos sobre ella.
 */