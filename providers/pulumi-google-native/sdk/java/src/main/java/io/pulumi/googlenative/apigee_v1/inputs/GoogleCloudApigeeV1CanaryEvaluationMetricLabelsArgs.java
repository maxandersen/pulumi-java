// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Labels that can be used to filter Apigee metrics.
 * 
 */
public final class GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs Empty = new GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs();

    /**
     * The environment ID associated with the metrics.
     * 
     */
    @Import(name="env")
      private final @Nullable Output<String> env;

    public Output<String> env() {
        return this.env == null ? Codegen.empty() : this.env;
    }

    /**
     * The instance ID associated with the metrics. In Apigee Hybrid, the value is configured during installation.
     * 
     */
    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The location associated with the metrics.
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    public GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs(
        @Nullable Output<String> env,
        Output<String> instanceId,
        Output<String> location) {
        this.env = env;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
    }

    private GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs() {
        this.env = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.location = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> env;
        private Output<String> instanceId;
        private Output<String> location;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.env = defaults.env;
    	      this.instanceId = defaults.instanceId;
    	      this.location = defaults.location;
        }

        public Builder env(@Nullable Output<String> env) {
            this.env = env;
            return this;
        }
        public Builder env(@Nullable String env) {
            this.env = Codegen.ofNullable(env);
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }        public GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs build() {
            return new GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs(env, instanceId, location);
        }
    }
}
