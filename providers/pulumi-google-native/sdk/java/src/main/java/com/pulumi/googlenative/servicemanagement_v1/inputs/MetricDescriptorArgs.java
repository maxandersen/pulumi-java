// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.servicemanagement_v1.enums.MetricDescriptorLaunchStage;
import com.pulumi.googlenative.servicemanagement_v1.enums.MetricDescriptorMetricKind;
import com.pulumi.googlenative.servicemanagement_v1.enums.MetricDescriptorValueType;
import com.pulumi.googlenative.servicemanagement_v1.inputs.LabelDescriptorArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.MetricDescriptorMetadataArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a metric type and its schema. Once a metric descriptor is created, deleting or altering it stops data collection and makes the metric type&#39;s existing data unusable.
 * 
 */
public final class MetricDescriptorArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricDescriptorArgs Empty = new MetricDescriptorArgs();

    /**
     * A detailed description of the metric, which can be used in documentation.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example &#34;Request count&#34;. This field is optional but it is recommended to be set for any metrics associated with user-visible concepts, such as Quota.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The set of labels that can be used to describe a specific instance of this metric type. For example, the `appengine.googleapis.com/http/server/response_latencies` metric type has a label for the HTTP response code, `response_code`, so you can look at latencies for successful responses or just for responses that failed.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<LabelDescriptorArgs>> labels;

    public Output<List<LabelDescriptorArgs>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Optional. The launch stage of the metric definition.
     * 
     */
    @Import(name="launchStage")
      private final @Nullable Output<MetricDescriptorLaunchStage> launchStage;

    public Output<MetricDescriptorLaunchStage> launchStage() {
        return this.launchStage == null ? Codegen.empty() : this.launchStage;
    }

    /**
     * Optional. Metadata which can be used to guide usage of the metric.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<MetricDescriptorMetadataArgs> metadata;

    public Output<MetricDescriptorMetadataArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of `metric_kind` and `value_type` might not be supported.
     * 
     */
    @Import(name="metricKind")
      private final @Nullable Output<MetricDescriptorMetricKind> metricKind;

    public Output<MetricDescriptorMetricKind> metricKind() {
        return this.metricKind == null ? Codegen.empty() : this.metricKind;
    }

    /**
     * Read-only. If present, then a time series, which is identified partially by a metric type and a MonitoredResourceDescriptor, that is associated with this metric type can only be associated with one of the monitored resource types listed here.
     * 
     */
    @Import(name="monitoredResourceTypes")
      private final @Nullable Output<List<String>> monitoredResourceTypes;

    public Output<List<String>> monitoredResourceTypes() {
        return this.monitoredResourceTypes == null ? Codegen.empty() : this.monitoredResourceTypes;
    }

    /**
     * The resource name of the metric descriptor.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The metric type, including its DNS name prefix. The type is not URL-encoded. All user-defined metric types have the DNS name `custom.googleapis.com` or `external.googleapis.com`. Metric types should use a natural hierarchical grouping. For example: &#34;custom.googleapis.com/invoice/paid/amount&#34; &#34;external.googleapis.com/prometheus/up&#34; &#34;appengine.googleapis.com/http/server/response_latencies&#34;
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * The units in which the metric value is reported. It is only applicable if the `value_type` is `INT64`, `DOUBLE`, or `DISTRIBUTION`. The `unit` defines the representation of the stored metric values. Different systems might scale the values to be more easily displayed (so a value of `0.02kBy` _might_ be displayed as `20By`, and a value of `3523kBy` _might_ be displayed as `3.5MBy`). However, if the `unit` is `kBy`, then the value of the metric is always in thousands of bytes, no matter how it might be displayed. If you want a custom metric to record the exact number of CPU-seconds used by a job, you can create an `INT64 CUMULATIVE` metric whose `unit` is `s{CPU}` (or equivalently `1s{CPU}` or just `s`). If the job uses 12,005 CPU-seconds, then the value is written as `12005`. Alternatively, if you want a custom metric to record data in a more granular way, you can create a `DOUBLE CUMULATIVE` metric whose `unit` is `ks{CPU}`, and then write the value `12.005` (which is `12005/1000`), or use `Kis{CPU}` and write `11.723` (which is `12005/1024`). The supported units are a subset of [The Unified Code for Units of Measure](https://unitsofmeasure.org/ucum.html) standard: **Basic units (UNIT)** * `bit` bit * `By` byte * `s` second * `min` minute * `h` hour * `d` day * `1` dimensionless **Prefixes (PREFIX)** * `k` kilo (10^3) * `M` mega (10^6) * `G` giga (10^9) * `T` tera (10^12) * `P` peta (10^15) * `E` exa (10^18) * `Z` zetta (10^21) * `Y` yotta (10^24) * `m` milli (10^-3) * `u` micro (10^-6) * `n` nano (10^-9) * `p` pico (10^-12) * `f` femto (10^-15) * `a` atto (10^-18) * `z` zepto (10^-21) * `y` yocto (10^-24) * `Ki` kibi (2^10) * `Mi` mebi (2^20) * `Gi` gibi (2^30) * `Ti` tebi (2^40) * `Pi` pebi (2^50) **Grammar** The grammar also includes these connectors: * `/` division or ratio (as an infix operator). For examples, `kBy/{email}` or `MiBy/10ms` (although you should almost never have `/s` in a metric `unit`; rates should always be computed at query time from the underlying cumulative or delta value). * `.` multiplication or composition (as an infix operator). For examples, `GBy.d` or `k{watt}.h`. The grammar for a unit is as follows: Expression = Component { &#34;.&#34; Component } { &#34;/&#34; Component } ; Component = ( [ PREFIX ] UNIT | &#34;%&#34; ) [ Annotation ] | Annotation | &#34;1&#34; ; Annotation = &#34;{&#34; NAME &#34;}&#34; ; Notes: * `Annotation` is just a comment if it follows a `UNIT`. If the annotation is used alone, then the unit is equivalent to `1`. For examples, `{request}/s == 1/s`, `By{transmitted}/s == By/s`. * `NAME` is a sequence of non-blank printable ASCII characters not containing `{` or `}`. * `1` represents a unitary [dimensionless unit](https://en.wikipedia.org/wiki/Dimensionless_quantity) of 1, such as in `1/s`. It is typically used when none of the basic units are appropriate. For example, &#34;new users per day&#34; can be represented as `1/d` or `{new-users}/d` (and a metric value `5` would mean &#34;5 new users). Alternatively, &#34;thousands of page views per day&#34; would be represented as `1000/d` or `k1/d` or `k{page_views}/d` (and a metric value of `5.3` would mean &#34;5300 page views per day&#34;). * `%` represents dimensionless value of 1/100, and annotates values giving a percentage (so the metric values are typically in the range of 0..100, and a metric value `3` means &#34;3 percent&#34;). * `10^2.%` indicates a metric contains a ratio, typically in the range 0..1, that will be multiplied by 100 and displayed as a percentage (so a metric value `0.03` means &#34;3 percent&#34;).
     * 
     */
    @Import(name="unit")
      private final @Nullable Output<String> unit;

    public Output<String> unit() {
        return this.unit == null ? Codegen.empty() : this.unit;
    }

    /**
     * Whether the measurement is an integer, a floating-point number, etc. Some combinations of `metric_kind` and `value_type` might not be supported.
     * 
     */
    @Import(name="valueType")
      private final @Nullable Output<MetricDescriptorValueType> valueType;

    public Output<MetricDescriptorValueType> valueType() {
        return this.valueType == null ? Codegen.empty() : this.valueType;
    }

    public MetricDescriptorArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<List<LabelDescriptorArgs>> labels,
        @Nullable Output<MetricDescriptorLaunchStage> launchStage,
        @Nullable Output<MetricDescriptorMetadataArgs> metadata,
        @Nullable Output<MetricDescriptorMetricKind> metricKind,
        @Nullable Output<List<String>> monitoredResourceTypes,
        @Nullable Output<String> name,
        @Nullable Output<String> type,
        @Nullable Output<String> unit,
        @Nullable Output<MetricDescriptorValueType> valueType) {
        this.description = description;
        this.displayName = displayName;
        this.labels = labels;
        this.launchStage = launchStage;
        this.metadata = metadata;
        this.metricKind = metricKind;
        this.monitoredResourceTypes = monitoredResourceTypes;
        this.name = name;
        this.type = type;
        this.unit = unit;
        this.valueType = valueType;
    }

    private MetricDescriptorArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.labels = Codegen.empty();
        this.launchStage = Codegen.empty();
        this.metadata = Codegen.empty();
        this.metricKind = Codegen.empty();
        this.monitoredResourceTypes = Codegen.empty();
        this.name = Codegen.empty();
        this.type = Codegen.empty();
        this.unit = Codegen.empty();
        this.valueType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<List<LabelDescriptorArgs>> labels;
        private @Nullable Output<MetricDescriptorLaunchStage> launchStage;
        private @Nullable Output<MetricDescriptorMetadataArgs> metadata;
        private @Nullable Output<MetricDescriptorMetricKind> metricKind;
        private @Nullable Output<List<String>> monitoredResourceTypes;
        private @Nullable Output<String> name;
        private @Nullable Output<String> type;
        private @Nullable Output<String> unit;
        private @Nullable Output<MetricDescriptorValueType> valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDescriptorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.launchStage = defaults.launchStage;
    	      this.metadata = defaults.metadata;
    	      this.metricKind = defaults.metricKind;
    	      this.monitoredResourceTypes = defaults.monitoredResourceTypes;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
    	      this.valueType = defaults.valueType;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder labels(@Nullable Output<List<LabelDescriptorArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<LabelDescriptorArgs> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder labels(LabelDescriptorArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder launchStage(@Nullable Output<MetricDescriptorLaunchStage> launchStage) {
            this.launchStage = launchStage;
            return this;
        }
        public Builder launchStage(@Nullable MetricDescriptorLaunchStage launchStage) {
            this.launchStage = Codegen.ofNullable(launchStage);
            return this;
        }
        public Builder metadata(@Nullable Output<MetricDescriptorMetadataArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable MetricDescriptorMetadataArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder metricKind(@Nullable Output<MetricDescriptorMetricKind> metricKind) {
            this.metricKind = metricKind;
            return this;
        }
        public Builder metricKind(@Nullable MetricDescriptorMetricKind metricKind) {
            this.metricKind = Codegen.ofNullable(metricKind);
            return this;
        }
        public Builder monitoredResourceTypes(@Nullable Output<List<String>> monitoredResourceTypes) {
            this.monitoredResourceTypes = monitoredResourceTypes;
            return this;
        }
        public Builder monitoredResourceTypes(@Nullable List<String> monitoredResourceTypes) {
            this.monitoredResourceTypes = Codegen.ofNullable(monitoredResourceTypes);
            return this;
        }
        public Builder monitoredResourceTypes(String... monitoredResourceTypes) {
            return monitoredResourceTypes(List.of(monitoredResourceTypes));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder unit(@Nullable Output<String> unit) {
            this.unit = unit;
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = Codegen.ofNullable(unit);
            return this;
        }
        public Builder valueType(@Nullable Output<MetricDescriptorValueType> valueType) {
            this.valueType = valueType;
            return this;
        }
        public Builder valueType(@Nullable MetricDescriptorValueType valueType) {
            this.valueType = Codegen.ofNullable(valueType);
            return this;
        }        public MetricDescriptorArgs build() {
            return new MetricDescriptorArgs(description, displayName, labels, launchStage, metadata, metricKind, monitoredResourceTypes, name, type, unit, valueType);
        }
    }
}
