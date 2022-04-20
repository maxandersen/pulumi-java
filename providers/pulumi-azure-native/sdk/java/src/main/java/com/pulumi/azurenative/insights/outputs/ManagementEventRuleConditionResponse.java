// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.ManagementEventAggregationConditionResponse;
import com.pulumi.azurenative.insights.outputs.RuleManagementEventDataSourceResponse;
import com.pulumi.azurenative.insights.outputs.RuleMetricDataSourceResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagementEventRuleConditionResponse {
    /**
     * How the data that is collected should be combined over time and when the alert is activated. Note that for management event alerts aggregation is optional – if it is not provided then any event will cause the alert to activate.
     * 
     */
    private final @Nullable ManagementEventAggregationConditionResponse aggregation;
    /**
     * the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    private final @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;
    /**
     * specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition&#39;.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private ManagementEventRuleConditionResponse(
        @CustomType.Parameter("aggregation") @Nullable ManagementEventAggregationConditionResponse aggregation,
        @CustomType.Parameter("dataSource") @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource,
        @CustomType.Parameter("odataType") String odataType) {
        this.aggregation = aggregation;
        this.dataSource = dataSource;
        this.odataType = odataType;
    }

    /**
     * How the data that is collected should be combined over time and when the alert is activated. Note that for management event alerts aggregation is optional – if it is not provided then any event will cause the alert to activate.
     * 
    */
    public Optional<ManagementEventAggregationConditionResponse> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }
    /**
     * the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
    */
    public Optional<Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse>> dataSource() {
        return Optional.ofNullable(this.dataSource);
    }
    /**
     * specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition&#39;.
     * 
    */
    public String odataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementEventRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ManagementEventAggregationConditionResponse aggregation;
        private @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementEventRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.dataSource = defaults.dataSource;
    	      this.odataType = defaults.odataType;
        }

        public Builder aggregation(@Nullable ManagementEventAggregationConditionResponse aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        public Builder dataSource(@Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public ManagementEventRuleConditionResponse build() {
            return new ManagementEventRuleConditionResponse(aggregation, dataSource, odataType);
        }
    }
}
