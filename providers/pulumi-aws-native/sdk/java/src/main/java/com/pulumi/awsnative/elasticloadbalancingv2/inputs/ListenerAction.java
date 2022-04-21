// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerAuthenticateCognitoConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerAuthenticateOidcConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerFixedResponseConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerForwardConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRedirectConfig;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerAction extends com.pulumi.resources.InvokeArgs {

    public static final ListenerAction Empty = new ListenerAction();

    @Import(name="authenticateCognitoConfig")
    private @Nullable ListenerAuthenticateCognitoConfig authenticateCognitoConfig;

    public Optional<ListenerAuthenticateCognitoConfig> authenticateCognitoConfig() {
        return Optional.ofNullable(this.authenticateCognitoConfig);
    }

    @Import(name="authenticateOidcConfig")
    private @Nullable ListenerAuthenticateOidcConfig authenticateOidcConfig;

    public Optional<ListenerAuthenticateOidcConfig> authenticateOidcConfig() {
        return Optional.ofNullable(this.authenticateOidcConfig);
    }

    @Import(name="fixedResponseConfig")
    private @Nullable ListenerFixedResponseConfig fixedResponseConfig;

    public Optional<ListenerFixedResponseConfig> fixedResponseConfig() {
        return Optional.ofNullable(this.fixedResponseConfig);
    }

    @Import(name="forwardConfig")
    private @Nullable ListenerForwardConfig forwardConfig;

    public Optional<ListenerForwardConfig> forwardConfig() {
        return Optional.ofNullable(this.forwardConfig);
    }

    @Import(name="order")
    private @Nullable Integer order;

    public Optional<Integer> order() {
        return Optional.ofNullable(this.order);
    }

    @Import(name="redirectConfig")
    private @Nullable ListenerRedirectConfig redirectConfig;

    public Optional<ListenerRedirectConfig> redirectConfig() {
        return Optional.ofNullable(this.redirectConfig);
    }

    @Import(name="targetGroupArn")
    private @Nullable String targetGroupArn;

    public Optional<String> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private ListenerAction() {}

    private ListenerAction(ListenerAction $) {
        this.authenticateCognitoConfig = $.authenticateCognitoConfig;
        this.authenticateOidcConfig = $.authenticateOidcConfig;
        this.fixedResponseConfig = $.fixedResponseConfig;
        this.forwardConfig = $.forwardConfig;
        this.order = $.order;
        this.redirectConfig = $.redirectConfig;
        this.targetGroupArn = $.targetGroupArn;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerAction $;

        public Builder() {
            $ = new ListenerAction();
        }

        public Builder(ListenerAction defaults) {
            $ = new ListenerAction(Objects.requireNonNull(defaults));
        }

        public Builder authenticateCognitoConfig(@Nullable ListenerAuthenticateCognitoConfig authenticateCognitoConfig) {
            $.authenticateCognitoConfig = authenticateCognitoConfig;
            return this;
        }

        public Builder authenticateOidcConfig(@Nullable ListenerAuthenticateOidcConfig authenticateOidcConfig) {
            $.authenticateOidcConfig = authenticateOidcConfig;
            return this;
        }

        public Builder fixedResponseConfig(@Nullable ListenerFixedResponseConfig fixedResponseConfig) {
            $.fixedResponseConfig = fixedResponseConfig;
            return this;
        }

        public Builder forwardConfig(@Nullable ListenerForwardConfig forwardConfig) {
            $.forwardConfig = forwardConfig;
            return this;
        }

        public Builder order(@Nullable Integer order) {
            $.order = order;
            return this;
        }

        public Builder redirectConfig(@Nullable ListenerRedirectConfig redirectConfig) {
            $.redirectConfig = redirectConfig;
            return this;
        }

        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            $.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ListenerAction build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
