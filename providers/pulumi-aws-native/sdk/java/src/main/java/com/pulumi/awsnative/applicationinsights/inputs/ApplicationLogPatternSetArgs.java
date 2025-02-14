// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.inputs;

import com.pulumi.awsnative.applicationinsights.inputs.ApplicationLogPatternArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The log pattern set.
 * 
 */
public final class ApplicationLogPatternSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationLogPatternSetArgs Empty = new ApplicationLogPatternSetArgs();

    /**
     * The log patterns of a set.
     * 
     */
    @Import(name="logPatterns", required=true)
    private Output<List<ApplicationLogPatternArgs>> logPatterns;

    /**
     * @return The log patterns of a set.
     * 
     */
    public Output<List<ApplicationLogPatternArgs>> logPatterns() {
        return this.logPatterns;
    }

    /**
     * The name of the log pattern set.
     * 
     */
    @Import(name="patternSetName", required=true)
    private Output<String> patternSetName;

    /**
     * @return The name of the log pattern set.
     * 
     */
    public Output<String> patternSetName() {
        return this.patternSetName;
    }

    private ApplicationLogPatternSetArgs() {}

    private ApplicationLogPatternSetArgs(ApplicationLogPatternSetArgs $) {
        this.logPatterns = $.logPatterns;
        this.patternSetName = $.patternSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationLogPatternSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationLogPatternSetArgs $;

        public Builder() {
            $ = new ApplicationLogPatternSetArgs();
        }

        public Builder(ApplicationLogPatternSetArgs defaults) {
            $ = new ApplicationLogPatternSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logPatterns The log patterns of a set.
         * 
         * @return builder
         * 
         */
        public Builder logPatterns(Output<List<ApplicationLogPatternArgs>> logPatterns) {
            $.logPatterns = logPatterns;
            return this;
        }

        /**
         * @param logPatterns The log patterns of a set.
         * 
         * @return builder
         * 
         */
        public Builder logPatterns(List<ApplicationLogPatternArgs> logPatterns) {
            return logPatterns(Output.of(logPatterns));
        }

        /**
         * @param logPatterns The log patterns of a set.
         * 
         * @return builder
         * 
         */
        public Builder logPatterns(ApplicationLogPatternArgs... logPatterns) {
            return logPatterns(List.of(logPatterns));
        }

        /**
         * @param patternSetName The name of the log pattern set.
         * 
         * @return builder
         * 
         */
        public Builder patternSetName(Output<String> patternSetName) {
            $.patternSetName = patternSetName;
            return this;
        }

        /**
         * @param patternSetName The name of the log pattern set.
         * 
         * @return builder
         * 
         */
        public Builder patternSetName(String patternSetName) {
            return patternSetName(Output.of(patternSetName));
        }

        public ApplicationLogPatternSetArgs build() {
            $.logPatterns = Objects.requireNonNull($.logPatterns, "expected parameter 'logPatterns' to be non-null");
            $.patternSetName = Objects.requireNonNull($.patternSetName, "expected parameter 'patternSetName' to be non-null");
            return $;
        }
    }

}
