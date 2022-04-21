// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.aws.lb.inputs.ListenerRuleActionAuthenticateCognitoGetArgs;
import com.pulumi.aws.lb.inputs.ListenerRuleActionAuthenticateOidcGetArgs;
import com.pulumi.aws.lb.inputs.ListenerRuleActionFixedResponseGetArgs;
import com.pulumi.aws.lb.inputs.ListenerRuleActionForwardGetArgs;
import com.pulumi.aws.lb.inputs.ListenerRuleActionRedirectGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleActionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionGetArgs Empty = new ListenerRuleActionGetArgs();

    /**
     * Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
     * 
     */
    @Import(name="authenticateCognito")
    private @Nullable Output<ListenerRuleActionAuthenticateCognitoGetArgs> authenticateCognito;

    public Optional<Output<ListenerRuleActionAuthenticateCognitoGetArgs>> authenticateCognito() {
        return Optional.ofNullable(this.authenticateCognito);
    }

    /**
     * Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
     * 
     */
    @Import(name="authenticateOidc")
    private @Nullable Output<ListenerRuleActionAuthenticateOidcGetArgs> authenticateOidc;

    public Optional<Output<ListenerRuleActionAuthenticateOidcGetArgs>> authenticateOidc() {
        return Optional.ofNullable(this.authenticateOidc);
    }

    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    @Import(name="fixedResponse")
    private @Nullable Output<ListenerRuleActionFixedResponseGetArgs> fixedResponse;

    public Optional<Output<ListenerRuleActionFixedResponseGetArgs>> fixedResponse() {
        return Optional.ofNullable(this.fixedResponse);
    }

    /**
     * Information for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`.
     * 
     */
    @Import(name="forward")
    private @Nullable Output<ListenerRuleActionForwardGetArgs> forward;

    public Optional<Output<ListenerRuleActionForwardGetArgs>> forward() {
        return Optional.ofNullable(this.forward);
    }

    @Import(name="order")
    private @Nullable Output<Integer> order;

    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * Information for creating a redirect action. Required if `type` is `redirect`.
     * 
     */
    @Import(name="redirect")
    private @Nullable Output<ListenerRuleActionRedirectGetArgs> redirect;

    public Optional<Output<ListenerRuleActionRedirectGetArgs>> redirect() {
        return Optional.ofNullable(this.redirect);
    }

    /**
     * The ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    @Import(name="targetGroupArn")
    private @Nullable Output<String> targetGroupArn;

    public Optional<Output<String>> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    /**
     * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ListenerRuleActionGetArgs() {}

    private ListenerRuleActionGetArgs(ListenerRuleActionGetArgs $) {
        this.authenticateCognito = $.authenticateCognito;
        this.authenticateOidc = $.authenticateOidc;
        this.fixedResponse = $.fixedResponse;
        this.forward = $.forward;
        this.order = $.order;
        this.redirect = $.redirect;
        this.targetGroupArn = $.targetGroupArn;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleActionGetArgs $;

        public Builder() {
            $ = new ListenerRuleActionGetArgs();
        }

        public Builder(ListenerRuleActionGetArgs defaults) {
            $ = new ListenerRuleActionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticateCognito(@Nullable Output<ListenerRuleActionAuthenticateCognitoGetArgs> authenticateCognito) {
            $.authenticateCognito = authenticateCognito;
            return this;
        }

        public Builder authenticateCognito(ListenerRuleActionAuthenticateCognitoGetArgs authenticateCognito) {
            return authenticateCognito(Output.of(authenticateCognito));
        }

        public Builder authenticateOidc(@Nullable Output<ListenerRuleActionAuthenticateOidcGetArgs> authenticateOidc) {
            $.authenticateOidc = authenticateOidc;
            return this;
        }

        public Builder authenticateOidc(ListenerRuleActionAuthenticateOidcGetArgs authenticateOidc) {
            return authenticateOidc(Output.of(authenticateOidc));
        }

        public Builder fixedResponse(@Nullable Output<ListenerRuleActionFixedResponseGetArgs> fixedResponse) {
            $.fixedResponse = fixedResponse;
            return this;
        }

        public Builder fixedResponse(ListenerRuleActionFixedResponseGetArgs fixedResponse) {
            return fixedResponse(Output.of(fixedResponse));
        }

        public Builder forward(@Nullable Output<ListenerRuleActionForwardGetArgs> forward) {
            $.forward = forward;
            return this;
        }

        public Builder forward(ListenerRuleActionForwardGetArgs forward) {
            return forward(Output.of(forward));
        }

        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        public Builder redirect(@Nullable Output<ListenerRuleActionRedirectGetArgs> redirect) {
            $.redirect = redirect;
            return this;
        }

        public Builder redirect(ListenerRuleActionRedirectGetArgs redirect) {
            return redirect(Output.of(redirect));
        }

        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            $.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder targetGroupArn(String targetGroupArn) {
            return targetGroupArn(Output.of(targetGroupArn));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ListenerRuleActionGetArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
