package restaurante;

import java.util.*;

/**
 * 
 */
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.security.Policy.Parameters;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.util.ArrayList;
import javax.xml.transform.TransformerConfigurationException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import restaurante.Platillo;
/**
 * Clase encargada de formar el archivo XML
 * @author carlos
 */
public class XmlParser {
    public static String xmlFilePath="D:\\Universidad\\RestaurantePOO\\XML\\XML.xml";
    /**
     * Método encargado de crear un XML desde cero a partir de un ArrayList de platillos
     * @param Platillos
     * @throws ParserConfigurationException
     */
    public static void  CrearXML(ArrayList <Platillo> Platillos) 
    {
        System.out.println(Platillos.size());
        try
        {
            
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();
            
            Element root = document.createElement("PlatillosRestaurante");
            
            document.appendChild(root);
            
            for (Platillo comida:Platillos) 
            {
                Element MenuItem=document.createElement("Platillo");
                Element nomb=document.createElement("Nombre");
                nomb.appendChild(document.createTextNode(comida.getNombre()));
                MenuItem.appendChild(nomb);
                Element cod=document.createElement("Codigo");
                cod.appendChild(document.createTextNode(comida.getCodigo()));
                MenuItem.appendChild(cod);
                Element desc=document.createElement("Descripcion");
                desc.appendChild(document.createTextNode(comida.getDescripcion()));
                MenuItem.appendChild(desc);
                Element Rac=document.createElement("Racion");
                Rac.appendChild(document.createTextNode(Integer.toString(comida.getRacion())));
                MenuItem.appendChild(Rac);
                Element Cal=document.createElement("Calorias");
                Cal.appendChild(document.createTextNode(Float.toString(comida.getCalorias())));
                MenuItem.appendChild(Cal);
                Element Pre=document.createElement("Precio");
                Pre.appendChild(document.createTextNode(Integer.toString(comida.getPrecio())));
                MenuItem.appendChild(Pre);
                root.appendChild(MenuItem);

          }
          TransformerFactory transformerFactory = TransformerFactory.newInstance();
          Transformer transformer = transformerFactory.newTransformer();
          DOMSource domSource = new DOMSource(document);
          StreamResult streamResult = new StreamResult(new File(xmlFilePath));
          transformer.transform(domSource, streamResult);
       }
        catch (ParserConfigurationException pce)
        {
            pce.printStackTrace();
        }  
        catch (TransformerException tfe) 
        {
            tfe.printStackTrace();
        }
    }          
    /**
     * Encargado de agregar un Platillo a un XML ya existente
     * @param comida
     * @throws ParserConfigurationException
     * @throws TransformerConfigurationException
     * @throws TransformerException
     * @throws IOException
     * @throws SAXException 
     */
    public static void ActualizarXML(Platillo comida) throws ParserConfigurationException, TransformerConfigurationException, TransformerException, IOException, SAXException {
        String xmlFilePath="..\\RestaurantePOO\\XML";
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(xmlFilePath);
        Element root = document.getDocumentElement();

        Element MenuItem=document.createElement("Platillo");
        Attr nomb=document.createAttribute("Nombre");
        nomb.setNodeValue(comida.getNombre());
        MenuItem.setAttributeNode(nomb);
        Element cod=document.createElement("Codigo");
        cod.appendChild(document.createTextNode(comida.getCodigo()));
        MenuItem.appendChild(cod);
        Element desc=document.createElement("Descripcion");
        desc.appendChild(document.createTextNode(comida.getDescripcion()));
        MenuItem.appendChild(desc);
        Element Rac=document.createElement("Racion");
        Rac.appendChild(document.createTextNode(Integer.toString(comida.getRacion())));
        MenuItem.appendChild(Rac);
        Element Cal=document.createElement("Calorias");
        Cal.appendChild(document.createTextNode(Float.toString(comida.getCalorias())));
        MenuItem.appendChild(Cal);
        Element Pre=document.createElement("Precio");
        Pre.appendChild(document.createTextNode(Integer.toString(comida.getPrecio())));
        MenuItem.appendChild(Pre);
        root.appendChild(MenuItem);
        DOMSource source = new DOMSource(document);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        StreamResult result = new StreamResult(xmlFilePath);
        transformer.transform(source, result);
    }

    /**
     *Método encargado de cargar platillos desde el xml a el restaurante
     * @param PlatillosRestaurante
     * @param redipicsa 
     */
    public static void CargarXML(ArrayList<Platillo> PlatillosRestaurante,Restaurante redipicsa) {      
        try {
            File inputFile = new File(xmlFilePath);
                            System.out.println("asduhgvkasdbjklnfl");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Platillo");
            
            for (int temp = 0; temp < nList.getLength(); temp++) {
               Node nNode = nList.item(temp);
               if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                redipicsa.AgregarPlatillo(eElement.getElementsByTagName("Codigo").item(0).getTextContent()
                ,eElement.getElementsByTagName("Descripcion").item(0).getTextContent(),
                Integer.parseInt(eElement.getElementsByTagName("Racion").item(0).getTextContent()),
                Float.parseFloat(eElement.getElementsByTagName("Calorias").item(0).getTextContent()),
                Integer.parseInt(eElement.getElementsByTagName("Precio").item(0).getTextContent()),
                eElement.getElementsByTagName("Nombre").item(0).getTextContent());
               }
               
                 
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
    }
   
        
    


