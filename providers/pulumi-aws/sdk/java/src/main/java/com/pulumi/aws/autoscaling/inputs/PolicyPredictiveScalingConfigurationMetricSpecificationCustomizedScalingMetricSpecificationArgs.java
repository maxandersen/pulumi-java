// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs Empty = new PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs();

    /**
     * A list of up to 10 structures that defines custom capacity metric in predictive scaling policy
     * 
     */
    @Import(name="metricDataQueries", required=true)
    private Output<List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs>> metricDataQueries;

    /**
     * @return A list of up to 10 structures that defines custom capacity metric in predictive scaling policy
     * 
     */
    public Output<List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs>> metricDataQueries() {
        return this.metricDataQueries;
    }

    private PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs() {}

    private PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs $) {
        this.metricDataQueries = $.metricDataQueries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs $;

        public Builder() {
            $ = new PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs();
        }

        public Builder(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs defaults) {
            $ = new PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricDataQueries A list of up to 10 structures that defines custom capacity metric in predictive scaling policy
         * 
         * @return builder
         * 
         */
        public Builder metricDataQueries(Output<List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs>> metricDataQueries) {
            $.metricDataQueries = metricDataQueries;
            return this;
        }

        /**
         * @param metricDataQueries A list of up to 10 structures that defines custom capacity metric in predictive scaling policy
         * 
         * @return builder
         * 
         */
        public Builder metricDataQueries(List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs> metricDataQueries) {
            return metricDataQueries(Output.of(metricDataQueries));
        }

        /**
         * @param metricDataQueries A list of up to 10 structures that defines custom capacity metric in predictive scaling policy
         * 
         * @return builder
         * 
         */
        public Builder metricDataQueries(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs... metricDataQueries) {
            return metricDataQueries(List.of(metricDataQueries));
        }

        public PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs build() {
            $.metricDataQueries = Objects.requireNonNull($.metricDataQueries, "expected parameter 'metricDataQueries' to be non-null");
            return $;
        }
    }

}
