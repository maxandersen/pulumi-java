// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.inputs;

import com.pulumi.aws.identitystore.inputs.GetGroupFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupArgs Empty = new GetGroupArgs();

    /**
     * Configuration block(s) for filtering. Currently, the AWS Identity Store API supports only 1 filter. Detailed below.
     * 
     */
    @Import(name="filters", required=true)
      private final List<GetGroupFilter> filters;

    public List<GetGroupFilter> filters() {
        return this.filters;
    }

    /**
     * The identifier for a group in the Identity Store.
     * 
     */
    @Import(name="groupId")
      private final @Nullable String groupId;

    public Optional<String> groupId() {
        return this.groupId == null ? Optional.empty() : Optional.ofNullable(this.groupId);
    }

    /**
     * The Identity Store ID associated with the Single Sign-On Instance.
     * 
     */
    @Import(name="identityStoreId", required=true)
      private final String identityStoreId;

    public String identityStoreId() {
        return this.identityStoreId;
    }

    public GetGroupArgs(
        List<GetGroupFilter> filters,
        @Nullable String groupId,
        String identityStoreId) {
        this.filters = Objects.requireNonNull(filters, "expected parameter 'filters' to be non-null");
        this.groupId = groupId;
        this.identityStoreId = Objects.requireNonNull(identityStoreId, "expected parameter 'identityStoreId' to be non-null");
    }

    private GetGroupArgs() {
        this.filters = List.of();
        this.groupId = null;
        this.identityStoreId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetGroupFilter> filters;
        private @Nullable String groupId;
        private String identityStoreId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.groupId = defaults.groupId;
    	      this.identityStoreId = defaults.identityStoreId;
        }

        public Builder filters(List<GetGroupFilter> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }
        public Builder filters(GetGroupFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder groupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }
        public Builder identityStoreId(String identityStoreId) {
            this.identityStoreId = Objects.requireNonNull(identityStoreId);
            return this;
        }        public GetGroupArgs build() {
            return new GetGroupArgs(filters, groupId, identityStoreId);
        }
    }
}
