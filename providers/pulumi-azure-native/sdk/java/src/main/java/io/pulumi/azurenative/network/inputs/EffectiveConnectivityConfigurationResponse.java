// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ConfigurationGroupResponse;
import io.pulumi.azurenative.network.inputs.ConnectivityGroupItemResponse;
import io.pulumi.azurenative.network.inputs.HubResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The network manager effective connectivity configuration
 * 
 */
public final class EffectiveConnectivityConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final EffectiveConnectivityConfigurationResponse Empty = new EffectiveConnectivityConfigurationResponse();

    /**
     * Groups for configuration
     * 
     */
    @Import(name="appliesToGroups")
      private final @Nullable List<ConnectivityGroupItemResponse> appliesToGroups;

    public List<ConnectivityGroupItemResponse> appliesToGroups() {
        return this.appliesToGroups == null ? List.of() : this.appliesToGroups;
    }

    /**
     * Effective configuration groups.
     * 
     */
    @Import(name="configurationGroups")
      private final @Nullable List<ConfigurationGroupResponse> configurationGroups;

    public List<ConfigurationGroupResponse> configurationGroups() {
        return this.configurationGroups == null ? List.of() : this.configurationGroups;
    }

    /**
     * Connectivity topology type.
     * 
     */
    @Import(name="connectivityTopology", required=true)
      private final String connectivityTopology;

    public String connectivityTopology() {
        return this.connectivityTopology;
    }

    /**
     * Flag if need to remove current existing peerings.
     * 
     */
    @Import(name="deleteExistingPeering")
      private final @Nullable String deleteExistingPeering;

    public Optional<String> deleteExistingPeering() {
        return this.deleteExistingPeering == null ? Optional.empty() : Optional.ofNullable(this.deleteExistingPeering);
    }

    /**
     * A description of the connectivity configuration.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * A friendly name for the resource.
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> displayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * List of hubItems
     * 
     */
    @Import(name="hubs")
      private final @Nullable List<HubResponse> hubs;

    public List<HubResponse> hubs() {
        return this.hubs == null ? List.of() : this.hubs;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Flag if global mesh is supported.
     * 
     */
    @Import(name="isGlobal")
      private final @Nullable String isGlobal;

    public Optional<String> isGlobal() {
        return this.isGlobal == null ? Optional.empty() : Optional.ofNullable(this.isGlobal);
    }

    /**
     * The provisioning state of the connectivity configuration resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    public EffectiveConnectivityConfigurationResponse(
        @Nullable List<ConnectivityGroupItemResponse> appliesToGroups,
        @Nullable List<ConfigurationGroupResponse> configurationGroups,
        String connectivityTopology,
        @Nullable String deleteExistingPeering,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable List<HubResponse> hubs,
        @Nullable String id,
        @Nullable String isGlobal,
        String provisioningState) {
        this.appliesToGroups = appliesToGroups;
        this.configurationGroups = configurationGroups;
        this.connectivityTopology = Objects.requireNonNull(connectivityTopology, "expected parameter 'connectivityTopology' to be non-null");
        this.deleteExistingPeering = deleteExistingPeering;
        this.description = description;
        this.displayName = displayName;
        this.hubs = hubs;
        this.id = id;
        this.isGlobal = isGlobal;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private EffectiveConnectivityConfigurationResponse() {
        this.appliesToGroups = List.of();
        this.configurationGroups = List.of();
        this.connectivityTopology = null;
        this.deleteExistingPeering = null;
        this.description = null;
        this.displayName = null;
        this.hubs = List.of();
        this.id = null;
        this.isGlobal = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EffectiveConnectivityConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConnectivityGroupItemResponse> appliesToGroups;
        private @Nullable List<ConfigurationGroupResponse> configurationGroups;
        private String connectivityTopology;
        private @Nullable String deleteExistingPeering;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable List<HubResponse> hubs;
        private @Nullable String id;
        private @Nullable String isGlobal;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(EffectiveConnectivityConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliesToGroups = defaults.appliesToGroups;
    	      this.configurationGroups = defaults.configurationGroups;
    	      this.connectivityTopology = defaults.connectivityTopology;
    	      this.deleteExistingPeering = defaults.deleteExistingPeering;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.hubs = defaults.hubs;
    	      this.id = defaults.id;
    	      this.isGlobal = defaults.isGlobal;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder appliesToGroups(@Nullable List<ConnectivityGroupItemResponse> appliesToGroups) {
            this.appliesToGroups = appliesToGroups;
            return this;
        }
        public Builder appliesToGroups(ConnectivityGroupItemResponse... appliesToGroups) {
            return appliesToGroups(List.of(appliesToGroups));
        }
        public Builder configurationGroups(@Nullable List<ConfigurationGroupResponse> configurationGroups) {
            this.configurationGroups = configurationGroups;
            return this;
        }
        public Builder configurationGroups(ConfigurationGroupResponse... configurationGroups) {
            return configurationGroups(List.of(configurationGroups));
        }
        public Builder connectivityTopology(String connectivityTopology) {
            this.connectivityTopology = Objects.requireNonNull(connectivityTopology);
            return this;
        }
        public Builder deleteExistingPeering(@Nullable String deleteExistingPeering) {
            this.deleteExistingPeering = deleteExistingPeering;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder hubs(@Nullable List<HubResponse> hubs) {
            this.hubs = hubs;
            return this;
        }
        public Builder hubs(HubResponse... hubs) {
            return hubs(List.of(hubs));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder isGlobal(@Nullable String isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public EffectiveConnectivityConfigurationResponse build() {
            return new EffectiveConnectivityConfigurationResponse(appliesToGroups, configurationGroups, connectivityTopology, deleteExistingPeering, description, displayName, hubs, id, isGlobal, provisioningState);
        }
    }
}
