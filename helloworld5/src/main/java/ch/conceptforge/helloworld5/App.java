package ch.conceptforge.helloworld5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renob
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
public class App
{
private static Container c;
private static void dispalyText() {
System.out.println(c.getText());
}
private static void displayXml() {
XStream xs = new XStream(new DomDriver());
xs.alias("container", Container.class);
System.out.println(xs.toXML(c));
}
public static void main( String[] args )
{
c = new Container("Hello World!");
dispalyText();
displayXml();
}
}