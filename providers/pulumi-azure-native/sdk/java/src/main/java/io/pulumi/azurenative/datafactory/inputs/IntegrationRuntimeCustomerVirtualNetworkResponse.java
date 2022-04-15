// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition and properties of virtual network to which Azure-SSIS integration runtime will join.
 * 
 */
public final class IntegrationRuntimeCustomerVirtualNetworkResponse extends io.pulumi.resources.InvokeArgs {

    public static final IntegrationRuntimeCustomerVirtualNetworkResponse Empty = new IntegrationRuntimeCustomerVirtualNetworkResponse();

    /**
     * The ID of subnet to which Azure-SSIS integration runtime will join.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable String subnetId;

    public Optional<String> subnetId() {
        return this.subnetId == null ? Optional.empty() : Optional.ofNullable(this.subnetId);
    }

    public IntegrationRuntimeCustomerVirtualNetworkResponse(@Nullable String subnetId) {
        this.subnetId = subnetId;
    }

    private IntegrationRuntimeCustomerVirtualNetworkResponse() {
        this.subnetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeCustomerVirtualNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeCustomerVirtualNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }        public IntegrationRuntimeCustomerVirtualNetworkResponse build() {
            return new IntegrationRuntimeCustomerVirtualNetworkResponse(subnetId);
        }
    }
}
