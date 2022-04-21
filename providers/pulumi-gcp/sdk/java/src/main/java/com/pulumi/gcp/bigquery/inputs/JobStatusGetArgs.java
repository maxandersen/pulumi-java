// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.JobStatusErrorGetArgs;
import com.pulumi.gcp.bigquery.inputs.JobStatusErrorResultGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobStatusGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobStatusGetArgs Empty = new JobStatusGetArgs();

    @Import(name="errorResults")
    private @Nullable Output<List<JobStatusErrorResultGetArgs>> errorResults;

    public Optional<Output<List<JobStatusErrorResultGetArgs>>> errorResults() {
        return Optional.ofNullable(this.errorResults);
    }

    @Import(name="errors")
    private @Nullable Output<List<JobStatusErrorGetArgs>> errors;

    public Optional<Output<List<JobStatusErrorGetArgs>>> errors() {
        return Optional.ofNullable(this.errors);
    }

    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private JobStatusGetArgs() {}

    private JobStatusGetArgs(JobStatusGetArgs $) {
        this.errorResults = $.errorResults;
        this.errors = $.errors;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobStatusGetArgs $;

        public Builder() {
            $ = new JobStatusGetArgs();
        }

        public Builder(JobStatusGetArgs defaults) {
            $ = new JobStatusGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder errorResults(@Nullable Output<List<JobStatusErrorResultGetArgs>> errorResults) {
            $.errorResults = errorResults;
            return this;
        }

        public Builder errorResults(List<JobStatusErrorResultGetArgs> errorResults) {
            return errorResults(Output.of(errorResults));
        }

        public Builder errorResults(JobStatusErrorResultGetArgs... errorResults) {
            return errorResults(List.of(errorResults));
        }

        public Builder errors(@Nullable Output<List<JobStatusErrorGetArgs>> errors) {
            $.errors = errors;
            return this;
        }

        public Builder errors(List<JobStatusErrorGetArgs> errors) {
            return errors(Output.of(errors));
        }

        public Builder errors(JobStatusErrorGetArgs... errors) {
            return errors(List.of(errors));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public JobStatusGetArgs build() {
            return $;
        }
    }

}
