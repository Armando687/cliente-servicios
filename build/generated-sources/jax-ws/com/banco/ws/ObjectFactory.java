
package com.banco.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.banco.ws package. 
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

    private final static QName _SetCotizacion_QNAME = new QName("http://ws.banco.com/", "setCotizacion");
    private final static QName _GetCotizacion_QNAME = new QName("http://ws.banco.com/", "getCotizacion");
    private final static QName _GetCotizacionResponse_QNAME = new QName("http://ws.banco.com/", "getCotizacionResponse");
    private final static QName _SetCotizacionResponse_QNAME = new QName("http://ws.banco.com/", "setCotizacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.banco.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetCotizacionResponse }
     * 
     */
    public SetCotizacionResponse createSetCotizacionResponse() {
        return new SetCotizacionResponse();
    }

    /**
     * Create an instance of {@link GetCotizacionResponse }
     * 
     */
    public GetCotizacionResponse createGetCotizacionResponse() {
        return new GetCotizacionResponse();
    }

    /**
     * Create an instance of {@link SetCotizacion }
     * 
     */
    public SetCotizacion createSetCotizacion() {
        return new SetCotizacion();
    }

    /**
     * Create an instance of {@link GetCotizacion }
     * 
     */
    public GetCotizacion createGetCotizacion() {
        return new GetCotizacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCotizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.banco.com/", name = "setCotizacion")
    public JAXBElement<SetCotizacion> createSetCotizacion(SetCotizacion value) {
        return new JAXBElement<SetCotizacion>(_SetCotizacion_QNAME, SetCotizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCotizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.banco.com/", name = "getCotizacion")
    public JAXBElement<GetCotizacion> createGetCotizacion(GetCotizacion value) {
        return new JAXBElement<GetCotizacion>(_GetCotizacion_QNAME, GetCotizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCotizacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.banco.com/", name = "getCotizacionResponse")
    public JAXBElement<GetCotizacionResponse> createGetCotizacionResponse(GetCotizacionResponse value) {
        return new JAXBElement<GetCotizacionResponse>(_GetCotizacionResponse_QNAME, GetCotizacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCotizacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.banco.com/", name = "setCotizacionResponse")
    public JAXBElement<SetCotizacionResponse> createSetCotizacionResponse(SetCotizacionResponse value) {
        return new JAXBElement<SetCotizacionResponse>(_SetCotizacionResponse_QNAME, SetCotizacionResponse.class, null, value);
    }

}
