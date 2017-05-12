package uts.wsd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 
import javax.xml.bind.annotation.*;
import javax.swing.JOptionPane;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Circle {
 private double radius;
 private double circumference;
 private double diameter;
 private double area;
 
 public Circle() {
  super();
 }
 
 public Circle(double radius) {
  super();
  this.radius = radius;
  this. circumference = getCircumference();
  this.diameter = getDiameter();
  this.area = getArea();
 }
 

 
 @XmlElement
 public double getArea() {
     
     // Math.PI * Math.pow(radius, 3);
  return  Math.PI * Math.pow(radius, 2);
 }
 
 @XmlElement
 public double getCircumference() {
  return 2 * Math.PI * radius;
 }
 
 @XmlElement
 public double getRadius() {
  return radius;
 }
 
 @XmlElement
 public double getDiameter() {
     return radius * 2;
 }
 
 public void setRadius(double radius) {
  this.radius = radius;
 }
 
 
 
}