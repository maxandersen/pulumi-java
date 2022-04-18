// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the policy to be used for placement of a Service Fabric service.
 * 
 */
public final class ServicePlacementPolicyDescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServicePlacementPolicyDescriptionResponse Empty = new ServicePlacementPolicyDescriptionResponse();

    /**
     * The type of placement policy for a service fabric service. Following are the possible values.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public ServicePlacementPolicyDescriptionResponse(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServicePlacementPolicyDescriptionResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePlacementPolicyDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePlacementPolicyDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ServicePlacementPolicyDescriptionResponse build() {
            return new ServicePlacementPolicyDescriptionResponse(type);
        }
    }
}
