/**
 * 
 */
package org.sonatype.mavenbook.weather;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;

/**
 * @author fansy
 * @date 2015-5-26
 */
public class YahooRetriever {
	private static Logger log = Logger.getLogger(YahooRetriever.class);

	public InputStream retrieve(int zipcode) throws Exception {
		log.info("Retrieving Weather Data");
		String url = "http://weather.yahooapis.com/forecastrss?p=" + zipcode;
		URLConnection conn = new URL(url).openConnection();
		return conn.getInputStream();
	}
}
