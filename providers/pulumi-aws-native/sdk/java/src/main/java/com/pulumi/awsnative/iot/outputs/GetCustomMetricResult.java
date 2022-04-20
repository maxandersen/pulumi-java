// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.awsnative.iot.outputs.CustomMetricTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCustomMetricResult {
    /**
     * Field represents a friendly name in the console for the custom metric; it doesn&#39;t have to be unique. Don&#39;t use this name as the metric identifier in the device metric report. Can be updated once defined.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The Amazon Resource Number (ARN) of the custom metric.
     * 
     */
    private final @Nullable String metricArn;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<CustomMetricTag> tags;

    @CustomType.Constructor
    private GetCustomMetricResult(
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("metricArn") @Nullable String metricArn,
        @CustomType.Parameter("tags") @Nullable List<CustomMetricTag> tags) {
        this.displayName = displayName;
        this.metricArn = metricArn;
        this.tags = tags;
    }

    /**
     * Field represents a friendly name in the console for the custom metric; it doesn&#39;t have to be unique. Don&#39;t use this name as the metric identifier in the device metric report. Can be updated once defined.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The Amazon Resource Number (ARN) of the custom metric.
     * 
    */
    public Optional<String> metricArn() {
        return Optional.ofNullable(this.metricArn);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<CustomMetricTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomMetricResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String metricArn;
        private @Nullable List<CustomMetricTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomMetricResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.metricArn = defaults.metricArn;
    	      this.tags = defaults.tags;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder metricArn(@Nullable String metricArn) {
            this.metricArn = metricArn;
            return this;
        }
        public Builder tags(@Nullable List<CustomMetricTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(CustomMetricTag... tags) {
            return tags(List.of(tags));
        }        public GetCustomMetricResult build() {
            return new GetCustomMetricResult(displayName, metricArn, tags);
        }
    }
}
