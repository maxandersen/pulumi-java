// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ApplicationGatewayRewriteRuleResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rewrite rule set of an application gateway.
 * 
 */
public final class ApplicationGatewayRewriteRuleSetResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayRewriteRuleSetResponse Empty = new ApplicationGatewayRewriteRuleSetResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Name of the rewrite rule set that is unique within an Application Gateway.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the rewrite rule set resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Rewrite rules in the rewrite rule set.
     * 
     */
    @Import(name="rewriteRules")
      private final @Nullable List<ApplicationGatewayRewriteRuleResponse> rewriteRules;

    public List<ApplicationGatewayRewriteRuleResponse> rewriteRules() {
        return this.rewriteRules == null ? List.of() : this.rewriteRules;
    }

    public ApplicationGatewayRewriteRuleSetResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        @Nullable List<ApplicationGatewayRewriteRuleResponse> rewriteRules) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.rewriteRules = rewriteRules;
    }

    private ApplicationGatewayRewriteRuleSetResponse() {
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.rewriteRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable List<ApplicationGatewayRewriteRuleResponse> rewriteRules;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRewriteRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.rewriteRules = defaults.rewriteRules;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder rewriteRules(@Nullable List<ApplicationGatewayRewriteRuleResponse> rewriteRules) {
            this.rewriteRules = rewriteRules;
            return this;
        }
        public Builder rewriteRules(ApplicationGatewayRewriteRuleResponse... rewriteRules) {
            return rewriteRules(List.of(rewriteRules));
        }        public ApplicationGatewayRewriteRuleSetResponse build() {
            return new ApplicationGatewayRewriteRuleSetResponse(etag, id, name, provisioningState, rewriteRules);
        }
    }
}
