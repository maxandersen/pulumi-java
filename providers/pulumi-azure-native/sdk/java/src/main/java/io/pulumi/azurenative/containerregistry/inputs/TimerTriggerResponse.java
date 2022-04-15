// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a timer trigger.
 * 
 */
public final class TimerTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final TimerTriggerResponse Empty = new TimerTriggerResponse();

    /**
     * The name of the trigger.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The CRON expression for the task schedule
     * 
     */
    @Import(name="schedule", required=true)
      private final String schedule;

    public String schedule() {
        return this.schedule;
    }

    /**
     * The current status of trigger.
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public TimerTriggerResponse(
        String name,
        String schedule,
        @Nullable String status) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.status = status == null ? "Enabled" : status;
    }

    private TimerTriggerResponse() {
        this.name = null;
        this.schedule = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimerTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String schedule;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(TimerTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.status = defaults.status;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public TimerTriggerResponse build() {
            return new TimerTriggerResponse(name, schedule, status);
        }
    }
}
