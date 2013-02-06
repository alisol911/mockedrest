package org.mock.resource;

import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response;

public interface ExtendedResource {
    public Response process(UriInfo uriInfo) throws Exception;
}
