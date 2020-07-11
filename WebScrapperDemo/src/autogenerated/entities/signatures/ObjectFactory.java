
package autogenerated.entities.signatures;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the autogenerated.entities.signatures package. 
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

    private final static QName _Signatures_QNAME = new QName("http://xml.netbeans.org/schema/signatures", "signatures");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: autogenerated.entities.signatures
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Signatures }
     * 
     */
    public Signatures createSignatures() {
        return new Signatures();
    }

    /**
     * Create an instance of {@link IEMS }
     * 
     */
    public IEMS createIEMS() {
        return new IEMS();
    }

    /**
     * Create an instance of {@link Headphones }
     * 
     */
    public Headphones createHeadphones() {
        return new Headphones();
    }

    /**
     * Create an instance of {@link Signature }
     * 
     */
    public Signature createSignature() {
        return new Signature();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Signatures }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/signatures", name = "signatures")
    public JAXBElement<Signatures> createSignatures(Signatures value) {
        return new JAXBElement<Signatures>(_Signatures_QNAME, Signatures.class, null, value);
    }

}
