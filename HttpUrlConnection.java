import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public abstract class HttpUrlConnection extends URLConnection{
	
	
	protected HttpUrlConnection(URL url) {
		super(url);
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter URL:");
		String newUrl = input.nextLine();
		// This is the url that the program will connect to.
		String output = getUrlContents(newUrl);
		
		//This will allow it to print the html file for the url. This is the real output.
		System.out.println(output);
		
	}
	
	private static String getUrlContents(String theUrl) throws IOException {
		
		// This is the try or catch statement to catch any exceptions being thrown. 
		StringBuilder content = new StringBuilder();

		URL url = new URL("http://www.android.com/");
		try {
			url = new URL("http://www.android.com/");
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		try {
			urlConnection = (HttpURLConnection) url.openConnection();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		try {
			urlConnection = (HttpURLConnection) url.openConnection();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			try {
				InputStream in = new BufferedInputStream(urlConnection.getInputStream());
			} catch (IOException e3) {
				e3.printStackTrace();
			}
  
		} finally {
			urlConnection.disconnect();
		}
		return theUrl;


		
	}}
