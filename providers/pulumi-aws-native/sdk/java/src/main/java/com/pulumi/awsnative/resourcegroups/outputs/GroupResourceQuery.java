// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.resourcegroups.outputs;

import com.pulumi.awsnative.resourcegroups.enums.GroupResourceQueryType;
import com.pulumi.awsnative.resourcegroups.outputs.GroupQuery;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupResourceQuery {
    private final @Nullable GroupQuery query;
    private final @Nullable GroupResourceQueryType type;

    @CustomType.Constructor
    private GroupResourceQuery(
        @CustomType.Parameter("query") @Nullable GroupQuery query,
        @CustomType.Parameter("type") @Nullable GroupResourceQueryType type) {
        this.query = query;
        this.type = type;
    }

    public Optional<GroupQuery> query() {
        return Optional.ofNullable(this.query);
    }
    public Optional<GroupResourceQueryType> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupResourceQuery defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GroupQuery query;
        private @Nullable GroupResourceQueryType type;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupResourceQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.type = defaults.type;
        }

        public Builder query(@Nullable GroupQuery query) {
            this.query = query;
            return this;
        }
        public Builder type(@Nullable GroupResourceQueryType type) {
            this.type = type;
            return this;
        }        public GroupResourceQuery build() {
            return new GroupResourceQuery(query, type);
        }
    }
}
