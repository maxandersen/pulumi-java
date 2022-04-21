// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.relay.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWCFRelayAuthorizationRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWCFRelayAuthorizationRuleArgs Empty = new GetWCFRelayAuthorizationRuleArgs();

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
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * The relay name.
     * 
     */
    @Import(name="relayName", required=true)
    private String relayName;

    public String relayName() {
        return this.relayName;
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

    private GetWCFRelayAuthorizationRuleArgs() {}

    private GetWCFRelayAuthorizationRuleArgs(GetWCFRelayAuthorizationRuleArgs $) {
        this.authorizationRuleName = $.authorizationRuleName;
        this.namespaceName = $.namespaceName;
        this.relayName = $.relayName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWCFRelayAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWCFRelayAuthorizationRuleArgs $;

        public Builder() {
            $ = new GetWCFRelayAuthorizationRuleArgs();
        }

        public Builder(GetWCFRelayAuthorizationRuleArgs defaults) {
            $ = new GetWCFRelayAuthorizationRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizationRuleName(String authorizationRuleName) {
            $.authorizationRuleName = authorizationRuleName;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        public Builder relayName(String relayName) {
            $.relayName = relayName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetWCFRelayAuthorizationRuleArgs build() {
            $.authorizationRuleName = Objects.requireNonNull($.authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.relayName = Objects.requireNonNull($.relayName, "expected parameter 'relayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
