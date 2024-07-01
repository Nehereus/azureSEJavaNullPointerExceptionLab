package org.example.functions;

import com.microsoft.azure.functions.*;

import java.net.URI;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

public class PlainJavaRunner {

    public static void main(String[] args) {
        HttpTriggerJava httpTriggerJava = new HttpTriggerJava();
        httpTriggerJava.run(
            new HttpRequestMessage<Optional<String>>() {
                @Override
                public URI getUri() {
                    return null;
                }

                @Override
                public HttpMethod getHttpMethod() {
                    return null;
                }

                @Override
                public Map<String, String> getHeaders() {
                    return Collections.emptyMap();
                }

                @Override
                public Map<String, String> getQueryParameters() {
                    return Collections.emptyMap();
                }

                @Override
                public Optional<String> getBody() {
                    return Optional.empty();
                }

                @Override
                public HttpResponseMessage.Builder createResponseBuilder(HttpStatus httpStatus) {
                    return null;
                }

                @Override
                public HttpResponseMessage.Builder createResponseBuilder(HttpStatusType httpStatusType) {
                    return null;
                }
            },
            new ExecutionContext() {
                @Override
                public Logger getLogger() {
                    return null;
                }

                @Override
                public String getInvocationId() {
                    return "";
                }

                @Override
                public String getFunctionName() {
                    return "";
                }
            }
        );
    }
}
