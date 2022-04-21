// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.resourcegroups.inputs;

import com.pulumi.awsnative.resourcegroups.enums.GroupResourceQueryType;
import com.pulumi.awsnative.resourcegroups.inputs.GroupQueryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupResourceQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupResourceQueryArgs Empty = new GroupResourceQueryArgs();

    @Import(name="query")
    private @Nullable Output<GroupQueryArgs> query;

    public Optional<Output<GroupQueryArgs>> query() {
        return Optional.ofNullable(this.query);
    }

    @Import(name="type")
    private @Nullable Output<GroupResourceQueryType> type;

    public Optional<Output<GroupResourceQueryType>> type() {
        return Optional.ofNullable(this.type);
    }

    private GroupResourceQueryArgs() {}

    private GroupResourceQueryArgs(GroupResourceQueryArgs $) {
        this.query = $.query;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupResourceQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupResourceQueryArgs $;

        public Builder() {
            $ = new GroupResourceQueryArgs();
        }

        public Builder(GroupResourceQueryArgs defaults) {
            $ = new GroupResourceQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder query(@Nullable Output<GroupQueryArgs> query) {
            $.query = query;
            return this;
        }

        public Builder query(GroupQueryArgs query) {
            return query(Output.of(query));
        }

        public Builder type(@Nullable Output<GroupResourceQueryType> type) {
            $.type = type;
            return this;
        }

        public Builder type(GroupResourceQueryType type) {
            return type(Output.of(type));
        }

        public GroupResourceQueryArgs build() {
            return $;
        }
    }

}
