package pkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class GetRequest {
	
	public static void main(String args[]) throws IOException
	{
		URL url = new URL("http://cdldevretapp19:800/PlanVesting/api/v1/Vesting");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("PlanNumber", "000004");
				conn.setRequestProperty("Authorization", "Bearer ZXlKaGJHY2lPaUpTVXpJMU5pSXNJblI1Y0NJNklrcFhWQ0o5LmV5SnpZMjl3WlNJNld5SlNVelF3TVdzdlVHeGhiaTlXWlhOMGFXNW5JbDBzSW1WNGNDSTZNVFUwT1RrM01qTTRNU3dpYW5ScElqb2lObU0wWkdSaVlXSXRORGN6TmkwME56RTNMVGcyWWpndE1tUmxPR00wT1dNeE1HUmxJaXdpWTJ4cFpXNTBYMmxrSWpvaU5XUXhOekJoWXprdFkyUTJOaTAwTVRWbUxUZ3pNMkV0TmpjM05qUXpNRGszT1RJNEluMC5hWFBEdWVXaU9ncHVNSzlyMkRHSXRnQlIxSHV6THZHYTc4OC05T28zeVdDY0c5cHRITjd6VWZKVm1yV0lMV1pXcFJDb1RBdzNObm9PYVFXYVJnTzVBTDU3ZWliQ0VicE93ZzZXcG01ODFtV1hZZFR2MG5XNlJFTjRWU2lRMkNmN3hLNW8yRFA5Ym9uUjRvOGw1Xzhrb2lKY2kzZ3hoRGVxRTNxUTVYOGEtZ1RSZ3ZhbnNZNG1HZmVGUjhfNDY2S2hWak8tOWFQR3hEbXdIdEt4M0k2QVl3ZFNUU0hNaDZndkFNSVZNNWVNZlUzdzg0WTZDdVktdklnUFRpWlQ5N3BXWkVaNXVsakZpXzMxM1NzV0hOLUtwTk9uV2F3TTVsZ2ZIdnp1bjk4dWRYb1BrZ01jRU9wVk94Q0F0UGE5dE1uQW9idHFVSWVQLWFENzJpSVNkWU16ZlE=");
				conn.setRequestProperty("Accept", "application/json");
				
				System.out.println(conn.getResponseCode());
				System.out.println(conn.getResponseMessage());
				
				
				
				if (conn.getResponseCode() != 200) {
				throw new RuntimeException(" HTTP error code : "
				+ conn.getResponseCode());
				}
				
				
			/*	Scanner scan = new Scanner(url.openStream());
				String entireResponse = new String();
				while (scan.hasNext())
				entireResponse += scan.nextLine();
				System.out.println("Response : "+entireResponse);
				scan.close();
				*/
	}

}
