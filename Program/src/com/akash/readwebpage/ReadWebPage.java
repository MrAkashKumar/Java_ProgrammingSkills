package com.akash.readwebpage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadWebPage {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.youtube.com");
			BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputline;
			
			while((inputline = input.readLine()) != null) {
				System.out.println(inputline);
			}
			input.close();
		}catch(MalformedURLException e) {
			System.out.println(e);
		}catch(IOException ex) {
			System.out.println(ex);
		}

	}

}
