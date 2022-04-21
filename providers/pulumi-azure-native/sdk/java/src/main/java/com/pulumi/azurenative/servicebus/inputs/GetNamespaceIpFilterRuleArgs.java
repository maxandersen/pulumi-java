// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNamespaceIpFilterRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNamespaceIpFilterRuleArgs Empty = new GetNamespaceIpFilterRuleArgs();

    /**
     * The IP Filter Rule name.
     * 
     */
    @Import(name="ipFilterRuleName", required=true)
    private String ipFilterRuleName;

    public String ipFilterRuleName() {
        return this.ipFilterRuleName;
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

    private GetNamespaceIpFilterRuleArgs() {}

    private GetNamespaceIpFilterRuleArgs(GetNamespaceIpFilterRuleArgs $) {
        this.ipFilterRuleName = $.ipFilterRuleName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNamespaceIpFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNamespaceIpFilterRuleArgs $;

        public Builder() {
            $ = new GetNamespaceIpFilterRuleArgs();
        }

        public Builder(GetNamespaceIpFilterRuleArgs defaults) {
            $ = new GetNamespaceIpFilterRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipFilterRuleName(String ipFilterRuleName) {
            $.ipFilterRuleName = ipFilterRuleName;
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

        public GetNamespaceIpFilterRuleArgs build() {
            $.ipFilterRuleName = Objects.requireNonNull($.ipFilterRuleName, "expected parameter 'ipFilterRuleName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
