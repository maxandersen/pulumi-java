// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleAuthenticateCognitoConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleAuthenticateOidcConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleFixedResponseConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleForwardConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleRedirectConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionArgs Empty = new ListenerRuleActionArgs();

    @Import(name="authenticateCognitoConfig")
      private final @Nullable Output<ListenerRuleAuthenticateCognitoConfigArgs> authenticateCognitoConfig;

    public Output<ListenerRuleAuthenticateCognitoConfigArgs> authenticateCognitoConfig() {
        return this.authenticateCognitoConfig == null ? Codegen.empty() : this.authenticateCognitoConfig;
    }

    @Import(name="authenticateOidcConfig")
      private final @Nullable Output<ListenerRuleAuthenticateOidcConfigArgs> authenticateOidcConfig;

    public Output<ListenerRuleAuthenticateOidcConfigArgs> authenticateOidcConfig() {
        return this.authenticateOidcConfig == null ? Codegen.empty() : this.authenticateOidcConfig;
    }

    @Import(name="fixedResponseConfig")
      private final @Nullable Output<ListenerRuleFixedResponseConfigArgs> fixedResponseConfig;

    public Output<ListenerRuleFixedResponseConfigArgs> fixedResponseConfig() {
        return this.fixedResponseConfig == null ? Codegen.empty() : this.fixedResponseConfig;
    }

    @Import(name="forwardConfig")
      private final @Nullable Output<ListenerRuleForwardConfigArgs> forwardConfig;

    public Output<ListenerRuleForwardConfigArgs> forwardConfig() {
        return this.forwardConfig == null ? Codegen.empty() : this.forwardConfig;
    }

    @Import(name="order")
      private final @Nullable Output<Integer> order;

    public Output<Integer> order() {
        return this.order == null ? Codegen.empty() : this.order;
    }

    @Import(name="redirectConfig")
      private final @Nullable Output<ListenerRuleRedirectConfigArgs> redirectConfig;

    public Output<ListenerRuleRedirectConfigArgs> redirectConfig() {
        return this.redirectConfig == null ? Codegen.empty() : this.redirectConfig;
    }

    @Import(name="targetGroupArn")
      private final @Nullable Output<String> targetGroupArn;

    public Output<String> targetGroupArn() {
        return this.targetGroupArn == null ? Codegen.empty() : this.targetGroupArn;
    }

    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public ListenerRuleActionArgs(
        @Nullable Output<ListenerRuleAuthenticateCognitoConfigArgs> authenticateCognitoConfig,
        @Nullable Output<ListenerRuleAuthenticateOidcConfigArgs> authenticateOidcConfig,
        @Nullable Output<ListenerRuleFixedResponseConfigArgs> fixedResponseConfig,
        @Nullable Output<ListenerRuleForwardConfigArgs> forwardConfig,
        @Nullable Output<Integer> order,
        @Nullable Output<ListenerRuleRedirectConfigArgs> redirectConfig,
        @Nullable Output<String> targetGroupArn,
        Output<String> type) {
        this.authenticateCognitoConfig = authenticateCognitoConfig;
        this.authenticateOidcConfig = authenticateOidcConfig;
        this.fixedResponseConfig = fixedResponseConfig;
        this.forwardConfig = forwardConfig;
        this.order = order;
        this.redirectConfig = redirectConfig;
        this.targetGroupArn = targetGroupArn;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ListenerRuleActionArgs() {
        this.authenticateCognitoConfig = Codegen.empty();
        this.authenticateOidcConfig = Codegen.empty();
        this.fixedResponseConfig = Codegen.empty();
        this.forwardConfig = Codegen.empty();
        this.order = Codegen.empty();
        this.redirectConfig = Codegen.empty();
        this.targetGroupArn = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ListenerRuleAuthenticateCognitoConfigArgs> authenticateCognitoConfig;
        private @Nullable Output<ListenerRuleAuthenticateOidcConfigArgs> authenticateOidcConfig;
        private @Nullable Output<ListenerRuleFixedResponseConfigArgs> fixedResponseConfig;
        private @Nullable Output<ListenerRuleForwardConfigArgs> forwardConfig;
        private @Nullable Output<Integer> order;
        private @Nullable Output<ListenerRuleRedirectConfigArgs> redirectConfig;
        private @Nullable Output<String> targetGroupArn;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognitoConfig = defaults.authenticateCognitoConfig;
    	      this.authenticateOidcConfig = defaults.authenticateOidcConfig;
    	      this.fixedResponseConfig = defaults.fixedResponseConfig;
    	      this.forwardConfig = defaults.forwardConfig;
    	      this.order = defaults.order;
    	      this.redirectConfig = defaults.redirectConfig;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder authenticateCognitoConfig(@Nullable Output<ListenerRuleAuthenticateCognitoConfigArgs> authenticateCognitoConfig) {
            this.authenticateCognitoConfig = authenticateCognitoConfig;
            return this;
        }
        public Builder authenticateCognitoConfig(@Nullable ListenerRuleAuthenticateCognitoConfigArgs authenticateCognitoConfig) {
            this.authenticateCognitoConfig = Codegen.ofNullable(authenticateCognitoConfig);
            return this;
        }
        public Builder authenticateOidcConfig(@Nullable Output<ListenerRuleAuthenticateOidcConfigArgs> authenticateOidcConfig) {
            this.authenticateOidcConfig = authenticateOidcConfig;
            return this;
        }
        public Builder authenticateOidcConfig(@Nullable ListenerRuleAuthenticateOidcConfigArgs authenticateOidcConfig) {
            this.authenticateOidcConfig = Codegen.ofNullable(authenticateOidcConfig);
            return this;
        }
        public Builder fixedResponseConfig(@Nullable Output<ListenerRuleFixedResponseConfigArgs> fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
            return this;
        }
        public Builder fixedResponseConfig(@Nullable ListenerRuleFixedResponseConfigArgs fixedResponseConfig) {
            this.fixedResponseConfig = Codegen.ofNullable(fixedResponseConfig);
            return this;
        }
        public Builder forwardConfig(@Nullable Output<ListenerRuleForwardConfigArgs> forwardConfig) {
            this.forwardConfig = forwardConfig;
            return this;
        }
        public Builder forwardConfig(@Nullable ListenerRuleForwardConfigArgs forwardConfig) {
            this.forwardConfig = Codegen.ofNullable(forwardConfig);
            return this;
        }
        public Builder order(@Nullable Output<Integer> order) {
            this.order = order;
            return this;
        }
        public Builder order(@Nullable Integer order) {
            this.order = Codegen.ofNullable(order);
            return this;
        }
        public Builder redirectConfig(@Nullable Output<ListenerRuleRedirectConfigArgs> redirectConfig) {
            this.redirectConfig = redirectConfig;
            return this;
        }
        public Builder redirectConfig(@Nullable ListenerRuleRedirectConfigArgs redirectConfig) {
            this.redirectConfig = Codegen.ofNullable(redirectConfig);
            return this;
        }
        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = Codegen.ofNullable(targetGroupArn);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ListenerRuleActionArgs build() {
            return new ListenerRuleActionArgs(authenticateCognitoConfig, authenticateOidcConfig, fixedResponseConfig, forwardConfig, order, redirectConfig, targetGroupArn, type);
        }
    }
}
