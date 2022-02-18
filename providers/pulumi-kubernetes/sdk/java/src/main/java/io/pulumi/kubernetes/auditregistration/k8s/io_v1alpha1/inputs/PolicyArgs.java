// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Policy defines the configuration of how audit events are logged
 * 
 */
public final class PolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
     * 
     */
    @InputImport(name="level", required=true)
    private final Input<String> level;

    public Input<String> getLevel() {
        return this.level;
    }

    /**
     * Stages is a list of stages for which events are created.
     * 
     */
    @InputImport(name="stages")
    private final @Nullable Input<List<String>> stages;

    public Input<List<String>> getStages() {
        return this.stages == null ? Input.empty() : this.stages;
    }

    public PolicyArgs(
        Input<String> level,
        @Nullable Input<List<String>> stages) {
        this.level = Objects.requireNonNull(level, "expected parameter 'level' to be non-null");
        this.stages = stages;
    }

    private PolicyArgs() {
        this.level = Input.empty();
        this.stages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> level;
        private @Nullable Input<List<String>> stages;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.stages = defaults.stages;
        }

        public Builder setLevel(Input<String> level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public Builder setLevel(String level) {
            this.level = Input.of(Objects.requireNonNull(level));
            return this;
        }

        public Builder setStages(@Nullable Input<List<String>> stages) {
            this.stages = stages;
            return this;
        }

        public Builder setStages(@Nullable List<String> stages) {
            this.stages = Input.ofNullable(stages);
            return this;
        }

        public PolicyArgs build() {
            return new PolicyArgs(level, stages);
        }
    }
}
