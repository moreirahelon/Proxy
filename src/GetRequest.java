void GetRequest() {
	try {
		String message;
		
		while ((message = is.readLine()) != null) {
			if (message.equals(""))
				break; // end of command block
			System.err.println(message);
			StringTokenizer t = new StringTokenizer(message);
			String token = t.nextToken(); // get first token
			if (token.equals("GET")) // if token is ”GET”
				resource = t.nextToken(); // get second token
		}
	} catch (IOException e) {
		System.err.println("Error receiving Web request");
	}
}