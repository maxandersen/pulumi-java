// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAlertsSuppressionRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertsSuppressionRuleArgs Empty = new GetAlertsSuppressionRuleArgs();

    /**
     * The unique name of the suppression alert rule
     * 
     */
    @Import(name="alertsSuppressionRuleName", required=true)
    private String alertsSuppressionRuleName;

    /**
     * @return The unique name of the suppression alert rule
     * 
     */
    public String alertsSuppressionRuleName() {
        return this.alertsSuppressionRuleName;
    }

    private GetAlertsSuppressionRuleArgs() {}

    private GetAlertsSuppressionRuleArgs(GetAlertsSuppressionRuleArgs $) {
        this.alertsSuppressionRuleName = $.alertsSuppressionRuleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertsSuppressionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertsSuppressionRuleArgs $;

        public Builder() {
            $ = new GetAlertsSuppressionRuleArgs();
        }

        public Builder(GetAlertsSuppressionRuleArgs defaults) {
            $ = new GetAlertsSuppressionRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertsSuppressionRuleName The unique name of the suppression alert rule
         * 
         * @return builder
         * 
         */
        public Builder alertsSuppressionRuleName(String alertsSuppressionRuleName) {
            $.alertsSuppressionRuleName = alertsSuppressionRuleName;
            return this;
        }

        public GetAlertsSuppressionRuleArgs build() {
            $.alertsSuppressionRuleName = Objects.requireNonNull($.alertsSuppressionRuleName, "expected parameter 'alertsSuppressionRuleName' to be non-null");
            return $;
        }
    }

}
