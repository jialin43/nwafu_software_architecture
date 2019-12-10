package server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloWS {
    @WebMethod
    public Double calcTax(Double income) {
        double result = 0;
        if(income>3500){
            result = (income-3500) *0.02;
        }
        return result;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/WS/CalcTax",new HelloWS());
        System.out.println("WebService发布成功！");
    }
}
