// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The key authorization type integration runtime.
 * 
 */
public final class LinkedIntegrationRuntimeKeyAuthorizationResponse extends com.pulumi.resources.InvokeArgs {

    public static final LinkedIntegrationRuntimeKeyAuthorizationResponse Empty = new LinkedIntegrationRuntimeKeyAuthorizationResponse();

    /**
     * The authorization type for integration runtime sharing.
     * Expected value is &#39;Key&#39;.
     * 
     */
    @Import(name="authorizationType", required=true)
      private final String authorizationType;

    public String authorizationType() {
        return this.authorizationType;
    }

    /**
     * The key used for authorization.
     * 
     */
    @Import(name="key", required=true)
      private final SecureStringResponse key;

    public SecureStringResponse key() {
        return this.key;
    }

    public LinkedIntegrationRuntimeKeyAuthorizationResponse(
        String authorizationType,
        SecureStringResponse key) {
        this.authorizationType = Codegen.stringProp("authorizationType").arg(authorizationType).require();
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private LinkedIntegrationRuntimeKeyAuthorizationResponse() {
        this.authorizationType = null;
        this.key = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedIntegrationRuntimeKeyAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationType;
        private SecureStringResponse key;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedIntegrationRuntimeKeyAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.key = defaults.key;
        }

        public Builder authorizationType(String authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }
        public Builder key(SecureStringResponse key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }        public LinkedIntegrationRuntimeKeyAuthorizationResponse build() {
            return new LinkedIntegrationRuntimeKeyAuthorizationResponse(authorizationType, key);
        }
    }
}
