// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkProfileArgs Empty = new GetNetworkProfileArgs();

    @Import(name="arn", required=true)
      private final String arn;

    public String arn() {
        return this.arn;
    }

    public GetNetworkProfileArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetNetworkProfileArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }        public GetNetworkProfileArgs build() {
            return new GetNetworkProfileArgs(arn);
        }
    }
}
