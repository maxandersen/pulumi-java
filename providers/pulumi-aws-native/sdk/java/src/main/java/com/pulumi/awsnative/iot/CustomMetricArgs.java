// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot;

import com.pulumi.awsnative.iot.enums.CustomMetricMetricType;
import com.pulumi.awsnative.iot.inputs.CustomMetricTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomMetricArgs Empty = new CustomMetricArgs();

    /**
     * Field represents a friendly name in the console for the custom metric; it doesn&#39;t have to be unique. Don&#39;t use this name as the metric identifier in the device metric report. Can be updated once defined.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn&#39;t begin with aws: . Cannot be updated once defined.
     * 
     */
    @Import(name="metricName")
      private final @Nullable Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName == null ? Codegen.empty() : this.metricName;
    }

    /**
     * The type of the custom metric. Types include string-list, ip-address-list, number-list, and number.
     * 
     */
    @Import(name="metricType", required=true)
      private final Output<CustomMetricMetricType> metricType;

    public Output<CustomMetricMetricType> metricType() {
        return this.metricType;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<CustomMetricTagArgs>> tags;

    public Output<List<CustomMetricTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public CustomMetricArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<String> metricName,
        Output<CustomMetricMetricType> metricType,
        @Nullable Output<List<CustomMetricTagArgs>> tags) {
        this.displayName = displayName;
        this.metricName = metricName;
        this.metricType = Objects.requireNonNull(metricType, "expected parameter 'metricType' to be non-null");
        this.tags = tags;
    }

    private CustomMetricArgs() {
        this.displayName = Codegen.empty();
        this.metricName = Codegen.empty();
        this.metricType = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> metricName;
        private Output<CustomMetricMetricType> metricType;
        private @Nullable Output<List<CustomMetricTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.metricName = defaults.metricName;
    	      this.metricType = defaults.metricType;
    	      this.tags = defaults.tags;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder metricName(@Nullable Output<String> metricName) {
            this.metricName = metricName;
            return this;
        }
        public Builder metricName(@Nullable String metricName) {
            this.metricName = Codegen.ofNullable(metricName);
            return this;
        }
        public Builder metricType(Output<CustomMetricMetricType> metricType) {
            this.metricType = Objects.requireNonNull(metricType);
            return this;
        }
        public Builder metricType(CustomMetricMetricType metricType) {
            this.metricType = Output.of(Objects.requireNonNull(metricType));
            return this;
        }
        public Builder tags(@Nullable Output<List<CustomMetricTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<CustomMetricTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(CustomMetricTagArgs... tags) {
            return tags(List.of(tags));
        }        public CustomMetricArgs build() {
            return new CustomMetricArgs(displayName, metricName, metricType, tags);
        }
    }
}
