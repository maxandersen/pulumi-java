// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * One query argument in a web request, identified by name, for example UserName or SalesRegion. The name can be up to 30 characters long and isn&#39;t case sensitive.
 * 
 */
public final class WebACLFieldToMatchSingleQueryArgumentProperties extends com.pulumi.resources.InvokeArgs {

    public static final WebACLFieldToMatchSingleQueryArgumentProperties Empty = new WebACLFieldToMatchSingleQueryArgumentProperties();

    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public WebACLFieldToMatchSingleQueryArgumentProperties(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private WebACLFieldToMatchSingleQueryArgumentProperties() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLFieldToMatchSingleQueryArgumentProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLFieldToMatchSingleQueryArgumentProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public WebACLFieldToMatchSingleQueryArgumentProperties build() {
            return new WebACLFieldToMatchSingleQueryArgumentProperties(name);
        }
    }
}
