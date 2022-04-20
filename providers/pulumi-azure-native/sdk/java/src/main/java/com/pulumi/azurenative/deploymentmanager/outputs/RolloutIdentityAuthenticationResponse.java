// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RolloutIdentityAuthenticationResponse {
    /**
     * The authentication type.
     * Expected value is &#39;RolloutIdentity&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private RolloutIdentityAuthenticationResponse(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * The authentication type.
     * Expected value is &#39;RolloutIdentity&#39;.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutIdentityAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RolloutIdentityAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RolloutIdentityAuthenticationResponse build() {
            return new RolloutIdentityAuthenticationResponse(type);
        }
    }
}
