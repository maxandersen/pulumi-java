// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetTagAtScopeArgs extends InvokeArgs {

    public static final GetTagAtScopeArgs Empty = new GetTagAtScopeArgs();

    /**
     * The resource scope.
     * 
     */
    @Import(name="scope", required=true)
    private String scope;

    /**
     * @return The resource scope.
     * 
     */
    public String scope() {
        return this.scope;
    }

    private GetTagAtScopeArgs() {}

    private GetTagAtScopeArgs(GetTagAtScopeArgs $) {
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagAtScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagAtScopeArgs $;

        public Builder() {
            $ = new GetTagAtScopeArgs();
        }

        public Builder(GetTagAtScopeArgs defaults) {
            $ = new GetTagAtScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scope The resource scope.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        public GetTagAtScopeArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
