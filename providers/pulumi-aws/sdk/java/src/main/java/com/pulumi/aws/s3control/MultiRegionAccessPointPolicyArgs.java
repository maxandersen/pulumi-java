// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control;

import com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyDetailsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MultiRegionAccessPointPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointPolicyArgs Empty = new MultiRegionAccessPointPolicyArgs();

    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * A configuration block containing details about the policy for the Multi-Region Access Point. See Details Configuration Block below for more details
     * 
     */
    @Import(name="details", required=true)
      private final Output<MultiRegionAccessPointPolicyDetailsArgs> details;

    public Output<MultiRegionAccessPointPolicyDetailsArgs> details() {
        return this.details;
    }

    public MultiRegionAccessPointPolicyArgs(
        @Nullable Output<String> accountId,
        Output<MultiRegionAccessPointPolicyDetailsArgs> details) {
        this.accountId = accountId;
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
    }

    private MultiRegionAccessPointPolicyArgs() {
        this.accountId = Codegen.empty();
        this.details = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private Output<MultiRegionAccessPointPolicyDetailsArgs> details;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.details = defaults.details;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder details(Output<MultiRegionAccessPointPolicyDetailsArgs> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }
        public Builder details(MultiRegionAccessPointPolicyDetailsArgs details) {
            this.details = Output.of(Objects.requireNonNull(details));
            return this;
        }        public MultiRegionAccessPointPolicyArgs build() {
            return new MultiRegionAccessPointPolicyArgs(accountId, details);
        }
    }
}
