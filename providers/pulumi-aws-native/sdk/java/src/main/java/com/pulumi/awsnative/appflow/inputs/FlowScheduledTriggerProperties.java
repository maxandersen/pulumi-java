// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.enums.FlowScheduledTriggerPropertiesDataPullMode;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details required for scheduled trigger type
 * 
 */
public final class FlowScheduledTriggerProperties extends com.pulumi.resources.InvokeArgs {

    public static final FlowScheduledTriggerProperties Empty = new FlowScheduledTriggerProperties();

    @Import(name="dataPullMode")
    private @Nullable FlowScheduledTriggerPropertiesDataPullMode dataPullMode;

    public Optional<FlowScheduledTriggerPropertiesDataPullMode> dataPullMode() {
        return Optional.ofNullable(this.dataPullMode);
    }

    @Import(name="scheduleEndTime")
    private @Nullable Double scheduleEndTime;

    public Optional<Double> scheduleEndTime() {
        return Optional.ofNullable(this.scheduleEndTime);
    }

    @Import(name="scheduleExpression", required=true)
    private String scheduleExpression;

    public String scheduleExpression() {
        return this.scheduleExpression;
    }

    @Import(name="scheduleOffset")
    private @Nullable Double scheduleOffset;

    public Optional<Double> scheduleOffset() {
        return Optional.ofNullable(this.scheduleOffset);
    }

    @Import(name="scheduleStartTime")
    private @Nullable Double scheduleStartTime;

    public Optional<Double> scheduleStartTime() {
        return Optional.ofNullable(this.scheduleStartTime);
    }

    @Import(name="timeZone")
    private @Nullable String timeZone;

    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private FlowScheduledTriggerProperties() {}

    private FlowScheduledTriggerProperties(FlowScheduledTriggerProperties $) {
        this.dataPullMode = $.dataPullMode;
        this.scheduleEndTime = $.scheduleEndTime;
        this.scheduleExpression = $.scheduleExpression;
        this.scheduleOffset = $.scheduleOffset;
        this.scheduleStartTime = $.scheduleStartTime;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowScheduledTriggerProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowScheduledTriggerProperties $;

        public Builder() {
            $ = new FlowScheduledTriggerProperties();
        }

        public Builder(FlowScheduledTriggerProperties defaults) {
            $ = new FlowScheduledTriggerProperties(Objects.requireNonNull(defaults));
        }

        public Builder dataPullMode(@Nullable FlowScheduledTriggerPropertiesDataPullMode dataPullMode) {
            $.dataPullMode = dataPullMode;
            return this;
        }

        public Builder scheduleEndTime(@Nullable Double scheduleEndTime) {
            $.scheduleEndTime = scheduleEndTime;
            return this;
        }

        public Builder scheduleExpression(String scheduleExpression) {
            $.scheduleExpression = scheduleExpression;
            return this;
        }

        public Builder scheduleOffset(@Nullable Double scheduleOffset) {
            $.scheduleOffset = scheduleOffset;
            return this;
        }

        public Builder scheduleStartTime(@Nullable Double scheduleStartTime) {
            $.scheduleStartTime = scheduleStartTime;
            return this;
        }

        public Builder timeZone(@Nullable String timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        public FlowScheduledTriggerProperties build() {
            $.scheduleExpression = Objects.requireNonNull($.scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
            return $;
        }
    }

}
