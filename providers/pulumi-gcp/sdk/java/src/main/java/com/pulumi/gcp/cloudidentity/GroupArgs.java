// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudidentity.inputs.GroupGroupKeyArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * An extended description to help users determine the purpose of a Group.
     * Must not be longer than 4,096 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the Group.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * EntityKey of the Group.
     * Structure is documented below.
     * 
     */
    @Import(name="groupKey", required=true)
    private Output<GroupGroupKeyArgs> groupKey;

    public Output<GroupGroupKeyArgs> groupKey() {
        return this.groupKey;
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
    private @Nullable Output<String> initialGroupConfig;

    public Optional<Output<String>> initialGroupConfig() {
        return Optional.ofNullable(this.initialGroupConfig);
    }

    /**
     * The labels that apply to the Group.
     * Must not contain more than one entry. Must contain the entry
     * &#39;cloudidentity.googleapis.com/groups.discussion_forum&#39;: &#39;&#39; if the Group is a Google Group or
     * &#39;system/groups/external&#39;: &#39;&#39; if the Group is an external-identity-mapped group.
     * 
     */
    @Import(name="labels", required=true)
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels;
    }

    /**
     * The resource name of the entity under which this Group resides in the
     * Cloud Identity resource hierarchy.
     * Must be of the form identitysources/{identity_source_id} for external-identity-mapped
     * groups or customers/{customer_id} for Google Groups.
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    public Output<String> parent() {
        return this.parent;
    }

    private GroupArgs() {}

    private GroupArgs(GroupArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.groupKey = $.groupKey;
        this.initialGroupConfig = $.initialGroupConfig;
        this.labels = $.labels;
        this.parent = $.parent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupArgs $;

        public Builder() {
            $ = new GroupArgs();
        }

        public Builder(GroupArgs defaults) {
            $ = new GroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder groupKey(Output<GroupGroupKeyArgs> groupKey) {
            $.groupKey = groupKey;
            return this;
        }

        public Builder groupKey(GroupGroupKeyArgs groupKey) {
            return groupKey(Output.of(groupKey));
        }

        public Builder initialGroupConfig(@Nullable Output<String> initialGroupConfig) {
            $.initialGroupConfig = initialGroupConfig;
            return this;
        }

        public Builder initialGroupConfig(String initialGroupConfig) {
            return initialGroupConfig(Output.of(initialGroupConfig));
        }

        public Builder labels(Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public GroupArgs build() {
            $.groupKey = Objects.requireNonNull($.groupKey, "expected parameter 'groupKey' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            return $;
        }
    }

}
