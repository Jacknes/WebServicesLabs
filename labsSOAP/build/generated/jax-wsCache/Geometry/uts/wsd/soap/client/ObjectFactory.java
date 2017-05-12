
package uts.wsd.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uts.wsd.soap.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Circle_QNAME = new QName("http://soap.wsd.uts/", "circle");
    private final static QName _GetCircleGeometry_QNAME = new QName("http://soap.wsd.uts/", "getCircleGeometry");
    private final static QName _GetCircleGeometryResponse_QNAME = new QName("http://soap.wsd.uts/", "getCircleGeometryResponse");
    private final static QName _GetRectangleGeometry_QNAME = new QName("http://soap.wsd.uts/", "getRectangleGeometry");
    private final static QName _GetRectangleGeometryResponse_QNAME = new QName("http://soap.wsd.uts/", "getRectangleGeometryResponse");
    private final static QName _Rectangle_QNAME = new QName("http://soap.wsd.uts/", "rectangle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uts.wsd.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Circle }
     * 
     */
    public Circle createCircle() {
        return new Circle();
    }

    /**
     * Create an instance of {@link GetCircleGeometry }
     * 
     */
    public GetCircleGeometry createGetCircleGeometry() {
        return new GetCircleGeometry();
    }

    /**
     * Create an instance of {@link GetCircleGeometryResponse }
     * 
     */
    public GetCircleGeometryResponse createGetCircleGeometryResponse() {
        return new GetCircleGeometryResponse();
    }

    /**
     * Create an instance of {@link GetRectangleGeometry }
     * 
     */
    public GetRectangleGeometry createGetRectangleGeometry() {
        return new GetRectangleGeometry();
    }

    /**
     * Create an instance of {@link GetRectangleGeometryResponse }
     * 
     */
    public GetRectangleGeometryResponse createGetRectangleGeometryResponse() {
        return new GetRectangleGeometryResponse();
    }

    /**
     * Create an instance of {@link Rectangle }
     * 
     */
    public Rectangle createRectangle() {
        return new Rectangle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Circle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "circle")
    public JAXBElement<Circle> createCircle(Circle value) {
        return new JAXBElement<Circle>(_Circle_QNAME, Circle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCircleGeometry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "getCircleGeometry")
    public JAXBElement<GetCircleGeometry> createGetCircleGeometry(GetCircleGeometry value) {
        return new JAXBElement<GetCircleGeometry>(_GetCircleGeometry_QNAME, GetCircleGeometry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCircleGeometryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "getCircleGeometryResponse")
    public JAXBElement<GetCircleGeometryResponse> createGetCircleGeometryResponse(GetCircleGeometryResponse value) {
        return new JAXBElement<GetCircleGeometryResponse>(_GetCircleGeometryResponse_QNAME, GetCircleGeometryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRectangleGeometry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "getRectangleGeometry")
    public JAXBElement<GetRectangleGeometry> createGetRectangleGeometry(GetRectangleGeometry value) {
        return new JAXBElement<GetRectangleGeometry>(_GetRectangleGeometry_QNAME, GetRectangleGeometry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRectangleGeometryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "getRectangleGeometryResponse")
    public JAXBElement<GetRectangleGeometryResponse> createGetRectangleGeometryResponse(GetRectangleGeometryResponse value) {
        return new JAXBElement<GetRectangleGeometryResponse>(_GetRectangleGeometryResponse_QNAME, GetRectangleGeometryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rectangle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "rectangle")
    public JAXBElement<Rectangle> createRectangle(Rectangle value) {
        return new JAXBElement<Rectangle>(_Rectangle_QNAME, Rectangle.class, null, value);
    }

}
