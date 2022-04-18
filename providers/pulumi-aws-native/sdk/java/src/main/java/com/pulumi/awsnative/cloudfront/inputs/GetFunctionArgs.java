// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionArgs Empty = new GetFunctionArgs();

    @Import(name="functionARN", required=true)
      private final String functionARN;

    public String functionARN() {
        return this.functionARN;
    }

    public GetFunctionArgs(String functionARN) {
        this.functionARN = Objects.requireNonNull(functionARN, "expected parameter 'functionARN' to be non-null");
    }

    private GetFunctionArgs() {
        this.functionARN = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionARN;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionARN = defaults.functionARN;
        }

        public Builder functionARN(String functionARN) {
            this.functionARN = Objects.requireNonNull(functionARN);
            return this;
        }        public GetFunctionArgs build() {
            return new GetFunctionArgs(functionARN);
        }
    }
}
