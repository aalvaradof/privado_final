package urjc.isi.pruebasSparkJava;

import static spark.Spark.*;

import spark.Request;
import spark.Response;

import java.net.URISyntaxException;

public class Main {


    public static String infoPost(Request request, Response response) throws ClassNotFoundException, URISyntaxException {
        String result = new String("TODA LA INFORMACIÓN QUE QUIERAS SOBRE PELÍCULAS A TRAVÉS DE UN POST");

        return result;

    }

    public static String infoGet(Request request, Response response) throws ClassNotFoundException, URISyntaxException {
        String result = new String("TODA LA INFORMACIÓN QUE QUIERAS SOBRE PELÍCULAS A TRAVÉS DE UN GET");

        return result;

    }

    public static String doWork(Request request, Response response) throws ClassNotFoundException, URISyntaxException {
	String result = new String("Hello World");

	return result;
    }


    public static void main(String[] args) throws ClassNotFoundException {
        port(getHerokuAssignedPort());

	String home = "<html><body>" +
	"<h1>Bienvenidos a la web de películas</h1>" +
		"<form action='/info' method='post'>" +
			"<div class='button'>" +
				"Ir a info: <br/>" +
				"<button type='submit'>Información</button>" +
			"</div>" +
		"</form></br>"+
                "<form action='/hello' method='get'>" +
                        "<div class='button'>" +
                                "Ir a helloWorld: <br/>" +
                                "<button type='submit'>Hello</button>" +
                        "</div>" +
		"</form>" +
	"</body></html>";

        // spark server
        get("/", (req, res) -> home);
        get("/info", Main::infoGet);
        get("/hello", Main::doWork);

	post("/info", Main::infoPost);

    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
