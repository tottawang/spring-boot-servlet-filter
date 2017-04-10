package com.sample.conf;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

public class JerseyFilter implements ContainerRequestFilter {

  @Override
  public void filter(ContainerRequestContext requestContext) throws IOException {
    // TODO Auto-generated method stub
    System.out.println("Jersey filter is applied");
  }


}
