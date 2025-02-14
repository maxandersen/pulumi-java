// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataplex_v1.enums.GoogleCloudDataplexV1TaskTriggerSpecType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Task scheduling and trigger settings.
 * 
 */
public final class GoogleCloudDataplexV1TaskTriggerSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDataplexV1TaskTriggerSpecArgs Empty = new GoogleCloudDataplexV1TaskTriggerSpecArgs();

    /**
     * Optional. Prevent the task from executing. This does not cancel already running tasks. It is intended to temporarily disable RECURRING tasks.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Optional. Prevent the task from executing. This does not cancel already running tasks. It is intended to temporarily disable RECURRING tasks.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * Optional. Number of retry attempts before aborting. Set to zero to never attempt to retry a failed task.
     * 
     */
    @Import(name="maxRetries")
    private @Nullable Output<Integer> maxRetries;

    /**
     * @return Optional. Number of retry attempts before aborting. Set to zero to never attempt to retry a failed task.
     * 
     */
    public Optional<Output<Integer>> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

    /**
     * Optional. Cron schedule (https://en.wikipedia.org/wiki/Cron) for running tasks periodically. To explicitly set a timezone to the cron tab, apply a prefix in the cron tab: &#34;CRON_TZ=${IANA_TIME_ZONE}&#34; or &#34;TZ=${IANA_TIME_ZONE}&#34;. The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone database. For example, &#34;CRON_TZ=America/New_York 1 * * * *&#34;, or &#34;TZ=America/New_York 1 * * * *&#34;. This field is required for RECURRING tasks.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    /**
     * @return Optional. Cron schedule (https://en.wikipedia.org/wiki/Cron) for running tasks periodically. To explicitly set a timezone to the cron tab, apply a prefix in the cron tab: &#34;CRON_TZ=${IANA_TIME_ZONE}&#34; or &#34;TZ=${IANA_TIME_ZONE}&#34;. The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone database. For example, &#34;CRON_TZ=America/New_York 1 * * * *&#34;, or &#34;TZ=America/New_York 1 * * * *&#34;. This field is required for RECURRING tasks.
     * 
     */
    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * Optional. The first run of the task will be after this time. If not specified, the task will run shortly after being submitted if ON_DEMAND and based on the schedule if RECURRING.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Optional. The first run of the task will be after this time. If not specified, the task will run shortly after being submitted if ON_DEMAND and based on the schedule if RECURRING.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * Immutable. Trigger type of the user-specified Task.
     * 
     */
    @Import(name="type", required=true)
    private Output<GoogleCloudDataplexV1TaskTriggerSpecType> type;

    /**
     * @return Immutable. Trigger type of the user-specified Task.
     * 
     */
    public Output<GoogleCloudDataplexV1TaskTriggerSpecType> type() {
        return this.type;
    }

    private GoogleCloudDataplexV1TaskTriggerSpecArgs() {}

    private GoogleCloudDataplexV1TaskTriggerSpecArgs(GoogleCloudDataplexV1TaskTriggerSpecArgs $) {
        this.disabled = $.disabled;
        this.maxRetries = $.maxRetries;
        this.schedule = $.schedule;
        this.startTime = $.startTime;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDataplexV1TaskTriggerSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDataplexV1TaskTriggerSpecArgs $;

        public Builder() {
            $ = new GoogleCloudDataplexV1TaskTriggerSpecArgs();
        }

        public Builder(GoogleCloudDataplexV1TaskTriggerSpecArgs defaults) {
            $ = new GoogleCloudDataplexV1TaskTriggerSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled Optional. Prevent the task from executing. This does not cancel already running tasks. It is intended to temporarily disable RECURRING tasks.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Optional. Prevent the task from executing. This does not cancel already running tasks. It is intended to temporarily disable RECURRING tasks.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param maxRetries Optional. Number of retry attempts before aborting. Set to zero to never attempt to retry a failed task.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        /**
         * @param maxRetries Optional. Number of retry attempts before aborting. Set to zero to never attempt to retry a failed task.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(Integer maxRetries) {
            return maxRetries(Output.of(maxRetries));
        }

        /**
         * @param schedule Optional. Cron schedule (https://en.wikipedia.org/wiki/Cron) for running tasks periodically. To explicitly set a timezone to the cron tab, apply a prefix in the cron tab: &#34;CRON_TZ=${IANA_TIME_ZONE}&#34; or &#34;TZ=${IANA_TIME_ZONE}&#34;. The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone database. For example, &#34;CRON_TZ=America/New_York 1 * * * *&#34;, or &#34;TZ=America/New_York 1 * * * *&#34;. This field is required for RECURRING tasks.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Optional. Cron schedule (https://en.wikipedia.org/wiki/Cron) for running tasks periodically. To explicitly set a timezone to the cron tab, apply a prefix in the cron tab: &#34;CRON_TZ=${IANA_TIME_ZONE}&#34; or &#34;TZ=${IANA_TIME_ZONE}&#34;. The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone database. For example, &#34;CRON_TZ=America/New_York 1 * * * *&#34;, or &#34;TZ=America/New_York 1 * * * *&#34;. This field is required for RECURRING tasks.
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param startTime Optional. The first run of the task will be after this time. If not specified, the task will run shortly after being submitted if ON_DEMAND and based on the schedule if RECURRING.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Optional. The first run of the task will be after this time. If not specified, the task will run shortly after being submitted if ON_DEMAND and based on the schedule if RECURRING.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param type Immutable. Trigger type of the user-specified Task.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<GoogleCloudDataplexV1TaskTriggerSpecType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Immutable. Trigger type of the user-specified Task.
         * 
         * @return builder
         * 
         */
        public Builder type(GoogleCloudDataplexV1TaskTriggerSpecType type) {
            return type(Output.of(type));
        }

        public GoogleCloudDataplexV1TaskTriggerSpecArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
