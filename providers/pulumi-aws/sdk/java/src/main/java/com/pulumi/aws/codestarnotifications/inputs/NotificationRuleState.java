// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codestarnotifications.inputs;

import com.pulumi.aws.codestarnotifications.inputs.NotificationRuleTargetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationRuleState extends com.pulumi.resources.ResourceArgs {

    public static final NotificationRuleState Empty = new NotificationRuleState();

    /**
     * The codestar notification rule ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The codestar notification rule ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
     * 
     */
    @Import(name="detailType")
    private @Nullable Output<String> detailType;

    /**
     * @return The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
     * 
     */
    public Optional<Output<String>> detailType() {
        return Optional.ofNullable(this.detailType);
    }

    /**
     * A list of event types associated with this notification rule.
     * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
     * 
     */
    @Import(name="eventTypeIds")
    private @Nullable Output<List<String>> eventTypeIds;

    /**
     * @return A list of event types associated with this notification rule.
     * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
     * 
     */
    public Optional<Output<List<String>>> eventTypeIds() {
        return Optional.ofNullable(this.eventTypeIds);
    }

    /**
     * The name of notification rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of notification rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ARN of the resource to associate with the notification rule.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return The ARN of the resource to associate with the notification rule.
     * 
     */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    /**
     * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
     * 
     */
    @Import(name="targets")
    private @Nullable Output<List<NotificationRuleTargetArgs>> targets;

    /**
     * @return Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
     * 
     */
    public Optional<Output<List<NotificationRuleTargetArgs>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    private NotificationRuleState() {}

    private NotificationRuleState(NotificationRuleState $) {
        this.arn = $.arn;
        this.detailType = $.detailType;
        this.eventTypeIds = $.eventTypeIds;
        this.name = $.name;
        this.resource = $.resource;
        this.status = $.status;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.targets = $.targets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationRuleState $;

        public Builder() {
            $ = new NotificationRuleState();
        }

        public Builder(NotificationRuleState defaults) {
            $ = new NotificationRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The codestar notification rule ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The codestar notification rule ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param detailType The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
         * 
         * @return builder
         * 
         */
        public Builder detailType(@Nullable Output<String> detailType) {
            $.detailType = detailType;
            return this;
        }

        /**
         * @param detailType The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
         * 
         * @return builder
         * 
         */
        public Builder detailType(String detailType) {
            return detailType(Output.of(detailType));
        }

        /**
         * @param eventTypeIds A list of event types associated with this notification rule.
         * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
         * 
         * @return builder
         * 
         */
        public Builder eventTypeIds(@Nullable Output<List<String>> eventTypeIds) {
            $.eventTypeIds = eventTypeIds;
            return this;
        }

        /**
         * @param eventTypeIds A list of event types associated with this notification rule.
         * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
         * 
         * @return builder
         * 
         */
        public Builder eventTypeIds(List<String> eventTypeIds) {
            return eventTypeIds(Output.of(eventTypeIds));
        }

        /**
         * @param eventTypeIds A list of event types associated with this notification rule.
         * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
         * 
         * @return builder
         * 
         */
        public Builder eventTypeIds(String... eventTypeIds) {
            return eventTypeIds(List.of(eventTypeIds));
        }

        /**
         * @param name The name of notification rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of notification rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resource The ARN of the resource to associate with the notification rule.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource The ARN of the resource to associate with the notification rule.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param status The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param targets Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
         * 
         * @return builder
         * 
         */
        public Builder targets(@Nullable Output<List<NotificationRuleTargetArgs>> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @param targets Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
         * 
         * @return builder
         * 
         */
        public Builder targets(List<NotificationRuleTargetArgs> targets) {
            return targets(Output.of(targets));
        }

        /**
         * @param targets Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
         * 
         * @return builder
         * 
         */
        public Builder targets(NotificationRuleTargetArgs... targets) {
            return targets(List.of(targets));
        }

        public NotificationRuleState build() {
            return $;
        }
    }

}
