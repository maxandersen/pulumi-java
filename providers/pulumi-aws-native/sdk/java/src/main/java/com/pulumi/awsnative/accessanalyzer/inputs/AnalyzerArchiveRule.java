// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.accessanalyzer.inputs;

import com.pulumi.awsnative.accessanalyzer.inputs.AnalyzerFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An Access Analyzer archive rule. Archive rules automatically archive new findings that meet the criteria you define when you create the rule.
 * 
 */
public final class AnalyzerArchiveRule extends com.pulumi.resources.InvokeArgs {

    public static final AnalyzerArchiveRule Empty = new AnalyzerArchiveRule();

    @Import(name="filter", required=true)
      private final List<AnalyzerFilter> filter;

    public List<AnalyzerFilter> filter() {
        return this.filter;
    }

    /**
     * The archive rule name
     * 
     */
    @Import(name="ruleName", required=true)
      private final String ruleName;

    public String ruleName() {
        return this.ruleName;
    }

    public AnalyzerArchiveRule(
        List<AnalyzerFilter> filter,
        String ruleName) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.ruleName = Objects.requireNonNull(ruleName, "expected parameter 'ruleName' to be non-null");
    }

    private AnalyzerArchiveRule() {
        this.filter = List.of();
        this.ruleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyzerArchiveRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AnalyzerFilter> filter;
        private String ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyzerArchiveRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder filter(List<AnalyzerFilter> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filter(AnalyzerFilter... filter) {
            return filter(List.of(filter));
        }
        public Builder ruleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }        public AnalyzerArchiveRule build() {
            return new AnalyzerArchiveRule(filter, ruleName);
        }
    }
}
