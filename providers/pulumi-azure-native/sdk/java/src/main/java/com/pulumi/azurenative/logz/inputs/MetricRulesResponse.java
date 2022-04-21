// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.azurenative.logz.inputs.FilteringTagResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set of rules for sending metrics for the Monitor resource.
 * 
 */
public final class MetricRulesResponse extends com.pulumi.resources.InvokeArgs {

    public static final MetricRulesResponse Empty = new MetricRulesResponse();

    /**
     * List of filtering tags to be used for capturing metrics. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * 
     */
    @Import(name="filteringTags")
    private @Nullable List<FilteringTagResponse> filteringTags;

    public Optional<List<FilteringTagResponse>> filteringTags() {
        return Optional.ofNullable(this.filteringTags);
    }

    /**
     * Subscription Id for which filtering tags are applicable
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable String subscriptionId;

    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    private MetricRulesResponse() {}

    private MetricRulesResponse(MetricRulesResponse $) {
        this.filteringTags = $.filteringTags;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricRulesResponse $;

        public Builder() {
            $ = new MetricRulesResponse();
        }

        public Builder(MetricRulesResponse defaults) {
            $ = new MetricRulesResponse(Objects.requireNonNull(defaults));
        }

        public Builder filteringTags(@Nullable List<FilteringTagResponse> filteringTags) {
            $.filteringTags = filteringTags;
            return this;
        }

        public Builder filteringTags(FilteringTagResponse... filteringTags) {
            return filteringTags(List.of(filteringTags));
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public MetricRulesResponse build() {
            return $;
        }
    }

}
