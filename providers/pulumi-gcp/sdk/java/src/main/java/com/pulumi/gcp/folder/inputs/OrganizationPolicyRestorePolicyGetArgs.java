// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;


public final class OrganizationPolicyRestorePolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyRestorePolicyGetArgs Empty = new OrganizationPolicyRestorePolicyGetArgs();

    /**
     * May only be set to true. If set, then the default Policy is restored.
     * 
     */
    @Import(name="default", required=true)
      private final Output<Boolean> default_;

    public Output<Boolean> default_() {
        return this.default_;
    }

    public OrganizationPolicyRestorePolicyGetArgs(Output<Boolean> default_) {
        this.default_ = Objects.requireNonNull(default_, "expected parameter 'default_' to be non-null");
    }

    private OrganizationPolicyRestorePolicyGetArgs() {
        this.default_ = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationPolicyRestorePolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> default_;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationPolicyRestorePolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
        }

        public Builder default_(Output<Boolean> default_) {
            this.default_ = Objects.requireNonNull(default_);
            return this;
        }
        public Builder default_(Boolean default_) {
            this.default_ = Output.of(Objects.requireNonNull(default_));
            return this;
        }        public OrganizationPolicyRestorePolicyGetArgs build() {
            return new OrganizationPolicyRestorePolicyGetArgs(default_);
        }
    }
}
