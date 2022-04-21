// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs;
import com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricArgs Empty = new MetricArgs();

    /**
     * The bucketOptions are required when the logs-based metric is using a DISTRIBUTION value type and it
     * describes the bucket boundaries used to create a histogram of the extracted values.
     * Structure is documented below.
     * 
     */
    @Import(name="bucketOptions")
    private @Nullable Output<MetricBucketOptionsArgs> bucketOptions;

    public Optional<Output<MetricBucketOptionsArgs>> bucketOptions() {
        return Optional.ofNullable(this.bucketOptions);
    }

    /**
     * A description of this metric, which is used in documentation. The maximum length of the
     * description is 8000 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-filters) which
     * is used to match log entries.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    public Output<String> filter() {
        return this.filter;
    }

    /**
     * A map from a label key string to an extractor expression which is used to extract data from a log
     * entry field and assign as the label value. Each label key specified in the LabelDescriptor must
     * have an associated extractor expression in this map. The syntax of the extractor expression is
     * the same as for the valueExtractor field.
     * 
     */
    @Import(name="labelExtractors")
    private @Nullable Output<Map<String,String>> labelExtractors;

    public Optional<Output<Map<String,String>>> labelExtractors() {
        return Optional.ofNullable(this.labelExtractors);
    }

    /**
     * The metric descriptor associated with the logs-based metric.
     * Structure is documented below.
     * 
     */
    @Import(name="metricDescriptor", required=true)
    private Output<MetricMetricDescriptorArgs> metricDescriptor;

    public Output<MetricMetricDescriptorArgs> metricDescriptor() {
        return this.metricDescriptor;
    }

    /**
     * The client-assigned metric identifier. Examples - &#34;error_count&#34;, &#34;nginx/requests&#34;.
     * Metric identifiers are limited to 100 characters and can include only the following
     * characters A-Z, a-z, 0-9, and the special characters _-.,+!*&#39;,()%/. The forward-slash
     * character (/) denotes a hierarchy of name pieces, and it cannot be the first character
     * of the name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A valueExtractor is required when using a distribution logs-based metric to extract the values to
     * record from a log entry. Two functions are supported for value extraction - EXTRACT(field) or
     * REGEXP_EXTRACT(field, regex). The argument are 1. field - The name of the log entry field from which
     * the value is to be extracted. 2. regex - A regular expression using the Google RE2 syntax
     * (https://github.com/google/re2/wiki/Syntax) with a single capture group to extract data from the specified
     * log entry field. The value of the field is converted to a string before applying the regex. It is an
     * error to specify a regex that does not include exactly one capture group.
     * 
     */
    @Import(name="valueExtractor")
    private @Nullable Output<String> valueExtractor;

    public Optional<Output<String>> valueExtractor() {
        return Optional.ofNullable(this.valueExtractor);
    }

    private MetricArgs() {}

    private MetricArgs(MetricArgs $) {
        this.bucketOptions = $.bucketOptions;
        this.description = $.description;
        this.filter = $.filter;
        this.labelExtractors = $.labelExtractors;
        this.metricDescriptor = $.metricDescriptor;
        this.name = $.name;
        this.project = $.project;
        this.valueExtractor = $.valueExtractor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricArgs $;

        public Builder() {
            $ = new MetricArgs();
        }

        public Builder(MetricArgs defaults) {
            $ = new MetricArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketOptions(@Nullable Output<MetricBucketOptionsArgs> bucketOptions) {
            $.bucketOptions = bucketOptions;
            return this;
        }

        public Builder bucketOptions(MetricBucketOptionsArgs bucketOptions) {
            return bucketOptions(Output.of(bucketOptions));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public Builder labelExtractors(@Nullable Output<Map<String,String>> labelExtractors) {
            $.labelExtractors = labelExtractors;
            return this;
        }

        public Builder labelExtractors(Map<String,String> labelExtractors) {
            return labelExtractors(Output.of(labelExtractors));
        }

        public Builder metricDescriptor(Output<MetricMetricDescriptorArgs> metricDescriptor) {
            $.metricDescriptor = metricDescriptor;
            return this;
        }

        public Builder metricDescriptor(MetricMetricDescriptorArgs metricDescriptor) {
            return metricDescriptor(Output.of(metricDescriptor));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder valueExtractor(@Nullable Output<String> valueExtractor) {
            $.valueExtractor = valueExtractor;
            return this;
        }

        public Builder valueExtractor(String valueExtractor) {
            return valueExtractor(Output.of(valueExtractor));
        }

        public MetricArgs build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.metricDescriptor = Objects.requireNonNull($.metricDescriptor, "expected parameter 'metricDescriptor' to be non-null");
            return $;
        }
    }

}
