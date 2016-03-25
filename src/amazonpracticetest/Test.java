/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpracticetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Prathamesh
 */
public class Test {

    private static String DATE_STRING_FORMAT = "MM/dd/yyyy";

    private static final String OFFER_START_DATE = "07/12/2014";

    private static Date getDateFromString(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_STRING_FORMAT, Locale.ENGLISH);
        return sdf.parse(date);
    }

    public static void main(String[] args) {
        try {
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal1.setTime(getDateFromString(OFFER_START_DATE));
            cal2.setTime(getDateFromString("01/12/2012"));
            int a, b , c,d;
            a=cal1.get(Calendar.YEAR);
            b=cal2.get(Calendar.YEAR);
            c= cal2.get(Calendar.MONTH);
            d=  cal1.get(Calendar.MONTH);
            System.out.println((cal1.get(Calendar.YEAR) - cal2.get(Calendar.YEAR)) * 12 + cal1.get(Calendar.MONTH) - cal2.get(Calendar.MONTH));
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
}
