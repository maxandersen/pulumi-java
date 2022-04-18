// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ResponseHeadersPolicyAccessControlAllowMethods extends com.pulumi.resources.InvokeArgs {

    public static final ResponseHeadersPolicyAccessControlAllowMethods Empty = new ResponseHeadersPolicyAccessControlAllowMethods();

    @Import(name="items", required=true)
      private final List<String> items;

    public List<String> items() {
        return this.items;
    }

    public ResponseHeadersPolicyAccessControlAllowMethods(List<String> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private ResponseHeadersPolicyAccessControlAllowMethods() {
        this.items = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyAccessControlAllowMethods defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyAccessControlAllowMethods defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }        public ResponseHeadersPolicyAccessControlAllowMethods build() {
            return new ResponseHeadersPolicyAccessControlAllowMethods(items);
        }
    }
}
