/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author huan.buivan
 */
public class NumberExtraction {

//    public static String currencyFormat(String countryCode, double val) {
//        String stringVal = val + "";
//        StringBuilder sb = new StringBuilder();
//        boolean isDot = false;
//        if (stringVal.contains(".") || stringVal.contains(",")) {
//            int position;
//            if (stringVal.contains(".")) {
//                isDot = true;
//                position = stringVal.lastIndexOf(".");
//                sb.append(stringVal.substring(position, stringVal.length()));
//
//            } else {
//                position = stringVal.lastIndexOf(",");
//                sb.append(stringVal.substring(position, stringVal.length()));
//            }
//            stringVal = stringVal.substring(0, position - 1);
//        }
//        int strLen = stringVal.length();
//        while (strLen >= 3) {
//            sb.append(stringVal.substring(strLen - 3, strLen));
//            strLen -= 3;
//            sb.append(isDot ? "." : ",");
//        }
//        sb.append(stringVal.subSequence(0, strLen),0,1);
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(currencyFormat("VN", (double)10000));
//    }
    public static int paramToInteger(HttpServletRequest request, String paramName)
            throws NumberFormatException {
        return Integer.parseInt(request.getParameter(paramName));
    }
}
