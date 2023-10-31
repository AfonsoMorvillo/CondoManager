package controller;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class AppConfig {

   private static String URL;
   private static String USER;
   private static String PASSWORD;

   private AppConfig() {

   }


   public static String getUrl() {

      verificaXml( URL );

      return URL;
   }


   public static String getUser() {

      verificaXml( USER );

      return USER;
   }


   public static String getPassword() {

      verificaXml( PASSWORD );

      return PASSWORD;
   }


   private static void verificaXml( String field ) {

      if( field == null ){
         readXml();
      }
   }


   private static void readXml() {

      File file = new File( "app-config.xml" );

      if( file.exists() ){

         try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse( file );
            doc.getDocumentElement().normalize();

            Element root = doc.getDocumentElement();
            Node node = root.getElementsByTagName( "database" ).item( 0 );

            URL = node.getAttributes().getNamedItem( "url" ).getNodeValue();
            USER = node.getAttributes().getNamedItem( "user" ).getNodeValue();
            PASSWORD = node.getAttributes().getNamedItem( "password" ).getNodeValue();
         }
         catch( Exception e ){
            e.printStackTrace();
         }
      }
   }

}
