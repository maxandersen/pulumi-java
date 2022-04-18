// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Represents configuration for a generic web service.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse Empty = new GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse();

    /**
     * Optional. Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification. This overrides the default SSL trust store. If this is empty or unspecified, Dialogflow will use Google's default trust store to verify certificates. N.B. Make sure the HTTPS server certificates are signed with "subject alt name". For instance a certificate can be self-signed using the following command, openssl x509 -req -days 200 -in example.com.csr \ -signkey example.com.key \ -out example.com.crt \ -extfile <(printf "\nsubjectAltName='DNS:www.example.com'")
     * 
     */
    @Import(name="allowedCaCerts", required=true)
      private final List<String> allowedCaCerts;

    public List<String> allowedCaCerts() {
        return this.allowedCaCerts;
    }

    /**
     * The password for HTTP Basic authentication.
     * 
     */
    @Import(name="password", required=true)
      private final String password;

    public String password() {
        return this.password;
    }

    /**
     * The HTTP request headers to send together with webhook requests.
     * 
     */
    @Import(name="requestHeaders", required=true)
      private final Map<String,String> requestHeaders;

    public Map<String,String> requestHeaders() {
        return this.requestHeaders;
    }

    /**
     * The webhook URI for receiving POST requests. It must use https protocol.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String uri() {
        return this.uri;
    }

    /**
     * The user name for HTTP Basic authentication.
     * 
     */
    @Import(name="username", required=true)
      private final String username;

    public String username() {
        return this.username;
    }

    public GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse(
        List<String> allowedCaCerts,
        String password,
        Map<String,String> requestHeaders,
        String uri,
        String username) {
        this.allowedCaCerts = Objects.requireNonNull(allowedCaCerts, "expected parameter 'allowedCaCerts' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.requestHeaders = Objects.requireNonNull(requestHeaders, "expected parameter 'requestHeaders' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse() {
        this.allowedCaCerts = List.of();
        this.password = null;
        this.requestHeaders = Map.of();
        this.uri = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedCaCerts;
        private String password;
        private Map<String,String> requestHeaders;
        private String uri;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCaCerts = defaults.allowedCaCerts;
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder allowedCaCerts(List<String> allowedCaCerts) {
            this.allowedCaCerts = Objects.requireNonNull(allowedCaCerts);
            return this;
        }
        public Builder allowedCaCerts(String... allowedCaCerts) {
            return allowedCaCerts(List.of(allowedCaCerts));
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
        }        public GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse build() {
            return new GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse(allowedCaCerts, password, requestHeaders, uri, username);
        }
    }
}
