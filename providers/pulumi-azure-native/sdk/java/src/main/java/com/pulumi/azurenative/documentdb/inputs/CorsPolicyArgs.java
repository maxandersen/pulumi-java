// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The CORS policy for the Cosmos DB database account.
 * 
 */
public final class CorsPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CorsPolicyArgs Empty = new CorsPolicyArgs();

    /**
     * The request headers that the origin domain may specify on the CORS request.
     * 
     */
    @Import(name="allowedHeaders")
      private final @Nullable Output<String> allowedHeaders;

    public Output<String> allowedHeaders() {
        return this.allowedHeaders == null ? Codegen.empty() : this.allowedHeaders;
    }

    /**
     * The methods (HTTP request verbs) that the origin domain may use for a CORS request.
     * 
     */
    @Import(name="allowedMethods")
      private final @Nullable Output<String> allowedMethods;

    public Output<String> allowedMethods() {
        return this.allowedMethods == null ? Codegen.empty() : this.allowedMethods;
    }

    /**
     * The origin domains that are permitted to make a request against the service via CORS.
     * 
     */
    @Import(name="allowedOrigins", required=true)
      private final Output<String> allowedOrigins;

    public Output<String> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * The response headers that may be sent in the response to the CORS request and exposed by the browser to the request issuer.
     * 
     */
    @Import(name="exposedHeaders")
      private final @Nullable Output<String> exposedHeaders;

    public Output<String> exposedHeaders() {
        return this.exposedHeaders == null ? Codegen.empty() : this.exposedHeaders;
    }

    /**
     * The maximum amount time that a browser should cache the preflight OPTIONS request.
     * 
     */
    @Import(name="maxAgeInSeconds")
      private final @Nullable Output<Double> maxAgeInSeconds;

    public Output<Double> maxAgeInSeconds() {
        return this.maxAgeInSeconds == null ? Codegen.empty() : this.maxAgeInSeconds;
    }

    public CorsPolicyArgs(
        @Nullable Output<String> allowedHeaders,
        @Nullable Output<String> allowedMethods,
        Output<String> allowedOrigins,
        @Nullable Output<String> exposedHeaders,
        @Nullable Output<Double> maxAgeInSeconds) {
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = allowedMethods;
        this.allowedOrigins = Objects.requireNonNull(allowedOrigins, "expected parameter 'allowedOrigins' to be non-null");
        this.exposedHeaders = exposedHeaders;
        this.maxAgeInSeconds = maxAgeInSeconds;
    }

    private CorsPolicyArgs() {
        this.allowedHeaders = Codegen.empty();
        this.allowedMethods = Codegen.empty();
        this.allowedOrigins = Codegen.empty();
        this.exposedHeaders = Codegen.empty();
        this.maxAgeInSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allowedHeaders;
        private @Nullable Output<String> allowedMethods;
        private Output<String> allowedOrigins;
        private @Nullable Output<String> exposedHeaders;
        private @Nullable Output<Double> maxAgeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.maxAgeInSeconds = defaults.maxAgeInSeconds;
        }

        public Builder allowedHeaders(@Nullable Output<String> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }
        public Builder allowedHeaders(@Nullable String allowedHeaders) {
            this.allowedHeaders = Codegen.ofNullable(allowedHeaders);
            return this;
        }
        public Builder allowedMethods(@Nullable Output<String> allowedMethods) {
            this.allowedMethods = allowedMethods;
            return this;
        }
        public Builder allowedMethods(@Nullable String allowedMethods) {
            this.allowedMethods = Codegen.ofNullable(allowedMethods);
            return this;
        }
        public Builder allowedOrigins(Output<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String allowedOrigins) {
            this.allowedOrigins = Output.of(Objects.requireNonNull(allowedOrigins));
            return this;
        }
        public Builder exposedHeaders(@Nullable Output<String> exposedHeaders) {
            this.exposedHeaders = exposedHeaders;
            return this;
        }
        public Builder exposedHeaders(@Nullable String exposedHeaders) {
            this.exposedHeaders = Codegen.ofNullable(exposedHeaders);
            return this;
        }
        public Builder maxAgeInSeconds(@Nullable Output<Double> maxAgeInSeconds) {
            this.maxAgeInSeconds = maxAgeInSeconds;
            return this;
        }
        public Builder maxAgeInSeconds(@Nullable Double maxAgeInSeconds) {
            this.maxAgeInSeconds = Codegen.ofNullable(maxAgeInSeconds);
            return this;
        }        public CorsPolicyArgs build() {
            return new CorsPolicyArgs(allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, maxAgeInSeconds);
        }
    }
}
