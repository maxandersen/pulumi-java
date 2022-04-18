// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.outputs;

import com.pulumi.aws.alb.outputs.GetListenerDefaultActionAuthenticateCognito;
import com.pulumi.aws.alb.outputs.GetListenerDefaultActionAuthenticateOidc;
import com.pulumi.aws.alb.outputs.GetListenerDefaultActionFixedResponse;
import com.pulumi.aws.alb.outputs.GetListenerDefaultActionForward;
import com.pulumi.aws.alb.outputs.GetListenerDefaultActionRedirect;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetListenerDefaultAction {
    private final List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos;
    private final List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs;
    private final List<GetListenerDefaultActionFixedResponse> fixedResponses;
    private final List<GetListenerDefaultActionForward> forwards;
    private final Integer order;
    private final List<GetListenerDefaultActionRedirect> redirects;
    private final String targetGroupArn;
    private final String type;

    @CustomType.Constructor
    private GetListenerDefaultAction(
        @CustomType.Parameter("authenticateCognitos") List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos,
        @CustomType.Parameter("authenticateOidcs") List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs,
        @CustomType.Parameter("fixedResponses") List<GetListenerDefaultActionFixedResponse> fixedResponses,
        @CustomType.Parameter("forwards") List<GetListenerDefaultActionForward> forwards,
        @CustomType.Parameter("order") Integer order,
        @CustomType.Parameter("redirects") List<GetListenerDefaultActionRedirect> redirects,
        @CustomType.Parameter("targetGroupArn") String targetGroupArn,
        @CustomType.Parameter("type") String type) {
        this.authenticateCognitos = authenticateCognitos;
        this.authenticateOidcs = authenticateOidcs;
        this.fixedResponses = fixedResponses;
        this.forwards = forwards;
        this.order = order;
        this.redirects = redirects;
        this.targetGroupArn = targetGroupArn;
        this.type = type;
    }

    public List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos() {
        return this.authenticateCognitos;
    }
    public List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs() {
        return this.authenticateOidcs;
    }
    public List<GetListenerDefaultActionFixedResponse> fixedResponses() {
        return this.fixedResponses;
    }
    public List<GetListenerDefaultActionForward> forwards() {
        return this.forwards;
    }
    public Integer order() {
        return this.order;
    }
    public List<GetListenerDefaultActionRedirect> redirects() {
        return this.redirects;
    }
    public String targetGroupArn() {
        return this.targetGroupArn;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos;
        private List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs;
        private List<GetListenerDefaultActionFixedResponse> fixedResponses;
        private List<GetListenerDefaultActionForward> forwards;
        private Integer order;
        private List<GetListenerDefaultActionRedirect> redirects;
        private String targetGroupArn;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognitos = defaults.authenticateCognitos;
    	      this.authenticateOidcs = defaults.authenticateOidcs;
    	      this.fixedResponses = defaults.fixedResponses;
    	      this.forwards = defaults.forwards;
    	      this.order = defaults.order;
    	      this.redirects = defaults.redirects;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder authenticateCognitos(List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos) {
            this.authenticateCognitos = Objects.requireNonNull(authenticateCognitos);
            return this;
        }
        public Builder authenticateCognitos(GetListenerDefaultActionAuthenticateCognito... authenticateCognitos) {
            return authenticateCognitos(List.of(authenticateCognitos));
        }
        public Builder authenticateOidcs(List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs) {
            this.authenticateOidcs = Objects.requireNonNull(authenticateOidcs);
            return this;
        }
        public Builder authenticateOidcs(GetListenerDefaultActionAuthenticateOidc... authenticateOidcs) {
            return authenticateOidcs(List.of(authenticateOidcs));
        }
        public Builder fixedResponses(List<GetListenerDefaultActionFixedResponse> fixedResponses) {
            this.fixedResponses = Objects.requireNonNull(fixedResponses);
            return this;
        }
        public Builder fixedResponses(GetListenerDefaultActionFixedResponse... fixedResponses) {
            return fixedResponses(List.of(fixedResponses));
        }
        public Builder forwards(List<GetListenerDefaultActionForward> forwards) {
            this.forwards = Objects.requireNonNull(forwards);
            return this;
        }
        public Builder forwards(GetListenerDefaultActionForward... forwards) {
            return forwards(List.of(forwards));
        }
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public Builder redirects(List<GetListenerDefaultActionRedirect> redirects) {
            this.redirects = Objects.requireNonNull(redirects);
            return this;
        }
        public Builder redirects(GetListenerDefaultActionRedirect... redirects) {
            return redirects(List.of(redirects));
        }
        public Builder targetGroupArn(String targetGroupArn) {
            this.targetGroupArn = Objects.requireNonNull(targetGroupArn);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetListenerDefaultAction build() {
            return new GetListenerDefaultAction(authenticateCognitos, authenticateOidcs, fixedResponses, forwards, order, redirects, targetGroupArn, type);
        }
    }
}
