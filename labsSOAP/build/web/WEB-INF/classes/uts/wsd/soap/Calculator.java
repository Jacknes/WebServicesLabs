/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author 12545404
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    @WebMethod
    public int add(int a, int b) {
        return a + b;
    }

    @WebMethod
    public int sub(int a, int b) {
        return a - b;
    }

    @WebMethod
    public int mul(int a, int b) {
        return a * b;
    }

    @WebMethod
    public int div(int a, int b) {
        return a / b;
    }
}
