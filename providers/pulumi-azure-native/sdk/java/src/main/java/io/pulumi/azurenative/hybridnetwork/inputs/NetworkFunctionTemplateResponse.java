// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.inputs.NetworkFunctionRoleConfigurationResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The network function template.
 * 
 */
public final class NetworkFunctionTemplateResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkFunctionTemplateResponse Empty = new NetworkFunctionTemplateResponse();

    /**
     * An array of network function role definitions.
     * 
     */
    @Import(name="networkFunctionRoleConfigurations")
      private final @Nullable List<NetworkFunctionRoleConfigurationResponse> networkFunctionRoleConfigurations;

    public List<NetworkFunctionRoleConfigurationResponse> networkFunctionRoleConfigurations() {
        return this.networkFunctionRoleConfigurations == null ? List.of() : this.networkFunctionRoleConfigurations;
    }

    public NetworkFunctionTemplateResponse(@Nullable List<NetworkFunctionRoleConfigurationResponse> networkFunctionRoleConfigurations) {
        this.networkFunctionRoleConfigurations = networkFunctionRoleConfigurations;
    }

    private NetworkFunctionTemplateResponse() {
        this.networkFunctionRoleConfigurations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkFunctionTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NetworkFunctionRoleConfigurationResponse> networkFunctionRoleConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkFunctionTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkFunctionRoleConfigurations = defaults.networkFunctionRoleConfigurations;
        }

        public Builder networkFunctionRoleConfigurations(@Nullable List<NetworkFunctionRoleConfigurationResponse> networkFunctionRoleConfigurations) {
            this.networkFunctionRoleConfigurations = networkFunctionRoleConfigurations;
            return this;
        }
        public Builder networkFunctionRoleConfigurations(NetworkFunctionRoleConfigurationResponse... networkFunctionRoleConfigurations) {
            return networkFunctionRoleConfigurations(List.of(networkFunctionRoleConfigurations));
        }        public NetworkFunctionTemplateResponse build() {
            return new NetworkFunctionTemplateResponse(networkFunctionRoleConfigurations);
        }
    }
}
