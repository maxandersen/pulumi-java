// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.consumption.inputs;

import com.pulumi.azurenative.consumption.inputs.BudgetComparisonExpressionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Dimensions or Tags to filter a budget by.
 * 
 */
public final class BudgetFilterPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetFilterPropertiesArgs Empty = new BudgetFilterPropertiesArgs();

    /**
     * Has comparison expression for a dimension
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<BudgetComparisonExpressionArgs> dimensions;

    public Optional<Output<BudgetComparisonExpressionArgs>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * Has comparison expression for a tag
     * 
     */
    @Import(name="tags")
    private @Nullable Output<BudgetComparisonExpressionArgs> tags;

    public Optional<Output<BudgetComparisonExpressionArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private BudgetFilterPropertiesArgs() {}

    private BudgetFilterPropertiesArgs(BudgetFilterPropertiesArgs $) {
        this.dimensions = $.dimensions;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetFilterPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetFilterPropertiesArgs $;

        public Builder() {
            $ = new BudgetFilterPropertiesArgs();
        }

        public Builder(BudgetFilterPropertiesArgs defaults) {
            $ = new BudgetFilterPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder dimensions(@Nullable Output<BudgetComparisonExpressionArgs> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(BudgetComparisonExpressionArgs dimensions) {
            return dimensions(Output.of(dimensions));
        }

        public Builder tags(@Nullable Output<BudgetComparisonExpressionArgs> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(BudgetComparisonExpressionArgs tags) {
            return tags(Output.of(tags));
        }

        public BudgetFilterPropertiesArgs build() {
            return $;
        }
    }

}
