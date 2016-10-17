package org.jboss.fuse.TEST_8_2_13_SWO_QUERY_PARAMETERS;

import org.apache.camel.Exchange;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;
import org.fusesource.camel.component.sap.model.rfc.Table;

public class CreateRequest {

	public void createRequest(Exchange exchange) throws Exception {

		SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext().getEndpoint("sap-srfc-destination:quickstartDest:SWO_QUERY_PARAMETERS", SapSynchronousRfcDestinationEndpoint.class);
		Structure request = endpoint.createRequest();
		
		request.put("OBJTYPE", "BUS1001");
		request.put("VERB", "AVAILABILITY");
		request.put("VERBTYPE", "M");
		request.put("TEXT", "X");
		request.put("LANGUAGE", "EN");

		exchange.getIn().setBody(request);
	}

}
