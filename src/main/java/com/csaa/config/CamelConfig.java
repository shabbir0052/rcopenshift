package com.csaa.config;

import org.apache.camel.CamelContext;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.springframework.context.annotation.Bean;
import org.apache.camel.spring.boot.CamelContextConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CamelConfig {
	  private static final Logger LOG = LoggerFactory
	    		.getLogger(com.csaa.config.CamelConfig.class);

	  @Autowired
	  CamelContext camelContext;
	
	@Value("${camel.springboot.name}")
	String contextPath;
	
	
	
    @Bean
    public JaxbDataFormat jaxb () {
  	JaxbDataFormat retrieveConvertedPolicy = new JaxbDataFormat();
  	retrieveConvertedPolicy.setContextPath(aaancnu_wsdl_retrieveconvertedpolicyinfo_version2.com.aaancnuit.RetrieveConvertedPolicyInfoRequest.class.getPackage().getName());
  	
  	return retrieveConvertedPolicy;
  }
    
	@Bean
	public com.csaa.processor.RequestProcessor requestProcessor(){
		com.csaa.processor.RequestProcessor requestProcessor = new com.csaa.processor.RequestProcessor();		
		return requestProcessor;
	}
	
	

	 @Bean
	  CamelContextConfiguration contextConfiguration() {
	    return new CamelContextConfiguration() {
	    	
	      public void beforeApplicationStart(CamelContext camelContext) {
	    	  camelContext.setTracing(false);// Initializing the camel 
	      }
		public void afterApplicationStart(CamelContext camelContext) {
 			 //noop
		}
	    };
	  }

}
