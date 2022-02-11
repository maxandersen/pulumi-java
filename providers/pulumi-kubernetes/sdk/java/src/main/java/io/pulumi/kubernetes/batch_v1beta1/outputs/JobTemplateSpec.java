// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.batch_v1.outputs.JobSpec;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobTemplateSpec {
    private final @Nullable ObjectMeta metadata;
    private final @Nullable JobSpec spec;

    @OutputCustomType.Constructor({"metadata","spec"})
    private JobTemplateSpec(
        @Nullable ObjectMeta metadata,
        @Nullable JobSpec spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public Optional<JobSpec> getSpec() {
        return Optional.ofNullable(this.spec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ObjectMeta metadata;
        private @Nullable JobSpec spec;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder setMetadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setSpec(@Nullable JobSpec spec) {
            this.spec = spec;
            return this;
        }

        public JobTemplateSpec build() {
            return new JobTemplateSpec(metadata, spec);
        }
    }
}
