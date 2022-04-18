// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerplatform.inputs;

import com.pulumi.azurenative.powerplatform.inputs.VirtualNetworkPropertiesListResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings concerning network injection.
 * 
 */
public final class PropertiesResponseNetworkInjection extends com.pulumi.resources.InvokeArgs {

    public static final PropertiesResponseNetworkInjection Empty = new PropertiesResponseNetworkInjection();

    /**
     * Network injection configuration
     * 
     */
    @Import(name="virtualNetworks")
      private final @Nullable VirtualNetworkPropertiesListResponse virtualNetworks;

    public Optional<VirtualNetworkPropertiesListResponse> virtualNetworks() {
        return this.virtualNetworks == null ? Optional.empty() : Optional.ofNullable(this.virtualNetworks);
    }

    public PropertiesResponseNetworkInjection(@Nullable VirtualNetworkPropertiesListResponse virtualNetworks) {
        this.virtualNetworks = virtualNetworks;
    }

    private PropertiesResponseNetworkInjection() {
        this.virtualNetworks = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertiesResponseNetworkInjection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNetworkPropertiesListResponse virtualNetworks;

        public Builder() {
    	      // Empty
        }

        public Builder(PropertiesResponseNetworkInjection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNetworks = defaults.virtualNetworks;
        }

        public Builder virtualNetworks(@Nullable VirtualNetworkPropertiesListResponse virtualNetworks) {
            this.virtualNetworks = virtualNetworks;
            return this;
        }        public PropertiesResponseNetworkInjection build() {
            return new PropertiesResponseNetworkInjection(virtualNetworks);
        }
    }
}
