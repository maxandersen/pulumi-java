// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.WebACLBodyParsingFallbackBehavior;
import com.pulumi.awsnative.wafv2.enums.WebACLJsonMatchScope;
import com.pulumi.awsnative.wafv2.inputs.WebACLJsonMatchPatternArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Inspect the request body as JSON. The request body immediately follows the request headers.
 * 
 */
public final class WebACLJsonBodyArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebACLJsonBodyArgs Empty = new WebACLJsonBodyArgs();

    @Import(name="invalidFallbackBehavior")
    private @Nullable Output<WebACLBodyParsingFallbackBehavior> invalidFallbackBehavior;

    public Optional<Output<WebACLBodyParsingFallbackBehavior>> invalidFallbackBehavior() {
        return Optional.ofNullable(this.invalidFallbackBehavior);
    }

    @Import(name="matchPattern", required=true)
    private Output<WebACLJsonMatchPatternArgs> matchPattern;

    public Output<WebACLJsonMatchPatternArgs> matchPattern() {
        return this.matchPattern;
    }

    @Import(name="matchScope", required=true)
    private Output<WebACLJsonMatchScope> matchScope;

    public Output<WebACLJsonMatchScope> matchScope() {
        return this.matchScope;
    }

    private WebACLJsonBodyArgs() {}

    private WebACLJsonBodyArgs(WebACLJsonBodyArgs $) {
        this.invalidFallbackBehavior = $.invalidFallbackBehavior;
        this.matchPattern = $.matchPattern;
        this.matchScope = $.matchScope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLJsonBodyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLJsonBodyArgs $;

        public Builder() {
            $ = new WebACLJsonBodyArgs();
        }

        public Builder(WebACLJsonBodyArgs defaults) {
            $ = new WebACLJsonBodyArgs(Objects.requireNonNull(defaults));
        }

        public Builder invalidFallbackBehavior(@Nullable Output<WebACLBodyParsingFallbackBehavior> invalidFallbackBehavior) {
            $.invalidFallbackBehavior = invalidFallbackBehavior;
            return this;
        }

        public Builder invalidFallbackBehavior(WebACLBodyParsingFallbackBehavior invalidFallbackBehavior) {
            return invalidFallbackBehavior(Output.of(invalidFallbackBehavior));
        }

        public Builder matchPattern(Output<WebACLJsonMatchPatternArgs> matchPattern) {
            $.matchPattern = matchPattern;
            return this;
        }

        public Builder matchPattern(WebACLJsonMatchPatternArgs matchPattern) {
            return matchPattern(Output.of(matchPattern));
        }

        public Builder matchScope(Output<WebACLJsonMatchScope> matchScope) {
            $.matchScope = matchScope;
            return this;
        }

        public Builder matchScope(WebACLJsonMatchScope matchScope) {
            return matchScope(Output.of(matchScope));
        }

        public WebACLJsonBodyArgs build() {
            $.matchPattern = Objects.requireNonNull($.matchPattern, "expected parameter 'matchPattern' to be non-null");
            $.matchScope = Objects.requireNonNull($.matchScope, "expected parameter 'matchScope' to be non-null");
            return $;
        }
    }

}
