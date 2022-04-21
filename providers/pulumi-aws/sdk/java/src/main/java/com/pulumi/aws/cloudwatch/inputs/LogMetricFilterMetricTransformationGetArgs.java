// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogMetricFilterMetricTransformationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogMetricFilterMetricTransformationGetArgs Empty = new LogMetricFilterMetricTransformationGetArgs();

    /**
     * The value to emit when a filter pattern does not match a log event. Conflicts with `dimensions`.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<String> defaultValue;

    public Optional<Output<String>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * Map of fields to use as dimensions for the metric. Up to 3 dimensions are allowed. Conflicts with `default_value`.
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<Map<String,String>> dimensions;

    public Optional<Output<Map<String,String>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * The name of the CloudWatch metric to which the monitored log information should be published (e.g., `ErrorCount`)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The destination namespace of the CloudWatch metric.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * The unit to assign to the metric. If you omit this, the unit is set as `None`.
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    /**
     * What to publish to the metric. For example, if you&#39;re counting the occurrences of a particular term like &#34;Error&#34;, the value will be &#34;1&#34; for each occurrence. If you&#39;re counting the bytes transferred the published value will be the value in the log event.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private LogMetricFilterMetricTransformationGetArgs() {}

    private LogMetricFilterMetricTransformationGetArgs(LogMetricFilterMetricTransformationGetArgs $) {
        this.defaultValue = $.defaultValue;
        this.dimensions = $.dimensions;
        this.name = $.name;
        this.namespace = $.namespace;
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogMetricFilterMetricTransformationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogMetricFilterMetricTransformationGetArgs $;

        public Builder() {
            $ = new LogMetricFilterMetricTransformationGetArgs();
        }

        public Builder(LogMetricFilterMetricTransformationGetArgs defaults) {
            $ = new LogMetricFilterMetricTransformationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        public Builder defaultValue(String defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        public Builder dimensions(@Nullable Output<Map<String,String>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(Map<String,String> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public LogMetricFilterMetricTransformationGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
