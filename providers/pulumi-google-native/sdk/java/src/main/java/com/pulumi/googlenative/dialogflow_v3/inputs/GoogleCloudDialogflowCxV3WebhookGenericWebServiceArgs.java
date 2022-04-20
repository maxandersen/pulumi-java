// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents configuration for a generic web service.
 * 
 */
public final class GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs Empty = new GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs();

    /**
     * Optional. Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification. This overrides the default SSL trust store. If this is empty or unspecified, Dialogflow will use Google&#39;s default trust store to verify certificates. N.B. Make sure the HTTPS server certificates are signed with &#34;subject alt name&#34;. For instance a certificate can be self-signed using the following command, openssl x509 -req -days 200 -in example.com.csr \ -signkey example.com.key \ -out example.com.crt \ -extfile &lt;(printf &#34;\nsubjectAltName=&#39;DNS:www.example.com&#39;&#34;)
     * 
     */
    @Import(name="allowedCaCerts")
      private final @Nullable Output<List<String>> allowedCaCerts;

    public Output<List<String>> allowedCaCerts() {
        return this.allowedCaCerts == null ? Codegen.empty() : this.allowedCaCerts;
    }

    /**
     * The password for HTTP Basic authentication.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The HTTP request headers to send together with webhook requests.
     * 
     */
    @Import(name="requestHeaders")
      private final @Nullable Output<Map<String,String>> requestHeaders;

    public Output<Map<String,String>> requestHeaders() {
        return this.requestHeaders == null ? Codegen.empty() : this.requestHeaders;
    }

    /**
     * The webhook URI for receiving POST requests. It must use https protocol.
     * 
     */
    @Import(name="uri", required=true)
      private final Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    /**
     * The user name for HTTP Basic authentication.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> username() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs(
        @Nullable Output<List<String>> allowedCaCerts,
        @Nullable Output<String> password,
        @Nullable Output<Map<String,String>> requestHeaders,
        Output<String> uri,
        @Nullable Output<String> username) {
        this.allowedCaCerts = allowedCaCerts;
        this.password = password;
        this.requestHeaders = requestHeaders;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.username = username;
    }

    private GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs() {
        this.allowedCaCerts = Codegen.empty();
        this.password = Codegen.empty();
        this.requestHeaders = Codegen.empty();
        this.uri = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedCaCerts;
        private @Nullable Output<String> password;
        private @Nullable Output<Map<String,String>> requestHeaders;
        private Output<String> uri;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCaCerts = defaults.allowedCaCerts;
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder allowedCaCerts(@Nullable Output<List<String>> allowedCaCerts) {
            this.allowedCaCerts = allowedCaCerts;
            return this;
        }
        public Builder allowedCaCerts(@Nullable List<String> allowedCaCerts) {
            this.allowedCaCerts = Codegen.ofNullable(allowedCaCerts);
            return this;
        }
        public Builder allowedCaCerts(String... allowedCaCerts) {
            return allowedCaCerts(List.of(allowedCaCerts));
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder requestHeaders(@Nullable Output<Map<String,String>> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public Builder requestHeaders(@Nullable Map<String,String> requestHeaders) {
            this.requestHeaders = Codegen.ofNullable(requestHeaders);
            return this;
        }
        public Builder uri(Output<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Output.of(Objects.requireNonNull(uri));
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }        public GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs build() {
            return new GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs(allowedCaCerts, password, requestHeaders, uri, username);
        }
    }
}
