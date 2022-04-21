// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.MetricCriteriaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the metric alert criteria for a single resource that has multiple metric criteria.
 * 
 */
public final class MetricAlertSingleResourceMultipleMetricCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricAlertSingleResourceMultipleMetricCriteriaArgs Empty = new MetricAlertSingleResourceMultipleMetricCriteriaArgs();

    /**
     * The list of metric criteria for this &#39;all of&#39; operation.
     * 
     */
    @Import(name="allOf")
    private @Nullable Output<List<MetricCriteriaArgs>> allOf;

    public Optional<Output<List<MetricCriteriaArgs>>> allOf() {
        return Optional.ofNullable(this.allOf);
    }

    /**
     * specifies the type of the alert criteria.
     * Expected value is &#39;Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    private MetricAlertSingleResourceMultipleMetricCriteriaArgs() {}

    private MetricAlertSingleResourceMultipleMetricCriteriaArgs(MetricAlertSingleResourceMultipleMetricCriteriaArgs $) {
        this.allOf = $.allOf;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricAlertSingleResourceMultipleMetricCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricAlertSingleResourceMultipleMetricCriteriaArgs $;

        public Builder() {
            $ = new MetricAlertSingleResourceMultipleMetricCriteriaArgs();
        }

        public Builder(MetricAlertSingleResourceMultipleMetricCriteriaArgs defaults) {
            $ = new MetricAlertSingleResourceMultipleMetricCriteriaArgs(Objects.requireNonNull(defaults));
        }

        public Builder allOf(@Nullable Output<List<MetricCriteriaArgs>> allOf) {
            $.allOf = allOf;
            return this;
        }

        public Builder allOf(List<MetricCriteriaArgs> allOf) {
            return allOf(Output.of(allOf));
        }

        public Builder allOf(MetricCriteriaArgs... allOf) {
            return allOf(List.of(allOf));
        }

        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public MetricAlertSingleResourceMultipleMetricCriteriaArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
