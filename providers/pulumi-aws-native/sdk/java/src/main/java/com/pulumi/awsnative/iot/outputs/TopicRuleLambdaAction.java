// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleLambdaAction {
    private final @Nullable String functionArn;

    @CustomType.Constructor
    private TopicRuleLambdaAction(@CustomType.Parameter("functionArn") @Nullable String functionArn) {
        this.functionArn = functionArn;
    }

    public Optional<String> functionArn() {
        return Optional.ofNullable(this.functionArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleLambdaAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String functionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleLambdaAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
        }

        public Builder functionArn(@Nullable String functionArn) {
            this.functionArn = functionArn;
            return this;
        }        public TopicRuleLambdaAction build() {
            return new TopicRuleLambdaAction(functionArn);
        }
    }
}
