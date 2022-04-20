// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
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
      private final Output<List<String>> regexes;

    public Output<List<String>> regexes() {
        return this.regexes;
    }

    public RegexValidationArgs(Output<List<String>> regexes) {
        this.regexes = Objects.requireNonNull(regexes, "expected parameter 'regexes' to be non-null");
    }

    private RegexValidationArgs() {
        this.regexes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> regexes;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexes = defaults.regexes;
        }

        public Builder regexes(Output<List<String>> regexes) {
            this.regexes = Objects.requireNonNull(regexes);
            return this;
        }
        public Builder regexes(List<String> regexes) {
            this.regexes = Output.of(Objects.requireNonNull(regexes));
            return this;
        }
        public Builder regexes(String... regexes) {
            return regexes(List.of(regexes));
        }        public RegexValidationArgs build() {
            return new RegexValidationArgs(regexes);
        }
    }
}
