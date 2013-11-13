package com.mikalai.soap;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/**
 * @author Mikalai Kisel
 */
public class IpLocationFinder {

    public static void main(String [] args) {

        if (args.length!=1) {
            System.out.println("You need to enter ip address");
        } else {
            String ipAddress = args[0];
            GeoIPService geoIPService = new GeoIPService();
            GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
            GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
            System.out.println(geoIP.getCountryName());
        }

    }
}
