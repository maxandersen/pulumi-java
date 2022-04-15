// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.GroupMembersItemResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationGroupResponse {
    /**
     * Network group conditional filter.
     * 
     */
    private final @Nullable String conditionalMembership;
    /**
     * A description of the network group.
     * 
     */
    private final @Nullable String description;
    /**
     * A friendly name for the network group.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Group members of network group.
     * 
     */
    private final @Nullable List<GroupMembersItemResponse> groupMembers;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Group member type.
     * 
     */
    private final @Nullable String memberType;
    /**
     * The provisioning state of the scope assignment resource.
     * 
     */
    private final String provisioningState;

    @CustomType.Constructor
    private ConfigurationGroupResponse(
        @CustomType.Parameter("conditionalMembership") @Nullable String conditionalMembership,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("groupMembers") @Nullable List<GroupMembersItemResponse> groupMembers,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("memberType") @Nullable String memberType,
        @CustomType.Parameter("provisioningState") String provisioningState) {
        this.conditionalMembership = conditionalMembership;
        this.description = description;
        this.displayName = displayName;
        this.groupMembers = groupMembers;
        this.id = id;
        this.memberType = memberType;
        this.provisioningState = provisioningState;
    }

    /**
     * Network group conditional filter.
     * 
    */
    public Optional<String> conditionalMembership() {
        return Optional.ofNullable(this.conditionalMembership);
    }
    /**
     * A description of the network group.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A friendly name for the network group.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Group members of network group.
     * 
    */
    public List<GroupMembersItemResponse> groupMembers() {
        return this.groupMembers == null ? List.of() : this.groupMembers;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Group member type.
     * 
    */
    public Optional<String> memberType() {
        return Optional.ofNullable(this.memberType);
    }
    /**
     * The provisioning state of the scope assignment resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String conditionalMembership;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable List<GroupMembersItemResponse> groupMembers;
        private @Nullable String id;
        private @Nullable String memberType;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionalMembership = defaults.conditionalMembership;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.groupMembers = defaults.groupMembers;
    	      this.id = defaults.id;
    	      this.memberType = defaults.memberType;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder conditionalMembership(@Nullable String conditionalMembership) {
            this.conditionalMembership = conditionalMembership;
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
        public Builder groupMembers(@Nullable List<GroupMembersItemResponse> groupMembers) {
            this.groupMembers = groupMembers;
            return this;
        }
        public Builder groupMembers(GroupMembersItemResponse... groupMembers) {
            return groupMembers(List.of(groupMembers));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder memberType(@Nullable String memberType) {
            this.memberType = memberType;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public ConfigurationGroupResponse build() {
            return new ConfigurationGroupResponse(conditionalMembership, description, displayName, groupMembers, id, memberType, provisioningState);
        }
    }
}
