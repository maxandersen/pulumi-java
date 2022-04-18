// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.outputs;

import com.pulumi.aws.applicationloadbalancing.outputs.ListenerRuleActionAuthenticateCognito;
import com.pulumi.aws.applicationloadbalancing.outputs.ListenerRuleActionAuthenticateOidc;
import com.pulumi.aws.applicationloadbalancing.outputs.ListenerRuleActionFixedResponse;
import com.pulumi.aws.applicationloadbalancing.outputs.ListenerRuleActionForward;
import com.pulumi.aws.applicationloadbalancing.outputs.ListenerRuleActionRedirect;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleAction {
    /**
     * Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
     * 
     */
    private final @Nullable ListenerRuleActionAuthenticateCognito authenticateCognito;
    /**
     * Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
     * 
     */
    private final @Nullable ListenerRuleActionAuthenticateOidc authenticateOidc;
    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    private final @Nullable ListenerRuleActionFixedResponse fixedResponse;
    /**
     * Information for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`.
     * 
     */
    private final @Nullable ListenerRuleActionForward forward;
    private final @Nullable Integer order;
    /**
     * Information for creating a redirect action. Required if `type` is `redirect`.
     * 
     */
    private final @Nullable ListenerRuleActionRedirect redirect;
    /**
     * The ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    private final @Nullable String targetGroupArn;
    /**
     * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ListenerRuleAction(
        @CustomType.Parameter("authenticateCognito") @Nullable ListenerRuleActionAuthenticateCognito authenticateCognito,
        @CustomType.Parameter("authenticateOidc") @Nullable ListenerRuleActionAuthenticateOidc authenticateOidc,
        @CustomType.Parameter("fixedResponse") @Nullable ListenerRuleActionFixedResponse fixedResponse,
        @CustomType.Parameter("forward") @Nullable ListenerRuleActionForward forward,
        @CustomType.Parameter("order") @Nullable Integer order,
        @CustomType.Parameter("redirect") @Nullable ListenerRuleActionRedirect redirect,
        @CustomType.Parameter("targetGroupArn") @Nullable String targetGroupArn,
        @CustomType.Parameter("type") String type) {
        this.authenticateCognito = authenticateCognito;
        this.authenticateOidc = authenticateOidc;
        this.fixedResponse = fixedResponse;
        this.forward = forward;
        this.order = order;
        this.redirect = redirect;
        this.targetGroupArn = targetGroupArn;
        this.type = type;
    }

    /**
     * Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
     * 
    */
    public Optional<ListenerRuleActionAuthenticateCognito> authenticateCognito() {
        return Optional.ofNullable(this.authenticateCognito);
    }
    /**
     * Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
     * 
    */
    public Optional<ListenerRuleActionAuthenticateOidc> authenticateOidc() {
        return Optional.ofNullable(this.authenticateOidc);
    }
    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
    */
    public Optional<ListenerRuleActionFixedResponse> fixedResponse() {
        return Optional.ofNullable(this.fixedResponse);
    }
    /**
     * Information for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`.
     * 
    */
    public Optional<ListenerRuleActionForward> forward() {
        return Optional.ofNullable(this.forward);
    }
    public Optional<Integer> order() {
        return Optional.ofNullable(this.order);
    }
    /**
     * Information for creating a redirect action. Required if `type` is `redirect`.
     * 
    */
    public Optional<ListenerRuleActionRedirect> redirect() {
        return Optional.ofNullable(this.redirect);
    }
    /**
     * The ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
    */
    public Optional<String> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }
    /**
     * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerRuleActionAuthenticateCognito authenticateCognito;
        private @Nullable ListenerRuleActionAuthenticateOidc authenticateOidc;
        private @Nullable ListenerRuleActionFixedResponse fixedResponse;
        private @Nullable ListenerRuleActionForward forward;
        private @Nullable Integer order;
        private @Nullable ListenerRuleActionRedirect redirect;
        private @Nullable String targetGroupArn;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleAction defaults) {
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

        public Builder authenticateCognito(@Nullable ListenerRuleActionAuthenticateCognito authenticateCognito) {
            this.authenticateCognito = authenticateCognito;
            return this;
        }
        public Builder authenticateOidc(@Nullable ListenerRuleActionAuthenticateOidc authenticateOidc) {
            this.authenticateOidc = authenticateOidc;
            return this;
        }
        public Builder fixedResponse(@Nullable ListenerRuleActionFixedResponse fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }
        public Builder forward(@Nullable ListenerRuleActionForward forward) {
            this.forward = forward;
            return this;
        }
        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }
        public Builder redirect(@Nullable ListenerRuleActionRedirect redirect) {
            this.redirect = redirect;
            return this;
        }
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ListenerRuleAction build() {
            return new ListenerRuleAction(authenticateCognito, authenticateOidc, fixedResponse, forward, order, redirect, targetGroupArn, type);
        }
    }
}
