// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCustomAssessmentAutomationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomAssessmentAutomationArgs Empty = new GetCustomAssessmentAutomationArgs();

    /**
     * Name of the Custom Assessment Automation.
     * 
     */
    @Import(name="customAssessmentAutomationName", required=true)
    private String customAssessmentAutomationName;

    /**
     * @return Name of the Custom Assessment Automation.
     * 
     */
    public String customAssessmentAutomationName() {
        return this.customAssessmentAutomationName;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetCustomAssessmentAutomationArgs() {}

    private GetCustomAssessmentAutomationArgs(GetCustomAssessmentAutomationArgs $) {
        this.customAssessmentAutomationName = $.customAssessmentAutomationName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomAssessmentAutomationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomAssessmentAutomationArgs $;

        public Builder() {
            $ = new GetCustomAssessmentAutomationArgs();
        }

        public Builder(GetCustomAssessmentAutomationArgs defaults) {
            $ = new GetCustomAssessmentAutomationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customAssessmentAutomationName Name of the Custom Assessment Automation.
         * 
         * @return builder
         * 
         */
        public Builder customAssessmentAutomationName(String customAssessmentAutomationName) {
            $.customAssessmentAutomationName = customAssessmentAutomationName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetCustomAssessmentAutomationArgs build() {
            $.customAssessmentAutomationName = Objects.requireNonNull($.customAssessmentAutomationName, "expected parameter 'customAssessmentAutomationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
