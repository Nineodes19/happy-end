package study6_17;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @program:test_6.17
 * @author:Nine_odes
 * @description:
 * @create:2020-06-17 22:27
 **/
public class Response {
    private String version = "HTTP/1.1";
    private int status;
    private String message;
    private Map<String,String> headers = new HashMap<>();
    private StringBuilder body = new StringBuilder();
    private OutputStream outputStream = null;
    public static Response build(OutputStream outputStream){
        Response response = new Response();
        response.outputStream = outputStream;
        return response;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void writeBody(String content){
        body.append(content);
    }

    public void setHeader(String key,String value){
        headers.put(key,value);
    }

    public void flush(){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write(version + " " + status + " " + message + "\n" );
            headers.put("Content-Length",body.toString().getBytes().length + "");
            for(HashMap.Entry<String,String> entry : headers.entrySet()){
                bufferedWriter.write(entry.getKey() + ":" +entry.getValue() + "\n");
            }
            bufferedWriter.write("\n");
            bufferedWriter.write(body.toString());
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}
