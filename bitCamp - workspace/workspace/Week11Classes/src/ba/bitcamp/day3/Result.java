package ba.bitcamp.day3;

import java.io.BufferedWriter;
import java.io.IOException;

public class Result {

	public static void ok(BufferedWriter writer, String content) throws IOException {
		response(writer, "200 OK", content);
	}

	public static void notFound(BufferedWriter writer) throws IOException {
		response(writer, "404 Not Found", "<h1>No Page</h1>");
	}

	public static void serverError(BufferedWriter writer) throws IOException {
		response(writer, "500 Internal Server Error", "<h1>Server error</h>");
	}
	
	public static void response(BufferedWriter writer, String respCode, String respContent) throws IOException {
		writer.write(String.format("HTTP/1.1 %s \n", respCode));
		writer.write("content-type: text/html\n");
		writer.newLine();
		writer.write(respContent);
		writer.flush();
	}

}
