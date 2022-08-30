package open.data.consume.http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.InvalidParameterException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class HttpClientApi implements HttpClientApiInterface{

    private String urn = "https://dadosabertos.camara.leg.br/api/v2";

    public HttpResponse<String> get(String uri)
            throws IOException, InterruptedException {

        HttpRequest httpRequest = this.getRequester(this.urn + uri);

        return this.getResponseFrom(httpRequest);

    }

    private HttpResponse<String> getResponseFrom(HttpRequest request)
            throws IOException, InterruptedException {
        return HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
    }

    private HttpRequest getRequester(String route) {
        return HttpRequest.newBuilder(this.verifyUri(route))
                .timeout(Duration.of(5, ChronoUnit.SECONDS))
                .GET()
                .build();
        
    }

    private URI verifyUri(String route) {
        URI uri = null;

        try {

           uri = new URI(route);

        } catch (URISyntaxException e) {

            throw new InvalidParameterException("URI ingformada não é valida");

        }

        return uri;
    }

    
}
