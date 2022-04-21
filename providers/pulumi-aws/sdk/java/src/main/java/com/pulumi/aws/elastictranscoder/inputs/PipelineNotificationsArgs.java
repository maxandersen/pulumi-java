// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elastictranscoder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineNotificationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineNotificationsArgs Empty = new PipelineNotificationsArgs();

    /**
     * The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing a job in this pipeline.
     * 
     */
    @Import(name="completed")
    private @Nullable Output<String> completed;

    public Optional<Output<String>> completed() {
        return Optional.ofNullable(this.completed);
    }

    /**
     * The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition while processing a job in this pipeline.
     * 
     */
    @Import(name="error")
    private @Nullable Output<String> error;

    public Optional<Output<String>> error() {
        return Optional.ofNullable(this.error);
    }

    /**
     * The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process a job in this pipeline.
     * 
     */
    @Import(name="progressing")
    private @Nullable Output<String> progressing;

    public Optional<Output<String>> progressing() {
        return Optional.ofNullable(this.progressing);
    }

    /**
     * The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition while processing a job in this pipeline.
     * 
     */
    @Import(name="warning")
    private @Nullable Output<String> warning;

    public Optional<Output<String>> warning() {
        return Optional.ofNullable(this.warning);
    }

    private PipelineNotificationsArgs() {}

    private PipelineNotificationsArgs(PipelineNotificationsArgs $) {
        this.completed = $.completed;
        this.error = $.error;
        this.progressing = $.progressing;
        this.warning = $.warning;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineNotificationsArgs $;

        public Builder() {
            $ = new PipelineNotificationsArgs();
        }

        public Builder(PipelineNotificationsArgs defaults) {
            $ = new PipelineNotificationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder completed(@Nullable Output<String> completed) {
            $.completed = completed;
            return this;
        }

        public Builder completed(String completed) {
            return completed(Output.of(completed));
        }

        public Builder error(@Nullable Output<String> error) {
            $.error = error;
            return this;
        }

        public Builder error(String error) {
            return error(Output.of(error));
        }

        public Builder progressing(@Nullable Output<String> progressing) {
            $.progressing = progressing;
            return this;
        }

        public Builder progressing(String progressing) {
            return progressing(Output.of(progressing));
        }

        public Builder warning(@Nullable Output<String> warning) {
            $.warning = warning;
            return this;
        }

        public Builder warning(String warning) {
            return warning(Output.of(warning));
        }

        public PipelineNotificationsArgs build() {
            return $;
        }
    }

}
