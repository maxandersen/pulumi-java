// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedVirtualNetworkReferenceResponse {
    /**
     * Reference ManagedVirtualNetwork name.
     * 
     */
    private final String referenceName;
    /**
     * Managed Virtual Network reference type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ManagedVirtualNetworkReferenceResponse(
        @CustomType.Parameter("referenceName") String referenceName,
        @CustomType.Parameter("type") String type) {
        this.referenceName = referenceName;
        this.type = type;
    }

    /**
     * Reference ManagedVirtualNetwork name.
     * 
    */
    public String referenceName() {
        return this.referenceName;
    }
    /**
     * Managed Virtual Network reference type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedVirtualNetworkReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String referenceName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedVirtualNetworkReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder referenceName(String referenceName) {
            this.referenceName = Objects.requireNonNull(referenceName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ManagedVirtualNetworkReferenceResponse build() {
            return new ManagedVirtualNetworkReferenceResponse(referenceName, type);
        }
    }
}
