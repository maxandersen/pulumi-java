// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RegexValidationResponse {
    /**
     * RE2 regular expressions used to validate the parameter's value. The value must match the regex in its entirety (substring matches are not sufficient).
     * 
     */
    private final List<String> regexes;

    @OutputCustomType.Constructor
    private RegexValidationResponse(@OutputCustomType.Parameter("regexes") List<String> regexes) {
        this.regexes = regexes;
    }

    /**
     * RE2 regular expressions used to validate the parameter's value. The value must match the regex in its entirety (substring matches are not sufficient).
     * 
    */
    public List<String> getRegexes() {
        return this.regexes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexValidationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> regexes;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexValidationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexes = defaults.regexes;
        }

        public Builder setRegexes(List<String> regexes) {
            this.regexes = Objects.requireNonNull(regexes);
            return this;
        }
        public RegexValidationResponse build() {
            return new RegexValidationResponse(regexes);
        }
    }
}
