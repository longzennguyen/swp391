/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Admin
 */
public class NumberExtraction {

    public static int paramToInteger(HttpServletRequest request, String paramName)
            throws NumberFormatException {
        return Integer.parseInt(request.getParameter(paramName));
    }
}
