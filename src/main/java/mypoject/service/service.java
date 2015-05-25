package mypoject.service;

import mypoject.wsdl.globalweather.GetCitiesByCountry;
import mypoject.wsdl.globalweather.GetCitiesByCountryResponse;
import mypoject.wsdl.globalweather.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * Created by Student on 5/25/2015.
 */



    @Service
    public class service {
        @Autowired
        private WebServiceTemplate webServiceTemplate;

        public String GetCitiesByCountry(String  country) {
            GetCitiesByCountry conversionRate = new ObjectFactory().createGetCitiesByCountry();
            conversionRate.setCountryName(country);
            GetCitiesByCountryResponse response = (GetCitiesByCountryResponse) webServiceTemplate.marshalSendAndReceive(conversionRate);

            return response.getGetCitiesByCountryResult();
        }
    }




