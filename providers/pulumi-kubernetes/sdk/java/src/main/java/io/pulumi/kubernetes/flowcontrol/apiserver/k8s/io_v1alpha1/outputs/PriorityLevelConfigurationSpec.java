// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.LimitedPriorityLevelConfiguration;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PriorityLevelConfigurationSpec {
    private final @Nullable LimitedPriorityLevelConfiguration limited;
    private final String type;

    @OutputCustomType.Constructor({"limited","type"})
    private PriorityLevelConfigurationSpec(
        @Nullable LimitedPriorityLevelConfiguration limited,
        String type) {
        this.limited = limited;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<LimitedPriorityLevelConfiguration> getLimited() {
        return Optional.ofNullable(this.limited);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LimitedPriorityLevelConfiguration limited;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limited = defaults.limited;
    	      this.type = defaults.type;
        }

        public Builder setLimited(@Nullable LimitedPriorityLevelConfiguration limited) {
            this.limited = limited;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public PriorityLevelConfigurationSpec build() {
            return new PriorityLevelConfigurationSpec(limited, type);
        }
    }
}
