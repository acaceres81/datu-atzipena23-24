package dambi.unmarshall;

import java.io.File;

import dambi.business.Countries;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class UnMarshalJAXVBCompleteExample {

    public static void main( String[] args )
    {

        try
        {

            File file = new File( "countries.xml" );
            JAXBContext jaxbContext = JAXBContext.newInstance( Countries.class );

            /**
             * the only difference with the marshaling operation is here
             */
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Countries countres = (Countries)jaxbUnmarshaller.unmarshal( file );
            System.out.println( countres );

        }
        catch( JAXBException e )
        {
            e.printStackTrace();
        }

    }
    
}
