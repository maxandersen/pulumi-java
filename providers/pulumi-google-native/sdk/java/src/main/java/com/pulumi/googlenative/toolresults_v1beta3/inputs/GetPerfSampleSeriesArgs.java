// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPerfSampleSeriesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPerfSampleSeriesArgs Empty = new GetPerfSampleSeriesArgs();

    @Import(name="executionId", required=true)
    private String executionId;

    public String executionId() {
        return this.executionId;
    }

    @Import(name="historyId", required=true)
    private String historyId;

    public String historyId() {
        return this.historyId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="sampleSeriesId", required=true)
    private String sampleSeriesId;

    public String sampleSeriesId() {
        return this.sampleSeriesId;
    }

    @Import(name="stepId", required=true)
    private String stepId;

    public String stepId() {
        return this.stepId;
    }

    private GetPerfSampleSeriesArgs() {}

    private GetPerfSampleSeriesArgs(GetPerfSampleSeriesArgs $) {
        this.executionId = $.executionId;
        this.historyId = $.historyId;
        this.project = $.project;
        this.sampleSeriesId = $.sampleSeriesId;
        this.stepId = $.stepId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPerfSampleSeriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPerfSampleSeriesArgs $;

        public Builder() {
            $ = new GetPerfSampleSeriesArgs();
        }

        public Builder(GetPerfSampleSeriesArgs defaults) {
            $ = new GetPerfSampleSeriesArgs(Objects.requireNonNull(defaults));
        }

        public Builder executionId(String executionId) {
            $.executionId = executionId;
            return this;
        }

        public Builder historyId(String historyId) {
            $.historyId = historyId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder sampleSeriesId(String sampleSeriesId) {
            $.sampleSeriesId = sampleSeriesId;
            return this;
        }

        public Builder stepId(String stepId) {
            $.stepId = stepId;
            return this;
        }

        public GetPerfSampleSeriesArgs build() {
            $.executionId = Objects.requireNonNull($.executionId, "expected parameter 'executionId' to be non-null");
            $.historyId = Objects.requireNonNull($.historyId, "expected parameter 'historyId' to be non-null");
            $.sampleSeriesId = Objects.requireNonNull($.sampleSeriesId, "expected parameter 'sampleSeriesId' to be non-null");
            $.stepId = Objects.requireNonNull($.stepId, "expected parameter 'stepId' to be non-null");
            return $;
        }
    }

}
