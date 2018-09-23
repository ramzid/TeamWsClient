
package teamC;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the teamC package. 
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

    private final static QName _GeTeam_QNAME = new QName("http://TeamWsServer.ws.training/", "geTeam");
    private final static QName _GeTeamsResponse_QNAME = new QName("http://TeamWsServer.ws.training/", "geTeamsResponse");
    private final static QName _GeTeams_QNAME = new QName("http://TeamWsServer.ws.training/", "geTeams");
    private final static QName _GeTeamResponse_QNAME = new QName("http://TeamWsServer.ws.training/", "geTeamResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: teamC
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeTeam }
     * 
     */
    public GeTeam createGeTeam() {
        return new GeTeam();
    }

    /**
     * Create an instance of {@link GeTeamsResponse }
     * 
     */
    public GeTeamsResponse createGeTeamsResponse() {
        return new GeTeamsResponse();
    }

    /**
     * Create an instance of {@link GeTeams }
     * 
     */
    public GeTeams createGeTeams() {
        return new GeTeams();
    }

    /**
     * Create an instance of {@link GeTeamResponse }
     * 
     */
    public GeTeamResponse createGeTeamResponse() {
        return new GeTeamResponse();
    }

    /**
     * Create an instance of {@link Team }
     * 
     */
    public Team createTeam() {
        return new Team();
    }

    /**
     * Create an instance of {@link Player }
     * 
     */
    public Player createPlayer() {
        return new Player();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeTeam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TeamWsServer.ws.training/", name = "geTeam")
    public JAXBElement<GeTeam> createGeTeam(GeTeam value) {
        return new JAXBElement<GeTeam>(_GeTeam_QNAME, GeTeam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeTeamsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TeamWsServer.ws.training/", name = "geTeamsResponse")
    public JAXBElement<GeTeamsResponse> createGeTeamsResponse(GeTeamsResponse value) {
        return new JAXBElement<GeTeamsResponse>(_GeTeamsResponse_QNAME, GeTeamsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeTeams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TeamWsServer.ws.training/", name = "geTeams")
    public JAXBElement<GeTeams> createGeTeams(GeTeams value) {
        return new JAXBElement<GeTeams>(_GeTeams_QNAME, GeTeams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeTeamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TeamWsServer.ws.training/", name = "geTeamResponse")
    public JAXBElement<GeTeamResponse> createGeTeamResponse(GeTeamResponse value) {
        return new JAXBElement<GeTeamResponse>(_GeTeamResponse_QNAME, GeTeamResponse.class, null, value);
    }

}
