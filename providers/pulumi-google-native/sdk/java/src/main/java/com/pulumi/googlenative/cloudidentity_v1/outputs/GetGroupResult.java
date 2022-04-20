// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudidentity_v1.outputs.DynamicGroupMetadataResponse;
import com.pulumi.googlenative.cloudidentity_v1.outputs.EntityKeyResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    /**
     * The time when the `Group` was created.
     * 
     */
    private final String createTime;
    /**
     * An extended description to help users determine the purpose of a `Group`. Must not be longer than 4,096 characters.
     * 
     */
    private final String description;
    /**
     * The display name of the `Group`.
     * 
     */
    private final String displayName;
    /**
     * Optional. Dynamic group metadata like queries and status.
     * 
     */
    private final DynamicGroupMetadataResponse dynamicGroupMetadata;
    /**
     * The `EntityKey` of the `Group`.
     * 
     */
    private final EntityKeyResponse groupKey;
    /**
     * One or more label entries that apply to the Group. Currently supported labels contain a key with an empty value. Google Groups are the default type of group and have a label with a key of `cloudidentity.googleapis.com/groups.discussion_forum` and an empty value. Existing Google Groups can have an additional label with a key of `cloudidentity.googleapis.com/groups.security` and an empty value added to them. **This is an immutable change and the security label cannot be removed once added.** Dynamic groups have a label with a key of `cloudidentity.googleapis.com/groups.dynamic`. Identity-mapped groups for Cloud Search have a label with a key of `system/groups/external` and an empty value.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Group`. Shall be of the form `groups/{group}`.
     * 
     */
    private final String name;
    /**
     * Immutable. The resource name of the entity under which this `Group` resides in the Cloud Identity resource hierarchy. Must be of the form `identitysources/{identity_source}` for external- identity-mapped groups or `customers/{customer}` for Google Groups. The `customer` must begin with &#34;C&#34; (for example, &#39;C046psxkn&#39;).
     * 
     */
    private final String parent;
    /**
     * The time when the `Group` was last updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetGroupResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("dynamicGroupMetadata") DynamicGroupMetadataResponse dynamicGroupMetadata,
        @CustomType.Parameter("groupKey") EntityKeyResponse groupKey,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parent") String parent,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.dynamicGroupMetadata = dynamicGroupMetadata;
        this.groupKey = groupKey;
        this.labels = labels;
        this.name = name;
        this.parent = parent;
        this.updateTime = updateTime;
    }

    /**
     * The time when the `Group` was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * An extended description to help users determine the purpose of a `Group`. Must not be longer than 4,096 characters.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The display name of the `Group`.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Optional. Dynamic group metadata like queries and status.
     * 
    */
    public DynamicGroupMetadataResponse dynamicGroupMetadata() {
        return this.dynamicGroupMetadata;
    }
    /**
     * The `EntityKey` of the `Group`.
     * 
    */
    public EntityKeyResponse groupKey() {
        return this.groupKey;
    }
    /**
     * One or more label entries that apply to the Group. Currently supported labels contain a key with an empty value. Google Groups are the default type of group and have a label with a key of `cloudidentity.googleapis.com/groups.discussion_forum` and an empty value. Existing Google Groups can have an additional label with a key of `cloudidentity.googleapis.com/groups.security` and an empty value added to them. **This is an immutable change and the security label cannot be removed once added.** Dynamic groups have a label with a key of `cloudidentity.googleapis.com/groups.dynamic`. Identity-mapped groups for Cloud Search have a label with a key of `system/groups/external` and an empty value.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Group`. Shall be of the form `groups/{group}`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Immutable. The resource name of the entity under which this `Group` resides in the Cloud Identity resource hierarchy. Must be of the form `identitysources/{identity_source}` for external- identity-mapped groups or `customers/{customer}` for Google Groups. The `customer` must begin with &#34;C&#34; (for example, &#39;C046psxkn&#39;).
     * 
    */
    public String parent() {
        return this.parent;
    }
    /**
     * The time when the `Group` was last updated.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private DynamicGroupMetadataResponse dynamicGroupMetadata;
        private EntityKeyResponse groupKey;
        private Map<String,String> labels;
        private String name;
        private String parent;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.dynamicGroupMetadata = defaults.dynamicGroupMetadata;
    	      this.groupKey = defaults.groupKey;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder dynamicGroupMetadata(DynamicGroupMetadataResponse dynamicGroupMetadata) {
            this.dynamicGroupMetadata = Objects.requireNonNull(dynamicGroupMetadata);
            return this;
        }
        public Builder groupKey(EntityKeyResponse groupKey) {
            this.groupKey = Objects.requireNonNull(groupKey);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetGroupResult build() {
            return new GetGroupResult(createTime, description, displayName, dynamicGroupMetadata, groupKey, labels, name, parent, updateTime);
        }
    }
}
