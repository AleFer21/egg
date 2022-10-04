package servicio;

import cadena.Cadena;

public class CadenaServicio {

    public void mostrarVocales(Cadena cadena) {
        int vocales = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            if ((cadena.getFrase().charAt(i) == 'a') || (cadena.getFrase().charAt(i) == 'A')
                    || (cadena.getFrase().charAt(i) == 'e') || (cadena.getFrase().charAt(i) == 'E')
                    || (cadena.getFrase().charAt(i) == 'i') || (cadena.getFrase().charAt(i) == 'I')
                    || (cadena.getFrase().charAt(i) == 'o') || (cadena.getFrase().charAt(i) == 'O')
                    || (cadena.getFrase().charAt(i) == 'u') || (cadena.getFrase().charAt(i) == 'U')) {
                vocales++;
            }
        }
        System.out.println("La frase tiene " + vocales + " vocales.");
    }

    public void invertirFrase(Cadena cadena) {
        char invertir[] = cadena.getFrase().toCharArray();
        for (int i = cadena.getFrase().length() - 1; i >= 0; i--) {
            System.out.print(invertir[i]);
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena cadena, char letra) {
        int repite = 0;
        char contar[] = cadena.getFrase().toCharArray();
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            if (contar[i] == letra) {
                repite++;
            }
        }
        System.out.println("La letra " + letra + " se repite " + repite);
    }

    public void compararLongitud(Cadena cadena, String palabra) {
        cadena.setLongitud(cadena.getFrase().length());
        int largo = palabra.length();
        System.out.println("La longitud de la frase del constructor es de "
                + cadena.getLongitud() + " caracteres y la longitud de la frase ingresada es de " + largo + " caracteres.");
    }

    public void unirFrases(Cadena cadena, String palabra) {
        System.out.println(cadena.getFrase() + " " + palabra);
    }

    public void reemplazar(Cadena cadena, String letra) {
        System.out.println(cadena.getFrase().replace("a", letra));
    }

    public void contiene(Cadena cadena, String letra) {
        System.out.println("La frase contiene la letra " + letra + "? " + cadena.getFrase().contains(letra));
    }

}
