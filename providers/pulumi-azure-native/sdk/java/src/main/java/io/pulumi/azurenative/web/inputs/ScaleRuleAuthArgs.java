// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Auth Secrets for Container App Scale Rule
 * 
 */
public final class ScaleRuleAuthArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScaleRuleAuthArgs Empty = new ScaleRuleAuthArgs();

    /**
     * Name of the Container App secret from which to pull the auth params.
     * 
     */
    @Import(name="secretRef")
      private final @Nullable Output<String> secretRef;

    public Output<String> secretRef() {
        return this.secretRef == null ? Codegen.empty() : this.secretRef;
    }

    /**
     * Trigger Parameter that uses the secret
     * 
     */
    @Import(name="triggerParameter")
      private final @Nullable Output<String> triggerParameter;

    public Output<String> triggerParameter() {
        return this.triggerParameter == null ? Codegen.empty() : this.triggerParameter;
    }

    public ScaleRuleAuthArgs(
        @Nullable Output<String> secretRef,
        @Nullable Output<String> triggerParameter) {
        this.secretRef = secretRef;
        this.triggerParameter = triggerParameter;
    }

    private ScaleRuleAuthArgs() {
        this.secretRef = Codegen.empty();
        this.triggerParameter = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleRuleAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> secretRef;
        private @Nullable Output<String> triggerParameter;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleRuleAuthArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretRef = defaults.secretRef;
    	      this.triggerParameter = defaults.triggerParameter;
        }

        public Builder secretRef(@Nullable Output<String> secretRef) {
            this.secretRef = secretRef;
            return this;
        }
        public Builder secretRef(@Nullable String secretRef) {
            this.secretRef = Codegen.ofNullable(secretRef);
            return this;
        }
        public Builder triggerParameter(@Nullable Output<String> triggerParameter) {
            this.triggerParameter = triggerParameter;
            return this;
        }
        public Builder triggerParameter(@Nullable String triggerParameter) {
            this.triggerParameter = Codegen.ofNullable(triggerParameter);
            return this;
        }        public ScaleRuleAuthArgs build() {
            return new ScaleRuleAuthArgs(secretRef, triggerParameter);
        }
    }
}
