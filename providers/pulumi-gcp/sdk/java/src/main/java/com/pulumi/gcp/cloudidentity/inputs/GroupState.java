// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.cloudidentity.inputs.GroupGroupKeyGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupState extends com.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * The time when the Group was created.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * An extended description to help users determine the purpose of a Group.
     * Must not be longer than 4,096 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The display name of the Group.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * EntityKey of the Group.
     * Structure is documented below.
     * 
     */
    @Import(name="groupKey")
      private final @Nullable Output<GroupGroupKeyGetArgs> groupKey;

    public Output<GroupGroupKeyGetArgs> groupKey() {
        return this.groupKey == null ? Codegen.empty() : this.groupKey;
    }

    /**
     * The initial configuration options for creating a Group.
     * See the
     * [API reference](https://cloud.google.com/identity/docs/reference/rest/v1beta1/groups/create#initialgroupconfig)
     * for possible values.
     * Default value is `EMPTY`.
     * Possible values are `INITIAL_GROUP_CONFIG_UNSPECIFIED`, `WITH_INITIAL_OWNER`, and `EMPTY`.
     * 
     */
    @Import(name="initialGroupConfig")
      private final @Nullable Output<String> initialGroupConfig;

    public Output<String> initialGroupConfig() {
        return this.initialGroupConfig == null ? Codegen.empty() : this.initialGroupConfig;
    }

    /**
     * The labels that apply to the Group.
     * Must not contain more than one entry. Must contain the entry
     * &#39;cloudidentity.googleapis.com/groups.discussion_forum&#39;: &#39;&#39; if the Group is a Google Group or
     * &#39;system/groups/external&#39;: &#39;&#39; if the Group is an external-identity-mapped group.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Resource name of the Group in the format: groups/{group_id}, where group_id is the unique ID assigned to the Group.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The resource name of the entity under which this Group resides in the
     * Cloud Identity resource hierarchy.
     * Must be of the form identitysources/{identity_source_id} for external-identity-mapped
     * groups or customers/{customer_id} for Google Groups.
     * 
     */
    @Import(name="parent")
      private final @Nullable Output<String> parent;

    public Output<String> parent() {
        return this.parent == null ? Codegen.empty() : this.parent;
    }

    /**
     * The time when the Group was last updated.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> updateTime() {
        return this.updateTime == null ? Codegen.empty() : this.updateTime;
    }

    public GroupState(
        @Nullable Output<String> createTime,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<GroupGroupKeyGetArgs> groupKey,
        @Nullable Output<String> initialGroupConfig,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> parent,
        @Nullable Output<String> updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.groupKey = groupKey;
        this.initialGroupConfig = initialGroupConfig;
        this.labels = labels;
        this.name = name;
        this.parent = parent;
        this.updateTime = updateTime;
    }

    private GroupState() {
        this.createTime = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.groupKey = Codegen.empty();
        this.initialGroupConfig = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.parent = Codegen.empty();
        this.updateTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<GroupGroupKeyGetArgs> groupKey;
        private @Nullable Output<String> initialGroupConfig;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parent;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.groupKey = defaults.groupKey;
    	      this.initialGroupConfig = defaults.initialGroupConfig;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
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
        public Builder groupKey(@Nullable Output<GroupGroupKeyGetArgs> groupKey) {
            this.groupKey = groupKey;
            return this;
        }
        public Builder groupKey(@Nullable GroupGroupKeyGetArgs groupKey) {
            this.groupKey = Codegen.ofNullable(groupKey);
            return this;
        }
        public Builder initialGroupConfig(@Nullable Output<String> initialGroupConfig) {
            this.initialGroupConfig = initialGroupConfig;
            return this;
        }
        public Builder initialGroupConfig(@Nullable String initialGroupConfig) {
            this.initialGroupConfig = Codegen.ofNullable(initialGroupConfig);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder parent(@Nullable Output<String> parent) {
            this.parent = parent;
            return this;
        }
        public Builder parent(@Nullable String parent) {
            this.parent = Codegen.ofNullable(parent);
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Codegen.ofNullable(updateTime);
            return this;
        }        public GroupState build() {
            return new GroupState(createTime, description, displayName, groupKey, initialGroupConfig, labels, name, parent, updateTime);
        }
    }
}
