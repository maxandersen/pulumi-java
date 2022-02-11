// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.SELinuxOptions;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SELinuxStrategyOptions {
    private final String rule;
    private final @Nullable SELinuxOptions seLinuxOptions;

    @OutputCustomType.Constructor({"rule","seLinuxOptions"})
    private SELinuxStrategyOptions(
        String rule,
        @Nullable SELinuxOptions seLinuxOptions) {
        this.rule = Objects.requireNonNull(rule);
        this.seLinuxOptions = seLinuxOptions;
    }

    public String getRule() {
        return this.rule;
    }
    public Optional<SELinuxOptions> getSeLinuxOptions() {
        return Optional.ofNullable(this.seLinuxOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SELinuxStrategyOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String rule;
        private @Nullable SELinuxOptions seLinuxOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(SELinuxStrategyOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
    	      this.seLinuxOptions = defaults.seLinuxOptions;
        }

        public Builder setRule(String rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }

        public Builder setSeLinuxOptions(@Nullable SELinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        public SELinuxStrategyOptions build() {
            return new SELinuxStrategyOptions(rule, seLinuxOptions);
        }
    }
}
