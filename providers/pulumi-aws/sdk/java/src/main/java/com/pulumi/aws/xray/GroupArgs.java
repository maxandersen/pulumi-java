// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.xray;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * The filter expression defining criteria by which to group traces. more info can be found in official [docs](https://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html).
     * 
     */
    @Import(name="filterExpression", required=true)
    private Output<String> filterExpression;

    public Output<String> filterExpression() {
        return this.filterExpression;
    }

    /**
     * The name of the group.
     * 
     */
    @Import(name="groupName", required=true)
    private Output<String> groupName;

    public Output<String> groupName() {
        return this.groupName;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GroupArgs() {}

    private GroupArgs(GroupArgs $) {
        this.filterExpression = $.filterExpression;
        this.groupName = $.groupName;
        this.tags = $.tags;
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

        public Builder filterExpression(Output<String> filterExpression) {
            $.filterExpression = filterExpression;
            return this;
        }

        public Builder filterExpression(String filterExpression) {
            return filterExpression(Output.of(filterExpression));
        }

        public Builder groupName(Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GroupArgs build() {
            $.filterExpression = Objects.requireNonNull($.filterExpression, "expected parameter 'filterExpression' to be non-null");
            $.groupName = Objects.requireNonNull($.groupName, "expected parameter 'groupName' to be non-null");
            return $;
        }
    }

}
