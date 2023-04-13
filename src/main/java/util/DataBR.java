/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Renato
 */
public class DataBR {

    public static Date agora() throws ParseException {
        Locale locale = new Locale("pt", "BR");
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG, locale);
        return df.parse(new Date().toString());
    }
}
