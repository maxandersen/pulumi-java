// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.relay.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListHybridConnectionKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListHybridConnectionKeysArgs Empty = new ListHybridConnectionKeysArgs();

    /**
     * The authorization rule name.
     * 
     */
    @Import(name="authorizationRuleName", required=true)
    private String authorizationRuleName;

    public String authorizationRuleName() {
        return this.authorizationRuleName;
    }

    /**
     * The hybrid connection name.
     * 
     */
    @Import(name="hybridConnectionName", required=true)
    private String hybridConnectionName;

    public String hybridConnectionName() {
        return this.hybridConnectionName;
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListHybridConnectionKeysArgs() {}

    private ListHybridConnectionKeysArgs(ListHybridConnectionKeysArgs $) {
        this.authorizationRuleName = $.authorizationRuleName;
        this.hybridConnectionName = $.hybridConnectionName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListHybridConnectionKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListHybridConnectionKeysArgs $;

        public Builder() {
            $ = new ListHybridConnectionKeysArgs();
        }

        public Builder(ListHybridConnectionKeysArgs defaults) {
            $ = new ListHybridConnectionKeysArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizationRuleName(String authorizationRuleName) {
            $.authorizationRuleName = authorizationRuleName;
            return this;
        }

        public Builder hybridConnectionName(String hybridConnectionName) {
            $.hybridConnectionName = hybridConnectionName;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListHybridConnectionKeysArgs build() {
            $.authorizationRuleName = Objects.requireNonNull($.authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
            $.hybridConnectionName = Objects.requireNonNull($.hybridConnectionName, "expected parameter 'hybridConnectionName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
