// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1alpha1.inputs.InstanceAttemptResultArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Instance represents the status of an instance of a Job.
 * 
 */
public final class InstanceStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceStatusArgs Empty = new InstanceStatusArgs();

    /**
     * Optional. Represents time when the instance was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @Import(name="completionTime")
    private @Nullable Output<String> completionTime;

    public Optional<Output<String>> completionTime() {
        return Optional.ofNullable(this.completionTime);
    }

    /**
     * Optional. The number of times this instance exited with code &gt; 0; +optional
     * 
     */
    @Import(name="failed")
    private @Nullable Output<Integer> failed;

    public Optional<Output<Integer>> failed() {
        return Optional.ofNullable(this.failed);
    }

    /**
     * Index of the instance, unique per Job, and beginning at 0.
     * 
     */
    @Import(name="index", required=true)
    private Output<Integer> index;

    public Output<Integer> index() {
        return this.index;
    }

    /**
     * Optional. Result of the last attempt of this instance. +optional
     * 
     */
    @Import(name="lastAttemptResult")
    private @Nullable Output<InstanceAttemptResultArgs> lastAttemptResult;

    public Optional<Output<InstanceAttemptResultArgs>> lastAttemptResult() {
        return Optional.ofNullable(this.lastAttemptResult);
    }

    /**
     * Optional. Last exit code seen for this instance. +optional
     * 
     */
    @Import(name="lastExitCode")
    private @Nullable Output<Integer> lastExitCode;

    public Optional<Output<Integer>> lastExitCode() {
        return Optional.ofNullable(this.lastExitCode);
    }

    /**
     * Optional. The number of times this instance was restarted. Instances are restarted according the restartPolicy configured in the Job template. +optional
     * 
     */
    @Import(name="restarted")
    private @Nullable Output<Integer> restarted;

    public Optional<Output<Integer>> restarted() {
        return Optional.ofNullable(this.restarted);
    }

    /**
     * Optional. Represents time when the instance was created by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * Optional. The number of times this instance exited with code == 0. +optional
     * 
     */
    @Import(name="succeeded")
    private @Nullable Output<Integer> succeeded;

    public Optional<Output<Integer>> succeeded() {
        return Optional.ofNullable(this.succeeded);
    }

    private InstanceStatusArgs() {}

    private InstanceStatusArgs(InstanceStatusArgs $) {
        this.completionTime = $.completionTime;
        this.failed = $.failed;
        this.index = $.index;
        this.lastAttemptResult = $.lastAttemptResult;
        this.lastExitCode = $.lastExitCode;
        this.restarted = $.restarted;
        this.startTime = $.startTime;
        this.succeeded = $.succeeded;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceStatusArgs $;

        public Builder() {
            $ = new InstanceStatusArgs();
        }

        public Builder(InstanceStatusArgs defaults) {
            $ = new InstanceStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder completionTime(@Nullable Output<String> completionTime) {
            $.completionTime = completionTime;
            return this;
        }

        public Builder completionTime(String completionTime) {
            return completionTime(Output.of(completionTime));
        }

        public Builder failed(@Nullable Output<Integer> failed) {
            $.failed = failed;
            return this;
        }

        public Builder failed(Integer failed) {
            return failed(Output.of(failed));
        }

        public Builder index(Output<Integer> index) {
            $.index = index;
            return this;
        }

        public Builder index(Integer index) {
            return index(Output.of(index));
        }

        public Builder lastAttemptResult(@Nullable Output<InstanceAttemptResultArgs> lastAttemptResult) {
            $.lastAttemptResult = lastAttemptResult;
            return this;
        }

        public Builder lastAttemptResult(InstanceAttemptResultArgs lastAttemptResult) {
            return lastAttemptResult(Output.of(lastAttemptResult));
        }

        public Builder lastExitCode(@Nullable Output<Integer> lastExitCode) {
            $.lastExitCode = lastExitCode;
            return this;
        }

        public Builder lastExitCode(Integer lastExitCode) {
            return lastExitCode(Output.of(lastExitCode));
        }

        public Builder restarted(@Nullable Output<Integer> restarted) {
            $.restarted = restarted;
            return this;
        }

        public Builder restarted(Integer restarted) {
            return restarted(Output.of(restarted));
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public Builder succeeded(@Nullable Output<Integer> succeeded) {
            $.succeeded = succeeded;
            return this;
        }

        public Builder succeeded(Integer succeeded) {
            return succeeded(Output.of(succeeded));
        }

        public InstanceStatusArgs build() {
            $.index = Objects.requireNonNull($.index, "expected parameter 'index' to be non-null");
            return $;
        }
    }

}
