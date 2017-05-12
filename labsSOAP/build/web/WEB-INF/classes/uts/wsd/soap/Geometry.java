/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import uts.wsd.*;

/**
 *
 * @author 12545404
 */
@WebService(serviceName = "Geometry")
public class Geometry {

    @WebMethod
    public Rectangle getRectangleGeometry(double width, double height) {
        Rectangle rectangle = new Rectangle(width, height);
        return rectangle;
    }
    
    @WebMethod
    public Circle getCircleGeometry(double radius){
        Circle circle = new Circle(radius);
        return circle;  
    }
}
