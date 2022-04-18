// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.inputs;

import com.pulumi.aws.alb.inputs.ListenerRuleActionAuthenticateCognitoGetArgs;
import com.pulumi.aws.alb.inputs.ListenerRuleActionAuthenticateOidcGetArgs;
import com.pulumi.aws.alb.inputs.ListenerRuleActionFixedResponseGetArgs;
import com.pulumi.aws.alb.inputs.ListenerRuleActionForwardGetArgs;
import com.pulumi.aws.alb.inputs.ListenerRuleActionRedirectGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionGetArgs Empty = new ListenerRuleActionGetArgs();

    /**
     * Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
     * 
     */
    @Import(name="authenticateCognito")
      private final @Nullable Output<ListenerRuleActionAuthenticateCognitoGetArgs> authenticateCognito;

    public Output<ListenerRuleActionAuthenticateCognitoGetArgs> authenticateCognito() {
        return this.authenticateCognito == null ? Codegen.empty() : this.authenticateCognito;
    }

    /**
     * Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
     * 
     */
    @Import(name="authenticateOidc")
      private final @Nullable Output<ListenerRuleActionAuthenticateOidcGetArgs> authenticateOidc;

    public Output<ListenerRuleActionAuthenticateOidcGetArgs> authenticateOidc() {
        return this.authenticateOidc == null ? Codegen.empty() : this.authenticateOidc;
    }

    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    @Import(name="fixedResponse")
      private final @Nullable Output<ListenerRuleActionFixedResponseGetArgs> fixedResponse;

    public Output<ListenerRuleActionFixedResponseGetArgs> fixedResponse() {
        return this.fixedResponse == null ? Codegen.empty() : this.fixedResponse;
    }

    /**
     * Information for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`.
     * 
     */
    @Import(name="forward")
      private final @Nullable Output<ListenerRuleActionForwardGetArgs> forward;

    public Output<ListenerRuleActionForwardGetArgs> forward() {
        return this.forward == null ? Codegen.empty() : this.forward;
    }

    @Import(name="order")
      private final @Nullable Output<Integer> order;

    public Output<Integer> order() {
        return this.order == null ? Codegen.empty() : this.order;
    }

    /**
     * Information for creating a redirect action. Required if `type` is `redirect`.
     * 
     */
    @Import(name="redirect")
      private final @Nullable Output<ListenerRuleActionRedirectGetArgs> redirect;

    public Output<ListenerRuleActionRedirectGetArgs> redirect() {
        return this.redirect == null ? Codegen.empty() : this.redirect;
    }

    /**
     * The ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    @Import(name="targetGroupArn")
      private final @Nullable Output<String> targetGroupArn;

    public Output<String> targetGroupArn() {
        return this.targetGroupArn == null ? Codegen.empty() : this.targetGroupArn;
    }

    /**
     * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public ListenerRuleActionGetArgs(
        @Nullable Output<ListenerRuleActionAuthenticateCognitoGetArgs> authenticateCognito,
        @Nullable Output<ListenerRuleActionAuthenticateOidcGetArgs> authenticateOidc,
        @Nullable Output<ListenerRuleActionFixedResponseGetArgs> fixedResponse,
        @Nullable Output<ListenerRuleActionForwardGetArgs> forward,
        @Nullable Output<Integer> order,
        @Nullable Output<ListenerRuleActionRedirectGetArgs> redirect,
        @Nullable Output<String> targetGroupArn,
        Output<String> type) {
        this.authenticateCognito = authenticateCognito;
        this.authenticateOidc = authenticateOidc;
        this.fixedResponse = fixedResponse;
        this.forward = forward;
        this.order = order;
        this.redirect = redirect;
        this.targetGroupArn = targetGroupArn;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ListenerRuleActionGetArgs() {
        this.authenticateCognito = Codegen.empty();
        this.authenticateOidc = Codegen.empty();
        this.fixedResponse = Codegen.empty();
        this.forward = Codegen.empty();
        this.order = Codegen.empty();
        this.redirect = Codegen.empty();
        this.targetGroupArn = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ListenerRuleActionAuthenticateCognitoGetArgs> authenticateCognito;
        private @Nullable Output<ListenerRuleActionAuthenticateOidcGetArgs> authenticateOidc;
        private @Nullable Output<ListenerRuleActionFixedResponseGetArgs> fixedResponse;
        private @Nullable Output<ListenerRuleActionForwardGetArgs> forward;
        private @Nullable Output<Integer> order;
        private @Nullable Output<ListenerRuleActionRedirectGetArgs> redirect;
        private @Nullable Output<String> targetGroupArn;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognito = defaults.authenticateCognito;
    	      this.authenticateOidc = defaults.authenticateOidc;
    	      this.fixedResponse = defaults.fixedResponse;
    	      this.forward = defaults.forward;
    	      this.order = defaults.order;
    	      this.redirect = defaults.redirect;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder authenticateCognito(@Nullable Output<ListenerRuleActionAuthenticateCognitoGetArgs> authenticateCognito) {
            this.authenticateCognito = authenticateCognito;
            return this;
        }
        public Builder authenticateCognito(@Nullable ListenerRuleActionAuthenticateCognitoGetArgs authenticateCognito) {
            this.authenticateCognito = Codegen.ofNullable(authenticateCognito);
            return this;
        }
        public Builder authenticateOidc(@Nullable Output<ListenerRuleActionAuthenticateOidcGetArgs> authenticateOidc) {
            this.authenticateOidc = authenticateOidc;
            return this;
        }
        public Builder authenticateOidc(@Nullable ListenerRuleActionAuthenticateOidcGetArgs authenticateOidc) {
            this.authenticateOidc = Codegen.ofNullable(authenticateOidc);
            return this;
        }
        public Builder fixedResponse(@Nullable Output<ListenerRuleActionFixedResponseGetArgs> fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }
        public Builder fixedResponse(@Nullable ListenerRuleActionFixedResponseGetArgs fixedResponse) {
            this.fixedResponse = Codegen.ofNullable(fixedResponse);
            return this;
        }
        public Builder forward(@Nullable Output<ListenerRuleActionForwardGetArgs> forward) {
            this.forward = forward;
            return this;
        }
        public Builder forward(@Nullable ListenerRuleActionForwardGetArgs forward) {
            this.forward = Codegen.ofNullable(forward);
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
        public Builder redirect(@Nullable Output<ListenerRuleActionRedirectGetArgs> redirect) {
            this.redirect = redirect;
            return this;
        }
        public Builder redirect(@Nullable ListenerRuleActionRedirectGetArgs redirect) {
            this.redirect = Codegen.ofNullable(redirect);
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
        }        public ListenerRuleActionGetArgs build() {
            return new ListenerRuleActionGetArgs(authenticateCognito, authenticateOidc, fixedResponse, forward, order, redirect, targetGroupArn, type);
        }
    }
}
