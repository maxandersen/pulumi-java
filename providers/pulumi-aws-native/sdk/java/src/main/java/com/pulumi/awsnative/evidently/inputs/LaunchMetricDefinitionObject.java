// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LaunchMetricDefinitionObject extends com.pulumi.resources.InvokeArgs {

    public static final LaunchMetricDefinitionObject Empty = new LaunchMetricDefinitionObject();

    /**
     * The JSON path to reference the entity id in the event.
     * 
     */
    @Import(name="entityIdKey", required=true)
      private final String entityIdKey;

    public String entityIdKey() {
        return this.entityIdKey;
    }

    /**
     * Event patterns have the same structure as the events they match. Rules use event patterns to select events. An event pattern either matches an event or it doesn't.
     * 
     */
    @Import(name="eventPattern", required=true)
      private final String eventPattern;

    public String eventPattern() {
        return this.eventPattern;
    }

    @Import(name="metricName", required=true)
      private final String metricName;

    public String metricName() {
        return this.metricName;
    }

    @Import(name="unitLabel")
      private final @Nullable String unitLabel;

    public Optional<String> unitLabel() {
        return this.unitLabel == null ? Optional.empty() : Optional.ofNullable(this.unitLabel);
    }

    /**
     * The JSON path to reference the numerical metric value in the event.
     * 
     */
    @Import(name="valueKey", required=true)
      private final String valueKey;

    public String valueKey() {
        return this.valueKey;
    }

    public LaunchMetricDefinitionObject(
        String entityIdKey,
        String eventPattern,
        String metricName,
        @Nullable String unitLabel,
        String valueKey) {
        this.entityIdKey = Objects.requireNonNull(entityIdKey, "expected parameter 'entityIdKey' to be non-null");
        this.eventPattern = Objects.requireNonNull(eventPattern, "expected parameter 'eventPattern' to be non-null");
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.unitLabel = unitLabel;
        this.valueKey = Objects.requireNonNull(valueKey, "expected parameter 'valueKey' to be non-null");
    }

    private LaunchMetricDefinitionObject() {
        this.entityIdKey = null;
        this.eventPattern = null;
        this.metricName = null;
        this.unitLabel = null;
        this.valueKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchMetricDefinitionObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entityIdKey;
        private String eventPattern;
        private String metricName;
        private @Nullable String unitLabel;
        private String valueKey;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchMetricDefinitionObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityIdKey = defaults.entityIdKey;
    	      this.eventPattern = defaults.eventPattern;
    	      this.metricName = defaults.metricName;
    	      this.unitLabel = defaults.unitLabel;
    	      this.valueKey = defaults.valueKey;
        }

        public Builder entityIdKey(String entityIdKey) {
            this.entityIdKey = Objects.requireNonNull(entityIdKey);
            return this;
        }
        public Builder eventPattern(String eventPattern) {
            this.eventPattern = Objects.requireNonNull(eventPattern);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder unitLabel(@Nullable String unitLabel) {
            this.unitLabel = unitLabel;
            return this;
        }
        public Builder valueKey(String valueKey) {
            this.valueKey = Objects.requireNonNull(valueKey);
            return this;
        }        public LaunchMetricDefinitionObject build() {
            return new LaunchMetricDefinitionObject(entityIdKey, eventPattern, metricName, unitLabel, valueKey);
        }
    }
}
