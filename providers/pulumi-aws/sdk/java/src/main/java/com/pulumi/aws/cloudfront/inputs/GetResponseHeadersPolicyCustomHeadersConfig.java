// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicyCustomHeadersConfigItem;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class GetResponseHeadersPolicyCustomHeadersConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicyCustomHeadersConfig Empty = new GetResponseHeadersPolicyCustomHeadersConfig();

    @Import(name="items", required=true)
      private final List<GetResponseHeadersPolicyCustomHeadersConfigItem> items;

    public List<GetResponseHeadersPolicyCustomHeadersConfigItem> items() {
        return this.items;
    }

    public GetResponseHeadersPolicyCustomHeadersConfig(List<GetResponseHeadersPolicyCustomHeadersConfigItem> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private GetResponseHeadersPolicyCustomHeadersConfig() {
        this.items = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicyCustomHeadersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetResponseHeadersPolicyCustomHeadersConfigItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicyCustomHeadersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetResponseHeadersPolicyCustomHeadersConfigItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetResponseHeadersPolicyCustomHeadersConfigItem... items) {
            return items(List.of(items));
        }        public GetResponseHeadersPolicyCustomHeadersConfig build() {
            return new GetResponseHeadersPolicyCustomHeadersConfig(items);
        }
    }
}
