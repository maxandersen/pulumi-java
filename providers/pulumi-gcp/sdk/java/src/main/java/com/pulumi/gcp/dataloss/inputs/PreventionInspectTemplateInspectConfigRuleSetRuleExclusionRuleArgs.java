// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs();

    /**
     * Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    @Import(name="dictionary")
    private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs> dictionary;

    public Optional<Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs>> dictionary() {
        return Optional.ofNullable(this.dictionary);
    }

    /**
     * Set of infoTypes for which findings would affect this rule.
     * Structure is documented below.
     * 
     */
    @Import(name="excludeInfoTypes")
    private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs> excludeInfoTypes;

    public Optional<Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs>> excludeInfoTypes() {
        return Optional.ofNullable(this.excludeInfoTypes);
    }

    /**
     * How the rule is applied. See the documentation for more information: https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#MatchingType
     * Possible values are `MATCHING_TYPE_FULL_MATCH`, `MATCHING_TYPE_PARTIAL_MATCH`, and `MATCHING_TYPE_INVERSE_MATCH`.
     * 
     */
    @Import(name="matchingType", required=true)
    private Output<String> matchingType;

    public Output<String> matchingType() {
        return this.matchingType;
    }

    /**
     * Regular expression which defines the rule.
     * Structure is documented below.
     * 
     */
    @Import(name="regex")
    private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs> regex;

    public Optional<Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs>> regex() {
        return Optional.ofNullable(this.regex);
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs() {}

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs $) {
        this.dictionary = $.dictionary;
        this.excludeInfoTypes = $.excludeInfoTypes;
        this.matchingType = $.matchingType;
        this.regex = $.regex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder dictionary(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs> dictionary) {
            $.dictionary = dictionary;
            return this;
        }

        public Builder dictionary(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs dictionary) {
            return dictionary(Output.of(dictionary));
        }

        public Builder excludeInfoTypes(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs> excludeInfoTypes) {
            $.excludeInfoTypes = excludeInfoTypes;
            return this;
        }

        public Builder excludeInfoTypes(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs excludeInfoTypes) {
            return excludeInfoTypes(Output.of(excludeInfoTypes));
        }

        public Builder matchingType(Output<String> matchingType) {
            $.matchingType = matchingType;
            return this;
        }

        public Builder matchingType(String matchingType) {
            return matchingType(Output.of(matchingType));
        }

        public Builder regex(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs> regex) {
            $.regex = regex;
            return this;
        }

        public Builder regex(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs regex) {
            return regex(Output.of(regex));
        }

        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs build() {
            $.matchingType = Objects.requireNonNull($.matchingType, "expected parameter 'matchingType' to be non-null");
            return $;
        }
    }

}
