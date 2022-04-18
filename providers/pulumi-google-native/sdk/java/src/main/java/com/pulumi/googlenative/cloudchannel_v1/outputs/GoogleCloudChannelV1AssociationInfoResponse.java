// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudChannelV1AssociationInfoResponse {
    /**
     * The name of the base entitlement, for which this entitlement is an add-on.
     * 
     */
    private final String baseEntitlement;

    @CustomType.Constructor
    private GoogleCloudChannelV1AssociationInfoResponse(@CustomType.Parameter("baseEntitlement") String baseEntitlement) {
        this.baseEntitlement = baseEntitlement;
    }

    /**
     * The name of the base entitlement, for which this entitlement is an add-on.
     * 
    */
    public String baseEntitlement() {
        return this.baseEntitlement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1AssociationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseEntitlement;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1AssociationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseEntitlement = defaults.baseEntitlement;
        }

        public Builder baseEntitlement(String baseEntitlement) {
            this.baseEntitlement = Objects.requireNonNull(baseEntitlement);
            return this;
        }        public GoogleCloudChannelV1AssociationInfoResponse build() {
            return new GoogleCloudChannelV1AssociationInfoResponse(baseEntitlement);
        }
    }
}
