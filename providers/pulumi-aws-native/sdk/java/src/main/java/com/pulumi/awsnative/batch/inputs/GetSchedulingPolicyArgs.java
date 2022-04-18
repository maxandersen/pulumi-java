// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSchedulingPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchedulingPolicyArgs Empty = new GetSchedulingPolicyArgs();

    @Import(name="arn", required=true)
      private final String arn;

    public String arn() {
        return this.arn;
    }

    public GetSchedulingPolicyArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetSchedulingPolicyArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchedulingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchedulingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }        public GetSchedulingPolicyArgs build() {
            return new GetSchedulingPolicyArgs(arn);
        }
    }
}
