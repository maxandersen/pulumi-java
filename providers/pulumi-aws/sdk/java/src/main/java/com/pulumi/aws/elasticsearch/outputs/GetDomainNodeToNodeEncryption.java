// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetDomainNodeToNodeEncryption {
    /**
     * Whether node to node encryption is enabled.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private GetDomainNodeToNodeEncryption(@CustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether node to node encryption is enabled.
     * 
    */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainNodeToNodeEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainNodeToNodeEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public GetDomainNodeToNodeEncryption build() {
            return new GetDomainNodeToNodeEncryption(enabled);
        }
    }
}
