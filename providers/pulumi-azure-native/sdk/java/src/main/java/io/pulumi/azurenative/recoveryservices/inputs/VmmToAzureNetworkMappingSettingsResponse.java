// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * E2A Network Mapping fabric specific settings.
 * 
 */
public final class VmmToAzureNetworkMappingSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VmmToAzureNetworkMappingSettingsResponse Empty = new VmmToAzureNetworkMappingSettingsResponse();

    /**
     * Gets the Instance type.
     * Expected value is 'VmmToAzure'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    public VmmToAzureNetworkMappingSettingsResponse(String instanceType) {
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
    }

    private VmmToAzureNetworkMappingSettingsResponse() {
        this.instanceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmmToAzureNetworkMappingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(VmmToAzureNetworkMappingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }        public VmmToAzureNetworkMappingSettingsResponse build() {
            return new VmmToAzureNetworkMappingSettingsResponse(instanceType);
        }
    }
}
