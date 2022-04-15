// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.enums.RestMatchQuantifier;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The regular expressions to match the response content with.
 * 
 */
public final class RestResponseRegexArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestResponseRegexArgs Empty = new RestResponseRegexArgs();

    /**
     * Indicates whether any or all of the expressions should match with the response content.
     * 
     */
    @Import(name="matchQuantifier")
      private final @Nullable Output<RestMatchQuantifier> matchQuantifier;

    public Output<RestMatchQuantifier> matchQuantifier() {
        return this.matchQuantifier == null ? Codegen.empty() : this.matchQuantifier;
    }

    /**
     * The list of regular expressions.
     * 
     */
    @Import(name="matches")
      private final @Nullable Output<List<String>> matches;

    public Output<List<String>> matches() {
        return this.matches == null ? Codegen.empty() : this.matches;
    }

    public RestResponseRegexArgs(
        @Nullable Output<RestMatchQuantifier> matchQuantifier,
        @Nullable Output<List<String>> matches) {
        this.matchQuantifier = matchQuantifier;
        this.matches = matches;
    }

    private RestResponseRegexArgs() {
        this.matchQuantifier = Codegen.empty();
        this.matches = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestResponseRegexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RestMatchQuantifier> matchQuantifier;
        private @Nullable Output<List<String>> matches;

        public Builder() {
    	      // Empty
        }

        public Builder(RestResponseRegexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchQuantifier = defaults.matchQuantifier;
    	      this.matches = defaults.matches;
        }

        public Builder matchQuantifier(@Nullable Output<RestMatchQuantifier> matchQuantifier) {
            this.matchQuantifier = matchQuantifier;
            return this;
        }
        public Builder matchQuantifier(@Nullable RestMatchQuantifier matchQuantifier) {
            this.matchQuantifier = Codegen.ofNullable(matchQuantifier);
            return this;
        }
        public Builder matches(@Nullable Output<List<String>> matches) {
            this.matches = matches;
            return this;
        }
        public Builder matches(@Nullable List<String> matches) {
            this.matches = Codegen.ofNullable(matches);
            return this;
        }
        public Builder matches(String... matches) {
            return matches(List.of(matches));
        }        public RestResponseRegexArgs build() {
            return new RestResponseRegexArgs(matchQuantifier, matches);
        }
    }
}
