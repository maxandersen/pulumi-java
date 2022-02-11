// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricIdentifier {
    private final String name;
    private final @Nullable LabelSelector selector;

    @OutputCustomType.Constructor({"name","selector"})
    private MetricIdentifier(
        String name,
        @Nullable LabelSelector selector) {
        this.name = Objects.requireNonNull(name);
        this.selector = selector;
    }

    public String getName() {
        return this.name;
    }
    public Optional<LabelSelector> getSelector() {
        return Optional.ofNullable(this.selector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricIdentifier defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable LabelSelector selector;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.selector = defaults.selector;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSelector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        public MetricIdentifier build() {
            return new MetricIdentifier(name, selector);
        }
    }
}
