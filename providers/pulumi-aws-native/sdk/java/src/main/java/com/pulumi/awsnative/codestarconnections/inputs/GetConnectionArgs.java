// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codestarconnections.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionArgs Empty = new GetConnectionArgs();

    /**
     * The Amazon Resource Name (ARN) of the  connection. The ARN is used as the connection reference when the connection is shared between AWS services.
     * 
     */
    @Import(name="connectionArn", required=true)
      private final String connectionArn;

    public String connectionArn() {
        return this.connectionArn;
    }

    public GetConnectionArgs(String connectionArn) {
        this.connectionArn = Objects.requireNonNull(connectionArn, "expected parameter 'connectionArn' to be non-null");
    }

    private GetConnectionArgs() {
        this.connectionArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionArn = defaults.connectionArn;
        }

        public Builder connectionArn(String connectionArn) {
            this.connectionArn = Objects.requireNonNull(connectionArn);
            return this;
        }        public GetConnectionArgs build() {
            return new GetConnectionArgs(connectionArn);
        }
    }
}
