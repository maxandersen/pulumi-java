// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A condition type that checks whether a log message in the scoping project (https://cloud.google.com/monitoring/api/v3#project_name) satisfies the given filter. Logs from other projects in the metrics scope are not evaluated.
 * 
 */
public final class LogMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogMatchArgs Empty = new LogMatchArgs();

    /**
     * A logs-based filter. See Advanced Logs Queries (https://cloud.google.com/logging/docs/view/advanced-queries) for how this filter should be constructed.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    public Output<String> filter() {
        return this.filter;
    }

    /**
     * Optional. A map from a label key to an extractor expression, which is used to extract the value for this label key. Each entry in this map is a specification for how data should be extracted from log entries that match filter. Each combination of extracted values is treated as a separate rule for the purposes of triggering notifications. Label keys and corresponding values can be used in notifications generated by this condition.Please see the documentation on logs-based metric valueExtractors (https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.metrics#LogMetric.FIELDS.value_extractor) for syntax and examples.
     * 
     */
    @Import(name="labelExtractors")
    private @Nullable Output<Map<String,String>> labelExtractors;

    public Optional<Output<Map<String,String>>> labelExtractors() {
        return Optional.ofNullable(this.labelExtractors);
    }

    private LogMatchArgs() {}

    private LogMatchArgs(LogMatchArgs $) {
        this.filter = $.filter;
        this.labelExtractors = $.labelExtractors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogMatchArgs $;

        public Builder() {
            $ = new LogMatchArgs();
        }

        public Builder(LogMatchArgs defaults) {
            $ = new LogMatchArgs(Objects.requireNonNull(defaults));
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

        public LogMatchArgs build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            return $;
        }
    }

}
