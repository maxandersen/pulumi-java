// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * settings for security policy patterns to match
 * 
 */
public final class SecurityPolicyWebApplicationFirewallAssociationResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyWebApplicationFirewallAssociationResponse Empty = new SecurityPolicyWebApplicationFirewallAssociationResponse();

    /**
     * List of domains.
     * 
     */
    @Import(name="domains")
      private final @Nullable List<ResourceReferenceResponse> domains;

    public List<ResourceReferenceResponse> domains() {
        return this.domains == null ? List.of() : this.domains;
    }

    /**
     * List of paths
     * 
     */
    @Import(name="patternsToMatch")
      private final @Nullable List<String> patternsToMatch;

    public List<String> patternsToMatch() {
        return this.patternsToMatch == null ? List.of() : this.patternsToMatch;
    }

    public SecurityPolicyWebApplicationFirewallAssociationResponse(
        @Nullable List<ResourceReferenceResponse> domains,
        @Nullable List<String> patternsToMatch) {
        this.domains = domains;
        this.patternsToMatch = patternsToMatch;
    }

    private SecurityPolicyWebApplicationFirewallAssociationResponse() {
        this.domains = List.of();
        this.patternsToMatch = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyWebApplicationFirewallAssociationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResourceReferenceResponse> domains;
        private @Nullable List<String> patternsToMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyWebApplicationFirewallAssociationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.patternsToMatch = defaults.patternsToMatch;
        }

        public Builder domains(@Nullable List<ResourceReferenceResponse> domains) {
            this.domains = domains;
            return this;
        }
        public Builder domains(ResourceReferenceResponse... domains) {
            return domains(List.of(domains));
        }
        public Builder patternsToMatch(@Nullable List<String> patternsToMatch) {
            this.patternsToMatch = patternsToMatch;
            return this;
        }
        public Builder patternsToMatch(String... patternsToMatch) {
            return patternsToMatch(List.of(patternsToMatch));
        }        public SecurityPolicyWebApplicationFirewallAssociationResponse build() {
            return new SecurityPolicyWebApplicationFirewallAssociationResponse(domains, patternsToMatch);
        }
    }
}
