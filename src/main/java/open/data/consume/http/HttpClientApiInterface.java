package open.data.consume.http;

import java.io.IOException;
import java.net.http.HttpResponse;

public interface HttpClientApiInterface {
    
    public HttpResponse<String> get(String uri) 
        throws IOException, InterruptedException;

}
