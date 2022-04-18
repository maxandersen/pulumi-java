// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.subscription.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAliasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAliasArgs Empty = new GetAliasArgs();

    /**
     * Name for this subscription creation request also known as alias. Note that this is not the same as subscription name and this doesn’t have any other lifecycle need beyond the request for subscription creation.
     * 
     */
    @Import(name="aliasName", required=true)
      private final String aliasName;

    public String aliasName() {
        return this.aliasName;
    }

    public GetAliasArgs(String aliasName) {
        this.aliasName = Objects.requireNonNull(aliasName, "expected parameter 'aliasName' to be non-null");
    }

    private GetAliasArgs() {
        this.aliasName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aliasName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasName = defaults.aliasName;
        }

        public Builder aliasName(String aliasName) {
            this.aliasName = Objects.requireNonNull(aliasName);
            return this;
        }        public GetAliasArgs build() {
            return new GetAliasArgs(aliasName);
        }
    }
}
