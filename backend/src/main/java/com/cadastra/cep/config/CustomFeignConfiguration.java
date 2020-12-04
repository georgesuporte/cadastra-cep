package com.cadastra.cep.config;


import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.ssl.SSLContexts;
import org.springframework.context.annotation.Bean;

import feign.Client;


public class CustomFeignConfiguration {

    @Bean
    public Client feignClient() {
      return new Client.Default(getSSLSocketFactory(), new NoopHostnameVerifier());
    }
    
    private SSLSocketFactory getSSLSocketFactory() {
      try {
        SSLContext sslBuilder = SSLContexts.custom().loadTrustMaterial(null, new TrustSelfSignedStrategy(){
          @Override
          public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
              return true;
          }
        }).build();
        return sslBuilder.getSocketFactory();
      } catch (Exception e) {
        //
      }
	    return null;
    }
    
}