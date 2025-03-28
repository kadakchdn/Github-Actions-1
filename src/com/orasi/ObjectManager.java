
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: www.facebook.com
    Add a description of www.facebook.com
    */
    /* Page: Facebook  log in or sign up 
    
    */

    

bC = new ByFactoryCollection("email", "32438.2784", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='text']", "AttributeRule", "32438.2786", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='text']", "AttributeRule", "32438.2788", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy']", "AttributeRule", "32438.2790", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy']", "AttributeRule", "32438.2792", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-email']", "AttributeRule", "32438.2794", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-email']", "AttributeRule", "32438.2796", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Email address or phone number']", "AttributeRule", "32438.2798", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Email address or phone number']", "AttributeRule", "32438.2800", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@autofocus='1']", "AttributeRule", "32438.2802", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autofocus='1']", "AttributeRule", "32438.2804", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Email address or phone number']", "AttributeRule", "32438.2806", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Email address or phone number']", "AttributeRule", "32438.2808", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"email\"]", "IDRule", "32438.2810", "" ) );
bC.add( new ByFactory( ById.class, "email", "IDRule", "32438.2812", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"email\"]", "IDRule", "32438.2814", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"email\"]", "NameRule", "32438.2816", "" ) );
bC.add( new ByFactory( ByName.class, "email", "NameRule", "32438.2818", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"email\"]", "NameRule", "32438.2820", "" ) );


objectMap.put( "32438.2784", bC );


bC = new ByFactoryCollection("pass", "32438.2824", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='password']", "AttributeRule", "32438.2826", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='password']", "AttributeRule", "32438.2828", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32438.2830", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32438.2832", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-pass']", "AttributeRule", "32438.2834", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-pass']", "AttributeRule", "32438.2836", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Password']", "AttributeRule", "32438.2838", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Password']", "AttributeRule", "32438.2840", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Password']", "AttributeRule", "32438.2842", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Password']", "AttributeRule", "32438.2844", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"pass\"]", "IDRule", "32438.2846", "" ) );
bC.add( new ByFactory( ById.class, "pass", "IDRule", "32438.2848", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"pass\"]", "IDRule", "32438.2850", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"pass\"]", "NameRule", "32438.2852", "" ) );
bC.add( new ByFactory( ByName.class, "pass", "NameRule", "32438.2854", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"pass\"]", "NameRule", "32438.2856", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32438.2858", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32438.2860", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32438.2862", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32438.2864", "" ) );


objectMap.put( "32438.2824", bC );




  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
