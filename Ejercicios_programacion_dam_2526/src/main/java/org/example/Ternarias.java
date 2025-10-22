package org.example;

public class Ternarias {

    static void main() {

        //caso 1
        int a = 1, b = 2, c = 3;
        int resultado = a++ == 2 && c > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;

        System.out.println(resultado);

        //caso 2
        a = 1;
        b = 2;
        c = 3;

        resultado = a++ == 1 && a > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;

        System.out.println(resultado);

        //caso 3
        a = 1;
        b = 2;
        c = 3;

        resultado = a++ == 1 && a > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        b == c ? a++ : a--;

        System.out.println(resultado);

        //caso Examen
        int jacobo = 10;
        int angel = 18;
        int denis = 9;

        resultado = angel++ == 19 && angel < denis++ ? angel -= jacobo :
                angel == 19 && angel-- > jacobo-- && jacobo++ < denis-- ? angel -= denis :
                        jacobo-- < angel-- && denis++ < angel-- && jacobo > denis ? jacobo += denis:
                                denis > jacobo && angel > denis++ && jacobo == 9 ? angel-- : angel++;

        System.out.println(resultado);
        System.out.println(jacobo);
        System.out.println(angel);
        System.out.println(denis);

    }
}
