// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.inputs;

import com.pulumi.awsnative.applicationinsights.enums.ApplicationEventLevel;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Windows Event to be monitored for the component.
 * 
 */
public final class ApplicationWindowsEvent extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationWindowsEvent Empty = new ApplicationWindowsEvent();

    /**
     * The levels of event to log.
     * 
     */
    @Import(name="eventLevels", required=true)
      private final List<ApplicationEventLevel> eventLevels;

    public List<ApplicationEventLevel> eventLevels() {
        return this.eventLevels;
    }

    /**
     * The type of Windows Events to log.
     * 
     */
    @Import(name="eventName", required=true)
      private final String eventName;

    public String eventName() {
        return this.eventName;
    }

    /**
     * The CloudWatch log group name to be associated to the monitored log.
     * 
     */
    @Import(name="logGroupName", required=true)
      private final String logGroupName;

    public String logGroupName() {
        return this.logGroupName;
    }

    /**
     * The name of the log pattern set.
     * 
     */
    @Import(name="patternSet")
      private final @Nullable String patternSet;

    public Optional<String> patternSet() {
        return this.patternSet == null ? Optional.empty() : Optional.ofNullable(this.patternSet);
    }

    public ApplicationWindowsEvent(
        List<ApplicationEventLevel> eventLevels,
        String eventName,
        String logGroupName,
        @Nullable String patternSet) {
        this.eventLevels = Objects.requireNonNull(eventLevels, "expected parameter 'eventLevels' to be non-null");
        this.eventName = Objects.requireNonNull(eventName, "expected parameter 'eventName' to be non-null");
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.patternSet = patternSet;
    }

    private ApplicationWindowsEvent() {
        this.eventLevels = List.of();
        this.eventName = null;
        this.logGroupName = null;
        this.patternSet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationWindowsEvent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApplicationEventLevel> eventLevels;
        private String eventName;
        private String logGroupName;
        private @Nullable String patternSet;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationWindowsEvent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventLevels = defaults.eventLevels;
    	      this.eventName = defaults.eventName;
    	      this.logGroupName = defaults.logGroupName;
    	      this.patternSet = defaults.patternSet;
        }

        public Builder eventLevels(List<ApplicationEventLevel> eventLevels) {
            this.eventLevels = Objects.requireNonNull(eventLevels);
            return this;
        }
        public Builder eventLevels(ApplicationEventLevel... eventLevels) {
            return eventLevels(List.of(eventLevels));
        }
        public Builder eventName(String eventName) {
            this.eventName = Objects.requireNonNull(eventName);
            return this;
        }
        public Builder logGroupName(String logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }
        public Builder patternSet(@Nullable String patternSet) {
            this.patternSet = patternSet;
            return this;
        }        public ApplicationWindowsEvent build() {
            return new ApplicationWindowsEvent(eventLevels, eventName, logGroupName, patternSet);
        }
    }
}
