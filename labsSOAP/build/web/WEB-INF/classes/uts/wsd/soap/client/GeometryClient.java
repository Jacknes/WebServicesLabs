/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap.client;

/**
 *
 * @author 12545404
 */
public class GeometryClient {
    public static void main(String[] args) {
        Geometry_Service locator = new Geometry_Service();
        Geometry geometry = locator.getGeometryPort();
        
        Circle circle = geometry.getCircleGeometry(4.0);
        Rectangle rectangle = geometry.getRectangleGeometry(4.0, 5.0);
        System.out.println("Circle radius is " + circle.getRadius());
        System.out.println("Circle area is " + circle.getArea());
        System.out.println("Circle diameter is " + circle.getDiameter());
        System.out.println("Circle circumference is " + circle.getCircumference());
        
        System.out.println("Rectangle width is " + rectangle.getWidth());
        System.out.println("Rectangle height is " + rectangle.getHeight());
        System.out.println("Rectangle area is " + rectangle.getArea());
        System.out.println("Rectangle perimeter is " + rectangle.getPerimeter());
        
        
        //Circle radius is 4.0
        //Circle area is 50.26548245743669
        //Circle diameter is 8.0
        //Circle circumference is 25.132741228718345
        //Rectangle width is 4.0
        //Rectangle height is 5.0
        //Rectangle area is 20.0
        //Rectangle perimeter is 18.0
        
        
    }
}
