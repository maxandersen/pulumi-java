// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs Empty = new RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs();

    /**
     * The list of label value pairs that must match labels in the provided metadata
     * based on filterMatchCriteria  This list must not be empty and can have at the
     * most 64 entries.
     * Structure is documented below.
     * 
     */
    @Import(name="filterLabels", required=true)
    private Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs>> filterLabels;

    public Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs>> filterLabels() {
        return this.filterLabels;
    }

    /**
     * Specifies how individual filterLabel matches within the list of filterLabels
     * contribute towards the overall metadataFilter match. Supported values are:
     * * MATCH_ANY: At least one of the filterLabels must have a matching label in the
     *   provided metadata.
     * * MATCH_ALL: All filterLabels must have matching labels in
     *   the provided metadata.
     *   Possible values are `MATCH_ALL` and `MATCH_ANY`.
     * 
     */
    @Import(name="filterMatchCriteria", required=true)
    private Output<String> filterMatchCriteria;

    public Output<String> filterMatchCriteria() {
        return this.filterMatchCriteria;
    }

    private RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs() {}

    private RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs(RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs $) {
        this.filterLabels = $.filterLabels;
        this.filterMatchCriteria = $.filterMatchCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs();
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs defaults) {
            $ = new RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder filterLabels(Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs>> filterLabels) {
            $.filterLabels = filterLabels;
            return this;
        }

        public Builder filterLabels(List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs> filterLabels) {
            return filterLabels(Output.of(filterLabels));
        }

        public Builder filterLabels(RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs... filterLabels) {
            return filterLabels(List.of(filterLabels));
        }

        public Builder filterMatchCriteria(Output<String> filterMatchCriteria) {
            $.filterMatchCriteria = filterMatchCriteria;
            return this;
        }

        public Builder filterMatchCriteria(String filterMatchCriteria) {
            return filterMatchCriteria(Output.of(filterMatchCriteria));
        }

        public RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs build() {
            $.filterLabels = Objects.requireNonNull($.filterLabels, "expected parameter 'filterLabels' to be non-null");
            $.filterMatchCriteria = Objects.requireNonNull($.filterMatchCriteria, "expected parameter 'filterMatchCriteria' to be non-null");
            return $;
        }
    }

}
