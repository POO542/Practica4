import java.util.Locale;
import java.util.Random;


public class Operaciones
{
    String base;
    String curp;
    String rfc;

    char[] VOCALS = {'A', 'E', 'I', 'O', 'U'};
    String[] excepcion = {"BUEI","KOGE","BUEY","KOJO","CACA","KAKA","CACO","KULO","CAGA","MAME","CAGO","MAMO","CAKA","MEAR","COGE","MEON","COJA","MION","COJE","MOCO","COJI","MULA","COJO","PEDA","CULO","PEDO","FETO","PENE","GUEY","PUTA","JOTO","PUTO","KACA","QULO","KACO","RATA","KAGA","RUIN","KAGO"};
    public void setBase(String nombre, String apellidoPaterno, String apellidoMaterno, String fecha)
    {
        base = String.valueOf(apellidoPaterno.charAt(0));
        base = base.concat(primerVocal(apellidoPaterno));
        base = base.concat(String.valueOf(apellidoMaterno.charAt(0)));
        base = base.concat(String.valueOf(nombre.charAt(0)));
        base = base.toUpperCase();
        for(int i = 0; i < excepcion.length; i++)
        {
            if (excepcion[i].compareTo(base) == 0)
            {
                char j = base.charAt(3);
                base = base.replace(String.valueOf(base.charAt(3)),"X");
                break;
            }
        }
        String[] fechasep = fecha.split("/");
        base = base.concat(fechasep[2]);
        base = base.concat(fechasep[1]);
        base = base.concat(fechasep[0]);


    }

    public void setCurp(String sexo, String estado, String nombre, String apellidoPaterno, String apellidoMaterno)
    {
        curp = base;
        curp = curp.concat(sexo);
        curp = curp.concat(estado);
        curp = curp.concat(primerConsonante(apellidoPaterno));
        curp = curp.concat(primerConsonante(apellidoMaterno));
        curp = curp.concat(primerConsonante(nombre));
        curp = curp.concat(String.valueOf(randomChar()));
        curp = curp.concat(String.valueOf(randomChar()));
        curp = curp.toUpperCase();
    }

    public void setRfc()
    {
        rfc = base;
        rfc = rfc.concat(String.valueOf(randomChar()));
        rfc = rfc.concat(String.valueOf(randomChar()));
        rfc = rfc.concat(String.valueOf(randomChar()));
        rfc = rfc.toUpperCase();
    }

    public String primerVocal(String palabra)
    {
        palabra = palabra.toLowerCase();
        char c;
        for (int i = 1; i < palabra.length(); i++)
        {
            c = palabra.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                return String.valueOf(palabra.charAt(i));
            }
        }

        return "X";
    }

    public String primerConsonante(String palabra)
    {
        palabra = palabra.toLowerCase();
        char c;
        for (int i = 1; i < palabra.length(); i++)
        {
            c = palabra.charAt(i);
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
            {
               return String.valueOf(c);
            }
        }

        return "X";
    }

    public char randomChar()
    {
        Random random = new Random();

        String setOfCharacters = "ABCDEFGHIJKLMNOPRSTUVWXYZ1234567";

        int randomInt = random.nextInt(setOfCharacters.length());
        char randomChar = setOfCharacters.charAt(randomInt);
        return randomChar;
    }

    public String getCurp() {
        return curp;
    }

    public String getRfc() {
        return rfc;
    }
}
