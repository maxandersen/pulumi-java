// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;


public final class OrganizationPolicyBooleanPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyBooleanPolicyArgs Empty = new OrganizationPolicyBooleanPolicyArgs();

    /**
     * If true, then the Policy is enforced. If false, then any configuration is acceptable.
     * 
     */
    @Import(name="enforced", required=true)
      private final Output<Boolean> enforced;

    public Output<Boolean> enforced() {
        return this.enforced;
    }

    public OrganizationPolicyBooleanPolicyArgs(Output<Boolean> enforced) {
        this.enforced = Objects.requireNonNull(enforced, "expected parameter 'enforced' to be non-null");
    }

    private OrganizationPolicyBooleanPolicyArgs() {
        this.enforced = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationPolicyBooleanPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enforced;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationPolicyBooleanPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforced = defaults.enforced;
        }

        public Builder enforced(Output<Boolean> enforced) {
            this.enforced = Objects.requireNonNull(enforced);
            return this;
        }
        public Builder enforced(Boolean enforced) {
            this.enforced = Output.of(Objects.requireNonNull(enforced));
            return this;
        }        public OrganizationPolicyBooleanPolicyArgs build() {
            return new OrganizationPolicyBooleanPolicyArgs(enforced);
        }
    }
}
