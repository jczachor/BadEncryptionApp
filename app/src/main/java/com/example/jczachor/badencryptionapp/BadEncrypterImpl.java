package com.example.jczachor.badencryptionapp;

import java.util.Random;

/**
 * Created by jczachor on 08.09.2017.
 */

public class BadEncrypterImpl implements BadEncrypter {

    //returns reversed string
    @Override
    public String enc_reverse(String s) {
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        return new String(buffer);
    }

    //returns string with exchanged letters to digits
    @Override
    public String enc_changeToDigits(String s) {
        String lowercase = s.toLowerCase();
        String uppercase = s.toUpperCase();
        StringBuilder builder = new StringBuilder();
        Random RNG = new Random();
        for(int i=0; i<s.length();i++)
        {
            switch (lowercase.charAt(i)){
                case 'a':
                    builder.append('4');
                    break;
                case 'e':
                    builder.append('3');
                    break;
                case 'i':
                    builder.append(';');
                    break;
                case 'j':
                    builder.append('1');
                    break;
                case 'l':
                    builder.append('I');
                    break;
                case 'o':
                    builder.append('O');
                    break;
                case 's':
                    builder.append('5');
                    break;
                case 't':
                    builder.append('7');
                    break;
                default:
                    //if true lowercase default letter, else uppercase
                    boolean rnd = RNG.nextBoolean();
                    if (rnd) builder.append(lowercase.charAt(i));
                        else builder.append(uppercase.charAt(i));
            }
        }


        return new String(builder);
    }
}
