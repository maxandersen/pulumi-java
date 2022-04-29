// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetScopeAssignmentArgs extends InvokeArgs {

    public static final GetScopeAssignmentArgs Empty = new GetScopeAssignmentArgs();

    /**
     * The base resource of the scope assignment.
     * 
     */
    @Import(name="scope", required=true)
    private String scope;

    /**
     * @return The base resource of the scope assignment.
     * 
     */
    public String scope() {
        return this.scope;
    }

    /**
     * The name of the scope assignment to get.
     * 
     */
    @Import(name="scopeAssignmentName", required=true)
    private String scopeAssignmentName;

    /**
     * @return The name of the scope assignment to get.
     * 
     */
    public String scopeAssignmentName() {
        return this.scopeAssignmentName;
    }

    private GetScopeAssignmentArgs() {}

    private GetScopeAssignmentArgs(GetScopeAssignmentArgs $) {
        this.scope = $.scope;
        this.scopeAssignmentName = $.scopeAssignmentName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScopeAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScopeAssignmentArgs $;

        public Builder() {
            $ = new GetScopeAssignmentArgs();
        }

        public Builder(GetScopeAssignmentArgs defaults) {
            $ = new GetScopeAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scope The base resource of the scope assignment.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scopeAssignmentName The name of the scope assignment to get.
         * 
         * @return builder
         * 
         */
        public Builder scopeAssignmentName(String scopeAssignmentName) {
            $.scopeAssignmentName = scopeAssignmentName;
            return this;
        }

        public GetScopeAssignmentArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            $.scopeAssignmentName = Objects.requireNonNull($.scopeAssignmentName, "expected parameter 'scopeAssignmentName' to be non-null");
            return $;
        }
    }

}
