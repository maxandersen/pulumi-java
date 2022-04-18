// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.GroupMembersItemResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The network configuration group resource
 * 
 */
public final class ConfigurationGroupResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConfigurationGroupResponse Empty = new ConfigurationGroupResponse();

    /**
     * Network group conditional filter.
     * 
     */
    @Import(name="conditionalMembership")
      private final @Nullable String conditionalMembership;

    public Optional<String> conditionalMembership() {
        return this.conditionalMembership == null ? Optional.empty() : Optional.ofNullable(this.conditionalMembership);
    }

    /**
     * A description of the network group.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * A friendly name for the network group.
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> displayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Group members of network group.
     * 
     */
    @Import(name="groupMembers")
      private final @Nullable List<GroupMembersItemResponse> groupMembers;

    public List<GroupMembersItemResponse> groupMembers() {
        return this.groupMembers == null ? List.of() : this.groupMembers;
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
     * Group member type.
     * 
     */
    @Import(name="memberType")
      private final @Nullable String memberType;

    public Optional<String> memberType() {
        return this.memberType == null ? Optional.empty() : Optional.ofNullable(this.memberType);
    }

    /**
     * The provisioning state of the scope assignment resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    public ConfigurationGroupResponse(
        @Nullable String conditionalMembership,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable List<GroupMembersItemResponse> groupMembers,
        @Nullable String id,
        @Nullable String memberType,
        String provisioningState) {
        this.conditionalMembership = conditionalMembership;
        this.description = description;
        this.displayName = displayName;
        this.groupMembers = groupMembers;
        this.id = id;
        this.memberType = memberType;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private ConfigurationGroupResponse() {
        this.conditionalMembership = null;
        this.description = null;
        this.displayName = null;
        this.groupMembers = List.of();
        this.id = null;
        this.memberType = null;
        this.provisioningState = null;
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
