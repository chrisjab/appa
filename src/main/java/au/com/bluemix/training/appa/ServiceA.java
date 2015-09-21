package au.com.bluemix.training.appa;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService(serviceName = "ServiceAService", portName = "ServiceAPort", endpointInterface = "au.com.bluemix.training.appa.IServiceA", targetNamespace = "http://appa/ServiceA")


public class ServiceA implements IServiceA {

	@Override
	public int plus(int left, int right) {
		// TODO Auto-generated method stub
		
		return left+right;
	}

}
