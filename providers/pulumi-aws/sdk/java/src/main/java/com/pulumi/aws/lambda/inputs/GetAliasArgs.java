// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAliasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAliasArgs Empty = new GetAliasArgs();

    /**
     * Name of the aliased Lambda function.
     * 
     */
    @Import(name="functionName", required=true)
      private final String functionName;

    public String functionName() {
        return this.functionName;
    }

    /**
     * Name of the Lambda alias.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public GetAliasArgs(
        String functionName,
        String name) {
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetAliasArgs() {
        this.functionName = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.name = defaults.name;
        }

        public Builder functionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetAliasArgs build() {
            return new GetAliasArgs(functionName, name);
        }
    }
}
