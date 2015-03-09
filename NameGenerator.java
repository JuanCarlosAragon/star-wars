
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private static final int CARACTERESAPELLIDO = 3;
    private static final int CARACTERESNOMBRE = 3;
    private static final int CARACTERESAPELLIDOMADRE = 2;
    private static final int CARACTERESCIUDAD = 3;
    private static final char SEPARACION = ' ';
    
    private static final int INDICEINICIOENTRADA = 0;
    private static final int INDICEINICIOSALIDA = 0;
    
    public NameGenerator(){
    }
    
    public void generateStarWarsName( String nombre, String apellido, String apellidoMaterno, String ciudad){
        char[] letrasApellido = new char[apellido.length()];
        apellido.getChars(INDICEINICIOENTRADA, apellido.length()-1, letrasApellido, letrasApellido[INDICEINICIOSALIDA]);
        
        char[] letrasNombre = new char[nombre.length()];
        nombre.getChars(INDICEINICIOENTRADA,nombre.length()-1,letrasNombre,letrasNombre[INDICEINICIOSALIDA]);
        
        char[] letrasApellidoMaterno = new char[apellidoMaterno.length()];
        apellidoMaterno.getChars(INDICEINICIOENTRADA, apellidoMaterno.length()-1, letrasApellidoMaterno, letrasApellidoMaterno[INDICEINICIOSALIDA]);
        
        char[] letrasCiudad = new char[ciudad.length()];
        ciudad.getChars(INDICEINICIOENTRADA,nombre.length()-1, letrasCiudad, letrasCiudad[INDICEINICIOSALIDA]);
        
        StringBuffer starWarsNombre = new StringBuffer();
        
        for(int i = 0; i < CARACTERESAPELLIDO; i++){
            starWarsNombre.append(letrasApellido[i]);
        }
        for(int i = 0; i < CARACTERESNOMBRE; i++){
            starWarsNombre.append(letrasNombre[i]);
        }
        starWarsNombre.append(SEPARACION);
        for(int i = 0; i < CARACTERESAPELLIDOMADRE; i++){
            starWarsNombre.append(letrasApellidoMaterno[i]);
        }
        for(int i = 0; i < CARACTERESCIUDAD; i++){
            starWarsNombre.append(letrasCiudad[i]);
        }
        
        System.out.println(starWarsNombre);
    }
}
