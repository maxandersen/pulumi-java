// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AdministrativeUnitState extends com.pulumi.resources.ResourceArgs {

    public static final AdministrativeUnitState Empty = new AdministrativeUnitState();

    /**
     * The description of the administrative unit.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The display name of the administrative unit.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Whether the administrative unit and its members are hidden or publicly viewable in the directory
     * 
     */
    @Import(name="hiddenMembershipEnabled")
      private final @Nullable Output<Boolean> hiddenMembershipEnabled;

    public Output<Boolean> hiddenMembershipEnabled() {
        return this.hiddenMembershipEnabled == null ? Codegen.empty() : this.hiddenMembershipEnabled;
    }

    /**
     * A set of object IDs of members who should be present in this administrative unit. Supported object types are Users or Groups.
     * 
     */
    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members == null ? Codegen.empty() : this.members;
    }

    /**
     * The object ID of the administrative unit.
     * 
     */
    @Import(name="objectId")
      private final @Nullable Output<String> objectId;

    public Output<String> objectId() {
        return this.objectId == null ? Codegen.empty() : this.objectId;
    }

    /**
     * If `true`, will return an error if an existing administrative unit is found with the same name
     * 
     */
    @Import(name="preventDuplicateNames")
      private final @Nullable Output<Boolean> preventDuplicateNames;

    public Output<Boolean> preventDuplicateNames() {
        return this.preventDuplicateNames == null ? Codegen.empty() : this.preventDuplicateNames;
    }

    public AdministrativeUnitState(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<Boolean> hiddenMembershipEnabled,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> objectId,
        @Nullable Output<Boolean> preventDuplicateNames) {
        this.description = description;
        this.displayName = displayName;
        this.hiddenMembershipEnabled = hiddenMembershipEnabled;
        this.members = members;
        this.objectId = objectId;
        this.preventDuplicateNames = preventDuplicateNames;
    }

    private AdministrativeUnitState() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.hiddenMembershipEnabled = Codegen.empty();
        this.members = Codegen.empty();
        this.objectId = Codegen.empty();
        this.preventDuplicateNames = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdministrativeUnitState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Boolean> hiddenMembershipEnabled;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> objectId;
        private @Nullable Output<Boolean> preventDuplicateNames;

        public Builder() {
    	      // Empty
        }

        public Builder(AdministrativeUnitState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.hiddenMembershipEnabled = defaults.hiddenMembershipEnabled;
    	      this.members = defaults.members;
    	      this.objectId = defaults.objectId;
    	      this.preventDuplicateNames = defaults.preventDuplicateNames;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder hiddenMembershipEnabled(@Nullable Output<Boolean> hiddenMembershipEnabled) {
            this.hiddenMembershipEnabled = hiddenMembershipEnabled;
            return this;
        }
        public Builder hiddenMembershipEnabled(@Nullable Boolean hiddenMembershipEnabled) {
            this.hiddenMembershipEnabled = Codegen.ofNullable(hiddenMembershipEnabled);
            return this;
        }
        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }
        public Builder members(@Nullable List<String> members) {
            this.members = Codegen.ofNullable(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder objectId(@Nullable Output<String> objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = Codegen.ofNullable(objectId);
            return this;
        }
        public Builder preventDuplicateNames(@Nullable Output<Boolean> preventDuplicateNames) {
            this.preventDuplicateNames = preventDuplicateNames;
            return this;
        }
        public Builder preventDuplicateNames(@Nullable Boolean preventDuplicateNames) {
            this.preventDuplicateNames = Codegen.ofNullable(preventDuplicateNames);
            return this;
        }        public AdministrativeUnitState build() {
            return new AdministrativeUnitState(description, displayName, hiddenMembershipEnabled, members, objectId, preventDuplicateNames);
        }
    }
}
