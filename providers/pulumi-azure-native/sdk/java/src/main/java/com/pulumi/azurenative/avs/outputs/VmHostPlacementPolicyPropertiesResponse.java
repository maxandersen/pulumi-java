// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VmHostPlacementPolicyPropertiesResponse {
    /**
     * placement policy affinity type
     * 
     */
    private final String affinityType;
    /**
     * Display name of the placement policy
     * 
     */
    private final @Nullable String displayName;
    /**
     * Host members list
     * 
     */
    private final List<String> hostMembers;
    /**
     * The provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * Whether the placement policy is enabled or disabled
     * 
     */
    private final @Nullable String state;
    /**
     * placement policy type
     * Expected value is &#39;VmHost&#39;.
     * 
     */
    private final String type;
    /**
     * Virtual machine members list
     * 
     */
    private final List<String> vmMembers;

    @CustomType.Constructor
    private VmHostPlacementPolicyPropertiesResponse(
        @CustomType.Parameter("affinityType") String affinityType,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("hostMembers") List<String> hostMembers,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("vmMembers") List<String> vmMembers) {
        this.affinityType = affinityType;
        this.displayName = displayName;
        this.hostMembers = hostMembers;
        this.provisioningState = provisioningState;
        this.state = state;
        this.type = type;
        this.vmMembers = vmMembers;
    }

    /**
     * placement policy affinity type
     * 
    */
    public String affinityType() {
        return this.affinityType;
    }
    /**
     * Display name of the placement policy
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Host members list
     * 
    */
    public List<String> hostMembers() {
        return this.hostMembers;
    }
    /**
     * The provisioning state
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Whether the placement policy is enabled or disabled
     * 
    */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * placement policy type
     * Expected value is &#39;VmHost&#39;.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Virtual machine members list
     * 
    */
    public List<String> vmMembers() {
        return this.vmMembers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmHostPlacementPolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String affinityType;
        private @Nullable String displayName;
        private List<String> hostMembers;
        private String provisioningState;
        private @Nullable String state;
        private String type;
        private List<String> vmMembers;

        public Builder() {
    	      // Empty
        }

        public Builder(VmHostPlacementPolicyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityType = defaults.affinityType;
    	      this.displayName = defaults.displayName;
    	      this.hostMembers = defaults.hostMembers;
    	      this.provisioningState = defaults.provisioningState;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.vmMembers = defaults.vmMembers;
        }

        public Builder affinityType(String affinityType) {
            this.affinityType = Objects.requireNonNull(affinityType);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder hostMembers(List<String> hostMembers) {
            this.hostMembers = Objects.requireNonNull(hostMembers);
            return this;
        }
        public Builder hostMembers(String... hostMembers) {
            return hostMembers(List.of(hostMembers));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder vmMembers(List<String> vmMembers) {
            this.vmMembers = Objects.requireNonNull(vmMembers);
            return this;
        }
        public Builder vmMembers(String... vmMembers) {
            return vmMembers(List.of(vmMembers));
        }        public VmHostPlacementPolicyPropertiesResponse build() {
            return new VmHostPlacementPolicyPropertiesResponse(affinityType, displayName, hostMembers, provisioningState, state, type, vmMembers);
        }
    }
}
