// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.RuleGroupSizeConstraintStatementComparisonOperator;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.List;
import java.util.Objects;


/**
 * Size Constraint statement.
 * 
 */
public final class RuleGroupSizeConstraintStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupSizeConstraintStatementArgs Empty = new RuleGroupSizeConstraintStatementArgs();

    @Import(name="comparisonOperator", required=true)
    private Output<RuleGroupSizeConstraintStatementComparisonOperator> comparisonOperator;

    public Output<RuleGroupSizeConstraintStatementComparisonOperator> comparisonOperator() {
        return this.comparisonOperator;
    }

    @Import(name="fieldToMatch", required=true)
    private Output<RuleGroupFieldToMatchArgs> fieldToMatch;

    public Output<RuleGroupFieldToMatchArgs> fieldToMatch() {
        return this.fieldToMatch;
    }

    @Import(name="size", required=true)
    private Output<Double> size;

    public Output<Double> size() {
        return this.size;
    }

    @Import(name="textTransformations", required=true)
    private Output<List<RuleGroupTextTransformationArgs>> textTransformations;

    public Output<List<RuleGroupTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private RuleGroupSizeConstraintStatementArgs() {}

    private RuleGroupSizeConstraintStatementArgs(RuleGroupSizeConstraintStatementArgs $) {
        this.comparisonOperator = $.comparisonOperator;
        this.fieldToMatch = $.fieldToMatch;
        this.size = $.size;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupSizeConstraintStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupSizeConstraintStatementArgs $;

        public Builder() {
            $ = new RuleGroupSizeConstraintStatementArgs();
        }

        public Builder(RuleGroupSizeConstraintStatementArgs defaults) {
            $ = new RuleGroupSizeConstraintStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder comparisonOperator(Output<RuleGroupSizeConstraintStatementComparisonOperator> comparisonOperator) {
            $.comparisonOperator = comparisonOperator;
            return this;
        }

        public Builder comparisonOperator(RuleGroupSizeConstraintStatementComparisonOperator comparisonOperator) {
            return comparisonOperator(Output.of(comparisonOperator));
        }

        public Builder fieldToMatch(Output<RuleGroupFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(RuleGroupFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder size(Output<Double> size) {
            $.size = size;
            return this;
        }

        public Builder size(Double size) {
            return size(Output.of(size));
        }

        public Builder textTransformations(Output<List<RuleGroupTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<RuleGroupTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(RuleGroupTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public RuleGroupSizeConstraintStatementArgs build() {
            $.comparisonOperator = Objects.requireNonNull($.comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
            $.fieldToMatch = Objects.requireNonNull($.fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
            $.size = Objects.requireNonNull($.size, "expected parameter 'size' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
