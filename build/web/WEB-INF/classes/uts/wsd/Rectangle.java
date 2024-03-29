/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12545404
 */
package uts.wsd;
 
import javax.xml.bind.annotation.*;
 
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Rectangle {
 private double width;
 private double height;
 
 public Rectangle() {
  super();
 }
 
 public Rectangle(double width, double height) {
  super();
  this.width = width;
  this.height = height;
 }
 
 @XmlElement
 public double getWidth() {
  return width;
 }
 
 public void setWidth(double width) {
  this.width = width;
 }
 
 @XmlElement
 public double getHeight() {
  return height;
 }
 
 public void setHeight(double height) {
  this.height = height;
 }
 
 @XmlElement
 public double getArea() {
  return width * height;
 }
 
 @XmlElement
 public double getPerimeter() {
  return 2 * (width + height);
 }
}