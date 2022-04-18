// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration with resource tag settings to ignore across all resources handled by this provider (except any individual service tag resources such as `ec2.Tag`) for situations where external systems are managing certain resource tags.
 * 
 */
public final class ProviderIgnoreTagsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderIgnoreTagsArgs Empty = new ProviderIgnoreTagsArgs();

    /**
     * List of exact resource tag keys to ignore across all resources handled by this provider. This configuration prevents Pulumi from returning the tag in any `tags` attributes and displaying any configuration difference for the tag value. If any resource configuration still has this tag key configured in the `tags` argument, it will display a perpetual difference until the tag is removed from the argument or `ignoreChanges` is also used.
     * 
     */
    @Import(name="keyPrefixes")
      private final @Nullable Output<List<String>> keyPrefixes;

    public Output<List<String>> keyPrefixes() {
        return this.keyPrefixes == null ? Codegen.empty() : this.keyPrefixes;
    }

    /**
     * List of resource tag key prefixes to ignore across all resources handled by this provider. This configuration prevents Pulumi from returning any tag key matching the prefixes in any `tags` attributes and displaying any configuration difference for those tag values. If any resource configuration still has a tag matching one of the prefixes configured in the `tags` argument, it will display a perpetual difference until the tag is removed from the argument or `ignoreChanges` is also used.
     * 
     */
    @Import(name="keys")
      private final @Nullable Output<List<String>> keys;

    public Output<List<String>> keys() {
        return this.keys == null ? Codegen.empty() : this.keys;
    }

    public ProviderIgnoreTagsArgs(
        @Nullable Output<List<String>> keyPrefixes,
        @Nullable Output<List<String>> keys) {
        this.keyPrefixes = keyPrefixes;
        this.keys = keys;
    }

    private ProviderIgnoreTagsArgs() {
        this.keyPrefixes = Codegen.empty();
        this.keys = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderIgnoreTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> keyPrefixes;
        private @Nullable Output<List<String>> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderIgnoreTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyPrefixes = defaults.keyPrefixes;
    	      this.keys = defaults.keys;
        }

        public Builder keyPrefixes(@Nullable Output<List<String>> keyPrefixes) {
            this.keyPrefixes = keyPrefixes;
            return this;
        }
        public Builder keyPrefixes(@Nullable List<String> keyPrefixes) {
            this.keyPrefixes = Codegen.ofNullable(keyPrefixes);
            return this;
        }
        public Builder keyPrefixes(String... keyPrefixes) {
            return keyPrefixes(List.of(keyPrefixes));
        }
        public Builder keys(@Nullable Output<List<String>> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(@Nullable List<String> keys) {
            this.keys = Codegen.ofNullable(keys);
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }        public ProviderIgnoreTagsArgs build() {
            return new ProviderIgnoreTagsArgs(keyPrefixes, keys);
        }
    }
}
