// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebACLFieldIdentifier {
    private final String identifier;

    @CustomType.Constructor
    private WebACLFieldIdentifier(@CustomType.Parameter("identifier") String identifier) {
        this.identifier = identifier;
    }

    public String identifier() {
        return this.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLFieldIdentifier defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String identifier;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLFieldIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
        }

        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }        public WebACLFieldIdentifier build() {
            return new WebACLFieldIdentifier(identifier);
        }
    }
}
