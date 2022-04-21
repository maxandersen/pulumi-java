// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Message defining a custom regular expression.
 * 
 */
public final class GooglePrivacyDlpV2RegexArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2RegexArgs Empty = new GooglePrivacyDlpV2RegexArgs();

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
     * Pattern defining the regular expression. Its syntax (https://github.com/google/re2/wiki/Syntax) can be found under the google/re2 repository on GitHub.
     * 
     */
    @Import(name="pattern")
    private @Nullable Output<String> pattern;

    public Optional<Output<String>> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    private GooglePrivacyDlpV2RegexArgs() {}

    private GooglePrivacyDlpV2RegexArgs(GooglePrivacyDlpV2RegexArgs $) {
        this.groupIndexes = $.groupIndexes;
        this.pattern = $.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2RegexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2RegexArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2RegexArgs();
        }

        public Builder(GooglePrivacyDlpV2RegexArgs defaults) {
            $ = new GooglePrivacyDlpV2RegexArgs(Objects.requireNonNull(defaults));
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

        public Builder pattern(@Nullable Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        public GooglePrivacyDlpV2RegexArgs build() {
            return $;
        }
    }

}
