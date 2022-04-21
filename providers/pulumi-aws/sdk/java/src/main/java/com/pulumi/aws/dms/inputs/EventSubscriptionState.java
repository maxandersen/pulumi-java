// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventSubscriptionState extends com.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionState Empty = new EventSubscriptionState();

    /**
     * Amazon Resource Name (ARN) of the DMS Event Subscription.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Whether the event subscription should be enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
     * 
     */
    @Import(name="eventCategories")
    private @Nullable Output<List<String>> eventCategories;

    public Optional<Output<List<String>>> eventCategories() {
        return Optional.ofNullable(this.eventCategories);
    }

    /**
     * Name of event subscription.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * SNS topic arn to send events on.
     * 
     */
    @Import(name="snsTopicArn")
    private @Nullable Output<String> snsTopicArn;

    public Optional<Output<String>> snsTopicArn() {
        return Optional.ofNullable(this.snsTopicArn);
    }

    /**
     * Ids of sources to listen to.
     * 
     */
    @Import(name="sourceIds")
    private @Nullable Output<List<String>> sourceIds;

    public Optional<Output<List<String>>> sourceIds() {
        return Optional.ofNullable(this.sourceIds);
    }

    /**
     * Type of source for events. Valid values: `replication-instance` or `replication-task`
     * 
     */
    @Import(name="sourceType")
    private @Nullable Output<String> sourceType;

    public Optional<Output<String>> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    /**
     * Map of resource tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private EventSubscriptionState() {}

    private EventSubscriptionState(EventSubscriptionState $) {
        this.arn = $.arn;
        this.enabled = $.enabled;
        this.eventCategories = $.eventCategories;
        this.name = $.name;
        this.snsTopicArn = $.snsTopicArn;
        this.sourceIds = $.sourceIds;
        this.sourceType = $.sourceType;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSubscriptionState $;

        public Builder() {
            $ = new EventSubscriptionState();
        }

        public Builder(EventSubscriptionState defaults) {
            $ = new EventSubscriptionState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder eventCategories(@Nullable Output<List<String>> eventCategories) {
            $.eventCategories = eventCategories;
            return this;
        }

        public Builder eventCategories(List<String> eventCategories) {
            return eventCategories(Output.of(eventCategories));
        }

        public Builder eventCategories(String... eventCategories) {
            return eventCategories(List.of(eventCategories));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder snsTopicArn(@Nullable Output<String> snsTopicArn) {
            $.snsTopicArn = snsTopicArn;
            return this;
        }

        public Builder snsTopicArn(String snsTopicArn) {
            return snsTopicArn(Output.of(snsTopicArn));
        }

        public Builder sourceIds(@Nullable Output<List<String>> sourceIds) {
            $.sourceIds = sourceIds;
            return this;
        }

        public Builder sourceIds(List<String> sourceIds) {
            return sourceIds(Output.of(sourceIds));
        }

        public Builder sourceIds(String... sourceIds) {
            return sourceIds(List.of(sourceIds));
        }

        public Builder sourceType(@Nullable Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public EventSubscriptionState build() {
            return $;
        }
    }

}
