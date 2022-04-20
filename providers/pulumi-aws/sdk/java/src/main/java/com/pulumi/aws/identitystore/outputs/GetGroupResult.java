// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.outputs;

import com.pulumi.aws.identitystore.outputs.GetGroupFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    /**
     * The group&#39;s display name value.
     * 
     */
    private final String displayName;
    private final List<GetGroupFilter> filters;
    private final String groupId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String identityStoreId;

    @CustomType.Constructor
    private GetGroupResult(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("filters") List<GetGroupFilter> filters,
        @CustomType.Parameter("groupId") String groupId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identityStoreId") String identityStoreId) {
        this.displayName = displayName;
        this.filters = filters;
        this.groupId = groupId;
        this.id = id;
        this.identityStoreId = identityStoreId;
    }

    /**
     * The group&#39;s display name value.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    public List<GetGroupFilter> filters() {
        return this.filters;
    }
    public String groupId() {
        return this.groupId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public String identityStoreId() {
        return this.identityStoreId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private List<GetGroupFilter> filters;
        private String groupId;
        private String id;
        private String identityStoreId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.filters = defaults.filters;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.identityStoreId = defaults.identityStoreId;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder filters(List<GetGroupFilter> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }
        public Builder filters(GetGroupFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identityStoreId(String identityStoreId) {
            this.identityStoreId = Objects.requireNonNull(identityStoreId);
            return this;
        }        public GetGroupResult build() {
            return new GetGroupResult(displayName, filters, groupId, id, identityStoreId);
        }
    }
}
