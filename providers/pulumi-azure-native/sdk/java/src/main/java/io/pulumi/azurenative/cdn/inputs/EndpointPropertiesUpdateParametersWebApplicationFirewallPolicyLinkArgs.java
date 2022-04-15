// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the Web Application Firewall policy for the endpoint (if applicable)
 * 
 */
public final class EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLinkArgs Empty = new EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLinkArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    public EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLinkArgs(@Nullable Output<String> id) {
        this.id = id;
    }

    private EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLinkArgs() {
        this.id = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }        public EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLinkArgs build() {
            return new EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLinkArgs(id);
        }
    }
}
