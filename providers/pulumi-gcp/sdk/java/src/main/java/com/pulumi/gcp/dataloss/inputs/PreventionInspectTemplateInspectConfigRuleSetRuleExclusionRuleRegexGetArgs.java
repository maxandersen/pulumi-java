// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs();

    /**
     * The index of the submatch to extract as findings. When not specified, the entire match is returned. No more than 3 may be included.
     * 
     */
    @Import(name="groupIndexes")
    private @Nullable Output<List<Integer>> groupIndexes;

    public Optional<Output<List<Integer>>> groupIndexes() {
        return Optional.ofNullable(this.groupIndexes);
    }

    /**
     * Pattern defining the regular expression.
     * Its syntax (https://github.com/google/re2/wiki/Syntax) can be found under the google/re2 repository on GitHub.
     * 
     */
    @Import(name="pattern", required=true)
    private Output<String> pattern;

    public Output<String> pattern() {
        return this.pattern;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs() {}

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs $) {
        this.groupIndexes = $.groupIndexes;
        this.pattern = $.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupIndexes(@Nullable Output<List<Integer>> groupIndexes) {
            $.groupIndexes = groupIndexes;
            return this;
        }

        public Builder groupIndexes(List<Integer> groupIndexes) {
            return groupIndexes(Output.of(groupIndexes));
        }

        public Builder groupIndexes(Integer... groupIndexes) {
            return groupIndexes(List.of(groupIndexes));
        }

        public Builder pattern(Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs build() {
            $.pattern = Objects.requireNonNull($.pattern, "expected parameter 'pattern' to be non-null");
            return $;
        }
    }

}
