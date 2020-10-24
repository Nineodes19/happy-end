import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @program:test_10.24
 * @author:Nine_odes
 * @description:
 * @create:2020-10-24 23:07
 **/
public class Request {
    private String method;
    private String uri;
    private String version;
    private Map<String,String> headers = new HashMap<>();
    private Map<String,String> parameters = new HashMap<>();

    private static final String CHARSET = "UTF-8";
    private Request(){

    }
    public static Request build(InputStream is) throws IOException {
        Request request = new Request();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is,CHARSET));
        String[] requestLineArray = reader.readLine().split(" ");
        request.setMethod(requestLineArray[0]);
        request.setUri(requestLineArray[1]);
        request.setVersion(requestLineArray[2]);

        String requestHeader;
        while((requestHeader = reader.readLine()) != null && requestHeader.length() != 0){
            String[] headerArray = requestHeader.split(":");
            request.addHeader(headerArray[0].trim(),headerArray[1].trim());
        }
        return request;
    }

    public void addHeader(String key,String value){
        headers.put(key,value);
    }
    public void addParameter(String key,String value){
        parameters.put(key,value);
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "method='" + method + '\'' +
                ", uri='" + uri + '\'' +
                ", version='" + version + '\'' +
                ", headers=" + headers +
                ", parameters=" + parameters +
                '}';
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }
}
