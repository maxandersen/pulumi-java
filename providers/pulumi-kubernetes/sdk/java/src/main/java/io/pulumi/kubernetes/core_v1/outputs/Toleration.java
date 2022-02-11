// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Toleration {
    private final @Nullable String effect;
    private final @Nullable String key;
    private final @Nullable String operator;
    private final @Nullable Integer tolerationSeconds;
    private final @Nullable String value;

    @OutputCustomType.Constructor({"effect","key","operator","tolerationSeconds","value"})
    private Toleration(
        @Nullable String effect,
        @Nullable String key,
        @Nullable String operator,
        @Nullable Integer tolerationSeconds,
        @Nullable String value) {
        this.effect = effect;
        this.key = key;
        this.operator = operator;
        this.tolerationSeconds = tolerationSeconds;
        this.value = value;
    }

    public Optional<String> getEffect() {
        return Optional.ofNullable(this.effect);
    }
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> getOperator() {
        return Optional.ofNullable(this.operator);
    }
    public Optional<Integer> getTolerationSeconds() {
        return Optional.ofNullable(this.tolerationSeconds);
    }
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Toleration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String effect;
        private @Nullable String key;
        private @Nullable String operator;
        private @Nullable Integer tolerationSeconds;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(Toleration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.tolerationSeconds = defaults.tolerationSeconds;
    	      this.value = defaults.value;
        }

        public Builder setEffect(@Nullable String effect) {
            this.effect = effect;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setOperator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }

        public Builder setTolerationSeconds(@Nullable Integer tolerationSeconds) {
            this.tolerationSeconds = tolerationSeconds;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public Toleration build() {
            return new Toleration(effect, key, operator, tolerationSeconds, value);
        }
    }
}
