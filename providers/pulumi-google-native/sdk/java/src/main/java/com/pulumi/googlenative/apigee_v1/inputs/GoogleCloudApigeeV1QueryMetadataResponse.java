// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudApigeeV1QueryMetadataResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1QueryMetadataResponse Empty = new GoogleCloudApigeeV1QueryMetadataResponse();

    /**
     * Dimensions of the AsyncQuery.
     * 
     */
    @Import(name="dimensions", required=true)
    private List<String> dimensions;

    public List<String> dimensions() {
        return this.dimensions;
    }

    /**
     * End timestamp of the query range.
     * 
     */
    @Import(name="endTimestamp", required=true)
    private String endTimestamp;

    public String endTimestamp() {
        return this.endTimestamp;
    }

    /**
     * Metrics of the AsyncQuery. Example: [&#34;name:message_count,func:sum,alias:sum_message_count&#34;]
     * 
     */
    @Import(name="metrics", required=true)
    private List<String> metrics;

    public List<String> metrics() {
        return this.metrics;
    }

    /**
     * Output format.
     * 
     */
    @Import(name="outputFormat", required=true)
    private String outputFormat;

    public String outputFormat() {
        return this.outputFormat;
    }

    /**
     * Start timestamp of the query range.
     * 
     */
    @Import(name="startTimestamp", required=true)
    private String startTimestamp;

    public String startTimestamp() {
        return this.startTimestamp;
    }

    /**
     * Query GroupBy time unit.
     * 
     */
    @Import(name="timeUnit", required=true)
    private String timeUnit;

    public String timeUnit() {
        return this.timeUnit;
    }

    private GoogleCloudApigeeV1QueryMetadataResponse() {}

    private GoogleCloudApigeeV1QueryMetadataResponse(GoogleCloudApigeeV1QueryMetadataResponse $) {
        this.dimensions = $.dimensions;
        this.endTimestamp = $.endTimestamp;
        this.metrics = $.metrics;
        this.outputFormat = $.outputFormat;
        this.startTimestamp = $.startTimestamp;
        this.timeUnit = $.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1QueryMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1QueryMetadataResponse $;

        public Builder() {
            $ = new GoogleCloudApigeeV1QueryMetadataResponse();
        }

        public Builder(GoogleCloudApigeeV1QueryMetadataResponse defaults) {
            $ = new GoogleCloudApigeeV1QueryMetadataResponse(Objects.requireNonNull(defaults));
        }

        public Builder dimensions(List<String> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(String... dimensions) {
            return dimensions(List.of(dimensions));
        }

        public Builder endTimestamp(String endTimestamp) {
            $.endTimestamp = endTimestamp;
            return this;
        }

        public Builder metrics(List<String> metrics) {
            $.metrics = metrics;
            return this;
        }

        public Builder metrics(String... metrics) {
            return metrics(List.of(metrics));
        }

        public Builder outputFormat(String outputFormat) {
            $.outputFormat = outputFormat;
            return this;
        }

        public Builder startTimestamp(String startTimestamp) {
            $.startTimestamp = startTimestamp;
            return this;
        }

        public Builder timeUnit(String timeUnit) {
            $.timeUnit = timeUnit;
            return this;
        }

        public GoogleCloudApigeeV1QueryMetadataResponse build() {
            $.dimensions = Objects.requireNonNull($.dimensions, "expected parameter 'dimensions' to be non-null");
            $.endTimestamp = Objects.requireNonNull($.endTimestamp, "expected parameter 'endTimestamp' to be non-null");
            $.metrics = Objects.requireNonNull($.metrics, "expected parameter 'metrics' to be non-null");
            $.outputFormat = Objects.requireNonNull($.outputFormat, "expected parameter 'outputFormat' to be non-null");
            $.startTimestamp = Objects.requireNonNull($.startTimestamp, "expected parameter 'startTimestamp' to be non-null");
            $.timeUnit = Objects.requireNonNull($.timeUnit, "expected parameter 'timeUnit' to be non-null");
            return $;
        }
    }

}
