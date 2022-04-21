// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs Empty = new FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs();

    /**
     * A configuration block describing the stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet. You can pair this custom action with any of the standard stateless rule actions. See Publish Metric Action below for details.
     * 
     */
    @Import(name="publishMetricAction", required=true)
    private Output<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs> publishMetricAction;

    public Output<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs> publishMetricAction() {
        return this.publishMetricAction;
    }

    private FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs() {}

    private FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs $) {
        this.publishMetricAction = $.publishMetricAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs $;

        public Builder() {
            $ = new FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs();
        }

        public Builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs defaults) {
            $ = new FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder publishMetricAction(Output<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs> publishMetricAction) {
            $.publishMetricAction = publishMetricAction;
            return this;
        }

        public Builder publishMetricAction(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs publishMetricAction) {
            return publishMetricAction(Output.of(publishMetricAction));
        }

        public FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs build() {
            $.publishMetricAction = Objects.requireNonNull($.publishMetricAction, "expected parameter 'publishMetricAction' to be non-null");
            return $;
        }
    }

}
