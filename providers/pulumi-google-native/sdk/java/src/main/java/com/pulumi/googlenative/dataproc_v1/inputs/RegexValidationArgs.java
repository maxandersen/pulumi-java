// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Validation based on regular expressions.
 * 
 */
public final class RegexValidationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegexValidationArgs Empty = new RegexValidationArgs();

    /**
     * RE2 regular expressions used to validate the parameter&#39;s value. The value must match the regex in its entirety (substring matches are not sufficient).
     * 
     */
    @Import(name="regexes", required=true)
    private Output<List<String>> regexes;

    public Output<List<String>> regexes() {
        return this.regexes;
    }

    private RegexValidationArgs() {}

    private RegexValidationArgs(RegexValidationArgs $) {
        this.regexes = $.regexes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegexValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegexValidationArgs $;

        public Builder() {
            $ = new RegexValidationArgs();
        }

        public Builder(RegexValidationArgs defaults) {
            $ = new RegexValidationArgs(Objects.requireNonNull(defaults));
        }

        public Builder regexes(Output<List<String>> regexes) {
            $.regexes = regexes;
            return this;
        }

        public Builder regexes(List<String> regexes) {
            return regexes(Output.of(regexes));
        }

        public Builder regexes(String... regexes) {
            return regexes(List.of(regexes));
        }

        public RegexValidationArgs build() {
            $.regexes = Objects.requireNonNull($.regexes, "expected parameter 'regexes' to be non-null");
            return $;
        }
    }

}
