// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Auth Secrets for Container App Scale Rule
 * 
 */
public final class ScaleRuleAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScaleRuleAuthArgs Empty = new ScaleRuleAuthArgs();

    /**
     * Name of the Container App secret from which to pull the auth params.
     * 
     */
    @Import(name="secretRef")
    private @Nullable Output<String> secretRef;

    /**
     * @return Name of the Container App secret from which to pull the auth params.
     * 
     */
    public Optional<Output<String>> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    /**
     * Trigger Parameter that uses the secret
     * 
     */
    @Import(name="triggerParameter")
    private @Nullable Output<String> triggerParameter;

    /**
     * @return Trigger Parameter that uses the secret
     * 
     */
    public Optional<Output<String>> triggerParameter() {
        return Optional.ofNullable(this.triggerParameter);
    }

    private ScaleRuleAuthArgs() {}

    private ScaleRuleAuthArgs(ScaleRuleAuthArgs $) {
        this.secretRef = $.secretRef;
        this.triggerParameter = $.triggerParameter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScaleRuleAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScaleRuleAuthArgs $;

        public Builder() {
            $ = new ScaleRuleAuthArgs();
        }

        public Builder(ScaleRuleAuthArgs defaults) {
            $ = new ScaleRuleAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretRef Name of the Container App secret from which to pull the auth params.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(@Nullable Output<String> secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        /**
         * @param secretRef Name of the Container App secret from which to pull the auth params.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(String secretRef) {
            return secretRef(Output.of(secretRef));
        }

        /**
         * @param triggerParameter Trigger Parameter that uses the secret
         * 
         * @return builder
         * 
         */
        public Builder triggerParameter(@Nullable Output<String> triggerParameter) {
            $.triggerParameter = triggerParameter;
            return this;
        }

        /**
         * @param triggerParameter Trigger Parameter that uses the secret
         * 
         * @return builder
         * 
         */
        public Builder triggerParameter(String triggerParameter) {
            return triggerParameter(Output.of(triggerParameter));
        }

        public ScaleRuleAuthArgs build() {
            return $;
        }
    }

}
