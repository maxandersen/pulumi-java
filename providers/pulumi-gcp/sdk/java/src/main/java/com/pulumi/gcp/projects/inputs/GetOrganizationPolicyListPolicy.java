// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.projects.inputs.GetOrganizationPolicyListPolicyAllow;
import com.pulumi.gcp.projects.inputs.GetOrganizationPolicyListPolicyDeny;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetOrganizationPolicyListPolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationPolicyListPolicy Empty = new GetOrganizationPolicyListPolicy();

    @Import(name="allows", required=true)
      private final List<GetOrganizationPolicyListPolicyAllow> allows;

    public List<GetOrganizationPolicyListPolicyAllow> allows() {
        return this.allows;
    }

    @Import(name="denies", required=true)
      private final List<GetOrganizationPolicyListPolicyDeny> denies;

    public List<GetOrganizationPolicyListPolicyDeny> denies() {
        return this.denies;
    }

    @Import(name="inheritFromParent", required=true)
      private final Boolean inheritFromParent;

    public Boolean inheritFromParent() {
        return this.inheritFromParent;
    }

    @Import(name="suggestedValue", required=true)
      private final String suggestedValue;

    public String suggestedValue() {
        return this.suggestedValue;
    }

    public GetOrganizationPolicyListPolicy(
        List<GetOrganizationPolicyListPolicyAllow> allows,
        List<GetOrganizationPolicyListPolicyDeny> denies,
        Boolean inheritFromParent,
        String suggestedValue) {
        this.allows = Objects.requireNonNull(allows, "expected parameter 'allows' to be non-null");
        this.denies = Objects.requireNonNull(denies, "expected parameter 'denies' to be non-null");
        this.inheritFromParent = Objects.requireNonNull(inheritFromParent, "expected parameter 'inheritFromParent' to be non-null");
        this.suggestedValue = Objects.requireNonNull(suggestedValue, "expected parameter 'suggestedValue' to be non-null");
    }

    private GetOrganizationPolicyListPolicy() {
        this.allows = List.of();
        this.denies = List.of();
        this.inheritFromParent = null;
        this.suggestedValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyListPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetOrganizationPolicyListPolicyAllow> allows;
        private List<GetOrganizationPolicyListPolicyDeny> denies;
        private Boolean inheritFromParent;
        private String suggestedValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyListPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allows = defaults.allows;
    	      this.denies = defaults.denies;
    	      this.inheritFromParent = defaults.inheritFromParent;
    	      this.suggestedValue = defaults.suggestedValue;
        }

        public Builder allows(List<GetOrganizationPolicyListPolicyAllow> allows) {
            this.allows = Objects.requireNonNull(allows);
            return this;
        }
        public Builder allows(GetOrganizationPolicyListPolicyAllow... allows) {
            return allows(List.of(allows));
        }
        public Builder denies(List<GetOrganizationPolicyListPolicyDeny> denies) {
            this.denies = Objects.requireNonNull(denies);
            return this;
        }
        public Builder denies(GetOrganizationPolicyListPolicyDeny... denies) {
            return denies(List.of(denies));
        }
        public Builder inheritFromParent(Boolean inheritFromParent) {
            this.inheritFromParent = Objects.requireNonNull(inheritFromParent);
            return this;
        }
        public Builder suggestedValue(String suggestedValue) {
            this.suggestedValue = Objects.requireNonNull(suggestedValue);
            return this;
        }        public GetOrganizationPolicyListPolicy build() {
            return new GetOrganizationPolicyListPolicy(allows, denies, inheritFromParent, suggestedValue);
        }
    }
}
