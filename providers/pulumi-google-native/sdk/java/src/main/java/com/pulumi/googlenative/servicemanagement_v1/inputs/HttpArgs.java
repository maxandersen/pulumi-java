// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.servicemanagement_v1.inputs.HttpRuleArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the HTTP configuration for an API service. It contains a list of HttpRule, each specifying the mapping of an RPC method to one or more HTTP REST API methods.
 * 
 */
public final class HttpArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpArgs Empty = new HttpArgs();

    /**
     * When set to true, URL path parameters will be fully URI-decoded except in cases of single segment matches in reserved expansion, where &#34;%2F&#34; will be left encoded. The default behavior is to not decode RFC 6570 reserved characters in multi segment matches.
     * 
     */
    @Import(name="fullyDecodeReservedExpansion")
      private final @Nullable Output<Boolean> fullyDecodeReservedExpansion;

    public Output<Boolean> fullyDecodeReservedExpansion() {
        return this.fullyDecodeReservedExpansion == null ? Codegen.empty() : this.fullyDecodeReservedExpansion;
    }

    /**
     * A list of HTTP configuration rules that apply to individual API methods. **NOTE:** All service configuration rules follow &#34;last one wins&#34; order.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<HttpRuleArgs>> rules;

    public Output<List<HttpRuleArgs>> rules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    public HttpArgs(
        @Nullable Output<Boolean> fullyDecodeReservedExpansion,
        @Nullable Output<List<HttpRuleArgs>> rules) {
        this.fullyDecodeReservedExpansion = fullyDecodeReservedExpansion;
        this.rules = rules;
    }

    private HttpArgs() {
        this.fullyDecodeReservedExpansion = Codegen.empty();
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> fullyDecodeReservedExpansion;
        private @Nullable Output<List<HttpRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullyDecodeReservedExpansion = defaults.fullyDecodeReservedExpansion;
    	      this.rules = defaults.rules;
        }

        public Builder fullyDecodeReservedExpansion(@Nullable Output<Boolean> fullyDecodeReservedExpansion) {
            this.fullyDecodeReservedExpansion = fullyDecodeReservedExpansion;
            return this;
        }
        public Builder fullyDecodeReservedExpansion(@Nullable Boolean fullyDecodeReservedExpansion) {
            this.fullyDecodeReservedExpansion = Codegen.ofNullable(fullyDecodeReservedExpansion);
            return this;
        }
        public Builder rules(@Nullable Output<List<HttpRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<HttpRuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(HttpRuleArgs... rules) {
            return rules(List.of(rules));
        }        public HttpArgs build() {
            return new HttpArgs(fullyDecodeReservedExpansion, rules);
        }
    }
}
