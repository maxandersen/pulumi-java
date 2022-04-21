// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaConditionQueryTermArgs;
import com.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaConditionTimeRangeArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata that is used to define a condition that triggers an action. A valid condition must specify at least one of &#39;query_terms&#39; or &#39;products_filter&#39;. If multiple fields are specified, the condition is met if all the fields are satisfied e.g. if a set of query terms and product_filter are set, then only items matching the product_filter for requests with a query matching the query terms wil get boosted.
 * 
 */
public final class GoogleCloudRetailV2betaConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaConditionArgs Empty = new GoogleCloudRetailV2betaConditionArgs();

    /**
     * Range of time(s) specifying when Condition is active. Condition true if any time range matches.
     * 
     */
    @Import(name="activeTimeRange")
    private @Nullable Output<List<GoogleCloudRetailV2betaConditionTimeRangeArgs>> activeTimeRange;

    public Optional<Output<List<GoogleCloudRetailV2betaConditionTimeRangeArgs>>> activeTimeRange() {
        return Optional.ofNullable(this.activeTimeRange);
    }

    /**
     * A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
     * 
     */
    @Import(name="queryTerms")
    private @Nullable Output<List<GoogleCloudRetailV2betaConditionQueryTermArgs>> queryTerms;

    public Optional<Output<List<GoogleCloudRetailV2betaConditionQueryTermArgs>>> queryTerms() {
        return Optional.ofNullable(this.queryTerms);
    }

    private GoogleCloudRetailV2betaConditionArgs() {}

    private GoogleCloudRetailV2betaConditionArgs(GoogleCloudRetailV2betaConditionArgs $) {
        this.activeTimeRange = $.activeTimeRange;
        this.queryTerms = $.queryTerms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2betaConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaConditionArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2betaConditionArgs();
        }

        public Builder(GoogleCloudRetailV2betaConditionArgs defaults) {
            $ = new GoogleCloudRetailV2betaConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder activeTimeRange(@Nullable Output<List<GoogleCloudRetailV2betaConditionTimeRangeArgs>> activeTimeRange) {
            $.activeTimeRange = activeTimeRange;
            return this;
        }

        public Builder activeTimeRange(List<GoogleCloudRetailV2betaConditionTimeRangeArgs> activeTimeRange) {
            return activeTimeRange(Output.of(activeTimeRange));
        }

        public Builder activeTimeRange(GoogleCloudRetailV2betaConditionTimeRangeArgs... activeTimeRange) {
            return activeTimeRange(List.of(activeTimeRange));
        }

        public Builder queryTerms(@Nullable Output<List<GoogleCloudRetailV2betaConditionQueryTermArgs>> queryTerms) {
            $.queryTerms = queryTerms;
            return this;
        }

        public Builder queryTerms(List<GoogleCloudRetailV2betaConditionQueryTermArgs> queryTerms) {
            return queryTerms(Output.of(queryTerms));
        }

        public Builder queryTerms(GoogleCloudRetailV2betaConditionQueryTermArgs... queryTerms) {
            return queryTerms(List.of(queryTerms));
        }

        public GoogleCloudRetailV2betaConditionArgs build() {
            return $;
        }
    }

}
