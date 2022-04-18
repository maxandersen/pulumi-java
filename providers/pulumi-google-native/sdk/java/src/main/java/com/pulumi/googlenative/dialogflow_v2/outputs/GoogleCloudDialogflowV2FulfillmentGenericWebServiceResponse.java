// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse {
    /**
     * Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. is_cloud_function is deprecated. Cloud functions can be configured by its uri as a regular web service now.
     * 
     */
    private final Boolean isCloudFunction;
    /**
     * Optional. The password for HTTP Basic authentication.
     * 
     */
    private final String password;
    /**
     * Optional. The HTTP request headers to send together with fulfillment requests.
     * 
     */
    private final Map<String,String> requestHeaders;
    /**
     * The fulfillment URI for receiving POST requests. It must use https protocol.
     * 
     */
    private final String uri;
    /**
     * Optional. The user name for HTTP Basic authentication.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse(
        @CustomType.Parameter("isCloudFunction") Boolean isCloudFunction,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("requestHeaders") Map<String,String> requestHeaders,
        @CustomType.Parameter("uri") String uri,
        @CustomType.Parameter("username") String username) {
        this.isCloudFunction = isCloudFunction;
        this.password = password;
        this.requestHeaders = requestHeaders;
        this.uri = uri;
        this.username = username;
    }

    /**
     * Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. is_cloud_function is deprecated. Cloud functions can be configured by its uri as a regular web service now.
     * 
    */
    public Boolean isCloudFunction() {
        return this.isCloudFunction;
    }
    /**
     * Optional. The password for HTTP Basic authentication.
     * 
    */
    public String password() {
        return this.password;
    }
    /**
     * Optional. The HTTP request headers to send together with fulfillment requests.
     * 
    */
    public Map<String,String> requestHeaders() {
        return this.requestHeaders;
    }
    /**
     * The fulfillment URI for receiving POST requests. It must use https protocol.
     * 
    */
    public String uri() {
        return this.uri;
    }
    /**
     * Optional. The user name for HTTP Basic authentication.
     * 
    */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isCloudFunction;
        private String password;
        private Map<String,String> requestHeaders;
        private String uri;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCloudFunction = defaults.isCloudFunction;
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder isCloudFunction(Boolean isCloudFunction) {
            this.isCloudFunction = Objects.requireNonNull(isCloudFunction);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder requestHeaders(Map<String,String> requestHeaders) {
            this.requestHeaders = Objects.requireNonNull(requestHeaders);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse build() {
            return new GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse(isCloudFunction, password, requestHeaders, uri, username);
        }
    }
}
